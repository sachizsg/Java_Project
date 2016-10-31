/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Employee;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DataTruncation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import model.SalonDatabase.DatabaseConnection;


/**
 *
 * @author Nadee
 */
public class HandleEmployee {
    private String Employee_ID;
    private String First_Name;
    private String Last_Name;
    private String Contact_Number;
    private String Address;
    private String City;
    private String Basic_Salary;
    private String User_Type;
    private String SearchKey;
    private String newemepID;
    
    private InputStream profilePic;
    
    
    
    
    
    public String getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }
    
    public String getFirst_Name(){
        return First_Name;
    }
        
    public void setFirst_Name(String First_Name){
        this.First_Name = First_Name;
       
    }
    
     public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }
    
    public String getContact_Number(){
        return Contact_Number;
    }
        
    public void setContact_Number(String Contact_Number){
        this.Contact_Number = Contact_Number;
       
    }
    
     public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public String getCity(){
        return City;
    }
        
    public void setCity(String City){
        this.City = City;
       
    }
    
     public String getBasic_Salary() {
        return Basic_Salary;
    }

    public void setBasic_Salary(String Basic_Salary) {
        this.Basic_Salary = Basic_Salary;
    }
    
    public String getUser_Type(){
        return User_Type;
    }
        
    public void setUser_Type(String User_Type){
        this.User_Type = User_Type;
       
    }
    
    public void setSearchKey(String SearchKey){
        this.SearchKey = SearchKey;
    }
    
    public String getSearchKey(){
        return SearchKey;
    }
    
    public InputStream getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(InputStream profilePic) {
        this.profilePic = profilePic;
    }

    public String getNewemepID() {
        return newemepID;
    }

    public void setNewemepID(String newemepID) {
        this.newemepID = newemepID;
    }
    
    
    public int addEmployee()throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();       
        
        String queryString = "insert into Employee values (?,?,?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(queryString);
        
        pst.setString(1,getEmployee_ID());
        pst.setString(2,getFirst_Name());
        pst.setString(3,getLast_Name());
        pst.setString(4,getContact_Number());
        pst.setString(5,getAddress());
        pst.setString(6,getCity());     
        pst.setString(7,getBasic_Salary());
        pst.setBinaryStream(8,getProfilePic());
        
        int i = pst.executeUpdate();
        return i;
        
    }
    
    
    public ResultSet getSelectedEmployeeDetails() throws ClassNotFoundException,SQLException,Exception{
       DatabaseConnection db= new DatabaseConnection();
       Connection con = db.getConnection();
       Statement stmt = con.createStatement();
       String queryString = "select * from Employee where Employee_ID = '"+getEmployee_ID()+"'";
       ResultSet rs = stmt.executeQuery(queryString);
      
       
       return rs;
   }
    
   public int updateEmployee()throws ClassNotFoundException,SQLIntegrityConstraintViolationException,DataTruncation,SQLException,Exception{
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        String queryString = "update Employee set Employee_ID=?,First_Name=?,Last_Name=?,Contact_Number=?,Address=?,City=?,Basic_Salary=?  where Employee_ID = '"+getEmployee_ID()+"'";
        PreparedStatement pst = con.prepareStatement(queryString);
        
        pst.setString(1,getNewemepID());
        pst.setString(2,getFirst_Name());
        pst.setString(3,getLast_Name());
        pst.setString(4,getContact_Number());
        pst.setString(5,getAddress());
        pst.setString(6,getCity());
        pst.setString(7,getBasic_Salary());      
       
        int i = pst.executeUpdate();
        return i;
        
   }
    
   public ResultSet display() throws ClassNotFoundException,SQLException,Exception{
       DatabaseConnection db= new DatabaseConnection();
       Connection con = db.getConnection();
       Statement stmt = con.createStatement();
       String queryString = "select Employee_ID AS 'Employee ID',First_Name AS 'First Name',Last_Name AS 'Last Name',Contact_Number AS 'Contact Number',Address AS 'Address',City AS 'City',Basic_Salary AS 'Basic Salary',Profile_Picture AS 'Profile Picture' from Employee order by Employee_ID";
       ResultSet rs = stmt.executeQuery(queryString);
       
       return rs;
       
   }   
   
   public ResultSet searchEmployee() throws ClassNotFoundException,SQLException,Exception{        
       DatabaseConnection dbc = new DatabaseConnection();
       Connection con = dbc.getConnection();
       Statement stmt = con.createStatement();
       String queryString = "select Employee_ID AS 'Employee ID',First_Name AS 'First Name',Last_Name AS 'Last Name',Contact_Number AS 'Contact Number',Address AS 'Address',City AS 'City',Basic_Salary AS 'Basic Salary',Profile_Picture AS 'Profile Picture' from Employee where First_Name like  '%"+getSearchKey()+"%' or Last_Name like  '%"+getSearchKey()+"%' or Employee_ID like  '%"+getSearchKey()+"%' order by Employee_ID ";
       ResultSet rs = stmt.executeQuery(queryString);        
                
       return rs;
   }   
    
   public int deleteEmployee() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,SQLException,Exception{
       DatabaseConnection dbc = new DatabaseConnection();
       Connection con = dbc.getConnection();
       Statement stmt = con.createStatement();        
       String queryString = "delete from Employee where Employee_ID = '"+getEmployee_ID()+"'";
       int i = stmt.executeUpdate(queryString); 
       
       return i;
               
   }    
   
   public ResultSet checkEmployee() throws ClassNotFoundException,SQLException,Exception{        
       DatabaseConnection dbc = new DatabaseConnection();
       Connection con = dbc.getConnection();
       Statement stmt = con.createStatement();
       String queryString = "select * from Employee ";
       ResultSet rs = stmt.executeQuery(queryString);        
                
       return rs;
   }
    
   
}
