/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ReminderApp.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rrojas
 */
public class Employee {
    private String name = "";
    private String lastname = "";
    private String occupation = "";
    private String gender = "";

    public Employee() {
    }
    
    public Employee(String na, String la, String occ, String gen){
     name = na;
     lastname = la;
     occupation = occ;
     gender = gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public List<Employee> MostrarEmpleados(){
         EmployeeDA myEmpDa = new EmployeeDA();
        
         List<Employee> empleados = new ArrayList<>();
        try {
     
            ResultSet rs = myEmpDa.SelectEmployees("SELECT * FROM reminderdblocal.employee");
            while(rs.next()) {
                 Employee current = new Employee();
                current.setName(rs.getString("name"));
                current.setLastname(rs.getString("lastname"));
                current.setOccupation(rs.getString("occupation"));
                current.setGender(rs.getString("gender"));
                    empleados.add(current);      
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
       return empleados; 
    }
    
    
    
}
