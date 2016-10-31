/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Appointments;

import java.sql.Connection;
import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import model.SalonDatabase.DatabaseConnection;

/**
 *
 * @author Samu
 */
public class HandleClient {
    
    private String clientID;
    private String firstName;
    private String lastName;
    private String contactNumber;    
    private String firstInDate;
    
    private String searchKey;
    
    

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }   

    public String getFirstInDate() {
        return firstInDate;
    }

    public void setFirstInDate(String firstInDate) {
        this.firstInDate = firstInDate;
    }
    
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
    
    public int addClient() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String queryString = "insert into Client (First_Name,Last_Name,Contact_Number,First_In_Date) values ('"+getFirstName()+"','"+getLastName()+"','"+getContactNumber()+"','"+getFirstInDate()+"')";
        
        int i = stmt.executeUpdate(queryString);
        
        return i;
        
    }
    
    
    public int updateClient() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String quString = "update Client set First_Name = '"+getFirstName()+"',Last_Name = '"+getLastName()+"',Contact_Number = '"+getContactNumber()+"',First_In_Date = '"+getFirstInDate()+"' where Client_ID = '"+getClientID()+"'";
        
        int i = stmt.executeUpdate(quString);
        
        return i;
        
        
    }
    
    public int deleteClient() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String quString = "delete from Client where Client_ID = '"+getClientID()+"'";

        int i = stmt.executeUpdate(quString);
        
        return i;
        
    }
    
    public ResultSet searchClient() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String querString = "select Client_ID as 'Client ID',First_Name as 'First Name',Last_Name as 'Last Name',Contact_Number as 'Contact Number',First_In_Date as 'First In Date' from Client where First_Name like '%"+getSearchKey()+"%' or Last_Name like '%"+getSearchKey()+"%'";
        
        ResultSet rs = stmt.executeQuery(querString);
        
        return rs;
        
    }
    
    
    public ResultSet viewClientDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String querString = "select Client_ID as 'Client ID',First_Name as 'First Name',Last_Name as 'Last Name',Contact_Number as 'Contact Number',First_In_Date as 'First In Date' from Client";
        
        ResultSet rs = stmt.executeQuery(querString);       
        
        
        return rs;
        
    }
    
    
    public ResultSet getSelectedClientDetails()throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String querString = "select First_Name,Last_Name,Contact_Number,First_In_Date from Client where Client_ID = '"+getClientID()+"'";
        
        ResultSet rs = stmt.executeQuery(querString);
        
        return rs;
        
    }

    
    
}
