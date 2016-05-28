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
public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    
    private String FechaEmision;
    private String FechaExpiracion;
    private String DateCreated;
    private String categoria;
    private String TipoSangre;
    private String activo;

    public Cliente(String nombre, String apellido, String cedula, String correo, String FechaEmision, String FechaExpiracion, String DateCreated, String categoria, String TipoSangre, String activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.FechaEmision = FechaEmision;
        this.FechaExpiracion = FechaExpiracion;
        this.DateCreated = DateCreated;
        this.categoria = categoria;
        this.TipoSangre = TipoSangre;
        this.activo = activo;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(String FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public String getFechaExpiracion() {
        return FechaExpiracion;
    }

    public void setFechaExpiracion(String FechaExpiracion) {
        this.FechaExpiracion = FechaExpiracion;
    }

    public String getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(String DateCreated) {
        this.DateCreated = DateCreated;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
    
    public void InsertarCliente(){
        ClienteDA client = new ClienteDA();
            //INSERTA EN LA TABLA PRINCIPAL DE CLIENTE
    String query = "INSERT INTO `reminderdb`.`cliente` (`nombre`, `apellido`, `cedula`, `correo`) VALUES ('" + this.getNombre() + "', '" + this.getApellido() + "', '" + this.getCedula() + "', '" + this.getCorreo() + "')";
       client.Insertar(query);
         int idcliente = 999;
            //BUSCAMOS EL ULTIMO ID DEL CLIENTE SELECCIONADO
              String query3 = "SELECT idcliente FROM reminderdb.cliente where cedula = '" + this.getCedula() + "'";
             
              idcliente = client.SelectIdCliente(query3);
              System.out.println("DESPUES DEL SELECT CLIENTE: " + idcliente);
         //INSERTA EN LA TABLA DE CLIENTE_ESTATUS EL DETALLE
    String query2 = "INSERT INTO `reminderdb`.`cliente_estatus` (`categoria`, `tiposangre`, `activo`, `cliente_idcliente`, `fechaemision`, `fecha_expiracion`) VALUES ('" + getCategoria() + "', '" + getTipoSangre() + "', '" + getActivo() + "', '" + idcliente + "', '" + getFechaEmision() + "', '" + getFechaExpiracion() + "')"; 
       client.Insertar(query2);
    }
}
