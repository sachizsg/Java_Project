/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Login;

import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Login.HandleAdministrator;

/**
 *
 * @author Nadee
 */
public class Administrator extends javax.swing.JDialog {

    /**
     * Creates new form Administrator
     */
    
    private final ImageIcon saveOut;
    private final ImageIcon saveEnter;   
       
    private final ImageIcon cancelOut;
    private final ImageIcon cancelEnter;
    
    private final ImageIcon newOut;
    private final ImageIcon newEnter;    
  
    private final ImageIcon editOut;
    private final ImageIcon editEnter;
    
    private final ImageIcon settingsOut;
    private final ImageIcon settingsEnter;
    
    
    
    public Administrator(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
       saveOut = new ImageIcon(getClass().getResource("/view/Login/saveOut.png"));
       saveEnter = new ImageIcon(getClass().getResource("/view/Login/saveEnter.png"));       
       cancelOut = new ImageIcon(getClass().getResource("/view/Login/cancelOut.png"));
       cancelEnter = new ImageIcon(getClass().getResource("/view/Login/cancelEnter.png"));
       
       newOut = new ImageIcon(getClass().getResource("/view/Login/employeeOut.png"));
       newEnter = new ImageIcon(getClass().getResource("/view/Login/employeeEnter.png"));      
       editOut = new ImageIcon(getClass().getResource("/view/Login/adminOut.png"));
       editEnter = new ImageIcon(getClass().getResource("/view/Login/adminEnter.png"));
       settingsOut = new ImageIcon(getClass().getResource("/view/Login/settingsOut.png"));
       settingsEnter = new ImageIcon(getClass().getResource("/view/Login/settingsEnter.png"));
       
       
       newUserPanel.setVisible(true);       
       changePasswordPanel.setVisible(false);
       userSettingsPanel.setVisible(false);
        
       this.pack();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userControlSettingsButton = new javax.swing.JLabel();
        changeAdminPasswordButton = new javax.swing.JLabel();
        addNewUserButton = new javax.swing.JLabel();
        newUserPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        employeePassword = new javax.swing.JPasswordField();
        employeePasswordConfirm = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        userSaveCancelButton = new javax.swing.JLabel();
        userSaveButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        changePasswordPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        adminConfirmPassword = new javax.swing.JPasswordField();
        adminCurrentPassword = new javax.swing.JPasswordField();
        adminNewPassword = new javax.swing.JPasswordField();
        adminPasswordCancelButton = new javax.swing.JLabel();
        adminPasswordSaveButton = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userSettingsPanel = new javax.swing.JPanel();
        reportsCheck = new javax.swing.JCheckBox();
        financeCheck = new javax.swing.JCheckBox();
        employeeCheck = new javax.swing.JCheckBox();
        appointmentsCheck = new javax.swing.JCheckBox();
        salesCheck = new javax.swing.JCheckBox();
        inventoryCheck = new javax.swing.JCheckBox();
        servicesCheck = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        settingsCancelButton = new javax.swing.JLabel();
        settingsSaveButton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrator");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userControlSettingsButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        userControlSettingsButton.setForeground(new java.awt.Color(255, 255, 255));
        userControlSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/settingsOut.png"))); // NOI18N
        userControlSettingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userControlSettingsButton.setIconTextGap(0);
        userControlSettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userControlSettingsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userControlSettingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userControlSettingsButtonMouseExited(evt);
            }
        });
        jPanel1.add(userControlSettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 350, 50));

        changeAdminPasswordButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        changeAdminPasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        changeAdminPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/adminOut.png"))); // NOI18N
        changeAdminPasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeAdminPasswordButton.setIconTextGap(0);
        changeAdminPasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAdminPasswordButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeAdminPasswordButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeAdminPasswordButtonMouseExited(evt);
            }
        });
        jPanel1.add(changeAdminPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 350, 50));

        addNewUserButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addNewUserButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/employeeOut.png"))); // NOI18N
        addNewUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewUserButton.setIconTextGap(0);
        addNewUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewUserButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addNewUserButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addNewUserButtonMouseExited(evt);
            }
        });
        jPanel1.add(addNewUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, 50));

        newUserPanel.setPreferredSize(new java.awt.Dimension(460, 450));
        newUserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("New Password");
        jLabel17.setIconTextGap(0);
        newUserPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Confirm Password");
        jLabel18.setIconTextGap(0);
        newUserPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 220, 30));

        employeePassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newUserPanel.add(employeePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 260, 30));

        employeePasswordConfirm.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newUserPanel.add(employeePasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 260, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/employeeOut.png"))); // NOI18N
        jLabel11.setIconTextGap(0);
        newUserPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 50));

        userSaveCancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/cancelOut.png"))); // NOI18N
        userSaveCancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userSaveCancelButton.setIconTextGap(0);
        userSaveCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userSaveCancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userSaveCancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userSaveCancelButtonMouseExited(evt);
            }
        });
        newUserPanel.add(userSaveCancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 150, 50));

        userSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/saveOut.png"))); // NOI18N
        userSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userSaveButton.setIconTextGap(0);
        userSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userSaveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userSaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userSaveButtonMouseExited(evt);
            }
        });
        newUserPanel.add(userSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/adminPanelBackground.jpg"))); // NOI18N
        jLabel2.setIconTextGap(0);
        newUserPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 575, 500));

        jPanel1.add(newUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 575, 500));

        changePasswordPanel.setPreferredSize(new java.awt.Dimension(460, 450));
        changePasswordPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/adminOut.png"))); // NOI18N
        jLabel13.setIconTextGap(0);
        changePasswordPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 50));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("New Password");
        jLabel14.setIconTextGap(0);
        changePasswordPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 220, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Current Password");
        jLabel15.setIconTextGap(0);
        changePasswordPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, 30));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Confirm Password");
        jLabel20.setIconTextGap(0);
        changePasswordPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 220, 30));

        adminConfirmPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        changePasswordPanel.add(adminConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 260, 30));

        adminCurrentPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        changePasswordPanel.add(adminCurrentPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 260, 30));

        adminNewPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        changePasswordPanel.add(adminNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 260, 30));

        adminPasswordCancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/cancelOut.png"))); // NOI18N
        adminPasswordCancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminPasswordCancelButton.setIconTextGap(0);
        adminPasswordCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminPasswordCancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminPasswordCancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminPasswordCancelButtonMouseExited(evt);
            }
        });
        changePasswordPanel.add(adminPasswordCancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 150, 50));

        adminPasswordSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/saveOut.png"))); // NOI18N
        adminPasswordSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminPasswordSaveButton.setIconTextGap(0);
        adminPasswordSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminPasswordSaveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminPasswordSaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminPasswordSaveButtonMouseExited(evt);
            }
        });
        changePasswordPanel.add(adminPasswordSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 150, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/adminPanelBackground.jpg"))); // NOI18N
        jLabel4.setIconTextGap(0);
        changePasswordPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 575, 500));

        jPanel1.add(changePasswordPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 575, 500));

        userSettingsPanel.setPreferredSize(new java.awt.Dimension(460, 450));
        userSettingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportsCheck.setBackground(new java.awt.Color(102, 102, 102));
        reportsCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportsCheck.setForeground(new java.awt.Color(255, 255, 255));
        reportsCheck.setText("Reports");
        userSettingsPanel.add(reportsCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 150, -1));

        financeCheck.setBackground(new java.awt.Color(102, 102, 102));
        financeCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        financeCheck.setForeground(new java.awt.Color(255, 255, 255));
        financeCheck.setText("Finance");
        userSettingsPanel.add(financeCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 150, -1));

        employeeCheck.setBackground(new java.awt.Color(102, 102, 102));
        employeeCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        employeeCheck.setForeground(new java.awt.Color(255, 255, 255));
        employeeCheck.setText("Employees");
        userSettingsPanel.add(employeeCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 150, -1));

        appointmentsCheck.setBackground(new java.awt.Color(102, 102, 102));
        appointmentsCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        appointmentsCheck.setForeground(new java.awt.Color(255, 255, 255));
        appointmentsCheck.setText("Appointments");
        userSettingsPanel.add(appointmentsCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 140, -1));

        salesCheck.setBackground(new java.awt.Color(102, 102, 102));
        salesCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salesCheck.setForeground(new java.awt.Color(255, 255, 255));
        salesCheck.setText("Sales");
        userSettingsPanel.add(salesCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 140, -1));

        inventoryCheck.setBackground(new java.awt.Color(102, 102, 102));
        inventoryCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        inventoryCheck.setForeground(new java.awt.Color(255, 255, 255));
        inventoryCheck.setText("Inventory");
        userSettingsPanel.add(inventoryCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 140, -1));

        servicesCheck.setBackground(new java.awt.Color(102, 102, 102));
        servicesCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        servicesCheck.setForeground(new java.awt.Color(255, 255, 255));
        servicesCheck.setText("Services");
        userSettingsPanel.add(servicesCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 140, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/settingsOut.png"))); // NOI18N
        jLabel16.setIconTextGap(0);
        userSettingsPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 350, 50));

        settingsCancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/cancelOut.png"))); // NOI18N
        settingsCancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsCancelButton.setIconTextGap(0);
        settingsCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsCancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsCancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsCancelButtonMouseExited(evt);
            }
        });
        userSettingsPanel.add(settingsCancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 150, 50));

        settingsSaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/saveOut.png"))); // NOI18N
        settingsSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsSaveButton.setIconTextGap(0);
        settingsSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsSaveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsSaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsSaveButtonMouseExited(evt);
            }
        });
        userSettingsPanel.add(settingsSaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 150, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/adminPanelBackground.jpg"))); // NOI18N
        jLabel5.setIconTextGap(0);
        userSettingsPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 575, 500));

        jPanel1.add(userSettingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 575, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/adminBackground.jpg"))); // NOI18N
        jLabel1.setIconTextGap(0);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userSaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSaveButtonMouseEntered
        userSaveButton.setIcon(saveEnter);
    }//GEN-LAST:event_userSaveButtonMouseEntered

    private void userSaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSaveButtonMouseExited
         userSaveButton.setIcon(saveOut);
    }//GEN-LAST:event_userSaveButtonMouseExited

    private void userSaveCancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSaveCancelButtonMouseEntered
         userSaveCancelButton.setIcon(cancelEnter);
    }//GEN-LAST:event_userSaveCancelButtonMouseEntered

    private void userSaveCancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSaveCancelButtonMouseExited
         userSaveCancelButton.setIcon(cancelOut);
    }//GEN-LAST:event_userSaveCancelButtonMouseExited

    private void addNewUserButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewUserButtonMouseEntered
        addNewUserButton.setIcon(newEnter);
    }//GEN-LAST:event_addNewUserButtonMouseEntered

    private void addNewUserButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewUserButtonMouseExited
        addNewUserButton.setIcon(newOut);
    }//GEN-LAST:event_addNewUserButtonMouseExited

    private void changeAdminPasswordButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeAdminPasswordButtonMouseEntered
        changeAdminPasswordButton.setIcon(editEnter);
    }//GEN-LAST:event_changeAdminPasswordButtonMouseEntered

    private void changeAdminPasswordButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeAdminPasswordButtonMouseExited
        changeAdminPasswordButton.setIcon(editOut);
    }//GEN-LAST:event_changeAdminPasswordButtonMouseExited

    private void userControlSettingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userControlSettingsButtonMouseEntered
        userControlSettingsButton.setIcon(settingsEnter);
    }//GEN-LAST:event_userControlSettingsButtonMouseEntered

    private void userControlSettingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userControlSettingsButtonMouseExited
        userControlSettingsButton.setIcon(settingsOut);
    }//GEN-LAST:event_userControlSettingsButtonMouseExited

    private void addNewUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewUserButtonMouseClicked
       
       employeePassword.setText(null);
       employeePasswordConfirm.setText(null);
       
       newUserPanel.setVisible(true);       
       changePasswordPanel.setVisible(false);
       userSettingsPanel.setVisible(false);
       
    }//GEN-LAST:event_addNewUserButtonMouseClicked

    private void changeAdminPasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeAdminPasswordButtonMouseClicked
       
       adminCurrentPassword.setText(null);
       adminConfirmPassword.setText(null);
       adminNewPassword.setText(null);       
        
       newUserPanel.setVisible(false);       
       changePasswordPanel.setVisible(true);
       userSettingsPanel.setVisible(false);
       
    }//GEN-LAST:event_changeAdminPasswordButtonMouseClicked

    private void userControlSettingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userControlSettingsButtonMouseClicked

       appointmentsCheck.setSelected(false);
       servicesCheck.setSelected(false);
       inventoryCheck.setSelected(false);
       salesCheck.setSelected(false);
       employeeCheck.setSelected(false);
       financeCheck.setSelected(false);
       reportsCheck.setSelected(false);        
        
       newUserPanel.setVisible(false);       
       changePasswordPanel.setVisible(false);
       userSettingsPanel.setVisible(true);
       
    }//GEN-LAST:event_userControlSettingsButtonMouseClicked

    private void settingsSaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsSaveButtonMouseEntered
        settingsSaveButton.setIcon(saveEnter);
    }//GEN-LAST:event_settingsSaveButtonMouseEntered

    private void settingsSaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsSaveButtonMouseExited
        settingsSaveButton.setIcon(saveOut);
    }//GEN-LAST:event_settingsSaveButtonMouseExited

    private void settingsCancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsCancelButtonMouseEntered
        settingsCancelButton.setIcon(cancelEnter);
    }//GEN-LAST:event_settingsCancelButtonMouseEntered

    private void settingsCancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsCancelButtonMouseExited
        settingsCancelButton.setIcon(cancelOut);
    }//GEN-LAST:event_settingsCancelButtonMouseExited

    private void adminPasswordSaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPasswordSaveButtonMouseEntered
        adminPasswordSaveButton.setIcon(saveEnter);
    }//GEN-LAST:event_adminPasswordSaveButtonMouseEntered

    private void adminPasswordSaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPasswordSaveButtonMouseExited
        adminPasswordSaveButton.setIcon(saveOut);
    }//GEN-LAST:event_adminPasswordSaveButtonMouseExited

    private void adminPasswordCancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPasswordCancelButtonMouseEntered
        adminPasswordCancelButton.setIcon(cancelEnter);
    }//GEN-LAST:event_adminPasswordCancelButtonMouseEntered

    private void adminPasswordCancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPasswordCancelButtonMouseExited
        adminPasswordCancelButton.setIcon(cancelOut);
    }//GEN-LAST:event_adminPasswordCancelButtonMouseExited

    private void adminPasswordCancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPasswordCancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_adminPasswordCancelButtonMouseClicked

    private void adminPasswordSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPasswordSaveButtonMouseClicked
       
        if (adminCurrentPassword.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "All fields are required.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        
        else{
            HandleAdministrator ha = new HandleAdministrator();
            ha.setCurrentPasword(adminCurrentPassword.getText());
        
            try{
            ResultSet rs = ha.checkAdmin();
            if (rs.next()) {
                
                if(adminNewPassword.getText().equalsIgnoreCase("") || adminConfirmPassword.getText().equalsIgnoreCase("")){
            
                    JOptionPane.showMessageDialog(null, "All fields are required.", "WARNING", JOptionPane.WARNING_MESSAGE);
                    
                }       
                else
                {
                        
                if (adminNewPassword.getText().equals(adminConfirmPassword.getText()) ) {
                ha.setPassword(adminNewPassword.getText());
                
                
                try{
                    int i = ha.changeAdminPassword();
                    if (i!=0) {
                    
                        JOptionPane.showMessageDialog(null, "Administrator password has been saved successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                        adminCurrentPassword.setText(null);
                        adminNewPassword.setText(null);
                        adminConfirmPassword.setText(null);
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Administrator password cannot be save.", "Error", JOptionPane.ERROR_MESSAGE);
                        adminCurrentPassword.setText(null);
                        adminNewPassword.setText(null);
                        adminConfirmPassword.setText(null);
                    }
                }
                catch(SQLIntegrityConstraintViolationException ex){
                    JOptionPane.showMessageDialog(null, "This password is already existing in the system.", "SQLIntegrityConstraintViolationException", JOptionPane.ERROR_MESSAGE);
                } 
                catch(DataTruncation ex){
                    JOptionPane.showMessageDialog(null, "Some fields have exceeded the maximum number of characters.", "DataTruncation", JOptionPane.ERROR_MESSAGE);
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
                else
                {
                    JOptionPane.showMessageDialog(null, "Password does not match.", "Error", JOptionPane.ERROR_MESSAGE);
                    adminConfirmPassword.setText(null);
                }
                }
                
                
                
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Current password is incorrect.", "Error", JOptionPane.ERROR_MESSAGE);
                adminCurrentPassword.setText(null);
                
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
        
    }//GEN-LAST:event_adminPasswordSaveButtonMouseClicked

    private void userSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSaveButtonMouseClicked
       
        HandleAdministrator ha = new HandleAdministrator();
        
        if(employeePassword.getText().equalsIgnoreCase("") || employeePasswordConfirm.getText().equalsIgnoreCase("")){
            
                JOptionPane.showMessageDialog(null, "All fields are required.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
       
        else
        {
                if (employeePassword.getText().equals(employeePasswordConfirm.getText()) ) {
                ha.setPassword(employeePassword.getText());
                
                
                try{
                    int i = ha.changeEmployeePassword();
                    if (i!=0) {
                    
                        JOptionPane.showMessageDialog(null, "Employee password has been saved successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                        employeePassword.setText(null);
                        employeePasswordConfirm.setText(null);
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Employee password cannot be save.", "Error", JOptionPane.ERROR_MESSAGE);
                        employeePassword.setText(null);
                        employeePasswordConfirm.setText(null);
                    }
                }
                catch(SQLIntegrityConstraintViolationException ex){
                    JOptionPane.showMessageDialog(null, "This password is already existing in the system.", "SQLIntegrityConstraintViolationException", JOptionPane.ERROR_MESSAGE);
                } 
                catch(DataTruncation ex){
                    JOptionPane.showMessageDialog(null, "Some fields have exceeded the maximum number of characters.", "DataTruncation", JOptionPane.ERROR_MESSAGE);
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
                else{
                    JOptionPane.showMessageDialog(null, "Password does not match.", "Error", JOptionPane.ERROR_MESSAGE);
                    employeePasswordConfirm.setText(null);
                    
                }
        }
    }//GEN-LAST:event_userSaveButtonMouseClicked

    private void userSaveCancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSaveCancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_userSaveCancelButtonMouseClicked

    private void settingsCancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsCancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_settingsCancelButtonMouseClicked

    private void settingsSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsSaveButtonMouseClicked
        
        HandleAdministrator ha = new HandleAdministrator();
        
        if (appointmentsCheck.isSelected()) {
            ha.setAppointments("T");
        }
        else{
            ha.setAppointments("F");
        }
        if (servicesCheck.isSelected()) {
            ha.setServices("T");
        }
        else{
            ha.setServices("F");
        }
        if (inventoryCheck.isSelected()) {
            ha.setInventory("T");
        }
        else{
            ha.setInventory("F");
        }
        if (salesCheck.isSelected()) {
            ha.setSales("T");
        }
        else{
            ha.setSales("F"); 
        }
        
        if (employeeCheck.isSelected()) {
            ha.setEmployees("T");
        }
        else{
            ha.setEmployees("F");
        }
        if (financeCheck.isSelected()) {
            ha.setFinance("T");
        }
        else{
            ha.setFinance("F");
        }
        if (reportsCheck.isSelected()) {
            ha.setReports("T");
        }
        else{
            ha.setReports("F");
        }
        
        
        try{
            int i = ha.setUserSettings();
            
            if (i!=0) {
                JOptionPane.showMessageDialog(null, "User settings has been saved successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                
                appointmentsCheck.setSelected(false);
                servicesCheck.setSelected(false);
                inventoryCheck.setSelected(false);
                salesCheck.setSelected(false);
                employeeCheck.setSelected(false);
                financeCheck.setSelected(false);
                reportsCheck.setSelected(false);
               
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User settings cannot be save.", "Message", JOptionPane.INFORMATION_MESSAGE);
                
                appointmentsCheck.setSelected(false);
                servicesCheck.setSelected(false);
                inventoryCheck.setSelected(false);
                salesCheck.setSelected(false);
                employeeCheck.setSelected(false);
                financeCheck.setSelected(false);
                reportsCheck.setSelected(false);
                
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
        
    }//GEN-LAST:event_settingsSaveButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Administrator dialog = new Administrator(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel addNewUserButton;
    private javax.swing.JPasswordField adminConfirmPassword;
    private javax.swing.JPasswordField adminCurrentPassword;
    private javax.swing.JPasswordField adminNewPassword;
    private javax.swing.JLabel adminPasswordCancelButton;
    private javax.swing.JLabel adminPasswordSaveButton;
    private javax.swing.JCheckBox appointmentsCheck;
    private javax.swing.JLabel changeAdminPasswordButton;
    private javax.swing.JPanel changePasswordPanel;
    private javax.swing.JCheckBox employeeCheck;
    private javax.swing.JPasswordField employeePassword;
    private javax.swing.JPasswordField employeePasswordConfirm;
    private javax.swing.JCheckBox financeCheck;
    private javax.swing.JCheckBox inventoryCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel newUserPanel;
    private javax.swing.JCheckBox reportsCheck;
    private javax.swing.JCheckBox salesCheck;
    private javax.swing.JCheckBox servicesCheck;
    private javax.swing.JLabel settingsCancelButton;
    private javax.swing.JLabel settingsSaveButton;
    private javax.swing.JLabel userControlSettingsButton;
    private javax.swing.JLabel userSaveButton;
    private javax.swing.JLabel userSaveCancelButton;
    private javax.swing.JPanel userSettingsPanel;
    // End of variables declaration//GEN-END:variables
}
