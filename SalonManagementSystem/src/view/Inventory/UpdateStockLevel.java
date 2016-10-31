/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Inventory;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Inventory.HandleStocks;
import model.Inventory.ValidateStocks;


/**
 *
 * @author Sachithra
 */
public class UpdateStockLevel extends javax.swing.JDialog {
    
    private final ImageIcon saveout;
    private final ImageIcon saveenter;
    
    private final ImageIcon cacleout;
    private final ImageIcon cacleenter;
    
    private final ImageIcon totalout;
    private final ImageIcon totalenter;
   
    private String stckupID;
    private double discount;
    
   
    public UpdateStockLevel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        saveout = new ImageIcon(getClass().getResource("/view/Inventory/saveOut.png"));
        saveenter = new ImageIcon(getClass().getResource("/view/Inventory/saveEnter.png"));
        cacleout = new ImageIcon(getClass().getResource("/view/Inventory/cancelOut.png"));
        cacleenter = new ImageIcon(getClass().getResource("/view/Inventory/cancelEnter.png"));
        totalout = new ImageIcon(getClass().getResource("/view/Inventory/totlbtn.png"));
        totalenter = new ImageIcon(getClass().getResource("/view/Inventory/totl.png"));
        
    }
    
    public UpdateStockLevel(java.awt.Frame parent, boolean modal,String Stock_ID) {
        super(parent, modal);
        initComponents();
        
        saveout = new ImageIcon(getClass().getResource("/view/Inventory/saveOut.png"));
        saveenter = new ImageIcon(getClass().getResource("/view/Inventory/saveEnter.png"));
        cacleout = new ImageIcon(getClass().getResource("/view/Inventory/cancelOut.png"));
        cacleenter = new ImageIcon(getClass().getResource("/view/Inventory/cancelEnter.png"));
        totalout = new ImageIcon(getClass().getResource("/view/Inventory/totlbtn.png"));
        totalenter = new ImageIcon(getClass().getResource("/view/Inventory/totl.png"));
       
        
        this.stckupID = Stock_ID;
        this.pack();
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titlelable = new javax.swing.JLabel();
        Quantitytxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        savebtn = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JLabel();
        quantitylable = new javax.swing.JLabel();
        fotter = new javax.swing.JLabel();
        invoiceDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dueDateChooser = new com.toedter.calendar.JDateChooser();
        costtxt = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        totaltxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        costlable = new javax.swing.JLabel();
        jLable4 = new javax.swing.JLabel();
        discounttxt = new javax.swing.JTextField();
        statusCombo = new javax.swing.JComboBox();
        backlable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Update Stocks Details");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Due Date");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 120, 30));

        titlelable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/titleGlass.png"))); // NOI18N
        titlelable.setMinimumSize(new java.awt.Dimension(800, 50));
        titlelable.setPreferredSize(new java.awt.Dimension(800, 50));
        jPanel1.add(titlelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

        Quantitytxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Quantitytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QuantitytxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantitytxtKeyReleased(evt);
            }
        });
        jPanel1.add(Quantitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 230, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 110, 30));

        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/saveOut.png"))); // NOI18N
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

        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/cancelOut.png"))); // NOI18N
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

        quantitylable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        quantitylable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(quantitylable, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 230, 30));

        fotter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/buttonglassdown.png"))); // NOI18N
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
        jLabel2.setText("Cost");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 30));

        dueDateChooser.setDateFormatString("yyyy-MM-dd");
        dueDateChooser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(dueDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 230, 30));

        costtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        costtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                costtxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costtxtKeyReleased(evt);
            }
        });
        jPanel1.add(costtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 230, 30));

        total.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/totlbtn.png"))); // NOI18N
        total.setText("Total");
        total.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                totalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                totalMouseExited(evt);
            }
        });
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 110, 30));

        totaltxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(totaltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 230, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 110, 30));

        costlable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        costlable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(costlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 230, 30));

        jLable4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLable4.setForeground(new java.awt.Color(255, 255, 255));
        jLable4.setText("Discount");
        jPanel1.add(jLable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 110, 30));

        discounttxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        discounttxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discounttxtKeyReleased(evt);
            }
        });
        jPanel1.add(discounttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 230, 30));

        statusCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statusCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Not Paid", "Paid" }));
        jPanel1.add(statusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 230, 30));

        backlable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/backgroundsmall.jpg"))); // NOI18N
        jPanel1.add(backlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseClicked
         this.dispose();
    }//GEN-LAST:event_cancelbtnMouseClicked

    private void savebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseEntered
         savebtn.setIcon(saveenter);
    }//GEN-LAST:event_savebtnMouseEntered

    private void savebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseExited
         savebtn.setIcon(saveout);
    }//GEN-LAST:event_savebtnMouseExited

    private void cancelbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseEntered
         cancelbtn.setIcon(cacleenter);
    }//GEN-LAST:event_cancelbtnMouseEntered

    private void cancelbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseExited
         cancelbtn.setIcon(cacleout);
    }//GEN-LAST:event_cancelbtnMouseExited

    private void savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseClicked
        
        int currentstocklevel;
        String supid;
        String invoicedate = null;
        String duedate = null;
        
        if(costtxt.getText().equalsIgnoreCase("") || Quantitytxt.getText().equalsIgnoreCase("") || totaltxt.getText().equalsIgnoreCase("")){
               
            JOptionPane.showMessageDialog(null, "Cost,Quantity and Total are required.", "WARNING", JOptionPane.WARNING_MESSAGE);
            
        }
        else{
           ValidateStocks valid = new ValidateStocks();
           
           if(valid.validatePrice(costtxt.getText()) && valid.validateNumbers(Quantitytxt.getText())){
               
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
                  HandleStocks hs = new HandleStocks();
                  
                  hs.setStockID(stckupID);
                  ResultSet rs = hs.getSelectedStockDetails();
                  if(rs.next()){
                 
                  currentstocklevel = rs.getInt("Stock_Level");
                  supid = rs.getString("Supplier_Supplier_ID");
                  
                  int newStockLevel = currentstocklevel + Integer.parseInt(Quantitytxt.getText());
                  String totalstk =Integer.toString(newStockLevel);
                  
                  hs.setNewStock(totalstk);
                  int i = hs.updateStockLevel();
                  
                  if(i!=0){
                      hs.setDueData(duedate);
                      hs.setInvoiceDate(invoicedate);
                      hs.setCost(costtxt.getText());
                      hs.setQuantity(Quantitytxt.getText());
                      hs.setDiscount(Double.toString(discount)); 
                      hs.setTotal(totaltxt.getText());
                      hs.setInvoiceBalance(totaltxt.getText());
                      hs.setStatus(statusCombo.getSelectedItem().toString());
                      hs.setSupplier_ID(supid);
                      
                      int t = hs.purchaceDetails();
                      if(t!=0){
                         JOptionPane.showMessageDialog(null,"Stock has been updated successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                         this.dispose();                          
                      }
                      else
                      {
                        JOptionPane.showMessageDialog(null, "Stock cannot be update.", "Error", JOptionPane.ERROR_MESSAGE);
                      }
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "Stock cannot be update.", "Error", JOptionPane.ERROR_MESSAGE);
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
    
        else{
                if(!valid.validateNumbers(costtxt.getText())){
                    costlable.setText("Cost is invalid");
                }
                if(!valid.validateNumbers(Quantitytxt.getText())){
                    quantitylable.setText("Quantity is invalid");
                }
     
        }

     }
        
    }//GEN-LAST:event_savebtnMouseClicked

    private void totalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseEntered
        total.setIcon(totalenter);
    }//GEN-LAST:event_totalMouseEntered

    private void totalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseExited
        total.setIcon(totalout);
    }//GEN-LAST:event_totalMouseExited

    private void totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseClicked
        
        DecimalFormat df = new DecimalFormat("#.00"); 
        try{
            double cost = Double.parseDouble(costtxt.getText());
            double quantity = Double.parseDouble(Quantitytxt.getText());
            
            if(discounttxt.getText().equalsIgnoreCase("")){
                discount = 0;
            }
            else{
                discount = Double.parseDouble(discounttxt.getText());
            }
                double tot = cost * quantity;
                double total = tot - (tot * discount / 100);
                String totalAmount= df.format(total);
                totaltxt.setText(totalAmount);
        
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Total cannot calculate without cost and quantity.", "NumberFormatException", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_totalMouseClicked

    private void costtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costtxtKeyPressed
        costlable.setText(null);
    }//GEN-LAST:event_costtxtKeyPressed

    private void QuantitytxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantitytxtKeyPressed
        quantitylable.setText(null);
    }//GEN-LAST:event_QuantitytxtKeyPressed

    private void discounttxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discounttxtKeyReleased
        totaltxt.setText(null);
    }//GEN-LAST:event_discounttxtKeyReleased

    private void costtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costtxtKeyReleased
        totaltxt.setText(null);
    }//GEN-LAST:event_costtxtKeyReleased

    private void QuantitytxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantitytxtKeyReleased
        totaltxt.setText(null);
    }//GEN-LAST:event_QuantitytxtKeyReleased
 
        
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
            java.util.logging.Logger.getLogger(UpdateStockLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStockLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStockLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStockLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateStockLevel dialog = new UpdateStockLevel(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField Quantitytxt;
    private javax.swing.JLabel backlable;
    private javax.swing.JLabel cancelbtn;
    private javax.swing.JLabel costlable;
    private javax.swing.JTextField costtxt;
    private javax.swing.JTextField discounttxt;
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
    private javax.swing.JLabel quantitylable;
    private javax.swing.JLabel savebtn;
    private javax.swing.JComboBox statusCombo;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titlelable;
    private javax.swing.JLabel total;
    private javax.swing.JTextField totaltxt;
    // End of variables declaration//GEN-END:variables
}
