
package com.ReminderApp.Servlets;

import com.ReminderApp.Model.Direccion;
import com.google.appengine.api.utils.SystemProperty;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import com.ReminderApp.Model.Employee;
import com.ReminderApp.Model.Login;
import com.ReminderApp.Model.Telefono;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rrojas
 */

public class EmpleadoServlet extends HttpServlet {
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
          
            String action = request.getParameter("action");
            String mensaje = "", color = "";
            
            if(action.equals("login")){
             String usuario = request.getParameter("usuario");
             String contrasena = request.getParameter("contrasena");
             
             Login logger = new Login(usuario, contrasena);
             logger.ValidarUsuario();
             
             if(logger.isLogged_in()){
             mensaje = "Usuario Loggeado Con Exito";
             color = "GREEN"; 
             response.sendRedirect("/newEmployee.jsp");
             
            HttpSession session = request.getSession();
            session.setAttribute("UserName", usuario);
             }else{
            mensaje = "Lo sentimos, ocurrio un error con la autenticacion";
            color = "RED";
            request.setAttribute("mensaje", mensaje);
            request.setAttribute("color", color);  
            request.getRequestDispatcher("index.jsp").forward(request, response);
            //response.sendRedirect("/index.jsp");   
             }
            }
            if(action.equals("MostrarEmpleados")){
            Employee employee = new Employee();
            
            
            request.setAttribute("empleado", employee.MostrarEmpleados());
            request.getRequestDispatcher("viewEmployee.jsp").forward(request, response);
            }
            
            if(action.equals("Enviar")){
                         
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String cedula = request.getParameter("cedula");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		String estado = request.getParameter("estado");
		
		String pais = request.getParameter("combo_Paises");
		String Provincia = request.getParameter("combo_Provincia");
		String sector = request.getParameter("sector");
		String calle = request.getParameter("calle");
                
          Employee empleado = new Employee();
          empleado.setNombre(nombre);
          empleado.setApellido(apellidos);
          empleado.setEstado(estado);
          empleado.setGenero("M");
          empleado.setPosicion("abogado");
          empleado.setCedula(cedula);
          empleado.setSueldo("65000");
          
          boolean emp = empleado.GuardarEmpleado();
          
          String detalledir = calle + " " + "";
          
          Direccion dir1 = new Direccion("Santo Domingo", pais, Provincia, sector, calle);
          dir1.InsertarDireccionEmpleado(empleado);
                
           Telefono tel = new Telefono(telefono, "Residencial");
          tel.InsertarTelefonoEmpleado(empleado);  
          
             if(emp){
                 
                    mensaje = "Registrado correctamente";
                    color = "GREEN";
                     response.sendRedirect("/ViewerServlet");
                }else{
                    mensaje = "Error al insertar el empleado";
                    color = "RED";
                   
      
            request.setAttribute("mensaje", mensaje);
            request.setAttribute("color", color);
           request.getRequestDispatcher("newEmployee.jsp").forward(request, response);
           }
            }else if(action.equals("Limpiar")){
           // System.out.println("Limpiando");
             request.getRequestDispatcher("newEmployee.jsp").forward(request, response);
            
            }
            
            
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
      
  }
    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         processRequest(request, response);
         
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
