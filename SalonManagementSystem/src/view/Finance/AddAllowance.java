/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Finance;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Sachithra
 */
public class AddAllowance extends javax.swing.JDialog {
    private final ImageIcon bonusout;
    private final ImageIcon bonusenter;
    private final ImageIcon cancelout;
    private final ImageIcon cancelenter;
    
    private String totlBonus;
    private String monthlyPayment;

    public AddAllowance(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
       bonusout = new ImageIcon(getClass().getResource("/view/Finance/addbonusbtn.png"));
       bonusenter = new ImageIcon(getClass().getResource("/view/Finance/addbonus.png"));
       cancelout = new ImageIcon(getClass().getResource("/view/Finance/cancelbtn.png"));
       cancelenter = new ImageIcon(getClass().getResource("/view/Finance/cancel.png"));
       
       this.pack();
    }
    
     public AddAllowance(java.awt.Frame parent, boolean modal,String monthlyPayment) {
        super(parent, modal);
        initComponents();
        
       bonusout = new ImageIcon(getClass().getResource("/view/Finance/addbonusbtn.png"));
       bonusenter = new ImageIcon(getClass().getResource("/view/Finance/addbonus.png"));
       cancelout = new ImageIcon(getClass().getResource("/view/Finance/cancelbtn.png"));
       cancelenter = new ImageIcon(getClass().getResource("/view/Finance/cancel.png"));
       
       this.monthlyPayment = monthlyPayment;
       monthlyPaymentsTxt.setText(this.monthlyPayment);
       
       monthlyPaymentsTxt.setEditable(false);
       totalBonusTxt.setEditable(false);
       
       this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        monthlyPaymentsTxt = new javax.swing.JTextField();
        monthlyBonusTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalBonusTxt = new javax.swing.JTextField();
        addbonus = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Allowance");
        setMinimumSize(new java.awt.Dimension(400, 410));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(420, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Monthly Payment ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bonus Rate");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        monthlyPaymentsTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(monthlyPaymentsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 190, 30));

        monthlyBonusTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        monthlyBonusTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                monthlyBonusTxtKeyReleased(evt);
            }
        });
        jPanel1.add(monthlyBonusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Bonus");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, 30));

        totalBonusTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(totalBonusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 190, 30));

        addbonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/addbonusbtn.png"))); // NOI18N
        addbonus.setText("jLabel5");
        addbonus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbonusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbonusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbonusMouseExited(evt);
            }
        });
        jPanel1.add(addbonus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 150, 40));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/cancelbtn.png"))); // NOI18N
        cancel.setText("jLabel6");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 120, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/background.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbonusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbonusMouseEntered
        addbonus.setIcon(bonusenter);
    }//GEN-LAST:event_addbonusMouseEntered

    private void addbonusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbonusMouseExited
         addbonus.setIcon(bonusout);
    }//GEN-LAST:event_addbonusMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
       cancel.setIcon(cancelenter);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setIcon(cancelout);
    }//GEN-LAST:event_cancelMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void monthlyBonusTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthlyBonusTxtKeyReleased
       try{
       Double payment = Double.parseDouble(monthlyPaymentsTxt.getText());
       Double bonus = Double.parseDouble(monthlyBonusTxt.getText());
       Double totalBonus = payment * (bonus/100);

       DecimalFormat df = new DecimalFormat("#.00");
       totlBonus= df.format(totalBonus);
       totalBonusTxt.setText(totlBonus);
       }
       catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null, "Bonus rate format is invalid.", "NumberFormatException", JOptionPane.ERROR_MESSAGE); 
          monthlyBonusTxt.setText(null);
       }
    }//GEN-LAST:event_monthlyBonusTxtKeyReleased

    private void addbonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbonusMouseClicked
        if (totalBonusTxt.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Cannot add bonus without a value.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            EmplpaymentSetting.allowences = totlBonus;
            this.dispose();
        }        
       
    }//GEN-LAST:event_addbonusMouseClicked

    
    
    
    
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
            java.util.logging.Logger.getLogger(AddAllowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAllowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAllowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAllowance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddAllowance dialog = new AddAllowance(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel addbonus;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField monthlyBonusTxt;
    private javax.swing.JTextField monthlyPaymentsTxt;
    private javax.swing.JTextField totalBonusTxt;
    // End of variables declaration//GEN-END:variables

    public String getTotlBonus() {
        return totlBonus;
    }

    public void setTotlBonus(String totlBonus) {
        this.totlBonus = totlBonus;
    }
    
    
   
}
