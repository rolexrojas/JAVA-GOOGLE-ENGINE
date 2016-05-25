<%-- 
    Document   : index
    Created on : May 23, 2016, 10:18:43 AM
    Author     : rrojas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="/EmpleadoServlet" method="post">
            <input type="hidden" value="Hello World" name="hiddenfield"/>
            <input type="submit" name="enviar" value="enviar"/>
        </form>
    </body>
</html>
