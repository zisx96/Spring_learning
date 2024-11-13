<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Entry Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f4f4f9;
        }
        form {
            margin-top: 20px;
            width: 300px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            background-color: #fff;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
            border: 1px solid #ddd;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px;
            width: 100%;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        h1 {
            text-align: center;
            color: #333;
        }
    </style>
</head>
<body>

    <div>
        <h1>Employee Entry Form</h1>

        <form:form method="POST" modelAttribute="emp">
            <label for="id">Employee ID:</label>
            <form:input path="id"  />

            <label for="ename">Employee Name:</label>
            <form:input path="ename"  />

            <label for="ecity">Employee City:</label>
            <form:input path="ecity"  />

            <label for="esalary">Employee Salary:</label>
            <form:input path="esalary"  />

            <input type="submit" value="Submit">
        </form:form>
    </div>

</body>
</html>
