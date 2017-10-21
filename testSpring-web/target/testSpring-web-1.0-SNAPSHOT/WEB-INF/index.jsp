<%-- 
    Document   : index
    Created on : 21-Oct-2017, 10:42:21
    Author     : nth15
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! This is rapture project</h1>
        <form method="POST" action="greeting">
            <input type="submit" value="Test">
            <h1>${greeting}</h1>
        </form>
    </body>
</html>
