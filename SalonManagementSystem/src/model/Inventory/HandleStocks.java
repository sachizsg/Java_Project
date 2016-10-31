/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Inventory;


import java.sql.Connection;
import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import model.SalonDatabase.DatabaseConnection;

/**
 *
 * @author Sachithra
 */
public class HandleStocks {
    private String stockID;
    private String stockName;
    private String companyName;   
    private String price;
    private String stockLevel;
    private String reOrderLevel;
    private String supplier_ID;
    private String invoiceDate;
    private String dueData;
    private String cost;
    private String quantity;
    private String discount;
    private String total;
    private String status;
    private String invoiceBalance;
    private String newStock;
    
    private String searchKey;
    
    
    
    public String getStockID() {
        return stockID;
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(String stockLevel) {
        this.stockLevel = stockLevel;
    }

    public String getReOrderLevel() {
        return reOrderLevel;
    }

    public void setReOrderLevel(String reOrderLevel) {
        this.reOrderLevel = reOrderLevel;
    }

    public String getSupplier_ID() {
        return supplier_ID;
    }

    public void setSupplier_ID(String supplier_ID) {
        this.supplier_ID = supplier_ID;
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
     public String getNewStock() {
        return newStock;
    }

    public void setNewStock(String newStock) {
        this.newStock = newStock;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getInvoiceBalance() {
        return invoiceBalance;
    }

    public void setInvoiceBalance(String invoiceBalance) {
        this.invoiceBalance = invoiceBalance;
    }
    
    
    public ResultSet loadCompanyName() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String querString = "select Company_Name from supplier";
        ResultSet rs = stmt.executeQuery(querString);
        return rs;
    }
 
    public int addStock() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
         
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "insert into stock (Stock_Name,Selling_Price,Reorder_Level,Supplier_Supplier_ID) values ('"+getStockName()+"','"+getPrice()+"','"+getReOrderLevel()+"','"+getSupplier_ID()+"')";
        int i = stmt.executeUpdate(queryString);
         
        return i ;
         
    }
    
    public ResultSet getSelectedStockDetails() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select * from Stock inner join Supplier on Stock.Supplier_Supplier_ID = Supplier.Supplier_ID where Stock_ID = '"+getStockID()+"'";
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;

    }
    
    public int updateStock() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
          DatabaseConnection db = new DatabaseConnection();
          Connection con = db.getConnection();
          Statement stmt = con.createStatement();
          String queryString = "update stock set Stock_Name = '"+getStockName()+"',Selling_Price = '"+getPrice()+"',Reorder_Level = '"+getReOrderLevel()+"',Supplier_Supplier_ID = '"+getSupplier_ID()+"' where Stock_ID = '"+getStockID()+"'";
          int i = stmt.executeUpdate(queryString);
          return i;
      
    }
    
    public int updateStockLevel() throws ClassNotFoundException,SQLException,Exception{
         
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "update stock set Stock_Level = '"+getNewStock()+"' where Stock_ID = '"+getStockID()+"'";
         
         int i = stmt.executeUpdate(queryString);
         
         return i ;
    }
    
    public int purchaceDetails() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "insert into PurchaceInvoice (Invoice_Date,Due_Date,Cost,Quantity,Discount,Total_Payment,Invoice_Balance,Status,Stock_Stock_ID) "
                + "values ('"+getInvoiceDate()+"','"+getDueData()+"','"+getCost()+"','"+getQuantity()+"','"+getDiscount()+"','"+getTotal()+"','"+getInvoiceBalance()+"','"+getStatus()+"','"+getStockID()+"')";
        int i = stmt.executeUpdate(queryString);
        return i;
    }
    
    
    public ResultSet viewStocks() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();        
        String querString = "select Stock_ID as 'Stock ID',Stock_Name AS 'Stock Name',Company_Name AS 'Company Name',Selling_Price As Price,Stock_Level AS 'Stock Level',Reorder_Level AS 'Reorder Level' from stock inner join supplier on stock.Supplier_Supplier_ID = supplier.Supplier_ID ORDER BY stock.Stock_ID";
        
        ResultSet rs = stmt.executeQuery(querString);
      
        return rs;
    
    
    }
    
    public ResultSet searchStock() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Stock_ID as 'Stock ID',Stock_Name AS 'Stock Name',Company_Name AS 'Company Name',Selling_Price As Price,Stock_Level AS 'Stock Level',Reorder_Level AS 'Reorder Level' from Stock inner join supplier on Stock.Supplier_Supplier_ID = Supplier.Supplier_ID where Stock_Name like '%"+getSearchKey()+"%' or Company_Name like '%"+getSearchKey()+"%' order by Stock_ID";
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
    }
       
    public int deleteStock() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "delete from stock where Stock_ID = '"+getStockID()+"'";
        int i = stmt.executeUpdate(queryString);
        
        return i;
        
    }  
    
    public ResultSet stockMessages()throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String queryString = "select Stock_Name AS 'Stock Name',Company_Name AS 'Company Name',Stock_Level AS 'Stock Level' from Stock inner join supplier on Stock.Supplier_Supplier_ID = Supplier.Supplier_ID where Stock_Level <= Stock.Reorder_Level";
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    public ResultSet checkStockAvailability()throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Stock_Level from Stock inner join supplier on Stock.Supplier_Supplier_ID = Supplier.Supplier_ID where Stock.Stock_Name = '"+getStockName()+"' and Supplier.Company_Name = '"+getCompanyName()+"' ";
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    
    
    
}
    
    
    
    
    
    



