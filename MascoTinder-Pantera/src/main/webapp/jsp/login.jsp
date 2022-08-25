<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<!--CSS de Bootstrap-->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link href="estilosLogin.css" rel="stylesheet">
</head>
<body>
	<div class="container ">
		<div class="tipoDeLetra ">
			<h1>LOGO APP</h1>
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
							<input type="text" name="txtNombre" id="txtNombre"
								class="entradas" value="${persona.nombre}" />
						</div>
					</div>
					<br>
					<br>
					<div class="row">
						<div class="col-2 color">
							<label for="txtId" class="etiquetas">CLAVE</label>
						</div>
						<div class="col-10">
							<input type="password" name="txtClave" id="txtClave"
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
						<p class="texto1">Registrate</p>
						<a href="#" class="link"> aquí<br>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>