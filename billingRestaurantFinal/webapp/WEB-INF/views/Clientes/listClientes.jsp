<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<spring:url value="/resources" var="urlPublic" />

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
			<h3>Bienvenidos a su sistema de facturaci&sbquo;on, para realizar el registro de su factura por favor ingrese a la opci&sbquo;on Facturas del men&sbquo;u princiapl. S&sbquo;i requiere visualizar lo facturado por camarero, por favor seleccionar la opci&sbquo;on Camareros y por &sbquo;ultimo si quiere visualizar los clientes con mayor consumo en el restaurante, por favor seleccione la opci&sbquo;n Clientes.</h3>
		</div>
		<div class="card-body">
			<table class="table table-bordered">
				<thead class="thead-dark">
					<tr>
						<th>Id</th>
						<th>Nombre</th>
						<th>Apellidos</th>
						<th>Observaciones</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${clientes}" var="clientes">
						<tr>
							<td>${clientes.idCliente}</td>
							<td>${clientes.nombre}</td>
							<td>${clientes.apellido1}${clientes.apellido2}</td>
							<td>${clientes.observaciones}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<a href="#" class="btn btn-primary">Go somewhere</a>
		</div>
	</div>
	
	<!-- Footer estilo pull-right -->

	<jsp:include page="includes/footer.jsp"></jsp:include>

	<!-- Fin -->


</body>
</html>