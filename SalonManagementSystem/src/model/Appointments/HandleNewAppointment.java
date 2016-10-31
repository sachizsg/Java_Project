/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Appointments;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.SalonDatabase.DatabaseConnection;

/**
 *
 * @author Samu
 */
public class HandleNewAppointment {
    
    
    private String clientFullName;
    private String clientSearchKey;
    private String clientID;
    
    private String serviceID;
    private String serviceName;
    private String serviceSearchKey;
    
    private String clientStartTime;
    private String clientEndTime;
    private String clientDate;
    
    
    private String employeeID;
    private String employeeName;
    
    
    private String appointmentID;
    private String appointmentDate;
    private String appointmentStartTime;
    private String appointmentEndTime;
    private String status;
    
 
    
    
    public String getClientFullName() {
        return clientFullName;
    }

    public void setClientFullName(String clientFullName) {
        this.clientFullName = clientFullName;
    }

    public String getClientSearchKey() {
        return clientSearchKey;
    }

    public void setClientSearchKey(String clientSearchKey) {
        this.clientSearchKey = clientSearchKey;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceSearchKey() {
        return serviceSearchKey;
    }

    public void setServiceSearchKey(String serviceSearchKey) {
        this.serviceSearchKey = serviceSearchKey;
    }
   
    public String getClientDate() {
        return clientDate;
    }

    public void setClientDate(String clientDate) {
        this.clientDate = clientDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentStartTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentStartTime = appointmentTime;
    }

    public String getAppointmentStartTime() {
        return appointmentStartTime;
    }

    public void setAppointmentStartTime(String appointmentStartTime) {
        this.appointmentStartTime = appointmentStartTime;
    }

    public String getAppointmentEndTime() {
        return appointmentEndTime;
    }

    public void setAppointmentEndTime(String appointmentEndTime) {
        this.appointmentEndTime = appointmentEndTime;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getClientStartTime() {
        return clientStartTime;
    }

    public void setClientStartTime(String clientStartTime) {
        this.clientStartTime = clientStartTime;
    }

    public String getClientEndTime() {
        return clientEndTime;
    }

    public void setClientEndTime(String clientEndTime) {
        this.clientEndTime = clientEndTime;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    //Appointment Client -----------------------------------------------------------------------------------------------------
    
    public ResultSet viewClientNamesForAppointment() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select CONCAT_WS('  ',First_Name,Last_Name) as 'Client Name' from Client";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    public ResultSet viewClientDetailsForAppointment() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select * from Client where CONCAT_WS('  ',First_Name,Last_Name) = '"+getClientFullName()+"'";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    public ResultSet searchClientForAppointment() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String querString = "select CONCAT_WS('  ',First_Name,Last_Name) as 'Client Name' from Client where First_Name like '%"+getClientSearchKey()+"%' or Last_Name like '%"+getClientSearchKey()+"%'";
        
        ResultSet rs = stmt.executeQuery(querString);
        
        return rs;
        
    }    
    
    public ResultSet getClientDetailsByClientID()throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select CONCAT_WS('  ',First_Name,Last_Name),Contact_Number from Client where  Client_ID = '"+getClientID()+"'";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    
    //------------------------------------------------------------------------------------------------------------------------
    
    
    // Appointment Service ---------------------------------------------------------------------------------------------------
    
     public ResultSet viewServiceNamesForAppointment() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select Service_Name as 'Service Name' from Service";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
     
    public ResultSet viewPreviousClientServices() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select Service.Service_Name as 'Service Name',Service.Service_Price as 'Service Price',Appointment.Date as 'Last Sevice Date'\n" +
                             "From Service \n" +
                             "inner join Appointment_has_Service on Service.Service_ID = Appointment_has_Service.Service_Service_ID\n" +
                             "inner join Appointment on Appointment_has_Service.Appointment_Appointment_ID = Appointment.Appointment_ID\n" +
                             "where Appointment_has_Service.Appointment_Client_Client_ID = '"+getClientID()+"';";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }     
    
    public ResultSet viewServiceDetailsForAppointment()throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select * from Service where Service_Name = '"+getServiceName()+"'";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    public ResultSet getServiceDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select * from Service where Service_ID = '"+getServiceID()+"'";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
     
    public ResultSet searchService() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String querString = "select Service_Name as 'Service Name' from Service where Service_Name like '%"+getServiceSearchKey()+"%' ";
        
        ResultSet rs = stmt.executeQuery(querString);
        
        return rs;
        
    }
    
