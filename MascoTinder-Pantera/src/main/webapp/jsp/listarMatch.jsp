<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Matchs</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link
	href="${pageContext.request.contextPath}/css/estilosListarMatchs.css"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/3e841de0b4.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<header>
		<div class="menu">
			<img src="img/MascotinderLogo.png" class="logo" alt="logoApp">
			<nav>
				<ul>
					<li><samp></samp></li>
					<li><a href="#"></a></li>
					<li><a href="#"><img
							src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAAAXNSR0IArs4c6QAAAR5JREFUSEvt1uENwiAUBODrJOomOok6iTqJOoluoqOYa2iDpdB70IbESGL0B+0HPDhsUKk1lVyUwGsA/DxzBp8LnwCcHcjvixXPgbcAHgPIjFvhMZRjeAM4WpbdAsfQbvImXIW5iV5CHYnv3Aokuysw0SsAzlhpEq7A3Egq6i/7JjXKKTgHlfAUXIJ2+M3t9mDyMZg1PSgFFfqMnvEx2E8l4b1SlwAfwlNnVVIinb5wH14SDdLNh1lT1nbJxljlhguuReIrJ/M3w6OkMUxayLX+Flv6OPGuZoTKx4kd5zjHvwGzZvfB2u0jgTPrjMeSKBY6f7ivUM5xqrbUffp4GyyWeuZrke9kajG/uyQL0seDLX3bx6b+gZTEZfLZavAHgjZFH6oHJd4AAAAASUVORK5CYII=" /></a></li>
					<li><samp class="login">
							<img
								src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAAAXNSR0IArs4c6QAAAT9JREFUSEvNlusNwjAMhK+TAJMAkwCTAJMAkwCTAJOATkpQmped4qrkb1p/9uVip8NEq5uIi6HgOYANgBeAJ4BbawGtYAJPAFYRiPC1S0KVQwuYsGslKuE7bfUtYELjSuM8CF9oStaCt05iTUxKLp65FrwHcNBQ3XdH6dsxwGd31lW2FiwZK4TQYISbgHmNHlIwt09z0WQmYAbRGExlLAbTSu2zr5mM5hNN5QO1gvkfZeeZL10QynrRyBtqPwQsHZ9q/+/BXt5ZpW1S8rt2WkkVl6aRJCfvMY1WvFY1cEvTyCVCqE8g2S+Bf4V6UHFUlsCaESjJHcKTUZkDt0wiLTzp3zkwnzZsj5aL85nt9LtyYA4DutlyJS+THPhtSQxi9QZIDLZycy73KpgSW8vsk+i9w6TONZLq7fPYLJHJKv4AKg02H/YTa+oAAAAASUVORK5CYII=" />
						</samp></li>
					<li><samp>informacion de la persona logeada</samp></li>
				</ul>
			</nav>
		</div>
	</header>
	<c:forEach items="${matches}" var="match">
		<h1 class="titulo">Matchs para </h1> <span>${match.pretendido.getNombre()}</span>
	</c:forEach>
	
	
	<div class="mascotas">

		<div class="mascota">
			<div class="imagenMascota d-none d-lg-block col-3">
				<img src="img/perro2.jpg" class="mascotaImagen" alt="">
			</div>
			<div class="description">
				<c:forEach items="${matches}" var="match">
					<div class="row">
						<div class="col-6">
							<div class=" m-2">
								<span class="nombreMascota float-left">${match.pretendiente.getNombre()}</span>
								<br>
								<div>
									<span class="description">Lorem ipsum dolor sit amet
										consectetur adipisicing elit. Facilis necessitatibus, eos
										soluta quasi praesentium cumque quaerat at veritatis
										quibusdam, tempora officiis laudantium quisquam sit beatae
										numquam quis laboriosam corporis mollitia.</span>
								</div>
							</div>
						</div>
					</div>
					<br>
					<br>
					<div class="row">
						<div class="col-12 d-flex justify-content-around ">
							<div>
								<a class="enlace" href="MensajeController?idMensaje=${match.id}">MENSAJE</a>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>

	</div>
</body>
</html>