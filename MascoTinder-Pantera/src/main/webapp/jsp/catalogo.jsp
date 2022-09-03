<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catálogo</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
<link href="../css/estilosCatalogo.css" rel="stylesheet">
</head>
<body>
<header>
        <div class="menu">
          <img src="img/logo.jpg" class="logo" alt="logoApp">
          <nav>
            <ul>
              <li><samp></samp></li>
              <li><a href="#"></a></li>
              <li><a href="#"><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAAAXNSR0IArs4c6QAAAR5JREFUSEvt1uENwiAUBODrJOomOok6iTqJOoluoqOYa2iDpdB70IbESGL0B+0HPDhsUKk1lVyUwGsA/DxzBp8LnwCcHcjvixXPgbcAHgPIjFvhMZRjeAM4WpbdAsfQbvImXIW5iV5CHYnv3Aokuysw0SsAzlhpEq7A3Egq6i/7JjXKKTgHlfAUXIJ2+M3t9mDyMZg1PSgFFfqMnvEx2E8l4b1SlwAfwlNnVVIinb5wH14SDdLNh1lT1nbJxljlhguuReIrJ/M3w6OkMUxayLX+Flv6OPGuZoTKx4kd5zjHvwGzZvfB2u0jgTPrjMeSKBY6f7ivUM5xqrbUffp4GyyWeuZrke9kajG/uyQL0seDLX3bx6b+gZTEZfLZavAHgjZFH6oHJd4AAAAASUVORK5CYII="/></a></li>
              <li><samp class="login"><img
                    src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAAAXNSR0IArs4c6QAAAT9JREFUSEvNlusNwjAMhK+TAJMAkwCTAJMAkwCTAJOATkpQmped4qrkb1p/9uVip8NEq5uIi6HgOYANgBeAJ4BbawGtYAJPAFYRiPC1S0KVQwuYsGslKuE7bfUtYELjSuM8CF9oStaCt05iTUxKLp65FrwHcNBQ3XdH6dsxwGd31lW2FiwZK4TQYISbgHmNHlIwt09z0WQmYAbRGExlLAbTSu2zr5mM5hNN5QO1gvkfZeeZL10QynrRyBtqPwQsHZ9q/+/BXt5ZpW1S8rt2WkkVl6aRJCfvMY1WvFY1cEvTyCVCqE8g2S+Bf4V6UHFUlsCaESjJHcKTUZkDt0wiLTzp3zkwnzZsj5aL85nt9LtyYA4DutlyJS+THPhtSQxi9QZIDLZycy73KpgSW8vsk+i9w6TONZLq7fPYLJHJKv4AKg02H/YTa+oAAAAASUVORK5CYII=" /></samp>
              </li>
              <li><samp>información de la persona logeada</samp></li>
            </ul>
          </nav>
        </div>
      </header>
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