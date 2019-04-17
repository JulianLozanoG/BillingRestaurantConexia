<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to your billing system</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

 

</head>
<body>

	<!-- Header estilo navbar -->

	<jsp:include page="includes/menu.jsp"></jsp:include>

	<!-- Fin -->
	<div class="card">
		<div class="card-header">
			<h5>Bienvenidos a su sistema de facturaci&oacute;n, para realizar el registro de su factura por favor ingrese a la opci&oacute;n Facturas del men&uacute; princiapl. S&iacute; requiere visualizar lo facturado por camarero, por favor seleccionar la opci&oacute;n Camareros y por &uacute;ltimo si quiere visualizar los clientes con mayor consumo en el restaurante, por favor seleccione la opci&oacute;n Clientes.</h5>
		</div>
		<div class="card-body">
			<img src="https://media-cdn.tripadvisor.com/media/photo-s/0e/cc/0a/dc/restaurant-chocolat.jpg" >
			
		</div>
	</div> 
	
	<!-- Footer estilo pull-right -->

	<jsp:include page="includes/footer.jsp"></jsp:include>

	<!-- Fin -->


</body>
</html>