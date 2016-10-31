/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Services;

import java.sql.Connection;
import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import model.SalonDatabase.DatabaseConnection;


public class HandleServices {
    
    private String serviceID;
    private String name;
    private String duration;
    private String servicePrice;    
    private String searchkey;
    

    
    

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey;
    }
    
    
    public int addService() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
       DatabaseConnection db = new DatabaseConnection();
       Connection con = db.getConnection();
       Statement stmt = con.createStatement();
       String queryString = "insert into Service(Service_Name,Duration,Service_Price)" 
               + "values ('"+getName()+"' , '"+getDuration()+"','"+getServicePrice()+"')";
       int i = stmt.executeUpdate(queryString);
       
       return i;
    }
    
    public ResultSet getSelectedServiceDetails() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Service_Name,Duration,Service_Price from Service where Service_ID = '"+getServiceID()+"'";
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;

    }
    
    public int updateServices() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "update Service set Service_Name = '"+getName()+"',Duration='"+getDuration()+"',Service_Price='"+getServicePrice()+"'where Service_ID ='"+getServiceID()+"'";
        int i = stmt.executeUpdate(queryString);
        
        return i;
        
    }
    
    
    public ResultSet display() throws ClassNotFoundException,SQLException,Exception{
       DatabaseConnection db = new DatabaseConnection();
       Connection con = db.getConnection();
       Statement stmt = con.createStatement();
       String queryString = "select Service_ID as 'Service ID',Service_Name AS 'Service Name',Duration AS 'Duration (min)',Service_Price AS 'Service Price' from Service";
       ResultSet rs = stmt.executeQuery(queryString);
       
       return rs;   
    }   
    
    public ResultSet searchService() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Service_ID as 'Service ID',Service_Name AS 'Service Name',Duration AS 'Duration',Service_Price AS 'Service Price' from Service where Service_Name like '%"+getSearchkey()+"%'";
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
    }
    
    public int deleteService() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,SQLException,Exception{
    
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();        
        
        String queryString1 = "delete from Service where Service_ID = '"+getServiceID()+"'";        
       
        int i = stmt.executeUpdate(queryString1);     
        
        return i;
    }
    
    
}
