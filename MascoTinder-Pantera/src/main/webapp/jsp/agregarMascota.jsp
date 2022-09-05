<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="NuevaMascotaController">
			
			<label for="txtId">Id</label>
			<input type="hidden" name="txtedad" id="txtid" value="1"/> <br>
			
			<label for="txtId">Edad</label> 
			<input type="text" name="txtedad" id="txtedad" /> <br>
			
			<label for="txtId">Especie</label> 
			<input type="text" name="txtespecie" id="txtespecie" /> <br> 
			
			<label for="txtId">Nombre</label> 
			<input type="text" name="txtnombre" id="txtnombre" /> <br> 
			
			<label for="txtId">Raza</label> 
			<input type="text" name="txtraza" id="txtraza" /> <br>
			
			<label for="txtId">Sexo</label> 
			<input type="text" name="txtsexo" id="txtsexo" /> <br>
			
			<label for="txtId">Ubicacion</label> 
			<input type="text" name="txtubicacion" id="txtubicacion" /> <br> <br> <br>
			
			<input type="submit" value="Guardar" /> 
			<input type="submit" value="Calcelar"  href="ListarMascotasController"/> <br>
</form>

</body>
</html>