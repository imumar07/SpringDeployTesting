<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic JSP Page</title>
</head>
<body>
    <h1>Hello, World!</h1>
    
    <%
        // Java code can be included in JSP pages
        String name = "Visitor";
    %>

    <p>Welcome, <%= name %>!</p>
    <a href="/next">
        <button>Next Page</button>
    </a>
</body>
</html>
