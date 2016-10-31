/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Appointments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Appointments.HandleAppointment;
import model.Appointments.HandleNewAppointment;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Samu
 */
public class EditAppointmentDetails extends javax.swing.JDialog {

    private final ImageIcon doneOut;
    private final ImageIcon doneEnter;
    
    private final ImageIcon cancelOut;
    private final ImageIcon cancelEnter;
    
    private String appointmentID;    
 
    private String startTime;  
    private String endTime;  
    private String duration;

    private int rowCount = 0;
    
    public EditAppointmentDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        doneOut = new ImageIcon(getClass().getResource("/view/Appointments/doneOut.png"));  
        doneEnter = new ImageIcon(getClass().getResource("/view/Appointments/doneEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png")); 
        
        this.pack();
        
        
    }
    
    public EditAppointmentDetails(java.awt.Frame parent, boolean modal,String appointmentID) {
        super(parent, modal);
        initComponents();
        
        doneOut = new ImageIcon(getClass().getResource("/view/Appointments/doneOut.png"));  
        doneEnter = new ImageIcon(getClass().getResource("/view/Appointments/doneEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png")); 
        
        this.appointmentID = appointmentID;
        
        loadClientNames(); 
        loadFullAppointmentDetails();
        calculateDuration();
       
       
        
   
        this.pack();
        
        
    }
    
    private void loadClientNames(){
        
        HandleNewAppointment hna = new HandleNewAppointment();
        try{
            ResultSet rs = hna.viewClientNamesForAppointment();
            while(rs.next()) {
                clientnameCombo.addItem(rs.getString("Client Name"));
            }
        }
        catch(ClassNotFoundException ex){
               JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
        } 
        catch(SQLException ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    private void getEmployeeList(){        
                   
        HandleNewAppointment hna = new HandleNewAppointment();
        
        try{           
            ResultSet rs = hna.employeeListForUpdate();           
            EmployeeTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(ClassNotFoundException ex){
               JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
        } 
        catch(SQLException ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex){
               JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                
    }    
 
    private void loadFullAppointmentDetails(){
        
        HandleAppointment ha = new HandleAppointment();
        ha.setAppointmentID(this.appointmentID);
       
        try{
           
            this.appointmentDetails(ha);            
            this.employeeDetails(ha);
        
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
        } 
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
    }
    
    private void appointmentDetails(HandleAppointment ha)throws ClassNotFoundException,SQLException,Exception{
        
          ResultSet rs = ha.getFullAppointmentDetails();
          if (rs.next()) {          
            
          SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
          try {
            appodateChooser.setDate(date.parse(rs.getString("Appointment.Date")));
          } catch (ParseException ex) {
            Logger.getLogger(EditAppointmentDetails.class.getName()).log(Level.SEVERE, null, ex);
          }
       
          this.startTime = rs.getString("Appointment.Start_Time");
          this.endTime = rs.getString("Appointment.End_Time");
          timeCombo.setSelectedItem(this.startTime);
          clientnameCombo.setSelectedItem(rs.getString("CONCAT_WS('  ',Client.First_Name,Client.Last_Name)"));
          
          }        
          
    }
    
    private void calculateDuration(){
        
        String startTime = this.startTime;
        String endTime = this.endTime;
        
        int startMinutes = this.intoMinutes(startTime);
        int endMinutes = this.intoMinutes(endTime);
        
        int duMinits = endMinutes - startMinutes;
        this.duration =  this.convertHHMMSS(duMinits);
        
    }
    
    
     private String calculateEndTime(){
        
        String startTime = timeCombo.getSelectedItem().toString();
        String duration = this.duration;
        
        int startMinutes = this.intoMinutes(startTime);
        int durationMinutes = this.intoMinutes(duration);
        
        int endTimeMinutes = startMinutes + durationMinutes;
        String endTime = this.convertHHMMSS(endTimeMinutes);
        
        return endTime; 
    }
    
    private int intoMinutes(String duration){
        
        
        String[] h1=duration.split(":");  
  
        int hour=Integer.parseInt(h1[0]);  
        int minute=Integer.parseInt(h1[1]);  
        int second=Integer.parseInt(h1[2]);  
  
        int temp;  
        temp = second + (minute) + (60 * hour);   
                
        return temp;
        
    }
    
    private String convertHHMMSS(int serviceTime){
        
        long hours = TimeUnit.MINUTES.toHours(serviceTime);
        long remainMinute = serviceTime - TimeUnit.HOURS.toMinutes(hours);
        String h = String.format("%02d", hours);
        String m = String.format("%02d", remainMinute);
                  
                
       String time = h+":"+m+":"+"00";
       
       return time;
                
    }
    
    
    
    
    
    private void employeeDetails(HandleAppointment ha)throws ClassNotFoundException,SQLException,Exception{
        
        ResultSet rs = ha.getFullAppointmentEmployeeDetails();
        while(rs.next()) {
            DefaultTableModel model = (DefaultTableModel) selectedEmployeeTable.getModel();
            int x = model.getRowCount();
            model.setRowCount(x+1);
            
            if (rs.getString("Employee.Employee_ID") == null) {
               selectedEmployeeTable.setValueAt("Employee is Unavailable", this.rowCount, 0);  
               this.rowCount++;
            }
            else{              
          
                String employeeName = rs.getString("CONCAT_WS('  ',Employee.First_Name,Employee.Last_Name)");
                selectedEmployeeTable.setValueAt(employeeName, this.rowCount, 0);
                this.rowCount++;
            }
                 
       }
            
    }
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        timeCombo = new javax.swing.JComboBox();
        clientnameCombo = new javax.swing.JComboBox();
        appodateChooser = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        selectEmployeeLabel = new javax.swing.JLabel();
        cancelEmployeeLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        selectedEmployeeTable = new javax.swing.JTable();
        doneLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeCombo.setMaximumRowCount(200);
        timeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00:00", "09:15:00", "09:30:00", "09:45:00", "10:00:00", "10:15:00", "10:30:00", "10:45:00", "11:00:00", "11:15:00", "11:30:00", "11:45:00", "12:00:00", "12:15:00", "12:30:00", "12:45:00", "14:00:00", "14:15:00", "14:30:00", "14:45:00", "15:00:00", "15:15:00", "15:30:00", "15:45:00", "16:00:00", "16:15:00", "16:30:00", "16:45:00", "17:00:00", "17:15:00", "17:30:00", "17:45:00", "18:00:00" }));
        timeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeComboActionPerformed(evt);
            }
        });
        jPanel1.add(timeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 280, 30));

        clientnameCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientnameCombo.setMaximumRowCount(200);
        jPanel1.add(clientnameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 280, 30));

        appodateChooser.setDateFormatString("yyyy-MM-dd");
        appodateChooser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        appodateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                appodateChooserPropertyChange(evt);
            }
        });
        jPanel1.add(appodateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 280, 30));

        jLabel7.setBackground(new java.awt.Color(51, 0, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Employee List");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 245, 160, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel8.setIconTextGap(0);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 500, 30));

        EmployeeTable.setBackground(new java.awt.Color(204, 204, 204));
        EmployeeTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Details", "Employee", "Additional Employee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeTable.setFillsViewportHeight(true);
        EmployeeTable.setRowHeight(25);
        EmployeeTable.getTableHeader().setReorderingAllowed(false);
        EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(EmployeeTable);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 790, 150));

        jLabel9.setBackground(new java.awt.Color(51, 0, 51));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Selected Employees");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 445, 200, 20));

        selectEmployeeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/donesmall.png"))); // NOI18N
        selectEmployeeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectEmployeeLabel.setIconTextGap(0);
        selectEmployeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectEmployeeLabelMouseClicked(evt);
            }
        });
        jPanel1.add(selectEmployeeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 442, 25, 25));

        cancelEmployeeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/cancelsmall.png"))); // NOI18N
        cancelEmployeeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelEmployeeLabel.setIconTextGap(0);
        cancelEmployeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelEmployeeLabelMouseClicked(evt);
            }
        });
        jPanel1.add(cancelEmployeeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 442, 25, 25));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel10.setIconTextGap(0);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 500, 30));

        selectedEmployeeTable.setBackground(new java.awt.Color(204, 204, 204));
        selectedEmployeeTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selectedEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        selectedEmployeeTable.setFillsViewportHeight(true);
        selectedEmployeeTable.setRowHeight(25);
        selectedEmployeeTable.getTableHeader().setReorderingAllowed(false);
        selectedEmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedEmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(selectedEmployeeTable);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 790, 150));

        doneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/doneOut.png"))); // NOI18N
        doneLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doneLabel.setIconTextGap(0);
        doneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doneLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doneLabelMouseExited(evt);
            }
        });
        jPanel1.add(doneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 150, 50));

        cancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"))); // NOI18N
        cancelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelLabel.setIconTextGap(0);
        cancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelLabelMouseExited(evt);
            }
        });
        jPanel1.add(cancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 150, 50));

        jLabel15.setBackground(new java.awt.Color(51, 0, 51));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Time");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 195, 150, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel16.setIconTextGap(0);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 500, 30));

        jLabel11.setBackground(new java.awt.Color(51, 0, 51));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Client Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, 130, 20));

        jLabel13.setBackground(new java.awt.Color(51, 0, 51));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 135, 140, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel14.setIconTextGap(0);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 500, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel12.setIconTextGap(0);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 500, 30));

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Appointment Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 240, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/titleGlass.png"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/updateBackground.jpg"))); // NOI18N
        jLabel6.setIconTextGap(0);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseClicked
         
        if (selectedEmployeeTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Please select employee for this appointment.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        
        String clientName = clientnameCombo.getSelectedItem().toString();
        String appoDate = date.format(appodateChooser.getDate());
        String startTime = timeCombo.getSelectedItem().toString();
        String endTime = calculateEndTime();
        String clientID = null;       
       
        HandleNewAppointment hna = new HandleNewAppointment();
        
        try{
            hna.setClientFullName(clientName);
            ResultSet rs = hna.viewClientDetailsForAppointment();
            if (rs.next()) {
                clientID = rs.getString("Client_ID");
                
                hna.setAppointmentID(this.appointmentID);
                hna.setClientID(clientID);           
                hna.setAppointmentDate(appoDate);
                hna.setAppointmentStartTime(startTime);
                hna.setAppointmentEndTime(endTime);
            
                int i = hna.updateAppointment();
                if (i != 0) {
                    updateEmployee(hna);    
                    JOptionPane.showMessageDialog(null, "Appointment has been updated successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "This appointment cannot be update.", "Error", JOptionPane.ERROR_MESSAGE);
                    this.dispose();
                }
                                
            }
             
            
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
        } 
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
     
            
            
        }
        
        
      
    }//GEN-LAST:event_doneLabelMouseClicked

    private void updateEmployee(HandleNewAppointment hna){
        
        int employeeAvailableCheckCount = 0;
        try{
            for (int i = 0; i < selectedEmployeeTable.getRowCount(); i++) {
                
                String employeeName = selectedEmployeeTable.getValueAt(i, 0).toString();
                hna.setEmployeeName(employeeName);
                
                    ResultSet rs = hna.getSelectedEmployeeID();
                    if (rs.next()) {
                        String employeeID = rs.getString("Employee_ID");
                        hna.setEmployeeID(employeeID);
                        
                        ResultSet rs2 = hna.checkEmployeeAvailabilityAgain();
                        if (rs2.next()) {
                            employeeAvailableCheckCount++;
                        }  
                         hna.addAppointmentHasEmployeeDetails(); 
                    }                
        
            }            
            if (employeeAvailableCheckCount >= 1 ) {
                hna.setStatus("Error");
                hna.updateAppointmentStatus();               
            }
            else{
                hna.setStatus("Pending");
                hna.updateAppointmentStatus();                
            }
           
        
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
        } 
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
            
            
            
    }
    
    private void doneLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseEntered
        doneLabel.setIcon(doneEnter);
    }//GEN-LAST:event_doneLabelMouseEntered

    private void doneLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseExited
        doneLabel.setIcon(doneOut);
    }//GEN-LAST:event_doneLabelMouseExited

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelLabelMouseClicked

    private void cancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseEntered
        cancelLabel.setIcon(cancelEnter);
    }//GEN-LAST:event_cancelLabelMouseEntered

    private void cancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseExited
        cancelLabel.setIcon(cancelOut);
    }//GEN-LAST:event_cancelLabelMouseExited

    private void EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeTableMouseClicked
        selectedEmployeeTable.getSelectionModel().clearSelection();
    }//GEN-LAST:event_EmployeeTableMouseClicked

    private void selectEmployeeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectEmployeeLabelMouseClicked

        HandleNewAppointment hna = new HandleNewAppointment();
        int selectedRow = EmployeeTable.getSelectedRow();
        String appoDate = null;
        
        
        if (EmployeeTable.getRowCount()== 0) {
            JOptionPane.showMessageDialog(null, "All employees are unavailable.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Please select the employee.", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else{

                if (EmployeeTable.getValueAt(selectedRow, 2).toString().equalsIgnoreCase("Selected")) {
                    JOptionPane.showMessageDialog(null, "This employee is already selected.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    String employeeID = EmployeeTable.getValueAt(selectedRow, 0).toString();
                    String employeempName = EmployeeTable.getValueAt(selectedRow, 1).toString();

                    try{
                        SimpleDateFormat idate = new SimpleDateFormat("yyyy-MM-dd");
                        appoDate = idate.format(appodateChooser.getDate());
                    }
                    catch(NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Date is invalid.", "WARNING", JOptionPane.WARNING_MESSAGE);
                    }
                    
                    hna.setClientDate(appoDate);
                    hna.setClientStartTime(timeCombo.getSelectedItem().toString());                    
                    hna.setEmployeeID(employeeID);                   
                  

                    try{
                        ResultSet rs = hna.checkEmployeeAvailability();
                        if (rs.next() ) {
                            JOptionPane.showMessageDialog(null, "This employee is not available for this appointment.", "Message", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            DefaultTableModel model = (DefaultTableModel) selectedEmployeeTable.getModel();
                            int x = model.getRowCount();
                            model.setRowCount(x+1);

                            selectedEmployeeTable.setValueAt(employeempName, this.rowCount, 0);
                            EmployeeTable.setValueAt("Selected", selectedRow, 2);

                            this.rowCount++;

                        }
                    }
                    catch(ClassNotFoundException ex){
                        JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
                    }
                    catch(SQLException ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }

                }

            }

        }

    }//GEN-LAST:event_selectEmployeeLabelMouseClicked

    private void cancelEmployeeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelEmployeeLabelMouseClicked

        int selectedRow = selectedEmployeeTable.getSelectedRow();

        if (selectedEmployeeTable.getRowCount()== 0) {
            JOptionPane.showMessageDialog(null, "Selected employee table is empty.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Please select the employee that you need to be remove.", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else{

                DefaultTableModel model = (DefaultTableModel) selectedEmployeeTable.getModel();

                String employeeName = selectedEmployeeTable.getValueAt(selectedRow, 0).toString();

                model.removeRow(selectedRow);
                this.rowCount--;

                for (int j = 0; j < EmployeeTable.getRowCount(); j++) {

                    String employeempName1 = EmployeeTable.getValueAt(j, 1).toString();
                    if (employeeName.equalsIgnoreCase(employeempName1)) {
                        EmployeeTable.setValueAt("Not Selected", j, 2);
                    }

                }

            }

        }

    }//GEN-LAST:event_cancelEmployeeLabelMouseClicked

    private void selectedEmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedEmployeeTableMouseClicked
        EmployeeTable.getSelectionModel().clearSelection();
    }//GEN-LAST:event_selectedEmployeeTableMouseClicked

    private void appodateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_appodateChooserPropertyChange
        getEmployeeList();
        DefaultTableModel model = (DefaultTableModel) selectedEmployeeTable.getModel();
        model.setRowCount(0);
        this.rowCount = 0;
    }//GEN-LAST:event_appodateChooserPropertyChange

    private void timeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeComboActionPerformed
        getEmployeeList();
        DefaultTableModel model = (DefaultTableModel) selectedEmployeeTable.getModel();
        model.setRowCount(0);
        this.rowCount = 0;
    }//GEN-LAST:event_timeComboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditAppointmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAppointmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAppointmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAppointmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditAppointmentDetails dialog = new EditAppointmentDetails(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeTable;
    private com.toedter.calendar.JDateChooser appodateChooser;
    private javax.swing.JLabel cancelEmployeeLabel;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JComboBox clientnameCombo;
    private javax.swing.JLabel doneLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel selectEmployeeLabel;
    private javax.swing.JTable selectedEmployeeTable;
    private javax.swing.JComboBox timeCombo;
    // End of variables declaration//GEN-END:variables
}
