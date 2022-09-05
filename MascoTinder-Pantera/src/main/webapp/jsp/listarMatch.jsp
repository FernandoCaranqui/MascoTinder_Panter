<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Matchs</title>

<link
	href="${pageContext.request.contextPath}/css/estilosListarMatchs.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/templates/banner_interno..css"
	rel="stylesheet">

</head>
<body>
	<%@include file="../templates/banner_interno.html" %>
	<h1 class="titulo">
		Matchs para
		<%=request.getParameter("nombreMascota")%></h1>
	<div class="container-fluid mascota">

		<div class="row">
			<c:forEach items="${matches}" var="match">
				<div class="col-3">
					<div class="card">
						<div>
							<div class="titulo2">${match.pretendiente.getNombre()}</div>
							<div class="line">
								<hr>
							</div>

							<div class="contents">

								<img src="img/perro1.jpg" class="card-img-top"
									style="height: 100%;">
								<p class="descripcion">Lorem ipsum dolor sit amet
									consectetur adipisicing elit. Facilis necessitatibus, eos
									soluta quasi praesentium cumque quaerat at veritatis quibusdam,
									tempora officiis laudantium quisquam sit beatae numquam quis
									laboriosam corporis mollitia.</p>
							</div>
							<a class="mensajes" href="">MENSAJES</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>