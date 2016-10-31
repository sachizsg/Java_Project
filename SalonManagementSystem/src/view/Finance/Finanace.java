/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Finance;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Finance.HandleFinance;
import net.proteanit.sql.DbUtils;
import view.MainMenu.MainMenu;

/**
 *
 * @author Sachithra
 */
public class Finanace extends javax.swing.JFrame {
    
    private final ImageIcon searchout;
    private final ImageIcon searchenter;
    private final ImageIcon empcalout;
    private final ImageIcon empcalenter;
    private final ImageIcon suppayenter;
    private final ImageIcon suppayout;
    private final ImageIcon emppaycalout;
    private final ImageIcon emppaycalenter;
    private final ImageIcon backout;
    private final ImageIcon backenter;
    
    
    
 
    public Finanace() {
        initComponents();
        searchout = new ImageIcon(getClass().getResource("/view/Finance/searchOut.png"));
        searchenter = new ImageIcon(getClass().getResource("/view/Finance/searchEnter.png"));
        empcalout = new ImageIcon(getClass().getResource("/view/Finance/purcbtn.png"));
        empcalenter = new ImageIcon(getClass().getResource("/view/Finance/purc.png"));
        
        emppaycalout = new ImageIcon(getClass().getResource("/view/Finance/emppay.png"));
        emppaycalenter = new ImageIcon(getClass().getResource("/view/Finance/emppaybtn.png"));
        suppayout = new ImageIcon(getClass().getResource("/view/Finance/suppaym.png"));
        suppayenter = new ImageIcon(getClass().getResource("/view/Finance/suppaymbtn.png"));
        
        backout = new ImageIcon(getClass().getResource("/view/Finance/backOut.png"));
        backenter = new ImageIcon(getClass().getResource("/view/Finance/backEnter.png"));
    
        
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        
        setIcon();
        
        this.pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeepayments = new javax.swing.JTable();
        procedpayments = new javax.swing.JLabel();
        backbtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        purchacepayment = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        purchaceinDetails = new javax.swing.JTable();
        searchbtn = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        suppaybtn = new javax.swing.JLabel();
        emppaybtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finanace");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setPreferredSize(new java.awt.Dimension(1286, 460));

        employeepayments.setBackground(new java.awt.Color(204, 204, 204));
        employeepayments.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        employeepayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titile1", "Title2", "Title3", "Title4"
            }
        ));
        employeepayments.setFillsViewportHeight(true);
        employeepayments.setRowHeight(25);
        jScrollPane2.setViewportView(employeepayments);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1270, 500));

        procedpayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/purcbtn.png"))); // NOI18N
        procedpayments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        procedpayments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                procedpaymentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                procedpaymentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                procedpaymentsMouseExited(evt);
            }
        });
        jPanel2.add(procedpayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 527, -1, -1));

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/backOut.png"))); // NOI18N
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.setPreferredSize(new java.awt.Dimension(150, 51));
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backbtnMouseExited(evt);
            }
        });
        jPanel2.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 527, -1, -1));

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/Background1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1326, 585));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1326, 585));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/salonimglogo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, 310, 90));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        purchacepayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/purcbtn.png"))); // NOI18N
        purchacepayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchacepayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchacepaymentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchacepaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchacepaymentMouseExited(evt);
            }
        });
        jPanel3.add(purchacepayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 527, -1, -1));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(1286, 460));

        purchaceinDetails.setBackground(new java.awt.Color(204, 204, 204));
        purchaceinDetails.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        purchaceinDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Invoice ID", "Invoice Date", "Due Date", "Cost", "Quantity", "Discount", "Status"
            }
        ));
        purchaceinDetails.setFillsViewportHeight(true);
        purchaceinDetails.setRowHeight(25);
        jScrollPane3.setViewportView(purchaceinDetails);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1270, 500));

        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/searchOut.png"))); // NOI18N
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 543, 30, 25));

        searchtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchtxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchtxtMouseExited(evt);
            }
        });
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });
        jPanel3.add(searchtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 300, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/backOut.png"))); // NOI18N
        back.setText("jLabel5");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setPreferredSize(new java.awt.Dimension(150, 51));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 527, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/Background1.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1326, 585));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1326, 585));

        suppaybtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/suppaym.png"))); // NOI18N
        suppaybtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suppaybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppaybtnMouseClicked(evt);
            }
        });
        jPanel1.add(suppaybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 10, 200, 75));

        emppaybtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/emppaybtn.png"))); // NOI18N
        emppaybtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emppaybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emppaybtnMouseClicked(evt);
            }
        });
        jPanel1.add(emppaybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 10, 200, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void procedpaymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procedpaymentsMouseClicked
       EmplpaymentSetting emset = new EmplpaymentSetting(null,true);
       emset.setVisible(true);       
    }//GEN-LAST:event_procedpaymentsMouseClicked

    private void displayPurchaceInvoice(){
        try{
            HandleFinance hf = new HandleFinance();
            purchaceinDetails.setModel(DbUtils.resultSetToTableModel(hf.getpurchaceDetails()));
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
    
    private void displayEmployeementDetails(){
        try{
            HandleFinance hf = new HandleFinance();
            employeepayments.setModel(DbUtils.resultSetToTableModel(hf.EmployeeDetails()));
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
    
    
    private void procedpaymentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procedpaymentsMouseEntered
        procedpayments.setIcon(empcalenter);
    }//GEN-LAST:event_procedpaymentsMouseEntered

    private void procedpaymentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procedpaymentsMouseExited
        procedpayments.setIcon(empcalout);
    }//GEN-LAST:event_procedpaymentsMouseExited

    private void purchacepaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchacepaymentMouseClicked

        int row = purchaceinDetails.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Please select the payment that you need to be proceed.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String purchaceID = purchaceinDetails.getValueAt(row,0).toString();
            PurchaceInvoiceDetails invd =  new PurchaceInvoiceDetails(null,true,purchaceID);
            invd.setVisible(true);
        }
        
    }//GEN-LAST:event_purchacepaymentMouseClicked

    private void purchacepaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchacepaymentMouseEntered
       purchacepayment.setIcon(empcalenter);
    }//GEN-LAST:event_purchacepaymentMouseEntered

    private void purchacepaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchacepaymentMouseExited
       purchacepayment.setIcon(empcalout);
    }//GEN-LAST:event_purchacepaymentMouseExited

    private void suppaybtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppaybtnMouseClicked
        suppaybtn.setIcon(suppayout);
        emppaybtn.setIcon(emppaycalenter);
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
    }//GEN-LAST:event_suppaybtnMouseClicked

    private void emppaybtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emppaybtnMouseClicked
        suppaybtn.setIcon(suppayenter);
        emppaybtn.setIcon(emppaycalout);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_emppaybtnMouseClicked

    private void searchtxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtxtMouseEntered
        searchbtn.setIcon(searchenter);
    }//GEN-LAST:event_searchtxtMouseEntered

    private void searchtxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtxtMouseExited
        searchbtn.setIcon(searchout);
    }//GEN-LAST:event_searchtxtMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.displayPurchaceInvoice();
        this.displayEmployeementDetails();
    }//GEN-LAST:event_formWindowActivated

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setIcon(backenter);
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setIcon(backout);
    }//GEN-LAST:event_backMouseExited

    private void backbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseEntered
         backbtn.setIcon(backenter);
    }//GEN-LAST:event_backbtnMouseEntered

    private void backbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseExited
        backbtn.setIcon(backout);
    }//GEN-LAST:event_backbtnMouseExited

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        
        HandleFinance hf = new HandleFinance();
        hf.setSearchKey(searchtxt.getText());
        
        try{
               ResultSet rs = hf.searchPayments();
               purchaceinDetails.setModel(DbUtils.resultSetToTableModel(rs));
            
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
        
    }//GEN-LAST:event_searchtxtKeyReleased

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backbtnMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("finance.png")));
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
            java.util.logging.Logger.getLogger(Finanace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finanace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finanace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finanace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finanace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel backbtn;
    private javax.swing.JTable employeepayments;
    private javax.swing.JLabel emppaybtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel procedpayments;
    private javax.swing.JTable purchaceinDetails;
    private javax.swing.JLabel purchacepayment;
    private javax.swing.JLabel searchbtn;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JLabel suppaybtn;
    // End of variables declaration//GEN-END:variables


}



