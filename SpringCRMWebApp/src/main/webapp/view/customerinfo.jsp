<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        .button-primary {
            display: inline-block;
            margin-bottom: 20px;
            padding: 10px 20px;
            font-size: 16px;
            color: #fff;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
        }

        .button-primary:hover {
            background-color: #0056b3;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f4f4f4;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin: 0;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 4px;
        }

        .action-buttons button {
            margin: 0 5px;
            padding: 8px 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .update-btn {
            background-color: #28a745;
            color: white;
        }

        .update-btn:hover {
            background-color: #218838;
        }

        .delete-btn {
            background-color: #dc3545;
            color: white;
        }

        .delete-btn:hover {
            background-color: #c82333;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>User Management</h1>
        <a href="/CRMApp/showForm" class="button-primary">New User Register</a>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>City</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
            </thead>
            
            <c:forEach var="customer" items="${customers}">
            <c:url var = "updateLink" value="/updateForm"> 
            
            <c:param name="cxid" value="${customer.id}"></c:param>
            
            </c:url>
            
            <c:url var = "deleteLink" value="/deleteForm"> 
            
            <c:param name="cxid" value="${customer.id}"></c:param>
            
            </c:url>
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.city}</td>
                   	
                   	<td><a href="${updateLink}">Update</a></td>
                   	<td><a href="${deleteLink}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>