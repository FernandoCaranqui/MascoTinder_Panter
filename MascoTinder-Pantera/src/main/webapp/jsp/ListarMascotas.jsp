<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Listar Mascotas</title>
<link
	href="${pageContext.request.contextPath}/css/estilosListarMascotas.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/templates/banner_interno.css"
	rel="stylesheet">
</head>

<body>
	<%@include file="../templates/banner_interno.html" %>
	
	
	<div class="titulo">
		<h1 >Mis Mascotas</h1>
	</div>
	
	<div  class="btnAgregar">
		<a href="NuevaMascotaController?user=${usuario.getId()}">Nuevo</a>
	</div>
	<br>
	<div class="mascotas">
		<c:forEach items="${mascotas}" var="mascota">
			<div class="mascota">
				<div class="imagenMascota">
					<img src="img/Lunes.jpg" class="mascotaImagen" alt="">
				</div>
				<div class="description col-12 col-lg-8 ">
					<div class="row">
						<div class="col-12">
							<div class=" m-2">
								<div class="Informacion">Nombre: <span class="nombreMascota ">${mascota.nombre}</span></div>
								<div class="Informacion">Especie: <span class="nombreMascota ">${mascota.especie}</span></div>
								<div class="Informacion">Raza: <span class="nombreMascota ">${mascota.raza}</span></div>
								<div class="Informacion">Edad: <span class="nombreMascota ">${mascota.edad} Años</span></div>
								<div class="Informacion">Sexo: <span class="nombreMascota ">${mascota.sexo}</span></div>
								<div class="Informacion">Ubicación: <span class="nombreMascota ">${mascota.ubicacion}</span></div>
							</div>
						</div>
					</div>
			
					<br>
					<div class="row">
						<div class="col-12 d-flex justify-content-around ">
							<div>
								<a class="enlace" href="PreferenciasController">PREFERENCIAS</a>
							</div>
							<div>
								<a class="enlace" href="MatchController?idMascota=${mascota.id}&nombreMascota=${mascota.nombre}">MATCHES</a>
								<i class="fas fa-heart"></i><span class = "numMatch"> 350 </span>
							</div>
							<div>
								<a class="enlace" href="BuscarMascotasController">BUSCAR</a>
							</div>
						</div>
						<div class="cajaBotonEliminar"><a href="EliminarMascotaController?idMascota=${mascota.id}">Eliminar</a></div>
						<div class="cajaBotonActualizar"><a href="EliminarMascotaController?idMascota=${mascota.id}">Actualizar</a></div>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
</body>

</html>