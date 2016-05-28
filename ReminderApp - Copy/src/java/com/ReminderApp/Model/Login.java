/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ReminderApp.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class Login {
    private String usuario;
    private String contrasena;
    private boolean Logged_in = false;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isLogged_in() {
        return Logged_in;
    }

    public void setLogged_in(boolean Logged_in) {
        this.Logged_in = Logged_in;
    }
    
    public void ValidarUsuario(){
       LoginDA logger = new LoginDA();
       String dbusername = "", dbpassword = "";
       ResultSet rs = null;
       String query = "SELECT * FROM usuario WHERE nombreusuario = '" + getUsuario() + "' and contrasena = '" + getContrasena() + "'";
       System.out.println(query);
       rs = logger.SelectUsers(query);
        try {
            while(rs.next()){
                dbusername = rs.getString("nombreusuario");
                dbpassword = rs.getString("contrasena");
                System.out.println(dbusername);
                System.out.println(dbpassword);
            }} catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(dbusername.equals(getUsuario()) && dbpassword.equals(getContrasena())){
            setLogged_in(true);
        }
       
    }
    
    
}
