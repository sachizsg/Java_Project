/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.PointOfSale;

import javax.swing.JOptionPane;
import model.PointOfSale.ValidatePointOfSale;

/**
 *
 * @author Nadee
 */
public class Quantity extends javax.swing.JDialog {

   
    
    public Quantity(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        quantityText.setText(PointOfSale.quan);
         
        this.pack();
    }       

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        quantityText = new javax.swing.JTextField();
        OKButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quantity");
        setMinimumSize(new java.awt.Dimension(350, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(350, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quantity");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 30));

        quantityText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(quantityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, 30));

        OKButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });
        jPanel1.add(OKButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, 40));

        CancelButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/quantityBackground.jpg"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jLabel2.setPreferredSize(new java.awt.Dimension(350, 200));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 200));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed

        ValidatePointOfSale vps = new ValidatePointOfSale();
        
        
        if (vps.validateNumbers(quantityText.getText())) {
            int quantity = Integer.parseInt(quantityText.getText());
            
            if (PointOfSale.stockLevel < quantity) {
                JOptionPane.showMessageDialog(null, "This item doesn't have enough stocks.", "Warning", JOptionPane.WARNING_MESSAGE);
                this.dispose();
            }
            else{
                PointOfSale.quan = quantityText.getText();       
                this.dispose();
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Quantity value is invalid.", "Error", JOptionPane.ERROR_MESSAGE);
            quantityText.setText("1");
        }
        
        
        
    }//GEN-LAST:event_OKButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Quantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Quantity dialog = new Quantity(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField quantityText;
    // End of variables declaration//GEN-END:variables
}
