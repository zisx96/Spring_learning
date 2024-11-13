<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f9;
            color: #333;
            text-align: center;
            padding: 40px;
        }
        h1 {
            color: #d32f2f;
            font-size: 2.5em;
            margin: 20px 0;
            border-bottom: 2px solid #d32f2f;
            padding-bottom: 10px;
        }
        .container {
            background-color: #ffffff;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            margin: 0 auto;
        }
        .label {
            font-size: 1.5em;
            color: #333;
            margin-bottom: 10px;
        }
        .value {
            font-size: 2em;
            color: #555;
            font-weight: bold;
            margin-bottom: 20px;
        }
        .value, .label {
            text-align: left;
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>Employee Details</h1>

        <div class="label">Employee Id:</div>
        <div class="value">${emp.id}</div>

        <div class="label">Employee Name:</div>
        <div class="value">${emp.ename}</div>

        <div class="label">Employee City:</div>
        <div class="value">${emp.ecity}</div>

        <div class="label">Employee Salary:</div>
        <div class="value">${emp.esalary}</div>
    </div>

</body>
</html>