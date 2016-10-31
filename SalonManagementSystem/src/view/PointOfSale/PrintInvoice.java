/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.PointOfSale;

import javax.swing.ImageIcon;
import model.Reports.HandleInvoice;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Samu
 */
public class PrintInvoice extends javax.swing.JDialog {

    
    private final ImageIcon cancelOut;
    private final ImageIcon cancelEnter;
    
    private String invoiceID;
    
    public PrintInvoice(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cancelOut = new ImageIcon(getClass().getResource("/view/PointOfSale/cancelOut.png"));
        cancelEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/cancelEnter.png"));
        
       
        this.pack();
        
    }

    public PrintInvoice(java.awt.Frame parent, boolean modal,String ID) {
        super(parent, modal);
        initComponents();
        cancelOut = new ImageIcon(getClass().getResource("/view/PointOfSale/cancelOut.png"));
        cancelEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/cancelEnter.png"));
        
        this.invoiceID = ID;
        this.loadInvoice();      
        
        this.pack();
        
    }
    
    private void loadInvoice(){
        
        HandleInvoice hi = new HandleInvoice();
        hi.setInvoiceID(this.invoiceID);
        
        hi.setReportSource("C:\\Salon Management System\\SalonManagementSystem\\Reports\\Invoice\\Invoice.jrxml");
        
        JasperPrint jasperPrint = hi.printInvoice();
        
        JRViewer jRViewer = new JRViewer(jasperPrint);
        jRViewer.setZoomRatio((float) 0.75);    
                        
        
        jTabbedPane1.addTab("Invoice Details", jRViewer);  
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount()-1);
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Cancel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 10, 910, 460));

        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/cancelOut.png"))); // NOI18N
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.setIconTextGap(0);
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelMouseExited(evt);
            }
        });
        jPanel1.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 150, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/JBtnPanel.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 480, 910, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/Jdialog.jpg"))); // NOI18N
        jLabel1.setIconTextGap(0);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CancelMouseClicked

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        Cancel.setIcon(cancelEnter);
    }//GEN-LAST:event_CancelMouseEntered

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        Cancel.setIcon(cancelOut);
    }//GEN-LAST:event_CancelMouseExited

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
            java.util.logging.Logger.getLogger(PrintInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrintInvoice dialog = new PrintInvoice(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
