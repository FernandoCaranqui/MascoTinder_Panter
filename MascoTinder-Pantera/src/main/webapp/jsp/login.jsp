<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<!--CSS de Bootstrap-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<!-- CSS only -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilosLogin.css">
</head>
<body>
	<div class="container">
		<div class="tipoDeLetra">
			<h1><img src="img/logo.jpg" class="logo" alt="logo de la app"></h1>
			<br>
			<br>
			<br>
			<form method="post" action="LoginController">
				<!--input type="text" name="txtId" id="txtId" value="${persona.id}" /-->
				<br>
				<div class="container">
					<div class="row">
						<div class="col-2 color">
							<label for="txtNombre" class="etiquetas">CORREO</label>
						</div>
						<div class="col-10">
							<input type="text" name="usuario" id="txtNombre"
								class="entradas" value="${persona.nombre}" />
						</div>
					</div>
					<br>
					<br>
					<div class="row">
						<div class="col-2 color">
							<label for="txtClave" class="etiquetas">CLAVE</label>
						</div>
						<div class="col-10">
							<input type="password" name="password" id="txtClave"
								class="entradas" value="${persona.password}" />
						</div>
					</div>
				</div>
				<br> <br>
				
				<div class="row alineacionBoton">
					<div>
						<input type="submit" class="entradas etiquetas color boton"
							value="INGRESAR" /> <br>
					</div>
				</div>
				<br> <br>
				<div class="row">
					<div class="col-6 texto">
						<p>¿No tienes cuenta?</p>
						<br>
					</div>
					<div class="col-6">
						<a href="#" class="link">Registrate aquí<br>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>