<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<script language="JavaScript" type="text/JavaScript">

	function volver(){
		document.GestionBicicletaForm.action = "/Mobike/GestionBicicleta.do?do=prueba";
		document.GestionBicicletaForm.submit();
	}
</script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mobike</title>
</head>
<body>
<html:form action="/GestionBicicleta" enctype="multipart/form-data" method="post">	

	<html:text property="valorTexto"></html:text>
	<html:text property="prueba2"></html:text>
	<html:radio property="opciones" value="opcion 1"></html:radio>
	<html:radio property="opciones" value="opcion 2"></html:radio>
	<html:submit onclick="volver()">Probar</html:submit>
	
	<table class="table table-striped" style=" width: 50%; overflow: auto;" align="center">
		<thead>
			<tr align="center">
				<th  scope="col"><bean:message key="gestionBicicleta.detalle.numeroBicicleta"/></th>
				<th  scope="col"><bean:message key="gestionBicicleta.detalle.estado"/></th>
				<th  scope="col">
			</tr>
		</thead>
		<logic:iterate name="listaBicicletas" id="indice">
			<tr>
				<th scope="row">
					<bean:write name="indice" property="idBicicleta"/>
				</th>
				<td>
					<bean:write name="indice" property="estado"/>
				</td>
				<logic:equal name="indice" property="estado" value="BLOQUEADO">
					<td>
						<input type="button" value="Desbloquear">
					</td>
				</logic:equal>
				<logic:equal name="indice" property="estado" value="DESBLOQUEADO">
					<td>
						<input type="button" value="Bloquear">
					</td>
				</logic:equal>
			</tr>
		</logic:iterate>
	</table>
</html:form>
</body>
</html:html>