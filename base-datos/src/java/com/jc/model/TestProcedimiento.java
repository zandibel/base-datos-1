/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;


public class TestProcedimiento {
    public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
        CallableStatement callate=con.prepareCall("{call autenticar(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,"Sandra");
        callate.setString(3,"smfa");
      
        callate.execute();
        int pk=callate.getInt(1);
        System.out.println("El id insertado es:"+pk);
    }
    
}
