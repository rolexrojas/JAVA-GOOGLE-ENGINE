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
    private String idempleado = "";
    private String nombre = "";
    private String apellido = "";
    private String genero = "";
    private String cedula = "";
    private String sueldo = "";
    private String posicion = "";
    private String estado = "";
    Direccion dir = new Direccion();
    Telefono tel = new Telefono();

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }
    
    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    public Telefono getTel() {
        return tel;
    }

    public void setTel(Telefono tel) {
        this.tel = tel;
    }
    
    public Employee() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public List<Employee> MostrarEmpleados(){
         EmployeeDA myEmpDa = new EmployeeDA();
         List<Employee> empleados = new ArrayList<>();
        try {
     
            ResultSet rs = myEmpDa.SelectEmployees("SELECT * FROM empleado");// join direccion on idempleado = direccion.empleado_idempleado " +
                                                                                     //               "join telefono on idempleado = telefono.empleado_idempleado");
            System.out.println("before rs.next");
            
            while(rs.next()) {
              Employee myemp = new Employee();   
                myemp.setIdempleado(rs.getString("idempleado"));
                myemp.setNombre(rs.getString("nombre"));
                myemp.setApellido(rs.getString("apellido"));
                myemp.setCedula(rs.getString("cedula"));
                myemp.setPosicion(rs.getString("posicion"));
                    empleados.add(myemp);      
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
       return empleados; 
    }
    
    public boolean GuardarEmpleado(){
        
     EmployeeDA emp = new EmployeeDA();
     String query = "INSERT INTO `empleado`(`nombre`, `apellido`, `cedula`, `sueldo`, `posicion`, `estado`) VALUES ('" + this.getNombre() + "', '" + this.getApellido() + "', '" + this.getCedula()+ "', '" + this.getSueldo() + "', '" + this.getPosicion() + "', '" + this.getEstado() + "')";
     
     //System.out.println(query);
     if(emp.Insertar(query)){
         return true;
     }
     return false;
    }
    
        public Employee MostrarEmpleado(int idempleado){
         EmployeeDA myEmpDa = new EmployeeDA();
        // List<Employee> empleados = new ArrayList<>();
        Employee myemp = new Employee(); 
        try {
     
            ResultSet rs = myEmpDa.SelectEmployees("SELECT * FROM empleado join direccion on idempleado = direccion.empleado_idempleado " +
                                                             "join telefono on idempleado = telefono.empleado_idempleado WHERE idempleado = '" + idempleado + "'");
            System.out.println("before rs.next");
            
            while(rs.next()) {
                
                myemp.setIdempleado(rs.getString("idempleado"));
                myemp.setNombre(rs.getString("nombre"));
                myemp.setApellido(rs.getString("apellido"));
                myemp.setCedula(rs.getString("cedula"));
                myemp.setPosicion(rs.getString("posicion"));
                   
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
       return myemp; 
    }
    
    
    
}
