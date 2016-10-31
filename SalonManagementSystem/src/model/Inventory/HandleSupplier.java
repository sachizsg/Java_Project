/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Inventory;



import model.SalonDatabase.DatabaseConnection;
import java.sql.*;


/**
 *
 * @author Sachithra
 */
public class HandleSupplier {
    
    private String supplierID;
    private String updateSupplierID;
    private String firstName;
    private String lastName;
    private String companyName;
    private String contactNum;
    private String address;
    private String city;
    private String searchkey;
    
    

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

     public String getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey;
    }

    public String getUpdateSupplierID() {
        return updateSupplierID;
    }

    public void setUpdateSupplierID(String updateSupplierID) {
        this.updateSupplierID = updateSupplierID;
    }
    
   
    public int addSupplier() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
       DatabaseConnection db = new DatabaseConnection();
       Connection con;
       con = db.getConnection();       
       Statement stmt = con.createStatement();
       
       String queryString = "insert into Supplier(Supplier_ID,First_Name,Last_Name,Company_Name,Contact_Number,Address,City)" 
               + "values ('"+getSupplierID()+"' , '"+getFirstName()+"' , '"+getLastName()+"','"+getCompanyName()+"','"+getContactNum()+"','"+getAddress()+"','"+getCity()+"')";
              
       int i = stmt.executeUpdate(queryString);
       return i;
       
    }
   
    public ResultSet getSelectedSupplierDetails() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Supplier_ID,First_Name,Last_Name,Company_Name,Contact_Number,Address,City from Supplier where Supplier_ID = '"+getSupplierID()+"'";
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;

    }
    
    public int updateSupplier() throws ClassNotFoundException,DataTruncation,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "update Supplier set Supplier_ID = '"+getUpdateSupplierID()+"',First_Name = '"+getFirstName()+"',Last_Name='"+getLastName()+"',Company_Name='"+getCompanyName()+"',Contact_Number='"+getContactNum()+"',Address='"+getAddress()+"',City = '"+getCity()+"' where Supplier_ID ='"+getSupplierID()+"'";
        int i = stmt.executeUpdate(queryString);
        
        return i;
        
    }
   
    public ResultSet display() throws ClassNotFoundException,SQLException,Exception{
       DatabaseConnection db = new DatabaseConnection();
       Connection con = db.getConnection();
       Statement stmt = con.createStatement();
       String queryString = "select Supplier_ID AS 'Supplier ID',First_Name AS 'First Name',Last_Name AS 'Last Name',Company_Name AS 'Company Name',Contact_Number AS 'Contact Number',Address AS 'Address',City AS 'City' from Supplier order by Supplier_ID";
       ResultSet rs = stmt.executeQuery(queryString); 
       
       return rs;
    }
   
    public int deleteSupplier() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,SQLException,Exception{    
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "delete from Supplier where Supplier_ID = '"+getSupplierID()+"'";
        int i = stmt.executeUpdate(queryString);
        
        return i;
    }   
    
    public ResultSet searchSupplier() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Supplier_ID AS 'Supplier ID',First_Name AS 'First Name',Last_Name AS 'Last Name',Company_Name AS 'Company Name',Contact_Number AS 'Contact Number',Address AS 'Address',City AS 'City' from Supplier where Supplier_ID like '%"+getSearchkey()+"%' or First_Name like '%"+getSearchkey()+"%' or Last_Name like '%"+getSearchkey()+"%' or Company_Name like '%"+getSearchkey()+"%' or City like '%"+getSearchkey()+"%' order by Supplier_ID";
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
    }

    public ResultSet supplierIDByCompanyName() throws ClassNotFoundException,SQLException,Exception{
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select Supplier_ID from Supplier where Company_Name = '"+getCompanyName()+"'";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
    }
   
   
}

