<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucess Register</title>
</head>
<body>


<h1 style="color:green">${msg}</h1>

<h1>${user.email}</h1>
<h1>${user.name}</h1>
<h1>${user.password}</h1>


</body>
</html>