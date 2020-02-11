<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Pirate Name Generator</title>
</head>
<body>
<h1>Pirate Name Generator</h1>
<form action="getNameServlet" method="post">
Enter the color of your shirt:
<input type="text" name="shirtColor" size="10">
<br /><br />
Enter your birth month:
<input type="text" name="birthMonth" size="10">
<br /><br />
<input class="button" type="submit" value="Generate" />
</form>
</body>
</html>