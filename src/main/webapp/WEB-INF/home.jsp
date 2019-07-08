<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head><h1 align="center">MovieHub</h1>
</head> 
<body>
<form:form action="addMovieDetails" modelAttribute="ticket" method="post"> 
<center>
Username : <input type="text" name="Username"></br></br> 
Password : <input type="Password" name="Password"></br></br> 
<input type="Submit" name="Login" value="Login"/>
<input type="submit" value="Cancel" name="cancel"/> 
</center>
</form:form> 
</body> 
</html>