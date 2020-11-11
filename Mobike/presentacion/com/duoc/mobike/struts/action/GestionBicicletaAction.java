package com.duoc.mobike.struts.action;

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

import com.duoc.mobike.logica.UtilLogica;
import com.duoc.mobike.struts.form.GestionBicicletaForm;

public class GestionBicicletaAction extends DispatchAction{
	
	private static Log LOG = LogFactory.getLog(GestionBicicletaAction.class);
	ActionErrors errors = new ActionErrors();
	
	protected ActionForward unspecified(ActionMapping mapping,
			ActionForm aform, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		errors.clear();
		HttpSession session = request.getSession();
		
		session.setAttribute("listaBicicletas", UtilLogica.armarListaBicicleta());

		return mapping.findForward("GestionBicicleta");

	}// unspecified
	
	public ActionForward prueba(ActionMapping mapping,
			ActionForm aform, HttpServletRequest request,
			HttpServletResponse response){
		GestionBicicletaForm formulario = (GestionBicicletaForm)aform;
		errors.clear();
		try {
			
			String prueba = formulario.getValorTexto();
			String prueba2 = formulario.getPrueba2();
			String opcion = formulario.getOpciones();
			System.out.println(prueba);

		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("[ERROR] En GestionBicicletaAction.unspecified() : "+ e.getMessage());
			errors.add("dao", new ActionMessage("error.manejo.informacion"));
			saveErrors(request, (ActionMessages) errors);
		}
		
		return mapping.findForward("GestionBicicleta");
	}

}
