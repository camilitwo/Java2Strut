package com.duoc.mobike.logica;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.duoc.mobike.constantes.Constantes;
import com.duoc.mobike.dto.BicicletaDTO;

public class UtilLogica {

	private static Log LOG = LogFactory.getLog(UtilLogica.class);
	
	
	public static List<BicicletaDTO> armarListaBicicleta() throws Exception{
		LOG.info("Ingreso a UtilLogica.armarListaBicicleta()");
		List<BicicletaDTO> listaBicicleta = new ArrayList<BicicletaDTO>();
		try {
			BicicletaDTO bicicleta = null;
			for (int i = 0; i < 16; i++) {
				bicicleta = new BicicletaDTO();
				bicicleta.setIdBicicleta(i+1);
				bicicleta.setEstado(Constantes.ESTADO_BLOQUEADO);
				
				listaBicicleta.add(bicicleta);
			}
			
		} catch (Exception e) {
			LOG.error("[ERROR] Ingreso a UtilLogica.armarListaBicicleta()");
			e.printStackTrace();
			throw new Exception();
		}
		return listaBicicleta;
	}
	
	
}
