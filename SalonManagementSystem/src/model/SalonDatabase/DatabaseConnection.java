/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.SalonDatabase;

import java.sql.*;

/**
 *
 * @author Samu
 */
public class DatabaseConnection {
    
    private static final String host = "localhost";
    private static final String port = "3307";
    private static final String username = "root";
    private static final String password = "1234";
    private static final String database = "salondatabase";
            
    
    
    public Connection getConnection()throws ClassNotFoundException,SQLException{
        
        
        Connection con;
        con = DriverManager.getConnection( "jdbc:mysql://"+host+":"+port+"/"+database,username,password);
        
        return con;
        
       
        
    }
    
    
    
    
}
