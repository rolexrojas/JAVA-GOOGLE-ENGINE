/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ReminderApp.Model;

/**
 *
 * @author Owner
 */
public class Telefono {
    private String telefono;
    private String tipo;

    public Telefono(){}
    
    public Telefono(String telefono, String tipo) {
        this.telefono = telefono;
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
  public void InsertarTelefonoEmpleado(Employee empleado){
        EmployeeDA empDA = new EmployeeDA();
           int idEmpleado = 999;
    String query = "SELECT idempleado FROM empleado where cedula = '" + empleado.getCedula() + "'"; 
    //  System.out.println(query);
      idEmpleado = empDA.SelectIdEmpleado(query);
     // System.out.println(idEmpleado);
    String query2 = "INSERT INTO `telefono` (`telefono`, `tipo`, `empleado_idempleado`, `cliente_idcliente` ) VALUES ('" + this.getTelefono() +"', '" + this.getTipo() +"', '" + idEmpleado + "', "+ null + ")";
   // System.out.println(query2);
          empDA.Insertar(query2);
           
    }
    
    public void InsertarDireccionCliente(Cliente cliente){
        ClienteDA empDA = new ClienteDA();
           int idCliente = 999;
    String query = "SELECT idcliente FROM cliente where cedula = '" + cliente.getCedula() + "'"; 
    idCliente = empDA.SelectIdCliente(query);
     // System.out.println(idCliente);
    String query2 = "INSERT INTO `telefono`(`telefono`, `tipo`, `empleado_idempleado`, `cliente_idcliente` ) VALUES ('" + this.getTelefono() +"', '" + this.getTipo() +"', " + null + ", '"+ idCliente + "')";
    //System.out.println(query2);
          empDA.Insertar(query2);
           
    }
    
    
}
