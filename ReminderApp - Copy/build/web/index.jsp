<%-- 
    Document   : index
    Created on : May 23, 2016, 10:18:43 AM
    Author     : rrojas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
        <link rel="stylesheet" href="/css/styles.css" />
    </head>
    <body>
        
        <section id="genericSection">
					<h2>Bienvenido a Reminder App<h2>
					
					<div class="gridWrapper" >
                                            <form action="/EmpleadoServlet" method="post">
						<table class="grid" style="width: 50%;">
							<thead>
								<tr>
                                                                        <th align="center"><span>usuario</span></th>
                                                                        <th align="center"><span>contrasena</span></th></tr>
							<thead>
							<tbody>
								<tr>
                                                                
									<td align="center"><input type="text" name="usuario"/></td>
									<td align="center"><input type="password" name="contrasena"/></td>
									
								</tr>
                                                                <tr>
                                                        
                                                                </tr>
                                                                <tr>
                                                        
                                                                </tr>
                                                                <tr><td align="center"><input type="submit" name="action" value="login"/></td></tr>
                                                                
							</tbody>
						</table>
                                            </form>
					</div>
					
				</section>
        <section><div  style="align:center;color:${color};animation-duration:4s;"><h3>${mensaje}</h3></div></section>
        
        
    </body>
</html>
