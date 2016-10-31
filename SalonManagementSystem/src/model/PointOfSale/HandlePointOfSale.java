/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.PointOfSale;

import java.sql.Connection;
import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.SalonDatabase.DatabaseConnection;

/**
 *
 * @author Nadee
 */
public class HandlePointOfSale {
    
    
    
    private String itemSearchKey;
    private String serviceSearchKey;
    private String date;
    private String price;
    
    
    private String Invoice_ID;
    private String serviceID;
    private String stockID;
    private String quantity;
    private String appointmentID;
    
    
   private String serviceName;
   private String stockName;
   private String companyName;
   
   private String invoiceDate;
   private String invoiceSearchKey;
   
   
   public String getItemSearchKey() {
        return itemSearchKey;
    }

    public void setItemSearchKey(String itemSearchKey) {
        this.itemSearchKey = itemSearchKey;
    }

    public String getServiceSearchKey() {
        return serviceSearchKey;
    }

    public void setServiceSearchKey(String serviceSearchKey) {
        this.serviceSearchKey = serviceSearchKey;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInvoice_ID() {
        return Invoice_ID;
    }

    public void setInvoice_ID(String Invoice_ID) {
        this.Invoice_ID = Invoice_ID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getStockID() {
        return stockID;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceSearchKey() {
        return invoiceSearchKey;
    }

    public void setInvoiceSearchKey(String invoiceSearchKey) {
        this.invoiceSearchKey = invoiceSearchKey;
    }
   
    
    
    
    public ResultSet viewStocks() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();        
        String queryString = "select Stock_Name AS 'Stock Name',Selling_Price AS 'Price',Supplier.Company_Name AS 'Brand Name' from Stock inner join Supplier on Stock.Supplier_Supplier_ID = Supplier.Supplier_ID";
        
        ResultSet rs = stmt.executeQuery(queryString);        
                
        return rs;
    }
    
    public ResultSet viewServices() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();        
        String queryString = "select Service_Name AS 'Service Name',Service_Price AS 'Price' from Service";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
                
        return rs;
    }
     
    public ResultSet searchStocksToInvoice() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Stock_Name AS 'Stock Name',Selling_Price AS 'Price',Supplier.Company_Name AS 'Brand Name' from Stock inner join Supplier on Stock.Supplier_Supplier_ID = Supplier.Supplier_ID where Stock_Name like '%"+getItemSearchKey()+"%' or Supplier.Company_Name like '%"+getItemSearchKey()+"%'  ";
        
        ResultSet rs = stmt.executeQuery(queryString);        
                
        return rs;
    }
     
    public ResultSet searchServiceToInvoice() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Service_Name AS 'Service Name',Service_Price AS 'Price' From Service where Service_Name like '%"+getServiceSearchKey()+"%' ";
        
        ResultSet rs = stmt.executeQuery(queryString);        
                
        return rs;
    }
     
    public int addToInvoice() throws ClassNotFoundException,DataTruncation,SQLException,Exception{
       
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "insert into Invoice (Invoice_Date,Total_Price) values ('"+getDate()+"','"+getPrice()+"')";
        int i = stmt.executeUpdate(queryString);
	
	return i;
               
    }
    
    public int addToInvoice_has_Appointment() throws ClassNotFoundException,DataTruncation,SQLException,Exception{     
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "insert into Invoice_has_Appointment (Invoice_Invoice_ID,Appointment_Appointment_ID) values ('"+getInvoice_ID()+"','"+getAppointmentID()+"')";
        int i = stmt.executeUpdate(queryString);
	
	return i;
               
    }
    
    
    
    public int addToInvoice_has_Service() throws ClassNotFoundException,DataTruncation,SQLException,Exception{    
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "insert into Invoice_has_Service (Invoice_Invoice_ID,Service_Service_ID) values ('"+getInvoice_ID()+"','"+getServiceID()+"')";
        int i = stmt.executeUpdate(queryString);
	
	return i;
               
    }
    
    public int addToInvoice_has_Stock() throws ClassNotFoundException,DataTruncation,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "insert into Invoice_has_Stock (Invoice_Invoice_ID,Stock_Stock_ID,Quantity) values ('"+getInvoice_ID()+"','"+getStockID()+"','"+getQuantity()+"')";
        int i = stmt.executeUpdate(queryString);
	
	return i;
               
    }
        
     public ResultSet getSelectedServiceID() throws ClassNotFoundException,SQLException,Exception{
         
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();        
        String querString = "select Service_ID from Service where Service_Name = '"+getServiceName()+"' ";
        
        ResultSet rs = stmt.executeQuery(querString);
      
        return rs;
    
    
    }
    
    public ResultSet getSelectedStockID() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();        
        String querString = "select Stock_ID from Stock inner join Supplier on Stock.Supplier_Supplier_ID = Supplier.Supplier_ID where Stock_Name = '"+getStockName()+"' && Supplier.Company_Name = '"+getCompanyName()+"' ";
        
        ResultSet rs = stmt.executeQuery(querString);
      
        return rs;
        
    } 
    public ResultSet getInvoiceHistory()throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();        
        String queryString = "select Invoice_ID as 'Invoice ID',Invoice_Date as 'Invoice Date',Total_Price as 'Total Price' from Invoice order by Invoice_Date";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
    }
    
    public ResultSet getSearchInvoiceHistory() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();        
        String queryString = "select Invoice_ID as 'Invoice ID',Invoice_Date as 'Invoice Date',Total_Price as 'Total Price' from Invoice where Invoice_ID like '%"+getInvoiceSearchKey()+"%' or Invoice_Date like '%"+getInvoiceDate()+"%' order by Invoice_Date ";
        
        ResultSet rs = stmt.executeQuery(queryString);        
                
        return rs;
    }
    
     
    public ResultSet getTodaySalesInvoice() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();        
        String queryString = "select Invoice_ID as 'Invoice ID',Invoice_Date as 'Invoice Date',Total_Price as 'Total Price' from Invoice where Invoice_Date = '"+getInvoiceDate()+"' order by Invoice_Date ";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
                
        return rs;
    }

    public ResultSet searchTodayInvoice() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();        
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Invoice_ID as 'Invoice ID',Invoice_Date as 'Invoice Date',Total_Price as 'Total Price' from Invoice where Invoice_ID like '%"+getInvoiceSearchKey()+"%' order by Invoice_Date";
        
        ResultSet rs = stmt.executeQuery(queryString);        
                
        return rs;
    }
    
    
    public ResultSet getLastFromInvoice() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
       
        String queryString = "select MAX(Invoice_ID) as 'Invoice ID' from Invoice";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    
}
