<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reminder</title>
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
					  <li><a href="home.jsp">Inicio</a></li>
					  <li><a class="active" href="/newEmployee.jsp">Empleados</a></li>
					  <li><a href="#">Clientes</a></li>
					  <li><a href="#">Cerrar Sesión</a></li>
					</ul>
				</section>
			
				
				<section id="genericSection">
					<h2>Actualizar Datos del Empleado</h2>
					<form action="/EmpleadoEditServlet" method="post" id="formulario">
						<div class="form-group-wrapper">
							<span class="form-group">
								<label for="name">Nombre</label>
								<input type="text" name="nombre" id="nombre" value ="${empleado.nombre}" required/>
							</span>
							<span class="form-group">
								<label for="apellidos">Apellido</label>
								<input type="text" name="apellidos" id="apellidos" value="${empleado.apellido}" required/>
							</span>
                                                       <span class="form-group">
								<label for="cedula">cedula</label>
								<input type="text" name="cedula" id="cedula" value="${empleado.cedula}" required/>
							</span>
                                                        <span class="form-group">
								<label for="correo">correo electronico</label>
								<input type="email" name="correo" id="correo" value="" required/>
							</span>
                                                        <span class="form-group">
								<label for="telefono">telefono</label>
								<input type="text" name="telefono" id="telefono" required/>
							</span>
                                                        <span class="form-group">
                                                            
                                                            <datalist id="estado">
                                                                <option value="Activo">
                                                                <option value="Inactivo">
                                                            </datalist>
                                                            <label for="estado">Estado</label>
                                                            <input type="text" name="estado" id="estado" list="estado" required/>
                                                         </span>       
						</div>
                                            
                                                <div class="form-group-wrapper">
                                                    <input type="submit" name="action" value="Actualizar"/>

                                                    <input type="submit" name="action" value="Limpiar"/>
                                                </div>       
                                   </form>
                            </section> 
			</div>
                    <div><h3>${mensaje}</h3></div>
		</div>
	</body>
</html>