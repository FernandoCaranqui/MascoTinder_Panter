<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>

<link href="${pageContext.request.contextPath}/css/estilosLogin.css" rel = "stylesheet">
   
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
	
</head>
<body>
    <div class="container">
        <div class = "wrapper">
            <div class="formContent">
                <img src="img/MascotinderLogo.png" width="224px" height="280px" class="logo">
                <form method="post" action="LoginController">
                    <input type="hidden" name="txtId" id="txtId" value="${persona.id}" />
				    <br>
                    <fieldset>
                        <legend>Log in</legend>
                        <p>Usuario</p>
                        <input type="text" name="usuario" id="txtNombre" class="entradas" value="${persona.nombre}" />
                        <p>Constraseña</p>
                        <input type="password" name="password" id="txtClave" class="entradas" value="${persona.password}" />
                        <br>
                        <br> <input type="submit" value="Ingresar">
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</body>
</html>