/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ReminderApp.Servlets;

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
import com.ReminderApp.Model.Employee;
import java.util.List;

/**
 *
 * @author rrojas
 */
public class EmpleadoServlet extends HttpServlet {
    private Employee emp = new Employee();
     
     
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            List<Employee> Empleados = emp.MostrarEmpleados();
             response.getWriter().println();
           
            for(int x=0; x < Empleados.size(); x++){
               response.getWriter().println(Empleados.get(x).getName());
            }
            
            //ConexionDB myCon = new ConexionDB();
           // Connection conn = myCon.Connect();
            
          //  Statement st = myCon.getConn().createStatement();
          //  ResultSet rs = st.executeQuery("SELECT * FROM reminderdblocal.employee");
          // ResultSet rs = st.executeQuery("SELECT * FROM reminderDB.employee");
          //  while (rs.next()) {
          //      response.getWriter().println(rs.getString(1));
          //  }
            
            
            
            
            /*
            String url = "";
            boolean DevelopmentMode = System.getProperty("dev-environment-mode") == "1" ? true : false;
            if(DevelopmentMode){
            System.out.println("Loading driver...");
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded!");
            } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
            }
            
            url = System.getProperty("ae-cloudsql.local-database-url");
            
            try {
            Connection conn = DriverManager.getConnection(url);
            
            try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SHOW DATABASES");
            while (rs.next()) {
            response.getWriter().println(rs.getString(1));
            }
            response.getWriter().println("-- done --");
            } finally {
            conn.close();
            }
            } catch (SQLException e) {
            response.getWriter().println("SQLException: " + e.getMessage());
            }
            }else{
            System.out.println("Loading driver...");
            
            try {
            Class.forName("com.mysql.jdbc.GoogleDriver");
            System.out.println("Driver loaded!");
            } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
            }
            
            url = System.getProperty("ae-cloudsql.cloudsql-database-url");
            
            try {
            Connection conn = DriverManager.getConnection(url);
            
            try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM reminderDB.employee");
            while (rs.next()) {
            response.getWriter().println(rs.getString("name"));
            }
            response.getWriter().println("-- done --");
            } finally {
            conn.close();
            }
            } catch (SQLException e) {
            response.getWriter().println("SQLException: " + e.getMessage());
            }
            
            }
            
            
            /*
            String url = "RESULTADO URL";
            
            ResultSet resultado = null;
            final String selectSql = "SELECT * FROM reminderdblocal.employee";
            PrintWriter out= response.getWriter();
            out.print("PROCESS REQUEST");
            try {
            
            out.print("To get Driver");
            try {
            Class.forName("com.mysql.jdbc.GoogleDriver").newInstance();
            out.print("To get Driver2");
            } catch (InstantiationException ex) {
            Logger.getLogger(EmpleadoServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
            Logger.getLogger(EmpleadoServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            out.print("Getting driver");
            try {
            out.print("Inner Connection");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reminderdblocal?user=root;password=webroot");
            out.print("got connected");
            resultado =  conn.prepareStatement(selectSql).executeQuery();
            
            out.print(resultado);
            
            } catch (SQLException ex) {
            Logger.getLogger(EmpleadoServlet.class.getName()).log(Level.SEVERE, null, ex);
            url = ex.getMessage();
            }
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoServlet.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
            
            
            try (ResultSet rs = resultado) {
            out.print("Empleados:\n");
            while (rs.next()) {
            String savedIp = rs.getString("nombre");
            String timeStamp = rs.getString("apellido");
            out.print(" Nombre: " + savedIp + " Apellido" + timeStamp +"\n");
            }
            }catch (SQLException e) {
            throw new ServletException("SQL error", e);
            }
            
            
            
            
            try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmpleadoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmpleadoServlet at " + request.getContextPath() + "</h1>");
            out.println("<span>Servlet EmpleadoServlet at " + request.getParameter("hiddenfield") + "</span>");
            out.println("</br><span>La conexion" + url + "</span>");
            out.println("</body>");
            out.println("</html>");
            }
        */ 
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        /*
        res.setContentType("text/plain");

    String url = null;
    try {
      if (SystemProperty.environment.value() == SystemProperty.Environment.Value.Production) {
        // Load the class that provides the new "jdbc:google:mysql://" prefix.
        Class.forName("com.mysql.jdbc.GoogleDriver");
        url = System.getProperty("ae-cloudsql.cloudsql-database-url");
      } else {
        Class.forName("com.mysql.jdbc.Driver");
        url = System.getProperty("ae-cloudsql.local-database-url");
      }
    } catch (Exception e) {
      e.printStackTrace();
      return;
    }

    try {
      Connection conn = DriverManager.getConnection(url);

      try {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SHOW DATABASES");
        while (rs.next()) {
          res.getWriter().println(rs.getString(1));
        }
        res.getWriter().println("-- done --");
      } finally {
        conn.close();
      }
    } catch (SQLException e) {
      res.getWriter().println("SQLException: " + e.getMessage());
    }
/*/
  }
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