    //-------------------------------------------------------------------------------------------------------------------------

    
    // Appointment Additional Employee --------------------------------------------------------------------------------------------------
    
    
    public ResultSet employeeList() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select Employee_ID as 'Employee ID',CONCAT_WS('  ',First_Name,Last_Name) as 'Employee Name','Not Selected' as 'Status'\n" +
                             "from Employee \n" +                             
                             "where Employee_ID != '"+getEmployeeID()+"'";
        
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    public ResultSet employeeListForUpdate() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select Employee_ID as 'Employee ID',CONCAT_WS('  ',First_Name,Last_Name) as 'Employee Name','Not Selected' as 'Status'\n" +
                             "from Employee";
        
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    public ResultSet checkEmployeeAvailability() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String queryString = "select *\n" +
                             "From Employee\n" +
                             "left join Appointment_Has_Employee on Employee.Employee_ID = Appointment_Has_Employee.Employee_Employee_ID\n" +
                             "inner join Appointment on Appointment_Has_Employee.Appointment_Appointment_ID = Appointment.Appointment_ID\n" +
                             "where \n" +
                             "Appointment.Date = '"+getClientDate()+"' and\n" +
                             "Employee.Employee_ID = '"+getEmployeeID()+"' and\n" +
                             "'"+getClientStartTime()+"'  between Appointment.Start_Time and  SUBTIME(Appointment.End_Time,15)";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    public ResultSet checkEmployeeAvailabilityAgain() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        
        Statement stmt = con.createStatement();
        
        String queryString = "select *\n" +
                             "From Employee\n" +
                             "left join Appointment_Has_Employee on Employee.Employee_ID = Appointment_Has_Employee.Employee_Employee_ID\n" +
                             "inner join Appointment on Appointment_Has_Employee.Appointment_Appointment_ID = Appointment.Appointment_ID\n" +
                             "where \n" +
                             "Appointment.Date = '"+getAppointmentDate()+"' and\n" +
                             "Employee.Employee_ID = '"+getEmployeeID()+"' and\n" +
                             "ADDTIME(Appointment.Start_Time,15) between '"+getAppointmentStartTime()+"'  and  '"+getAppointmentEndTime()+"' ";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    
    
     public ResultSet getSelectedEmployeeID() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select Employee_ID from Employee where CONCAT_WS('  ',First_Name,Last_Name) = '"+getEmployeeName()+"'";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
     
    public ResultSet getEmployeeDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "select CONCAT_WS('  ',First_Name,Last_Name) from Employee where Employee_ID = '"+getEmployeeID()+"'";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
     
    // -----------------------------------------------------------------------------------------------------------------------
    
    
    // Save Appointmnet ------------------------------------------------------------------------------------------------------
     
    public int addAppointmentDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
        
        String queryString = "insert into Appointment (Date,Start_Time,End_Time,Status,Client_Client_ID) values('"+getAppointmentDate()+"','"+getAppointmentStartTime()+"','"+getAppointmentEndTime()+"','Pending','"+getClientID()+"')";
        
        int i = stmt.executeUpdate(queryString);
        
        return i;
        
    }
    
    public ResultSet getLastFromAppointment() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
       
        String queryString = "select MAX(Appointment_ID) as 'Appointment ID' from Appointment";
        
        ResultSet rs = stmt.executeQuery(queryString);
        
        return rs;
        
    }
    
    
    public int addAppointmentHasServiceDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();
       
        String queryString = "insert into Appointment_has_Service (Appointment_Appointment_ID,Appointment_Client_Client_ID,Service_Service_ID) values('"+getAppointmentID()+"','"+getClientID()+"','"+getServiceID()+"')";
        
        int i = stmt.executeUpdate(queryString);
        
        return i;
        
    }
     
    public void addAppointmentHasEmployeeDetails() throws ClassNotFoundException,SQLException,Exception{
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection con = dbc.getConnection();
        Statement stmt = con.createStatement();        

        String queryString = "insert into Appointment_has_Employee (Appointment_Appointment_ID,Employee_Employee_ID) values('"+getAppointmentID()+"','"+getEmployeeID()+"')";
        stmt.executeUpdate(queryString);
     
    }
     
       
    
    //--------------------------------------------------------------------------------------------------------------------------
    
    //Update Appointment ------------------------------------------------------------------------------------------------------
    
     public int updateAppointment() throws ClassNotFoundException,SQLException,Exception{
    
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();        
        
        String queryString1 = "update Appointment set Date = '"+getAppointmentDate()+"', Start_Time = '"+getAppointmentStartTime()+"',End_Time = '"+getAppointmentEndTime()+"',Client_Client_ID = '"+getClientID()+"' where Appointment_ID = '"+getAppointmentID()+"'";
        String queryString2 = "delete from Appointment_has_Employee where Appointment_Appointment_ID = '"+getAppointmentID()+"'";
       
        stmt.executeUpdate(queryString1);  
        int i = stmt.executeUpdate(queryString2);  
        
        return i;
    }
     
     
    public int updateAppointmentStatus() throws ClassNotFoundException,SQLException,Exception{
    
        DatabaseConnection db = new DatabaseConnection();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();        
        
        String queryString = "update Appointment set Status = '"+getStatus()+"' where Appointment_ID = '"+getAppointmentID()+"'";
        
        int i = stmt.executeUpdate(queryString);  
        
        return i;
    }

    
    
    
    
}
