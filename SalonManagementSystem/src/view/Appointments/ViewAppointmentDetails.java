/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Appointments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Appointments.HandleAppointment;
import view.PointOfSale.PointOfSale;

/**
 *
 * @author Samu
 */
public class ViewAppointmentDetails extends javax.swing.JDialog {

        
    
    private final ImageIcon cancelOut;
    private final ImageIcon cancelEnter;
        
    private String appointmentID;

    private int serviceRowCount = 0;
    private int employeeRowCount = 0;
    
    
 
    public ViewAppointmentDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();                 
        
    
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png")); 
        
        this.pack();
        
        
    }

    public ViewAppointmentDetails(java.awt.Frame parent, boolean modal,String appointmentID) {
        super(parent, modal);
        initComponents();             
        
     
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png")); 
        
       
        this.appointmentID = appointmentID;    
        this.loadFullAppointmentDetails();
        
        this.pack();
        
        
    }
    
    private void loadFullAppointmentDetails(){
        
        HandleAppointment ha = new HandleAppointment();
        ha.setAppointmentID(this.appointmentID);
       
        try{
           
            this.appointmentDetails(ha);
            this.serviceDetails(ha);
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
          appointmentIDLabel.setText( rs.getString("Appointment.Appointment_ID"));          
          timeLabel.setText(rs.getString("Appointment.Start_Time"));
          dateLabel.setText(rs.getString("Appointment.Date"));          
          clientNameLabel.setText(rs.getString("CONCAT_WS('  ',Client.First_Name,Client.Last_Name)"));
          contactNumberLabel.setText(rs.getString("Client.Contact_Number"));                
          }        
          
    }
    
    private void employeeDetails(HandleAppointment ha)throws ClassNotFoundException,SQLException,Exception{
        
        ResultSet rs = ha.getFullAppointmentEmployeeDetails();
        while(rs.next()) {
             DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
            int x = model.getRowCount();
            model.setRowCount(x+1);
            
            if (rs.getString("Employee.Employee_ID") == null) {
               employeeTable.setValueAt("Employee is Unavailable", this.employeeRowCount, 0);  
               this.employeeRowCount++;
            }
            else{              
          
                String employeeName = rs.getString("CONCAT_WS('  ',Employee.First_Name,Employee.Last_Name)");
                employeeTable.setValueAt(employeeName, this.employeeRowCount, 0);
                this.employeeRowCount++;
            }
                 
       }
            
    }
    
    private void serviceDetails(HandleAppointment ha)throws ClassNotFoundException,SQLException,Exception{
            
       ResultSet rs = ha.getFullAppointmentServiceDetails();            
       while(rs.next()) {
                
          DefaultTableModel model = (DefaultTableModel) serviceTable.getModel();
          int x = model.getRowCount();
          model.setRowCount(x+1);
          
           if (rs.getString("Service.Service_ID") == null) {
              
                serviceTable.setValueAt("Unavailable", this.serviceRowCount, 0);
                serviceTable.setValueAt("Unavailable", this.serviceRowCount, 1);
                serviceTable.setValueAt("Unavailable", this.serviceRowCount, 2);
                this.serviceRowCount++;                 
           }
           else{
               String serName = rs.getString("Service.Service_Name");
               String duration = rs.getString("Service.Duration");
               String serPrice = rs.getString("Service.Service_Price");
               priceLabel.setText(rs.getString("SUM(Service.Service_Price)"));
               durationLabel.setText(rs.getString("SUM(Service.Duration)"));           

               serviceTable.setValueAt(serName, this.serviceRowCount, 0);
               serviceTable.setValueAt(duration, this.serviceRowCount, 1);
               serviceTable.setValueAt(serPrice, this.serviceRowCount, 2);
                    
               this.serviceRowCount++;        
               
               
           }                    
          
                
       }
                 
    }
            
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        appointmentIDLabel = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        contactNumberLabel = new javax.swing.JLabel();
        clientNameLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appointmentIDLabel.setBackground(new java.awt.Color(51, 0, 51));
        appointmentIDLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        appointmentIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(appointmentIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 80, 20));

        jLabel22.setBackground(new java.awt.Color(51, 0, 51));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Appointment ID :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 120, 20));

        jLabel19.setBackground(new java.awt.Color(51, 0, 51));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Duration (min) :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 235, 120, 20));

        durationLabel.setBackground(new java.awt.Color(51, 0, 51));
        durationLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        durationLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(durationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 235, 80, 20));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel21.setIconTextGap(0);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 220, 30));

        jLabel20.setBackground(new java.awt.Color(51, 0, 51));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Total Charge    :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 265, 110, 20));

        priceLabel.setBackground(new java.awt.Color(51, 0, 51));
        priceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 265, 90, 20));

        contactNumberLabel.setBackground(new java.awt.Color(51, 0, 51));
        contactNumberLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contactNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactNumberLabel.setText("Contact Number");
        jPanel1.add(contactNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 165, 300, 20));

        clientNameLabel.setBackground(new java.awt.Color(51, 0, 51));
        clientNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clientNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        clientNameLabel.setText("Name");
        jPanel1.add(clientNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 125, 290, 20));

        timeLabel.setBackground(new java.awt.Color(51, 0, 51));
        timeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 110, 20));

        dateLabel.setBackground(new java.awt.Color(51, 0, 51));
        dateLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 110, 20));

        jLabel18.setBackground(new java.awt.Color(51, 0, 51));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Time :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 50, 20));

        jLabel17.setBackground(new java.awt.Color(51, 0, 51));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Date :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 50, 20));

        jLabel15.setBackground(new java.awt.Color(51, 0, 51));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Contact Number");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 165, 150, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel16.setIconTextGap(0);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 500, 30));

        jLabel11.setBackground(new java.awt.Color(51, 0, 51));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Client Details");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, 230, 20));

        jLabel13.setBackground(new java.awt.Color(51, 0, 51));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 125, 140, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel14.setIconTextGap(0);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 500, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel12.setIconTextGap(0);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 540, 30));

        jLabel7.setBackground(new java.awt.Color(51, 0, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Service Details");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 265, 140, 20));

        serviceTable.setBackground(new java.awt.Color(204, 204, 204));
        serviceTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Name", "Duration", "Service Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        serviceTable.setFillsViewportHeight(true);
        serviceTable.setRowHeight(25);
        serviceTable.getTableHeader().setReorderingAllowed(false);
        serviceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(serviceTable);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 290, 542, 150));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel8.setIconTextGap(0);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 540, 30));

        jLabel9.setBackground(new java.awt.Color(51, 0, 51));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Employee Details");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 265, 200, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel10.setIconTextGap(0);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 30));

        employeeTable.setBackground(new java.awt.Color(204, 204, 204));
        employeeTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        employeeTable.setFillsViewportHeight(true);
        employeeTable.setRowHeight(25);
        employeeTable.getTableHeader().setReorderingAllowed(false);
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(employeeTable);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 290, 263, 235));

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Appointment Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/titleGlass.png"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

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
        jPanel1.add(cancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 150, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel5.setIconTextGap(0);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 540, 75));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/backgroundsmall.jpg"))); // NOI18N
        jLabel6.setIconTextGap(0);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Appointment");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem2.setText("Add to Invoice");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem7.setText("Edit Appointment");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem3.setText("Delete Apoointment");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void serviceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceTableMouseClicked
        employeeTable.getSelectionModel().clearSelection();
    }//GEN-LAST:event_serviceTableMouseClicked

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        serviceTable.getSelectionModel().clearSelection();
    }//GEN-LAST:event_employeeTableMouseClicked

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelLabelMouseClicked

    private void cancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseEntered
        cancelLabel.setIcon(cancelEnter);
    }//GEN-LAST:event_cancelLabelMouseEntered

    private void cancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseExited
        cancelLabel.setIcon(cancelOut);
    }//GEN-LAST:event_cancelLabelMouseExited

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        HandleAppointment ha = new HandleAppointment();
        try{
            ha.setAppointmentID(this.appointmentID);
            ResultSet rs = ha.getFullAppointmentDetails();
            if (rs.next()) {
                String status = rs.getString("Appointment.Status");
                switch (status) {
                    case "Completed":
                        JOptionPane.showMessageDialog(null, "This appointment was already proceed with the invoice.", "Appointment to Invoice", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Error":
                        JOptionPane.showMessageDialog(null, "This appointment has an error.", "Appointment to Invoice", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        String appoID = this.appointmentID;
                        String charge = priceLabel.getText();
                        PointOfSale pos = new PointOfSale(appoID,charge);
                        this.dispose();        
                        pos.setVisible(true);
                                        
                        break;
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
                
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        
        HandleAppointment ha = new HandleAppointment();
        try{
            ha.setAppointmentID(this.appointmentID);
            ResultSet rs = ha.getFullAppointmentDetails();
            if (rs.next()) {
                String status = rs.getString("Appointment.Status");
                switch (status) {
                    case "Completed":
                        JOptionPane.showMessageDialog(null, "Cannot edit this appointment.It was completed already.", "Edit Appointment", JOptionPane.INFORMATION_MESSAGE);
                        break;                    
                    default:
                         EditAppointmentDetails ead = new EditAppointmentDetails(null, true,this.appointmentID);
                         this.dispose();
                         ead.setVisible(true);
                         break;
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
               
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        HandleAppointment ha = new HandleAppointment();
        ha.setAppointmentID(this.appointmentID);
        try{
                int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this appointment ?", "Delete Appointment", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                        
                     int i = ha.deleteAppointment();
                     if (i!=0) {
                        JOptionPane.showMessageDialog(null, "Appointment has been deleted successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                     }
                     else{
                         JOptionPane.showMessageDialog(null, "Appointment cannot be delete.", "Error", JOptionPane.ERROR_MESSAGE);
                         this.dispose();
                     }
                    
                 }
                 else {
                    this.dispose();
                 }
          
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Appointment cannot be deleted since appointment is related to existing invoice.", "SQLIntegrityConstraintViolationException", JOptionPane.WARNING_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAppointmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAppointmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAppointmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAppointmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewAppointmentDetails dialog = new ViewAppointmentDetails(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel appointmentIDLabel;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JLabel clientNameLabel;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTable serviceTable;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
