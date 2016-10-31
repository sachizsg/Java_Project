/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Finance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.SalonDatabase.DatabaseConnection;

/**
 *
 * @author Sachithra
 */
public class HandleFinance {
    
    private String purchaceID;
    private String invoiceDate;
    private String dueData;   
    private String status;
    private String newBalnce;
    
    
  
    
    private String currentDate;
    private String salary;
    private String bonus;
    private String totalSalary;
    
    private String searchKey;
     
     
     

    public String getPurchaceID() {
        return purchaceID;
    }

    public void setPurchaceID(String purchaceID) {
        this.purchaceID = purchaceID;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getDueData() {
        return dueData;
    }

    public void setDueData(String dueData) {
        this.dueData = dueData;
    }   

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
     public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
    
     public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(String totalSalary) {
        this.totalSalary = totalSalary;
    }
    
    public String getNewBalnce() {
        return newBalnce;
    }

    public void setNewBalnce(String newBalnce) {
        this.newBalnce = newBalnce;
    }
    
    public ResultSet getselectedpurchaceDetails() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select * from PurchaceInvoice where PurchaceInvoice_ID = '"+getPurchaceID()+"'";
        ResultSet rs = stmt.executeQuery(queryString);
        return rs;
    }
    
    public ResultSet getpurchaceDetails() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select PurchaceInvoice.PurchaceInvoice_ID as 'Invoice ID',Supplier.Company_Name as 'Company Name',Stock.Stock_Name as 'Stock Name',\n" +
                             "PurchaceInvoice.Invoice_Date AS 'Invoice Date', PurchaceInvoice.Due_date AS 'Due Date' ,PurchaceInvoice.Cost AS 'Cost',PurchaceInvoice.Quantity AS 'Quantity',PurchaceInvoice.Discount AS 'Discount',\n" +
                             "PurchaceInvoice.Total_Payment  AS 'Total Payment',PurchaceInvoice.Invoice_Balance AS 'Invoice Balance', PurchaceInvoice.Status AS 'Status' \n" +
                             "from PurchaceInvoice \n" +
                             "inner join Stock on PurchaceInvoice.Stock_Stock_ID = Stock.Stock_ID \n" +
                             "left join Supplier on Stock.Supplier_Supplier_ID = Supplier.Supplier_ID order by PurchaceInvoice_ID;" ;
        
        ResultSet rs = stmt.executeQuery(queryString);
        return rs;
    }
    
    public int updatePurchaceDetails() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "update PurchaceInvoice set Invoice_Date = '"+getInvoiceDate()+"',Due_Date = '"+getDueData()+"',Invoice_Balance = '"+getNewBalnce()+"',status = '"+getStatus()+"' where PurchaceInvoice_ID = '"+getPurchaceID()+"'";
        int i = stmt.executeUpdate(queryString);
        return i;
    }
    
    public ResultSet searchPayments() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();        
        String queryString = " select PurchaceInvoice.PurchaceInvoice_ID as 'Invoice ID',Supplier.Company_Name as 'Company Name',Stock.Stock_Name as 'Stock Name',\n" +
                             "PurchaceInvoice.Invoice_Date AS 'Invoice Date', PurchaceInvoice.Due_date AS 'Due Date' ,PurchaceInvoice.Cost AS 'Cost',PurchaceInvoice.Quantity AS 'Quantity',PurchaceInvoice.Discount AS 'Discount',\n" +
                             "PurchaceInvoice.Total_Payment  AS 'Total Payment',PurchaceInvoice.Invoice_Balance AS 'Invoice Balance', PurchaceInvoice.Status AS 'Status' \n" +
                             "from PurchaceInvoice \n" +
                             "inner join Stock on PurchaceInvoice.Stock_Stock_ID = Stock.Stock_ID \n" +
                             "left join Supplier on Stock.Supplier_Supplier_ID = Supplier.Supplier_ID where Invoice_Date like '%"+getSearchKey()+"%' or Due_Date like '%"+getSearchKey()+"%' or Status like '%"+getSearchKey()+"%' or Supplier.Company_Name like '%"+getSearchKey()+"%' order by PurchaceInvoice_ID " ;
        
        
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
    }
      
    public ResultSet display() throws ClassNotFoundException,SQLException,Exception{
       DatabaseConnection db= new DatabaseConnection();
       Connection con = db.getConnection();
       Statement stmt = con.createStatement();
       String queryString = "select Employee_ID AS 'Employee ID',First_Name AS 'First Name',Last_Name AS 'Last Name',Basic_Salary AS 'Basic Salary' from Employee";
       ResultSet rs = stmt.executeQuery(queryString);
       
       return rs;
       
       
   }
      
   public int addSalary() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "insert into EmployeePayment (Payment_Date,Monthly_Payment,Bonus_Payment,Total_Payment) values ('"+getCurrentDate()+"','"+getSalary()+"','"+getBonus()+"','"+getTotalSalary()+"')";
        int i = stmt.executeUpdate(queryString);
        return i;
   }
      
   public ResultSet EmployeeDetails() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db= new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Payment_Date AS 'Payment Date',Monthly_Payment AS 'Monthly Payment',Bonus_Payment AS 'Bonus Payment',Total_Payment AS 'Total Payment' from EmployeePayment";
        ResultSet rs = stmt.executeQuery(queryString);
       
        return rs;
       
       
   }

    
}