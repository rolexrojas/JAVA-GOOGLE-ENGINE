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
public class LoginDA extends ConexionDB{
    
    public LoginDA(){
      super();
    }
    
      public ResultSet SelectUsers(String query){
          ResultSet rs = null;
        try {
            Statement st = getConn().prepareStatement(query);
             rs = st.executeQuery(query);
        } catch (SQLException ex) {
            //System.out.println("Die in select employees");
            Logger.getLogger(EmployeeDA.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       return rs;
    }
}
