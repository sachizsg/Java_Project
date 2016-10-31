/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Employee;

import salonmanagementsystem.SetImageSize;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Employee.HandleEmployee;
import model.Employee.ValidateEmployee;



public class UpdateEmployee extends javax.swing.JDialog {

    private final ImageIcon saveOut;
    private final ImageIcon saveEnter;
    
    private final ImageIcon cancelOut;
    private final ImageIcon cancelEnter;
    
    private String empID;  
    
    private InputStream employeeImage;
    
    
    
    
    public UpdateEmployee(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        saveOut = new ImageIcon(getClass().getResource("/view/Employee/saveOut.png"));  
        saveEnter = new ImageIcon(getClass().getResource("/view/Employee/saveEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Employee/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Employee/cancelEnter.png")); 
        
        
        this.pack();       
        
        
    }
    public UpdateEmployee(java.awt.Frame parent, boolean modal,String employeeID) {
        super(parent, modal);
        initComponents();
        
        saveOut = new ImageIcon(getClass().getResource("/view/Employee/saveOut.png"));  
        saveEnter = new ImageIcon(getClass().getResource("/view/Employee/saveEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Employee/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Employee/cancelEnter.png"));         
        
        this.empID = employeeID;
        
        employeeIDValidateLabel.setVisible(false);
        firstNameValidateLabel.setVisible(false);
        lastNameValidateLabel.setVisible(false);
        contactNumberValidateLabel.setVisible(false);
        basicSalaryValidateLabel1.setVisible(false);
        
        this.loadingEmployeeDetails();
        this.pack();      
        
    }
    
    
    
