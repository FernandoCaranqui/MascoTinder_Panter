<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Catálogo</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<link href="../css/estilosCatalogo.css" rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/css/estilosListarMascotas.css"
	rel="stylesheet">
<body>
<%@include file="../templates/banner_interno.html" %>
    <div class="ancho">
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img class="d-block w-100" src="img/carrucel1.jpg" alt="First slide">
            <div class="carousel-caption d-none d-md-block">
              <h5>Nombre de la mascota</h5>
              <p>Descripcion</p>
            </div>
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="img/carrucel2.jpg" alt="Second slide">
            <div class="carousel-caption d-none d-md-block">
              <h5>Nombre de la mascota</h5>
              <p>Descripcion</p>
            </div>
          </div>
          <div class="carousel-item">
            <img class="d-block w-100" src="img/carrucel3.jpg" alt="Third slide">
            <div class="carousel-caption d-none d-md-block">
              <h5>Nombre de la mascota</h5>
              <p>Descripcion</p>
            </div>
          </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
    </div>
      <div class="espaciado">
        <div class="meGusta">
            <a href="#">Me gusta</a>
        </div>
        <div class="noMegusta">
            <a href="#">No me gusta</a>
        </div>
      </div>
      <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
</body>
</html>