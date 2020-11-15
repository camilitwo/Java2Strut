package com.duoc.mobike.logica;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.duoc.mobike.constantes.Constantes;
import com.duoc.mobike.dao.BicicletaDAO;
import com.duoc.mobike.dto.BicicletaDTO;

public class BicicletaLogica {
	private static Log LOG = LogFactory.getLog(BicicletaLogica.class);
	
	public static List<BicicletaDTO> getBicicletas() throws Exception {
		
		LOG.info("Ingreso a BicicletaLogica.armarListaBicicleta()");		
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//localhost:1521/XEPDB1"); // jdbc:oracle:thin@//[hostname]:[port]/[DB service name]
		Connection conn = null;
		try {
			ods.setUser("system"); // [username]
			ods.setPassword("massu"); // [password]
			conn = ods.getConnection();
			
			return BicicletaDAO.getBicicletas(conn);
			
			
		} catch (Exception e) {
			LOG.info("[ERROR] Error en BicicletaFachada.armarListaBicicleta()");		
			e.printStackTrace();
			throw new Exception();
		}finally{
			conn.close();
		}
	}

	public static void actualizarEstadoBicicleta(String id, String estado) throws Exception {
		
		LOG.info("Ingreso a BicicletaLogica.actualizarEstadoBicicleta()");		
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@//localhost:1521/XEPDB1"); // jdbc:oracle:thin@//[hostname]:[port]/[DB service name]
		Connection conn = null;
		try {
			ods.setUser("system"); // [username]
			ods.setPassword("massu"); // [password]
			conn = ods.getConnection();
			conn.setAutoCommit(false);
			
			if(Constantes.ESTADO_BLOQUEADO.equals(estado)){
				estado = Constantes.ESTADO_DESBLOQUEADO;
			}else if(Constantes.ESTADO_DESBLOQUEADO.equals(estado)){
				estado = Constantes.ESTADO_BLOQUEADO;
			}
			
			BicicletaDAO.actualizarEstadoBicicleta(conn, id, estado);
			
			conn.commit();
		} catch (Exception e) {
			LOG.info("[ERROR] Error en BicicletaFachada.actualizarEstadoBicicleta()");		
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			throw new Exception();
		}finally{
			conn.close();
		}
		
	}

}
