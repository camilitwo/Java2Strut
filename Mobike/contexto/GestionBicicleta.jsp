<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>

<!-- JavaScript -->
<script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>

<!-- CSS -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css"/>
<!-- Default theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.min.css"/>
<!-- Semantic UI theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.min.css"/>
<!-- Bootstrap theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.min.css"/>

<!-- 
    RTL version
-->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.rtl.min.css"/>
<!-- Default theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.rtl.min.css"/>
<!-- Semantic UI theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.rtl.min.css"/>
<!-- Bootstrap theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.rtl.min.css"/>

<script language="JavaScript" type="text/JavaScript">

	function volver(){
		document.GestionBicicletaForm.action = "/Mobike/GestionBicicleta.do?do=prueba";
		document.GestionBicicletaForm.submit();
	}
	
	
	function actualizarEstado(id, estado){		
		alertify.confirm('¿Está Seguro?', 
				function(){ 
					
					document.GestionBicicletaForm.action = "/Mobike/GestionBicicleta.do?do=actualizarEstado&id="+id+"&estado="+estado;
					document.GestionBicicletaForm.submit();
			}, function(){ 
					alertify.error('Se ha cancelado')
				}).set('labels', {ok:'SI', cancel:'NO'}).set('defaultFocus', 'cancel');
		
	}
	
	function mostrarAlerta(){
		var alerta = document.getElementById("alertas").value;
		if(alerta === '1'){
			alertify.error('Ya tiene una bicicleta desbloqueada')
			alertify.set('notifier','position', 'bottom-right');
		}
	}
</script>

<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.hero-image {
	background-image: url("img/fondo2.png");
	background-color: #cccccc;
	height: 800px;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
}

.hero-text {
	text-align: center;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	color: white;
}
</style>

<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mobike</title>
</head>
<body onload="javascript:mostrarAlerta();">
<html:form action="/GestionBicicleta" enctype="multipart/form-data" method="post">
	<html:hidden property="alertas" styleId="alertas"/>

		<div class="hero-image">
		</div>

		<table class="hero-text table table-striped table-hover table-secondary" style=" width: 50%; overflow: auto;" align="center">
		<thead>
			<tr align="center">
				<th  scope="col"><bean:message key="gestionBicicleta.detalle.numeroBicicleta"/></th>
				<th  scope="col"><bean:message key="gestionBicicleta.detalle.nombre"/></th>
				<th  scope="col"><bean:message key="gestionBicicleta.detalle.estado"/></th>
				<th  scope="col">
			</tr>
		</thead>
		<logic:iterate name="listaBicicletas" id="indice">
			<tbody>
				<tr>
					<th scope="row">
						<bean:write name="indice" property="idBicicleta"/>
					</th>
					<td>
						<bean:write name="indice" property="nombre"/>
					</td>
					<td>
						<bean:write name="indice" property="estado"/>
					</td>
					<logic:equal name="indice" property="estado" value="BLOQUEADO">
						<td>
							<input type="button" value="Desbloquear" class="btn btn-success"
							onclick='javascript:actualizarEstado("<bean:write name='indice' property='idBicicleta'/>", 
							"<bean:write name='indice' property='estado'/>");return false;'>
						</td>
					</logic:equal>
					<logic:equal name="indice" property="estado" value="DESBLOQUEADO">
						<td>
							<input type="button" value="Bloquear" class="btn btn-danger"
							onclick='javascript:actualizarEstado("<bean:write name='indice' property='idBicicleta'/>", 
							"<bean:write name='indice' property='estado'/>");return false;'>
						</td>
					</logic:equal>
				</tr>
			</tbody>
		</logic:iterate>
	</table>
</html:form>
</body>
</html:html>