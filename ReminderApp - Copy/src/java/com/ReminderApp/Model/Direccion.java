/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ReminderApp.Model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class Direccion {
    private String ciudad;
    private String pais;
    private String provincia;
    private String sector;
    private String detalle;
   // public Cliente client;
    public Employee empleado;
    
    
    public Direccion(){}

    public Direccion(String ciudad, String pais, String provincia, String sector, String detalle) {
        this.ciudad = ciudad;
        this.pais = pais;
        this.provincia = provincia;
        this.sector = sector;
        this.detalle = detalle;
    }
     
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    public void SetIdEmpleado(){
        
    }
    
    public void InsertarDireccionEmpleado(Employee empleado){
        EmployeeDA empDA = new EmployeeDA();
           int idEmpleado = 999;
    String query = "SELECT idempleado FROM empleado where cedula = '" + empleado.getCedula() + "'"; 
      //System.out.println(query);
      idEmpleado = empDA.SelectIdEmpleado(query);
      //System.out.println(idEmpleado);
    String query2 = "INSERT INTO `direccion` (`ciudad`, `pais`, `provinicia`, `sector`, `detalle`, `cliente_idcliente`, `empleado_idempleado`) VALUES ('" + this.getCiudad() +"', '" + this.getPais() +"', '', '"+ this.getSector() + "', ' " + this.getDetalle() + "'," + null + " , '" + idEmpleado + "')";
     //System.out.println(query2);
          empDA.Insertar(query2);
           
    }
    
    public void InsertarDireccionCliente(Cliente cliente){
        ClienteDA empDA = new ClienteDA();
           int idCliente = 999;
    String query = "SELECT idcliente FROM cliente where cedula = '" + cliente.getCedula() + "'"; 
    idCliente = empDA.SelectIdCliente(query);
      //System.out.println(idCliente);
    String query2 = "INSERT INTO `direccion` (`ciudad`, `pais`, `provinicia`, `sector`, `detalle`, `cliente_idcliente`, `empleado_idempleado`) VALUES ('" + this.getCiudad() + "', '" + this.getPais() +"', '" + this.getProvincia() + "', '"+ this.getSector() + "', '" + this.getDetalle() + "', '" + idCliente + "' , " + null + ")";
    //System.out.println(query2);
          empDA.Insertar(query2);
     
          
    }
    
}
