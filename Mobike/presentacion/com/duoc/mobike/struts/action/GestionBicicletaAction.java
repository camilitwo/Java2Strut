package com.duoc.mobike.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DispatchAction;

import com.duoc.mobike.constantes.Constantes;
import com.duoc.mobike.dto.BicicletaDTO;
import com.duoc.mobike.fachada.BicicletaFachada;
import com.duoc.mobike.struts.form.GestionBicicletaForm;

public class GestionBicicletaAction extends DispatchAction{
	
	private static Log LOG = LogFactory.getLog(GestionBicicletaAction.class);
	ActionErrors errors = new ActionErrors();
	
	protected ActionForward unspecified(ActionMapping mapping,
			ActionForm aform, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		errors.clear();
		HttpSession session = request.getSession();
		
		//session.setAttribute("listaBicicletas", UtilLogica.armarListaBicicleta());
		session.setAttribute("listaBicicletas", BicicletaFachada.armarListaBicicleta());

		return mapping.findForward("GestionBicicleta");

	}// unspecified
	
	public ActionForward actualizarEstado(ActionMapping mapping,
			ActionForm aform, HttpServletRequest request,
			HttpServletResponse response){
		GestionBicicletaForm formulario = (GestionBicicletaForm)aform;
		errors.clear();
		HttpSession session = request.getSession();
		try {
			
			String id = request.getParameter("id");
			String estado = request.getParameter("estado");
			
			List<BicicletaDTO> listaBici =  new ArrayList<BicicletaDTO>();
			listaBici = (List<BicicletaDTO>)session.getAttribute("listaBicicletas");
			//validacion del estado si es bloqueado -> desbloqueado y lo mismo al reves
			
			//validacion para que solo exista una bicicle desbloqueada
			//for 
			int h = 0;
			formulario.setAlertas("0");
			if(estado.equals(Constantes.ESTADO_BLOQUEADO)){
				
				h++;
				
				for (BicicletaDTO bici : listaBici){
					if (bici.getEstado().equals(Constantes.ESTADO_DESBLOQUEADO)){
						h++;
						if (h>1){
							formulario.setAlertas("1");
							throw new Exception();
						}
					}
				}
				
			}
			
			
			
			BicicletaFachada.actualizarEstadoBicicleta(id, estado);
			
			session.setAttribute("listaBicicletas", BicicletaFachada.armarListaBicicleta());

		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("[ERROR] En GestionBicicletaAction.unspecified() : "+ e.getMessage());
			errors.add("dao", new ActionMessage("error.manejo.informacion"));
			saveErrors(request, (ActionMessages) errors);
		}
		
		return mapping.findForward("GestionBicicleta");
	}

}
