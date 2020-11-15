package com.duoc.mobike.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.duoc.mobike.dto.BicicletaDTO;

public class BicicletaDAO {
	private static Log LOG = LogFactory.getLog(BicicletaDAO.class);

	/**
	 * Metodo encargado de listar bicicletas por parada.
	 * @param conn
	 * @return
	 * @throws Exception 
	 */
	public static List<BicicletaDTO> getBicicletas(Connection conn) throws Exception {
		LOG.info("Ingreso a BicicletaDAO.getBicicletas()");
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<BicicletaDTO> listaBicicleta = new ArrayList<>();
		BicicletaDTO bici = null;
		try {
			
			String sql = "SELECT ID_BICICLETA, NOMBRE, FECHA_DIGITACION, DIGITADOR, ESTADO "
					+ " FROM BICICLETA "
					+ " ORDER BY ID_BICICLETA ASC ";
			
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()){
				bici = new BicicletaDTO();
				bici.setIdBicicleta(rs.getString("ID_BICICLETA"));
				bici.setEstado(rs.getString("ESTADO"));
				bici.setNombre(rs.getString("NOMBRE"));
				listaBicicleta.add(bici);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("[ERROR] BicicletaDAO.getBicicletas()");
			throw new Exception();
		}finally{
			if(pst != null){
				pst.close();
			}
			if(rs != null){
				rs.close();
			}
		}
		
		return listaBicicleta;
	}

	public static void actualizarEstadoBicicleta(Connection conn, String id,
			String estado) throws Exception {
		LOG.info("Ingreso a BicicletaDAO.actualizarEstadoBicicleta()");
		PreparedStatement pst = null;
		try {
			
			String sql = " UPDATE BICICLETA SET ESTADO = ? WHERE ID_BICICLETA = ? ";
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, estado);
			pst.setString(2, id);
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("[ERROR] BicicletaDAO.getBicicletas()");
			throw new Exception();
		}finally{
			if(pst != null){
				pst.close();
			}
		}
	}

}
