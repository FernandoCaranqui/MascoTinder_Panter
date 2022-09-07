<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Nueva Mascota</title>
<link
	href="${pageContext.request.contextPath}/templates/banner_interno.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/css/agregarMascota.css"
	rel="stylesheet">
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
	
</head>
<body>
<%@include file="../templates/banner_interno.html" %>
<section>
<form method="post" action="NuevaMascotaController">
		<div class="wrapper">
			<div class="formContent">
				<h1>Nueva Mascota</h1>
				<label for="txtId"></label>
				<input type="hidden" name="txtedad" id="txtid" value="1"/> <br>
				
				<label for="txtId">Edad</label> 
				<input type="text" name="txtedad" id="txtedad" /> <br>
				
				<label for="txtId">Especie</label> 
				<input type="text" name="txtespecie" id="txtespecie" /> <br> 
				
				<label for="txtId">Nombre</label> 
				<input type="text" name="txtnombre" id="txtnombre" /> <br> 
				
				<label for="txtId">Raza</label> 
				<input type="text" name="txtraza" id="txtraza" /> <br>
				
				<label for="txtId">Sexo</label> 
				<input type="text" name="txtsexo" id="txtsexo" /> <br>
				
				<label for="txtId">Ubicacion</label> 
				<input type="text" name="txtubicacion" id="txtubicacion" /> <br> <br> <br>
				
				<input type="submit" value="Guardar" class="confirm guardar"/> 
				<a href="ListarMascotasController">
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x-lg" viewBox="0 0 16 16">
					  <path d="M2.146 2.854a.5.5 0 1 1 .708-.708L8 7.293l5.146-5.147a.5.5 0 0 1 .708.708L8.707 8l5.147 5.146a.5.5 0 0 1-.708.708L8 8.707l-5.146 5.147a.5.5 0 0 1-.708-.708L7.293 8 2.146 2.854Z"/>
					</svg>
				</div>
				
			
		</div>
			
</form>
</section>

</body>
</html>