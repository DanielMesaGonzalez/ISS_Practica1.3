<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="st" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sesion</title>
</head>
<body>
<h1>Datos de Usuario</h1>
<table>
<tr style="background:#BDBDBD">
<th> Nombre </th>
<th> Apellidos </th>
<th> Email </th>
</tr>
<tr style="background:#01A9DB">
<td>${user.nombre}</td>
<td>${user.apellidos}</td>
<td>${user.email}</td>
</tr>
</table>
</body>
</html>