/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ReminderApp.Servlets;

import com.ReminderApp.Model.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rrojas
 */
public class EmpleadoEditServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        
        
                        String paramValue = "";
                        Employee emp = new Employee();
                        String[] param = request.getParameterValues("employee");
                   
                        for (String param1 : param) {
                            paramValue = param1;
                        }
             
                        if(paramValue.isEmpty()){

                        }
              
                    int id = Integer.parseInt(paramValue);
                    emp = emp.MostrarEmpleado(id);
                 //emp.MostrarEmpleado(id);
               request.setAttribute("empleado", emp);
              request.getRequestDispatcher("editEmployee.jsp").forward(request, response); 
           
                  
                    
        
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
