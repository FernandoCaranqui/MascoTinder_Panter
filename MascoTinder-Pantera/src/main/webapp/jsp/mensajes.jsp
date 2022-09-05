<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mensajes</title>
<link
	href="${pageContext.request.contextPath}/templates/banner_interno..css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/estilosMensajes.css" rel="stylesheet">
</head>
<body>
	<%@include file="../templates/banner_interno.html" %>
	<section class="form-register">
		<form>
			<h1 class="titulo">Mensajes</h1>
			<br>
			<textarea class="controls" name="Review" rows="3" cols="30">${mensajes.contenido}</textarea>
			<br>
			<br> <input class="remitente" type="text" name="mensaje1">
			<input class="enviar" type="submit" value="Enviar">
		</form>
	</section>
</body>
</html>