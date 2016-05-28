<%-- 
    Document   : viewEmployee
    Created on : May 27, 2016, 1:22:22 AM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
		<meta charset="UTF-8">
		<title>REMINDER APP</title>
		<link rel="stylesheet" href="/css/styles.css" />
	</head>
	<body>
		<div id="bodyWrapper">
			<div class="innerWrapper">
			
				<section id="header">
					<h1>Reminder App</h1>
					<ul id="mainMenu">
					  <li><a  href="#">Inicio</a></li>
					  <li><a class="active" href="#">Empleados</a></li>
					  <li><a href="#">Clientes</a></li>
					  <li><a href="#">Cerrar Sesión</a></li>
					</ul>
				</section>
                            
                            <section id="genericSection">
					<h2>Lista de Empleados<h2>
					<ul id="submenu">
						<li><a href="/newEmployee.jsp">Registrar Empleado</a><li>
					</ul>
					
					<div class="gridWrapper">
						<table class="grid">
							<thead>
								<tr>
									 <th>Nombre</th>
                                                                        <th>Apellido</th>
                                                                        <th>Cedula</th>
                                                                      <!--  <th>Sueldo</th> -->
                                                                        <th>Posicion</th>
                                                                       <!--   <th>Estado</th>
                                                                        <th>Telefono</th>
                                                                        <th>Tipo</th>-->
								</tr>
							</thead>
							<tbody>
                                                            <c:forEach items="${empleado}" var="emp">
								<tr>
								        <td><a href="/EmpleadoEditServlet?employee=${emp.idempleado}">${emp.nombre}</a></td>
                                                                        <td>${emp.apellido}</td>
                                                                        <td>${emp.cedula}</td>
                                                                        <td>${emp.posicion}</td>
								</tr>
                                                             </c:forEach>
							</tbody>
						</table>
                                                    
					</div>
					
				</section>
     <!--   <input type="submit" name="action" value="MostrarEmpleados"/> -->
     
    </body>
</html>

