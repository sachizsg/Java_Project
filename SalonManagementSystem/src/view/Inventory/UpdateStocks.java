/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Inventory;



import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Inventory.HandleStocks;
import model.Inventory.HandleSupplier;
import model.Inventory.ValidateStocks;


/**
 *
 * @author Sachithra
 */
public class UpdateStocks extends javax.swing.JDialog {
    
    private final ImageIcon saveout;
    private final ImageIcon saveenter;
    
    private final ImageIcon cacleout;
    private final ImageIcon cacleenter;
    
    
    private String stckID;
    
  
    public UpdateStocks(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        saveout = new ImageIcon(getClass().getResource("/view/Inventory/saveOut.png"));
        saveenter = new ImageIcon(getClass().getResource("/view/Inventory/saveEnter.png"));
        cacleout = new ImageIcon(getClass().getResource("/view/Inventory/cancelOut.png"));
        cacleenter = new ImageIcon(getClass().getResource("/view/Inventory/cancelEnter.png"));
        
    }
    
    public UpdateStocks(java.awt.Frame parent, boolean modal,String Stock_ID) {
        super(parent, modal);
        initComponents();
        
        saveout = new ImageIcon(getClass().getResource("/view/Inventory/saveOut.png"));
        saveenter = new ImageIcon(getClass().getResource("/view/Inventory/saveEnter.png"));
        cacleout = new ImageIcon(getClass().getResource("/view/Inventory/cancelOut.png"));
        cacleenter = new ImageIcon(getClass().getResource("/view/Inventory/cancelEnter.png"));
        
        this.stckID = Stock_ID;
        
        this.loadComboBoxData();
        this.loadStockDetails();
        
      
        this.pack();
    }
    
    private void loadComboBoxData() {
       
            HandleStocks hs = new HandleStocks();
            
            try{
            ResultSet rs = hs.loadCompanyName();
            while(rs.next()){
                String name = rs.getString("Company_Name");
                Combobox_Name.addItem(name);
            }
            
            Combobox_Name.setSelectedIndex(-1);
            
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
    
    private void loadStockDetails(){
        HandleStocks hs = new HandleStocks();
        hs.setStockID(this.stckID);
        try{
            ResultSet rs = hs.getSelectedStockDetails();
            if(rs.next()){
                stnametxt.setText(rs.getString(2));
                pricetxt.setText(rs.getString(3));
                reordertxt.setText(rs.getString(5));
                Combobox_Name.setSelectedItem(rs.getString("Supplier.Company_Name"));
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
        Combobox_Name = new javax.swing.JComboBox();
        stnametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        reordertxt = new javax.swing.JTextField();
        reorderlable = new javax.swing.JLabel();
        pricelable = new javax.swing.JLabel();
        titlelable = new javax.swing.JLabel();
        savebtn = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JLabel();
        fotter = new javax.swing.JLabel();
        backlable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Stock");
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
        jLabel3.setText("Company Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 30));

        Combobox_Name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(Combobox_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 200, 30));

        stnametxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(stnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 200, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stock Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 110, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, 30));

        pricetxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pricetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pricetxtKeyPressed(evt);
            }
        });
        jPanel1.add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 200, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reorder Level");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 140, 30));

        reordertxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reordertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reordertxtKeyPressed(evt);
            }
        });
        jPanel1.add(reordertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 200, 30));

        reorderlable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reorderlable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(reorderlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 200, 30));

        pricelable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pricelable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(pricelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 200, 30));

        titlelable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/titleGlass.png"))); // NOI18N
        titlelable.setMinimumSize(new java.awt.Dimension(800, 50));
        titlelable.setPreferredSize(new java.awt.Dimension(800, 50));
        jPanel1.add(titlelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

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

        fotter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/buttonglassdown.png"))); // NOI18N
        jPanel1.add(fotter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 810, 70));

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
                
        if(Combobox_Name.getSelectedIndex() == -1 || stnametxt.getText().equalsIgnoreCase("") || pricetxt.getText().equalsIgnoreCase("")
                || reordertxt.getText().equalsIgnoreCase("")){
            
            JOptionPane.showMessageDialog(null,"All fields are required.", "WARNING",JOptionPane.WARNING_MESSAGE);
        }
        
        else{            
           ValidateStocks valid = new ValidateStocks();
       
           if(valid.validatePrice(pricetxt.getText()) && valid.validateNumbers(reordertxt.getText())){
            
            HandleStocks hs = new HandleStocks();   
                             
            hs.setStockID(this.stckID);
            hs.setStockName(valid.capitalizeFirstLetter(stnametxt.getText()).trim());
            hs.setPrice(pricetxt.getText());
            hs.setReOrderLevel(reordertxt.getText());
            hs.setSupplier_ID(this.supplierID());
            
             try{
                    int i = hs.updateStock();
                    if(i!=0){              
                        JOptionPane.showMessageDialog(null, "Stock has been updated successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Stock cannot be update.", "Error", JOptionPane.ERROR_MESSAGE);
                        this.dispose();
                    }
                } 
                catch(SQLIntegrityConstraintViolationException ex){
                    JOptionPane.showMessageDialog(null, "Some of data is already existing in the system.", "SQLIntegrityConstraintViolationException", JOptionPane.ERROR_MESSAGE);
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
               if(!valid.validatePrice(pricetxt.getText())){
                   pricelable.setText("Price is invalid");
               }
               if(!valid.validateNumbers(reordertxt.getText())){
                   reorderlable.setText("Reorder Level is invalid");
               }
        
           }
        }
        
    }//GEN-LAST:event_savebtnMouseClicked

    private String supplierID(){
        HandleSupplier hs = new HandleSupplier();
        hs.setCompanyName(Combobox_Name.getSelectedItem().toString());
        String supID = null;
        try{
            ResultSet rs = hs.supplierIDByCompanyName();
            if (rs.next()) {
                supID = rs.getString("Supplier_ID");
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
        
        return supID;
        
    }
    
    private void pricetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pricetxtKeyPressed
        pricelable.setText(null);
    }//GEN-LAST:event_pricetxtKeyPressed

    private void reordertxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reordertxtKeyPressed
        reorderlable.setText(null);
    }//GEN-LAST:event_reordertxtKeyPressed

    
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
            java.util.logging.Logger.getLogger(UpdateStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateStocks dialog = new UpdateStocks(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox Combobox_Name;
    private javax.swing.JLabel backlable;
    private javax.swing.JLabel cancelbtn;
    private javax.swing.JLabel fotter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pricelable;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JLabel reorderlable;
    private javax.swing.JTextField reordertxt;
    private javax.swing.JLabel savebtn;
    private javax.swing.JTextField stnametxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titlelable;
    // End of variables declaration//GEN-END:variables
}
