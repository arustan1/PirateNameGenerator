<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Your Pirate Name</title>
</head>
<body>
<p>Your pirate name is: ${pirateName.getFirstName()} ${pirateName.getLastName() }
</p>
<a href="index.jsp">Get another pirate name</a>
</body>
</html>