/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.PointOfSale;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.PointOfSale.HandlePointOfSale;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Nadee
 */
public class History extends javax.swing.JDialog {

   
    private final ImageIcon printOut;
    private final ImageIcon printEnter;
    private final ImageIcon cancelOut;
    private final ImageIcon cancelEnter;
    private final ImageIcon searchOut;
    private final ImageIcon searchEnter;
    
    public History(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        printOut = new ImageIcon(getClass().getResource("/view/PointOfSale/printOut.png"));
        printEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/printEnter.png"));
        cancelOut = new ImageIcon(getClass().getResource("/view/PointOfSale/cancelOut.png"));
        cancelEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/cancelEnter.png"));
        searchOut = new ImageIcon(getClass().getResource("/view/PointOfSale/searchOut.png"));
        searchEnter = new ImageIcon(getClass().getResource("/view/PointOfSale/searchEnter.png"));
        
        this.loadInvoiceDetails(); 
        this.pack();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JLabel();
        searchinvoicetxt = new javax.swing.JTextField();
        Sales = new javax.swing.JScrollPane();
        invoiceHistoryTable = new javax.swing.JTable();
        Print = new javax.swing.JLabel();
        Cancel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("History");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/searchOut.png"))); // NOI18N
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 503, 30, 25));

        searchinvoicetxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchinvoicetxt.setPreferredSize(new java.awt.Dimension(300, 30));
        searchinvoicetxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchinvoicetxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchinvoicetxtMouseExited(evt);
            }
        });
        searchinvoicetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchinvoicetxtKeyReleased(evt);
            }
        });
        jPanel1.add(searchinvoicetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 300, 30));

        invoiceHistoryTable.setBackground(new java.awt.Color(204, 204, 204));
        invoiceHistoryTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        invoiceHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Invoice ID", "Invoice Date", "Total Price"
            }
        ));
        invoiceHistoryTable.setFillsViewportHeight(true);
        invoiceHistoryTable.setRowHeight(25);
        Sales.setViewportView(invoiceHistoryTable);

        jPanel1.add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 910, 370));

        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/printOut.png"))); // NOI18N
        Print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Print.setIconTextGap(0);
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrintMouseExited(evt);
            }
        });
        jPanel1.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 150, 50));

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
        jPanel1.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 150, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/JBtnPanel.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 910, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/PointOfSale/Jdialog.jpg"))); // NOI18N
        jLabel1.setIconTextGap(0);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadInvoiceDetails(){
        
        HandlePointOfSale pos = new HandlePointOfSale();              
        try{
            ResultSet rs = pos.getInvoiceHistory();
            invoiceHistoryTable.setModel(DbUtils.resultSetToTableModel(rs));
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
    
    
    private void searchinvoicetxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchinvoicetxtMouseEntered
        search.setIcon(searchEnter);
    }//GEN-LAST:event_searchinvoicetxtMouseEntered

    private void searchinvoicetxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchinvoicetxtMouseExited
        search.setIcon(searchOut);
    }//GEN-LAST:event_searchinvoicetxtMouseExited

    private void searchinvoicetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchinvoicetxtKeyReleased
        
        HandlePointOfSale pos = new HandlePointOfSale();

        pos.setInvoiceSearchKey(searchinvoicetxt.getText());
        pos.setInvoiceDate(searchinvoicetxt.getText());
        try{
            ResultSet rs = pos.getSearchInvoiceHistory();
            invoiceHistoryTable.setModel(DbUtils.resultSetToTableModel(rs));

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
        
    }//GEN-LAST:event_searchinvoicetxtKeyReleased

    private void PrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseEntered
        Print.setIcon(printEnter);
    }//GEN-LAST:event_PrintMouseEntered

    private void PrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseExited
        Print.setIcon(printOut);
    }//GEN-LAST:event_PrintMouseExited

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CancelMouseClicked

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        Cancel.setIcon(cancelEnter);
    }//GEN-LAST:event_CancelMouseEntered

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        Cancel.setIcon(cancelOut);
    }//GEN-LAST:event_CancelMouseExited

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
        
        int i = invoiceHistoryTable.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(null, "Please select the Invoice that you need to be print.", "Message", JOptionPane.INFORMATION_MESSAGE);           
        }
        else{
            String ID = invoiceHistoryTable.getValueAt(i, 0).toString();
            PrintInvoice pi = new PrintInvoice(null, true,ID);
            this.dispose();
            pi.setVisible(true);
        }
        
        
    }//GEN-LAST:event_PrintMouseClicked

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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                History dialog = new History(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel Print;
    private javax.swing.JScrollPane Sales;
    private javax.swing.JTable invoiceHistoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchinvoicetxt;
    // End of variables declaration//GEN-END:variables

}
