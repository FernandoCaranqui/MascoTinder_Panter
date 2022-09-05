<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preferencias</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
    <link href="estilosPreferencias.css" rel="stylesheet">
</head>
<body>
<header>
        <div class="menu">
            <img src="img/logo.jpg" class="logo" alt="logoApp">
            <nav>
                <ul>
                    <li><samp></samp></li>
                    <li><a href="#"></a></li>
                    <li><a href="#"><img
                                src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAAAXNSR0IArs4c6QAAAR5JREFUSEvt1uENwiAUBODrJOomOok6iTqJOoluoqOYa2iDpdB70IbESGL0B+0HPDhsUKk1lVyUwGsA/DxzBp8LnwCcHcjvixXPgbcAHgPIjFvhMZRjeAM4WpbdAsfQbvImXIW5iV5CHYnv3Aokuysw0SsAzlhpEq7A3Egq6i/7JjXKKTgHlfAUXIJ2+M3t9mDyMZg1PSgFFfqMnvEx2E8l4b1SlwAfwlNnVVIinb5wH14SDdLNh1lT1nbJxljlhguuReIrJ/M3w6OkMUxayLX+Flv6OPGuZoTKx4kd5zjHvwGzZvfB2u0jgTPrjMeSKBY6f7ivUM5xqrbUffp4GyyWeuZrke9kajG/uyQL0seDLX3bx6b+gZTEZfLZavAHgjZFH6oHJd4AAAAASUVORK5CYII=" /></a>
                    </li>
                    <li><samp class="login"><img
                                src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAAAXNSR0IArs4c6QAAAT9JREFUSEvNlusNwjAMhK+TAJMAkwCTAJMAkwCTAJOATkpQmped4qrkb1p/9uVip8NEq5uIi6HgOYANgBeAJ4BbawGtYAJPAFYRiPC1S0KVQwuYsGslKuE7bfUtYELjSuM8CF9oStaCt05iTUxKLp65FrwHcNBQ3XdH6dsxwGd31lW2FiwZK4TQYISbgHmNHlIwt09z0WQmYAbRGExlLAbTSu2zr5mM5hNN5QO1gvkfZeeZL10QynrRyBtqPwQsHZ9q/+/BXt5ZpW1S8rt2WkkVl6aRJCfvMY1WvFY1cEvTyCVCqE8g2S+Bf4V6UHFUlsCaESjJHcKTUZkDt0wiLTzp3zkwnzZsj5aL85nt9LtyYA4DutlyJS+THPhtSQxi9QZIDLZycy73KpgSW8vsk+i9w6TONZLq7fPYLJHJKv4AKg02H/YTa+oAAAAASUVORK5CYII=" /></samp>
                    </li>
                    <li><samp>información de la persona logeada</samp></li>
                </ul>
            </nav>
        </div>
    </header>
    <div>
        <section >
            <form action="CatalogoController" class="form-register">
                <h1 class="titulo">Preferencias</h1>
                <p>Buscar mascotas que cumplen con: </p>
                Tipo
                <br>
                <select class="controls" name="select">
                    <option value="especies" selected>Opciones</option>
                    <option value="especies1">Perros</option>
                    <option value="especies2">Gatos</option>
                    <option value="especies3">Aves</option>
                    <option value="especies4">Caballos</option>
                    <option value="especies5">Vacas</option>
                </select>
                <br>
                Sexo
                <br>
                <select class="controls" name="select">
                    <option value="Sexos" selected>Opciones</option>
                    <option value="Sexo1">Hembra</option>
                    <option value="Sexo2">Macho</option>
                </select>
                <br>
                Ubicación
                <br>
                <select class="controls" name="select">
                    <option value="Ubicaciones" selected>Opciones</option>
                    <option value="Ubicacion1">Quito</option>
                    <option value="Ubicacion2">Guayaquil</option>
                    <option value="Ubicacion3">Cuenca</option>
                    <option value="Ubicacion4">Ibarra</option>
                    <option value="Ubicacion5">Esmeraldas</option>
                </select>
                <br>
                <h2>Rangos de Edad</h2>
                Mayores a
                <br>
                <select class="controls" name="select">
                    <option value="Edades" selected>Opciones</option>
                    <option value="Edad1">1 año</option>
                    <option value="Edad2">2 años</option>
                    <option value="Edad3">5 años</option>
                </select>
                <br>
                Menores a
                <br>
                <select class="controls" name="select">
                    <option value="EdadesM" selected>Opciones</option>
                    <option value="EdadesM1">5 años</option>
                    <option value="EdadesM2">3 años</option>
                    <option value="EdadesM3">2 años</option>
                </select>
                <br><br>
                <input class="enviar" type="submit">
            </form>
        </section>
    </div>
</body>
</html>