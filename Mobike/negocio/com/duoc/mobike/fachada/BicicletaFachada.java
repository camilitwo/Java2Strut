package com.duoc.mobike.fachada;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.duoc.mobike.dto.BicicletaDTO;
import com.duoc.mobike.logica.BicicletaLogica;

public class BicicletaFachada {
	
	private static Log LOG = LogFactory.getLog(BicicletaFachada.class);

	public static List<BicicletaDTO> armarListaBicicleta() throws Exception {
		LOG.info("Ingreso a BicicletaFachada.armarListaBicicleta()");					
			return BicicletaLogica.getBicicletas();
	}

	public static void actualizarEstadoBicicleta(String id, String estado) throws Exception {
		BicicletaLogica.actualizarEstadoBicicleta(id, estado);
	}
	
	

}