    private void loadingEmployeeDetails(){
        
        HandleEmployee hemp = new HandleEmployee();
        try {
            hemp.setEmployee_ID(this.empID);
            ResultSet rs = hemp.getSelectedEmployeeDetails();
            if(rs.next()){
                employeeIDText.setText(rs.getString("Employee_ID"));
                firstNameText.setText(rs.getString("First_Name"));
                lastNameText.setText(rs.getString("Last_Name"));
                contactNumberText.setText(rs.getString("Contact_Number"));
                addressText.setText(rs.getString("Address"));
                cityText.setText(rs.getString("City"));
                basicSalaryText.setText(rs.getString("Basic_Salary"));
                
                this.employeeImage = rs.getBinaryStream("Profile_Picture");
                    
                SetImageSize sis = new SetImageSize();                    
                BufferedImage image = ImageIO.read(this.employeeImage);                    
                EmpImage.setIcon(sis.addImageToLabel(image,128,128));
                                
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

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BodyLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        employeeImageLabel = new javax.swing.JLabel();
        basicsalaryLabel = new javax.swing.JLabel();
        basicSalaryValidateLabel1 = new javax.swing.JLabel();
        addressLabel1 = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        EmpImage = new javax.swing.JLabel();
        employeeIDLabel = new javax.swing.JLabel();
        employeeIDText = new javax.swing.JTextField();
        employeeIDValidateLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        contactNumberText = new javax.swing.JTextField();
        basicSalaryText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        cityText = new javax.swing.JTextField();
        firstNameValidateLabel = new javax.swing.JLabel();
        lastNameValidateLabel = new javax.swing.JLabel();
        contactNumberLabel = new javax.swing.JLabel();
        contactNumberValidateLabel = new javax.swing.JLabel();
        TitlePanelLabel = new javax.swing.JLabel();
        doneLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        ButtonPanelLabel = new javax.swing.JLabel();
        BodyLabel1 = new javax.swing.JLabel();

        BodyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/backgroundsmall.jpg"))); // NOI18N
        BodyLabel.setIconTextGap(0);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Employee");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setBackground(new java.awt.Color(51, 0, 51));
        TitleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Update Employee Details");
        jPanel1.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 35));

        firstNameLabel.setBackground(new java.awt.Color(51, 0, 51));
        firstNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        firstNameLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 100, 30));

        lastNameLabel.setBackground(new java.awt.Color(51, 0, 51));
        lastNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");
        lastNameLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 30));

        employeeImageLabel.setBackground(new java.awt.Color(51, 0, 51));
        employeeImageLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        employeeImageLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeImageLabel.setText("Employee Image");
        employeeImageLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(employeeImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 150, 30));

        basicsalaryLabel.setBackground(new java.awt.Color(51, 0, 51));
        basicsalaryLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        basicsalaryLabel.setForeground(new java.awt.Color(255, 255, 255));
        basicsalaryLabel.setText("Basic Salary");
        basicsalaryLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(basicsalaryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 130, 30));

        basicSalaryValidateLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        basicSalaryValidateLabel1.setForeground(new java.awt.Color(204, 0, 0));
        basicSalaryValidateLabel1.setText("Basic Salary is invalid");
        basicSalaryValidateLabel1.setMaximumSize(new java.awt.Dimension(200, 15));
        basicSalaryValidateLabel1.setMinimumSize(new java.awt.Dimension(200, 15));
        basicSalaryValidateLabel1.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel1.add(basicSalaryValidateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 200, 15));

        addressLabel1.setBackground(new java.awt.Color(51, 0, 51));
        addressLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addressLabel1.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel1.setText("Address");
        addressLabel1.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(addressLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 130, 30));

        cityLabel.setBackground(new java.awt.Color(51, 0, 51));
        cityLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityLabel.setText("City");
        cityLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(cityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 100, 30));

        EmpImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/employeeProPic1.jpg"))); // NOI18N
        EmpImage.setIconTextGap(0);
        EmpImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpImageMouseClicked(evt);
            }
        });
        jPanel1.add(EmpImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 128, 128));

        employeeIDLabel.setBackground(new java.awt.Color(51, 0, 51));
        employeeIDLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        employeeIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeIDLabel.setText("Employee ID");
        employeeIDLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(employeeIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 30));

        employeeIDText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        employeeIDText.setPreferredSize(new java.awt.Dimension(0, 30));
        employeeIDText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                employeeIDTextKeyPressed(evt);
            }
        });
        jPanel1.add(employeeIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 200, 30));

        employeeIDValidateLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        employeeIDValidateLabel.setForeground(new java.awt.Color(204, 0, 0));
        employeeIDValidateLabel.setText("Employee ID is invalid");
        employeeIDValidateLabel.setMaximumSize(new java.awt.Dimension(200, 15));
        employeeIDValidateLabel.setMinimumSize(new java.awt.Dimension(200, 15));
        employeeIDValidateLabel.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel1.add(employeeIDValidateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 200, 15));

        firstNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstNameText.setPreferredSize(new java.awt.Dimension(0, 30));
        firstNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameTextKeyPressed(evt);
            }
        });
        jPanel1.add(firstNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 200, 30));

        lastNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameText.setPreferredSize(new java.awt.Dimension(0, 30));
        lastNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameTextKeyPressed(evt);
            }
        });
        jPanel1.add(lastNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 200, 30));

        contactNumberText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contactNumberText.setPreferredSize(new java.awt.Dimension(0, 30));
        contactNumberText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactNumberTextKeyPressed(evt);
            }
        });
        jPanel1.add(contactNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 200, 30));

        basicSalaryText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        basicSalaryText.setPreferredSize(new java.awt.Dimension(0, 30));
        basicSalaryText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                basicSalaryTextKeyPressed(evt);
            }
        });
        jPanel1.add(basicSalaryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 200, 30));

        addressText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addressText.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 200, 30));

        cityText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cityText.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 200, 30));

        firstNameValidateLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        firstNameValidateLabel.setForeground(new java.awt.Color(204, 0, 0));
        firstNameValidateLabel.setText("First Name is invalid");
        firstNameValidateLabel.setMaximumSize(new java.awt.Dimension(200, 15));
        firstNameValidateLabel.setMinimumSize(new java.awt.Dimension(200, 15));
        firstNameValidateLabel.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel1.add(firstNameValidateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 200, 15));

        lastNameValidateLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lastNameValidateLabel.setForeground(new java.awt.Color(204, 0, 0));
        lastNameValidateLabel.setText("Last Name is invalid");
        lastNameValidateLabel.setMaximumSize(new java.awt.Dimension(200, 15));
        lastNameValidateLabel.setMinimumSize(new java.awt.Dimension(200, 15));
        lastNameValidateLabel.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel1.add(lastNameValidateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 200, 15));

        contactNumberLabel.setBackground(new java.awt.Color(51, 0, 51));
        contactNumberLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contactNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactNumberLabel.setText("Contact Number");
        contactNumberLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(contactNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 150, 30));

        contactNumberValidateLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        contactNumberValidateLabel.setForeground(new java.awt.Color(204, 0, 0));
        contactNumberValidateLabel.setText("Contact Number is invalid");
        contactNumberValidateLabel.setMaximumSize(new java.awt.Dimension(200, 15));
        contactNumberValidateLabel.setMinimumSize(new java.awt.Dimension(200, 15));
        contactNumberValidateLabel.setPreferredSize(new java.awt.Dimension(200, 15));
        jPanel1.add(contactNumberValidateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 200, 15));

        TitlePanelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/titleGlass.png"))); // NOI18N
        TitlePanelLabel.setIconTextGap(0);
        jPanel1.add(TitlePanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

        doneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/saveOut.png"))); // NOI18N
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
        jPanel1.add(doneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 150, 50));

        cancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/cancelOut.png"))); // NOI18N
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

        ButtonPanelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/buttonGlass.png"))); // NOI18N
        ButtonPanelLabel.setIconTextGap(0);
        jPanel1.add(ButtonPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 540, 75));

        BodyLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/backgroundsmall.jpg"))); // NOI18N
        BodyLabel1.setIconTextGap(0);
        jPanel1.add(BodyLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmpImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpImageMouseClicked
        JOptionPane.showMessageDialog(null, "Employee Image cannot Update.", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_EmpImageMouseClicked

    private void firstNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextKeyPressed
        firstNameValidateLabel.setVisible(false);
    }//GEN-LAST:event_firstNameTextKeyPressed

    private void lastNameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTextKeyPressed
        lastNameValidateLabel.setVisible(false);
    }//GEN-LAST:event_lastNameTextKeyPressed

    private void contactNumberTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNumberTextKeyPressed
        contactNumberValidateLabel.setVisible(false);
    }//GEN-LAST:event_contactNumberTextKeyPressed

    private void basicSalaryTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_basicSalaryTextKeyPressed
        basicSalaryValidateLabel1.setVisible(false);
    }//GEN-LAST:event_basicSalaryTextKeyPressed

    private void doneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseClicked

        if( employeeIDText.getText().equalsIgnoreCase("") ||firstNameText.getText().equalsIgnoreCase("") || lastNameText.getText().equalsIgnoreCase("") || contactNumberText.getText().equalsIgnoreCase("")
            || addressText.getText().equalsIgnoreCase("") || cityText.getText().equalsIgnoreCase("") || basicSalaryText.getText().equalsIgnoreCase("") )
        {
            JOptionPane.showMessageDialog(null, "All fields are required.", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        else{
            ValidateEmployee vemp = new ValidateEmployee();
            if( vemp.ValidateEmployee_ID(employeeIDText.getText()) && vemp.ValidateName(firstNameText.getText()) && vemp.ValidateName(lastNameText.getText()) &&
                vemp.ValidateBasic_Salary(basicSalaryText.getText()) && vemp.ValidateContact_Number(contactNumberText.getText()) ){
                try{
                HandleEmployee hemp = new HandleEmployee();   
                    
                hemp.setEmployee_ID(this.empID);
                hemp.setNewemepID(employeeIDText.getText().trim());
                hemp.setFirst_Name(vemp.capitalizeFirstLetter(firstNameText.getText()).trim());
                hemp.setLast_Name(vemp.capitalizeFirstLetter(lastNameText.getText()).trim());
                hemp.setContact_Number(contactNumberText.getText().trim());
                hemp.setAddress(vemp.capitalizeFirstLetter(addressText.getText()).trim());
                hemp.setCity(vemp.capitalizeFirstLetter(cityText.getText()).trim());
                hemp.setBasic_Salary(basicSalaryText.getText().trim());                
                

                    int i = hemp.updateEmployee();
                    if(i!=0){
                           JOptionPane.showMessageDialog(null, "Employee has been updated successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                           this.dispose();
                    }
                    else{
                           JOptionPane.showMessageDialog(null, "Employee cannot be update.", "Error", JOptionPane.ERROR_MESSAGE);
                           this.dispose();
                    }
                }
                catch(SQLIntegrityConstraintViolationException ex){
                    JOptionPane.showMessageDialog(null, "This Employee ID is already existing in the system.", "SQLIntegrityConstraintViolationException", JOptionPane.ERROR_MESSAGE);
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
                if (!vemp.ValidateEmployee_ID(employeeIDText.getText())) {
                   employeeIDValidateLabel.setVisible(true);
                }

                if (!vemp.ValidateName(firstNameText.getText())) {
                    firstNameValidateLabel.setVisible(true);
                }
                if (!vemp.ValidateName(lastNameText.getText())) {
                    lastNameValidateLabel.setVisible(true);
                }
                if (!vemp.ValidateContact_Number(contactNumberText.getText())) {
                    contactNumberValidateLabel.setVisible(true);
                }
                if (!vemp.ValidateBasic_Salary(basicSalaryText.getText())) {
                    basicSalaryValidateLabel1.setVisible(true);
                }
            }

        }

    }//GEN-LAST:event_doneLabelMouseClicked
        
    private void doneLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseEntered
        doneLabel.setIcon(saveEnter);
    }//GEN-LAST:event_doneLabelMouseEntered

    private void doneLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseExited
        doneLabel.setIcon(saveOut);
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

    private void employeeIDTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeIDTextKeyPressed
        employeeIDValidateLabel.setVisible(false);
    }//GEN-LAST:event_employeeIDTextKeyPressed

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateEmployee dialog = new UpdateEmployee(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel BodyLabel;
    private javax.swing.JLabel BodyLabel1;
    private javax.swing.JLabel ButtonPanelLabel;
    private javax.swing.JLabel EmpImage;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel TitlePanelLabel;
    private javax.swing.JLabel addressLabel1;
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField basicSalaryText;
    private javax.swing.JLabel basicSalaryValidateLabel1;
    private javax.swing.JLabel basicsalaryLabel;
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityText;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JTextField contactNumberText;
    private javax.swing.JLabel contactNumberValidateLabel;
    private javax.swing.JLabel doneLabel;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JTextField employeeIDText;
    private javax.swing.JLabel employeeIDValidateLabel;
    private javax.swing.JLabel employeeImageLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel firstNameValidateLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel lastNameValidateLabel;
    // End of variables declaration//GEN-END:variables



}
