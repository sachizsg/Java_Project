/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Appointments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import model.SalonDatabase.DatabaseConnection;

/**
 *
 * @author Samu
 */
public class HandleAppointment {
    
    private String appointmentID;
    private String appointmentDate;
    private String employeeID;
    private String employeeName;
    private String apoointmentInvoiceID;
    
    
    
    

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    
    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getApoointmentInvoiceID() {
        return apoointmentInvoiceID;
    }

    public void setApoointmentInvoiceID(String apoointmentInvoiceID) {
        this.apoointmentInvoiceID = apoointmentInvoiceID;
    }
    
    
    public ResultSet getEmployeeDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select CONCAT_WS('  ',First_Name,Last_Name) as 'Employee Name' from Employee";
         
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    public ResultSet getSelectedEmployeeID() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select Employee_ID,Profile_Picture from Employee where CONCAT_WS('  ',First_Name,Last_Name) = '"+getEmployeeName()+"'";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }    
    
    public ResultSet getEmployeeAppointmentDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String querString = "select Appointment.Appointment_ID,Appointment.Start_Time,Appointment.End_Time,CONCAT_WS('  ',Client.First_Name,Client.Last_Name),\n" +
                            "Appointment.Status\n" +
                            "from Appointment\n" +
                            "inner join Client on Appointment.Client_Client_ID = Client.Client_ID\n" +
                            "inner join Appointment_has_Employee on Appointment.Appointment_ID = Appointment_has_Employee.Appointment_Appointment_ID\n" +
                            "where Appointment_has_Employee.Employee_Employee_ID = '"+getEmployeeID()+"' and Appointment.Date = '"+getAppointmentDate()+"'";
        
        ResultSet rs = stmt.executeQuery(querString);
        
        return rs;
        
    }
        
    public ResultSet getFullAppointmentDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String querString = "select Appointment.Appointment_ID,Appointment.Start_Time,Appointment.Date,Appointment.End_Time,Appointment.Status,Client.Client_ID,CONCAT_WS('  ',Client.First_Name,Client.Last_Name),Client.Contact_Number\n" +
                            "From Appointment\n" +
                            "inner join Client on Appointment.Client_Client_ID = Client.Client_ID\n" +
                            "where Appointment.Appointment_ID = '"+getAppointmentID()+"'";
        
        ResultSet rs = stmt.executeQuery(querString);
        
        return rs;
        
    }
    
    public ResultSet getFullAppointmentEmployeeDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String querString = "select Employee.Employee_ID,CONCAT_WS('  ',Employee.First_Name,Employee.Last_Name)\n" +
                            "From Appointment_has_Employee\n" +
                            "left join Employee on Appointment_has_Employee.Employee_Employee_ID = Employee.Employee_ID\n" +
                            "where Appointment_has_Employee.Appointment_Appointment_ID = '"+getAppointmentID()+"'";
        
        ResultSet rs = stmt.executeQuery(querString);
        
        return rs;
        
    }
    
    public ResultSet getFullAppointmentServiceDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String querString = "select Service.Service_ID,Service.Service_Name,Service.Duration,Service.Service_Price,SUM(Service.Service_Price),SUM(Service.Duration)\n" +
                            "From Appointment_has_Service\n" +
                            "left join Service on Appointment_has_Service.Service_Service_ID = Service.Service_ID\n" +
                            "where Appointment_has_Service.Appointment_Appointment_ID = '"+getAppointmentID()+"'";
        
        ResultSet rs = stmt.executeQuery(querString);
        
        return rs;
        
    }
    
    public int deleteAppointment() throws ClassNotFoundException,SQLIntegrityConstraintViolationException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String quString = "delete from Appointment where Appointment_ID = '"+getAppointmentID()+"'";
        
        int i = stmt.executeUpdate(quString);
        
        return i;
        
    }
    
    
     public int updateFinishedAppointment() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String quString = "update Appointment set Status = 'Completed' where Appointment_ID = '"+getAppointmentID()+"'";
        
        int i = stmt.executeUpdate(quString);
        
        return i;
        
    }
     
     public int updateAppointmentStatus() throws ClassNotFoundException,SQLException,Exception{
    
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();        
        
        String queryString1 = "update Appointment set Status = 'Error'  where Appointment_ID = '"+getAppointmentID()+"'";        
       
        int i = stmt.executeUpdate(queryString1);     
        
        return i;
    }
     
     
   
    
     
    
    
}
