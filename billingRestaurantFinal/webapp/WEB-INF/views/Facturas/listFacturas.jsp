<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de facturas</title>

<spring:url value="/resources" var="urlPublic" />
<spring:url value="/peliculas" var="urlPeliculas" />
</head>
<body>

	<jsp:include page="../includes/menu.jsp"></jsp:include>
	
	<div class="card">
		<div class="card-header">
			<h3>Listado de facturas creadas en el sistema</h3>
		</div>
		<div class="card-body">
			<table class="table table-bordered">
				<thead class="thead-dark">
					<tr>
						<th>Id</th>
						<th>Id Cliente</th>
						<th>Id Camarero</th>
						<th>Id Mesa</th>
						<th>Fecha Factura</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${facturas}" var="facturas">
						<tr>
							<td>${facturas.idFactura}</td>
							<td>${facturas.idCliente}</td>
							<td>${facturas.idCamarero}</td>
							<td>${facturas.idMesa}</td>
							<td>${facturas.fechaFactura}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	<jsp:include page="../includes/footer.jsp"></jsp:include>	

</body>
</html>