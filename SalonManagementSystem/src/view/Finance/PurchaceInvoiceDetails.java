/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Finance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Finance.HandleFinance;
import model.Inventory.ValidateStocks;

/**
 *
 * @author Sachithra
 */
public class PurchaceInvoiceDetails extends javax.swing.JDialog {

    
    private final ImageIcon saveout;
    private final ImageIcon saveenter;
    
    private final ImageIcon cacleout;
    private final ImageIcon cacleenter;
    
    private String purchaceID;
    
    
    public PurchaceInvoiceDetails(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        saveout = new ImageIcon(getClass().getResource("/view/Finance/doneOut.png"));
        saveenter = new ImageIcon(getClass().getResource("/view/Finance/doneEnter.png"));
        cacleout = new ImageIcon(getClass().getResource("/view/Finance/cancelOut.png"));
        cacleenter = new ImageIcon(getClass().getResource("/view/Finance/cancelEnter.png"));
          
    }

    
    public PurchaceInvoiceDetails(java.awt.Frame parent, boolean modal,String purchaceID) {
        super(parent, modal);
        initComponents();
        
        saveout = new ImageIcon(getClass().getResource("/view/Finance/doneOut.png"));
        saveenter = new ImageIcon(getClass().getResource("/view/Finance/doneEnter.png"));
        cacleout = new ImageIcon(getClass().getResource("/view/Finance/cancelOut.png"));
        cacleenter = new ImageIcon(getClass().getResource("/view/Finance/cancelEnter.png"));
       
        this.purchaceID = purchaceID;
        
        this.loadpurchaceDetails();  
        
        totText.setEditable(false);
        balanceText.setEditable(false);
        
        this.pack();
        
    }

    
    private void loadpurchaceDetails(){
        HandleFinance hf = new HandleFinance();
        hf.setPurchaceID(this.purchaceID);
        
        try{
                  
            ResultSet rs = hf.getselectedpurchaceDetails();
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            if(rs.next()){
                invoiceDateChooser.setDate(date.parse(rs.getString("Invoice_Date")));
                dueDateChooser.setDate(date.parse(rs.getString("Due_Date")));
                totText.setText(rs.getString("Total_Payment"));                
                balanceText.setText(rs.getString("Invoice_Balance"));
                statusCombo.setSelectedItem(rs.getString("Status"));
               
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

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titlelable = new javax.swing.JLabel();
        paymentText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        savebtn = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JLabel();
        paymentLabel = new javax.swing.JLabel();
        fotter = new javax.swing.JLabel();
        invoiceDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dueDateChooser = new com.toedter.calendar.JDateChooser();
        totText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLable4 = new javax.swing.JLabel();
        balanceText = new javax.swing.JTextField();
        statusCombo = new javax.swing.JComboBox();
        backlable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Purchace Invoice Details");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Due Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 100, 30));

        titlelable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/titleGlass.png"))); // NOI18N
        titlelable.setMinimumSize(new java.awt.Dimension(800, 50));
        titlelable.setPreferredSize(new java.awt.Dimension(800, 50));
        jPanel1.add(titlelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

        paymentText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        paymentText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paymentTextKeyReleased(evt);
            }
        });
        jPanel1.add(paymentText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 230, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payment");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, 30));

        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/doneOut.png"))); // NOI18N
        savebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savebtnMouseExited(evt);
            }
        });
        jPanel1.add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 150, 50));

        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/cancelOut.png"))); // NOI18N
        cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelbtnMouseExited(evt);
            }
        });
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, 50));

        paymentLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        paymentLabel.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(paymentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 230, 30));

        fotter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/buttonglassdown.png"))); // NOI18N
        jPanel1.add(fotter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 810, 70));

        invoiceDateChooser.setDateFormatString("yyyy-MM-dd");
        invoiceDateChooser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(invoiceDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 230, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Invoice Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 170, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Payment");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 30));

        dueDateChooser.setDateFormatString("yyyy-MM-dd");
        dueDateChooser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(dueDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 230, 30));

        totText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(totText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 230, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 90, 30));

        jLable4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLable4.setForeground(new java.awt.Color(255, 255, 255));
        jLable4.setText("Balance");
        jPanel1.add(jLable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 100, 30));

        balanceText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(balanceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 230, 30));

        statusCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statusCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Not Paid", "Paid", "Cancelled " }));
        jPanel1.add(statusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 230, 30));

        backlable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/backgroundsmall.jpg"))); // NOI18N
        jPanel1.add(backlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseClicked
     
        HandleFinance hf = new HandleFinance();
        ValidateStocks valid = new ValidateStocks();
        
        
        String invoicedate = null;
        String duedate = null;
        
        if(paymentText.getText().equalsIgnoreCase("")){
               
            JOptionPane.showMessageDialog(null, "Please enter your payment.", "WARNING", JOptionPane.WARNING_MESSAGE);
            
        }else{
           
        if(valid.validateNumbers(paymentText.getText())){
              
           try{
                SimpleDateFormat idate = new SimpleDateFormat("yyyy-MM-dd");
                invoicedate = idate.format(invoiceDateChooser.getDate());
        
                SimpleDateFormat dudate = new SimpleDateFormat("yyyy-MM-dd");
                duedate = dudate.format(dueDateChooser.getDate());
        
           }
           catch(NullPointerException e){
               JOptionPane.showMessageDialog(null, "Date is invalid.", "WARNING", JOptionPane.WARNING_MESSAGE);
           }
               
           try{                
                  
                      hf.setPurchaceID(this.purchaceID);
                      hf.setDueData(duedate);
                      hf.setInvoiceDate(invoicedate);
                     
                      double balance = Double.parseDouble(balanceText.getText());
                      double payment = Double.parseDouble(paymentText.getText());
                      
                      if (balance <= 0) {
                          hf.setNewBalnce("0.00");                   
                          hf.setStatus("Paid");
                          JOptionPane.showMessageDialog(null,"This purchace invoice has been paid already.", "Message", JOptionPane.INFORMATION_MESSAGE);
                          
                      }
                      else{
                        double newBalance = balance - payment;                      
                        DecimalFormat df = new DecimalFormat("#.00");   
                      
                        hf.setNewBalnce(df.format(newBalance));                   
                        hf.setStatus(statusCombo.getSelectedItem().toString());
                      }
                      
                      
                     
                      
                      int t = hf.updatePurchaceDetails();
                      if(t!=0){                         
                         JOptionPane.showMessageDialog(null,"Purchace Invoice has been saved successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                         this.dispose();                          
                      } 
                  
                      else
                      {
                          JOptionPane.showMessageDialog(null, "Purchace Invoice cannot be save.", "Error", JOptionPane.ERROR_MESSAGE);
                          this.dispose();
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
    
        else{              
                if(!valid.validateNumbers(paymentText.getText())){
                    paymentLabel.setText("Payment is invalid");
                }     
        }

     }
        
    }//GEN-LAST:event_savebtnMouseClicked

    private void savebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseEntered
        savebtn.setIcon(saveenter);
    }//GEN-LAST:event_savebtnMouseEntered

    private void savebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseExited
        savebtn.setIcon(saveout);
    }//GEN-LAST:event_savebtnMouseExited

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelbtnMouseClicked

    private void cancelbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseEntered
        cancelbtn.setIcon(cacleenter);
    }//GEN-LAST:event_cancelbtnMouseEntered

    private void cancelbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseExited
        cancelbtn.setIcon(cacleout);
    }//GEN-LAST:event_cancelbtnMouseExited

    private void paymentTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentTextKeyReleased
        paymentLabel.setText(null);
    }//GEN-LAST:event_paymentTextKeyReleased

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
            java.util.logging.Logger.getLogger(PurchaceInvoiceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaceInvoiceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaceInvoiceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaceInvoiceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PurchaceInvoiceDetails dialog = new PurchaceInvoiceDetails(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel backlable;
    private javax.swing.JTextField balanceText;
    private javax.swing.JLabel cancelbtn;
    private com.toedter.calendar.JDateChooser dueDateChooser;
    private javax.swing.JLabel fotter;
    private com.toedter.calendar.JDateChooser invoiceDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLable4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JTextField paymentText;
    private javax.swing.JLabel savebtn;
    private javax.swing.JComboBox statusCombo;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titlelable;
    private javax.swing.JTextField totText;
    // End of variables declaration//GEN-END:variables

}
