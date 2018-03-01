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
Username : ${sessionScope.nUsuario}
Username from session:<st:out value="${sessionScope.nUsuario}"/>
<jsp:useBean id="nUsuario" scope="session" class="P3.UsuariosDAO"></jsp:useBean>
<p>El nombre es <jsp:getProperty  property="nombre" name="nUsuario"/></p>
<p>El apellido es <jsp:getProperty  property="apellidos" name="nUsuario"/></p>
<p>El email es <jsp:getProperty  property="email" name="nUsuario"/></p>
</body>
</html>