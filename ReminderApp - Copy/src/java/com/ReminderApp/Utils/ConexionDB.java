/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ReminderApp.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.appengine.api.utils.SystemProperty;

/**
 *
 * @author rrojas
 */
public class ConexionDB {
    private String connectionString = "";
    Connection conn = null;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public ConexionDB(){
       boolean DevelopmentMode =  false;//System.getProperty("dev-environment-mode") == "1";
      
        if(DevelopmentMode){
           try {
               //inizializa conexion de desarrollo
             //  System.out.println("Loading Development Enviroment...");
               Class.forName("com.mysql.jdbc.Driver");
              // System.out.println("Driver loaded!");
               
               //setConnectionString(System.getProperty("ae-cloudsql.local-database-url"));
               //TESTING URL
               setConnectionString("jdbc:mysql://localhost:3306/reminderDB?user=root&password=webroot");
               try {
                    this.setConn(DriverManager.getConnection(getConnectionString()));
               } catch (SQLException ex) {
                   Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
               }
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
           }
        
        
        }else{
          //conecta a produccion
          System.out.println("Loading Producction Enviroment...");
             try {
               //inizializa conexion de desarrollo
             //  System.out.println("Loading Development Enviroment...");
               
               
               Class.forName("com.mysql.jdbc.GoogleDriver");
              // System.out.println("Driver loaded!");
               
               setConnectionString("jdbc:google:mysql://reminderapp-1320:reminderappedb/reminderDB?user=root&password=webroot");
               try {
                    this.setConn(DriverManager.getConnection(getConnectionString()));
               } catch (SQLException ex) {
                   Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
               }
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        
    }  
     
}
