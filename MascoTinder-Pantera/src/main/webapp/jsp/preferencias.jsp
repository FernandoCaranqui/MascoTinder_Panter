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
    
    <link href="${pageContext.request.contextPath}/css/estilosPreferencias.css" rel="stylesheet">
    <link
	href="${pageContext.request.contextPath}/templates/banner_interno.css"
	rel="stylesheet">
</head>
<body>
<%@include file="../templates/banner_interno.html" %>
    <div>
        <section >
            <form method="post" action="BuscarMascotasController" class="form-register">
                <h1 class="titulo">Preferencias</h1>
                <p>Buscar mascotas que cumplen con: </p>
                Tipo
                <br>
                <select class="controls" name="especie">
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
                <select class="controls" name="sexo">
                    <option value="Sexos" selected>Opciones</option>
                    <option value="Sexo1">Hembra</option>
                    <option value="Sexo2">Macho</option>
                </select>
                <br>
                Ubicación
                <br>
                <select class="controls" name="ubicacion">
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
                <select class="controls" name="edad-min">
                    <option value="Edades" selected>Opciones</option>
                    <option value="Edad1">1 año</option>
                    <option value="Edad2">2 años</option>
                    <option value="Edad3">5 años</option>
                </select>
                <br>
                Menores a
                <br>
                <select class="controls" name="edad-max">
                    <option value="EdadesM" selected>Opciones</option>
                    <option value="EdadesM1">5 años</option>
                    <option value="EdadesM2">3 años</option>
                    <option value="EdadesM3">2 años</option>
                </select>
                <br><br>
                <input class="enviar" type="submit" >
            </form>
        </section>
    </div>
</body>
</html>