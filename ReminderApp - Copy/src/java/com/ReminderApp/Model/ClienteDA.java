/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ReminderApp.Model;


import com.ReminderApp.Utils.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class ClienteDA extends ConexionDB{
    
    public void Insertar(String query){
          try{ 
            Statement st = getConn().createStatement();
             st.execute(query);
        } catch (SQLException ex) {
           // System.out.println("Die in select CLIENTES");
            Logger.getLogger(EmployeeDA.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
      public int SelectIdCliente(String query){
          ResultSet rs = null;
          int entero = 0;
        try{ 
            Statement st = getConn().prepareStatement(query);
             rs = st.executeQuery(query);
                  while(rs.next()){
               entero = rs.getInt("idcliente");
             }
        }catch (SQLException ex) {
            System.out.println("Die in select CLIENTE");
            Logger.getLogger(EmployeeDA.class.getName()).log(Level.SEVERE, null, ex);
        }
            return entero;
    }
      
    
    
    
}
