/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ReminderApp.TestMain;
import com.ReminderApp.Model.*;
import com.ReminderApp.Utils.ConexionDB;
/**
 *
 * @author Owner
 */
public class TestSuite {
      public static void main(String[] args){
          
          
          Employee empleado = new Employee();
          empleado.setNombre("jose");
          empleado.setApellido("perez");
          empleado.setEstado("1");
          empleado.setGenero("M");
          empleado.setPosicion("abogado");
          empleado.setCedula("22300653916");
          empleado.setSueldo("65000");
          
          empleado.GuardarEmpleado();
          
          Direccion dir1 = new Direccion("Santo Domingo", "Republica Dominicana", "Santo Domingo Este", "Alma rosa II", "Residencial Lopez apt #13");
          
          dir1.InsertarDireccionEmpleado(empleado);
          
          
          //inserta un empleado y lo guarda en la base de datos, inserta la direccion y la relaciona con dicho empleado
          
          
          //AGREGRANDO CLIENTE Y TAMBIEN SU DETALLE CON SU ID
          /*
          Cliente client = new Cliente("jose","rosario","88744565438","rosalarosa@gmail.com","26/05/2016","26/05/2017","","2","O+","1");
          client.InsertarCliente();
        
          //AGREGANDO DIRECCION Y PASANDO EL ID DEL CLIENTE PARA CREAR LA RELACION CON LA DIRECCION
          Direccion dir2 = new Direccion("Santo Domingo", "Republica Dominicana", "Santo Domingo Este", "Alma rosa II", "Residencial Lopez apt #13");
               dir2.InsertarDireccionCliente(client);
            */   
          
          /*
           Employee empleado = new Employee();
          empleado.setNombre("Rina");
          empleado.setApellido("Matos");
          empleado.setEstado("0");
          empleado.setGenero("F");
          empleado.setPosicion("Actriz");
          empleado.setCedula("22300653898");
          empleado.setSueldo("98000");
          
          empleado.GuardarEmpleado();
          
          Telefono tel = new Telefono("8097653433", "Residencial");
          tel.InsertarTelefonoEmpleado(empleado);
        */
          
          
          /*
          Cliente client = new Cliente("andy","lucas","88744565432","andylucas@gmail.com","26/05/2016","26/05/2017","","2","O+","1");
          client.InsertarCliente();
          
            Telefono tel2 = new Telefono("8097653113", "Mobile");
          tel2.InsertarDireccionCliente(client);
          
            Direccion dir2 = new Direccion("Santo Domingo", "Republica Dominicana", "Santo Domingo Este", "Alma rosa III", "Residencial Amara la Negra apt #13");
            dir2.InsertarDireccionCliente(client);
          */
          
          
          
          
          
          
    }  
}
