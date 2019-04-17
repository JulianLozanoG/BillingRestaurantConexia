<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<spring:url value="/" var="urlRoot" />
<!-- Header -->

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="${urlRoot}">Inicio</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				
				<li class="nav-item">
					<a class="nav-link" href="${urlRoot}">Facturas</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="${urlRoot}">Camareros</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="${urlRoot}">Clientes</a>
				</li>
				
			</ul>
		</div>
	</nav>