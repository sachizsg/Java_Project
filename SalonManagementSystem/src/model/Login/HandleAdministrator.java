/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Login;

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
public class HandleAdministrator {
    
    
    private String usertType;
    private String password;   
    
    private String currentPasword;
    
    private String appointments;
    private String services;
    private String inventory;
    private String sales;
    private String employees;
    private String finance;
    private String reports;
    private String administrator;
    
    
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

    public String getCurrentPasword() {
        return currentPasword;
    }

    public void setCurrentPasword(String currentPasword) {
        this.currentPasword = currentPasword;
    }

    public String getAppointments() {
        return appointments;
    }

    public void setAppointments(String appointments) {
        this.appointments = appointments;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getFinance() {
        return finance;
    }

    public void setFinance(String finance) {
        this.finance = finance;
    }

    public String getReports() {
        return reports;
    }

    public void setReports(String reports) {
        this.reports = reports;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }
    
    
    
    public int addLoginDetails()throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
 
        DatabaseConnection dbc = new DatabaseConnection();
        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();        
        
        String queryString1 = "insert into Login values('Admin','admin','T','T','T','T','T','T','T','T')";
        String queryString2 = "insert into Login values('Employee','admin','T','T','T','T','F','F','F','F')";
      
        stmt.executeUpdate(queryString1);
        int i = stmt.executeUpdate(queryString2);
        return i;
                
    }
    
    public ResultSet checkAdmin()throws ClassNotFoundException,SQLException,Exception{
 
        DatabaseConnection dbc = new DatabaseConnection();
        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();        
        
        String queryString = "select * from Login where User_Type = 'Admin' and Password = '"+getCurrentPasword()+"'";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
                
    }
    
    
    public int changeAdminPassword()throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
 
        DatabaseConnection dbc = new DatabaseConnection();
        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        
        String queryString = "update Login set Password = '"+getPassword()+"' where User_Type = 'Admin' ";
        
        int i = stmt.executeUpdate(queryString);
        
        return i;
                
    }    
        
    public int changeEmployeePassword()throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
 
        DatabaseConnection dbc = new DatabaseConnection();
        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        
        String queryString = "update Login set Password = '"+getPassword()+"' where User_Type = 'Employee' ";
        
        int i = stmt.executeUpdate(queryString);
        
        return i;
                
    }
    
    public int setUserSettings()throws ClassNotFoundException,SQLException,Exception{
 
        DatabaseConnection dbc = new DatabaseConnection();
        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        
        String queryString = "update Login set Appointments = '"+getAppointments()+"',Services = '"+getServices()+"',Inventory = '"+getInventory()+"',Sales = '"+getSales()+"',Employees = '"+getEmployees()+"',Finance = '"+getFinance()+"',Reports = '"+getReports()+"' where User_Type = 'Employee' ";
        
        int i = stmt.executeUpdate(queryString);
        
        return i;
                
    }
    
    
}
