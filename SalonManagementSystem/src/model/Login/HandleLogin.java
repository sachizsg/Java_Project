/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.SalonDatabase.DatabaseConnection;

/**
 *
 * @author Samu
 */
public class HandleLogin {
    
    private String usertType;
    private String password;
    
    public String getUsertType() {
        return usertType;
    }

    public void setUsertType(String usertType) {
        this.usertType = usertType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    public ResultSet checkLogin()throws ClassNotFoundException,SQLException,Exception{
    
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        String queryString = "select * from Login";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
                
        return rs;
        
        
    }
    
    public ResultSet login() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String query = "SET GLOBAL max_connections = 500";
        String queryString = "select Password from Login where User_Type = '"+getUsertType()+"' ";
        
        stmt.executeQuery(query);
        ResultSet rs = stmt.executeQuery(queryString);
       
        return rs;
        
    }
    
    public ResultSet getLoginSettings() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();        
  
        String queryString = "select * from Login where User_Type = '"+getUsertType()+"' ";
        
       
        ResultSet rs = stmt.executeQuery(queryString);
       
        return rs;
        
    }
    
    
    

    
    
    
    
    
}
