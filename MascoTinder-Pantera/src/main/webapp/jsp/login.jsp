<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<!--CSS de Bootstrap-->

<link href="${pageContext.request.contextPath}/css/estilosLogin.css" rel="stylesheet">
</head>
<body>
	<div class="container ">
		<div class="tipoDeLetra ">
			<h1><img src="img/MascotinderLogo.png" class="logoLogin" alt="logo de la app"></h1>
			<br>
			<br>
			<br>
			<form method="post" action="LoginController">
				<input type="hidden" name="txtId" id="txtId" value="${persona.id}" />
				<br>
				<div class="container">
					<div class="row">
						<div class="col-2 color">
							<label for="txtId" class="etiquetas">CORREO</label>
						</div>
						<div class="col-10 ">
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
						<p>No tienes cuenta?</p>
						<br>
					</div>
					<div class="col-6">
						<a href="#" class="link">Registrate aquí</a><br>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>