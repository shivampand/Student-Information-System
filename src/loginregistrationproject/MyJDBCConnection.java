/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginregistrationproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
 // this Class is generating for getting the JDBC  connection
public class MyJDBCConnection {
     Connection conn;
     
    public Connection getConn(){
        try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
        conn =DriverManager.getConnection("jdbc:oracle:thin:schoolp/schoolp@localhost:1521:XE","System","oracle");
        JOptionPane.showMessageDialog(null," Database Connection Successful SQLConnect getconn method");
        
        return conn;
        
    }
        catch(Exception e){
         JOptionPane.showMessageDialog(null,"Error in SQLConnect getconn method"+e);   
        }
        return conn;
    }
}
            
        
    
