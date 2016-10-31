/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Login;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Login.HandleAdministrator;
import model.Login.HandleLogin;
import view.MainMenu.MainMenu;

/**
 *
 * @author Nadee
 */
public class SalonLogin extends javax.swing.JFrame {

    
    private final ImageIcon loginOut;
    private final ImageIcon loginEnter;
    
    public static String userType;
    
    
    public SalonLogin() {
        initComponents();
        
         
        loginOut = new ImageIcon(getClass().getResource("/view/Login/loginOut.png"));
        loginEnter = new ImageIcon(getClass().getResource("/view/Login/loginEnter.png"));     
        
        this.setIcon();
        this.pack();
        
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("SalonIcon.png")));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        userTypeCombo = new javax.swing.JComboBox();
        passwordText = new javax.swing.JPasswordField();
        loginLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UserName.setForeground(new java.awt.Color(255, 255, 255));
        UserName.setText("User Type");
        jPanel1.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        Password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        userTypeCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Employee", "Admin" }));
        userTypeCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(userTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 230, 30));

        passwordText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 230, 30));

        loginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/loginOut.png"))); // NOI18N
        loginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLabel.setIconTextGap(0);
        loginLabel.setPreferredSize(new java.awt.Dimension(150, 50));
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginLabelMouseExited(evt);
            }
        });
        jPanel1.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 120, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/salonimglogo.png"))); // NOI18N
        jLabel3.setIconTextGap(0);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 280, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/LoginGlass.png"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 450, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/new-makeup-fashion-women-perfection-face.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked

        HandleLogin hl = new HandleLogin();

        try{
            ResultSet rs = hl.checkLogin();
            if (rs.next()) {
                this.checkLoginDetails();
            }
            else{
                this.addAdminDetails();
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

    }//GEN-LAST:event_loginLabelMouseClicked

    private void loginLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseEntered
        loginLabel.setIcon(loginEnter);
    }//GEN-LAST:event_loginLabelMouseEntered

    private void loginLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseExited
        loginLabel.setIcon(loginOut);
    }//GEN-LAST:event_loginLabelMouseExited

    private void addAdminDetails(){
        
               HandleAdministrator ha = new HandleAdministrator();
               try{
                   int i = ha.addLoginDetails();
                   if (i != 0) {
                       JOptionPane.showMessageDialog(null, "Administrator details has been added successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                       MainMenu mm = new MainMenu();
                       this.dispose();
                       mm.setVisible(true);
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Administrator details cannot be add.", "Error", JOptionPane.ERROR_MESSAGE);                      
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
    
    
    private void checkLoginDetails(){
        
        HandleLogin hl = new HandleLogin();
        
        if (passwordText.getText().equalsIgnoreCase("")) {
           JOptionPane.showMessageDialog(null, "Please enter your password", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
           SalonLogin.userType = userTypeCombo.getSelectedItem().toString();
           hl.setUsertType(SalonLogin.userType);
                   
           try{
              ResultSet rs  = hl.login();
              if(rs.next()) {                     
                    
              String password = rs.getString("Password");
                          
                 if (password.equals(passwordText.getText())) {
                         
                     MainMenu mm = new MainMenu();
                     this.dispose();
                     mm.setVisible(true); 
                             
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "Password is incorrect.", "Error", JOptionPane.ERROR_MESSAGE);               
                     passwordText.setText(null);
                        
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
               
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(SalonLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalonLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalonLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalonLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalonLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JComboBox userTypeCombo;
    // End of variables declaration//GEN-END:variables
}
