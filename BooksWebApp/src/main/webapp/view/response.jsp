<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring</title>
</head>
<body style="text-align:center">
		
	<h1 style="text-align:center; color:blue">Displaying Data From an Array or Collection</h1>
	<c:forEach var="book" items="${booksName}">
	<p>${book}</p>
	 </c:forEach>
	
</body>
</html>