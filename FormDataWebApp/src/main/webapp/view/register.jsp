<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

        <form method="POST">
            <label for="id">Employee ID:</label>
            <input type="number" id="id" name="id" required>

            <label for="ename">Employee Name:</label>
            <input type="text" id="ename" name="ename" required>

            <label for="ecity">Employee City:</label>
            <input type="text" id="ecity" name="ecity" required>

            <label for="esalary">Employee Salary:</label>
            <input type="number" id="esalary" name="esalary" required>

            <input type="submit" value="Submit">
        </form>
    </div>

</body>
</html>
