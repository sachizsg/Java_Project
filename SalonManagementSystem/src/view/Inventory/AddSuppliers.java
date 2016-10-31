/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Inventory;



import java.sql.DataTruncation;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Inventory.HandleSupplier;
import model.Inventory.ValidateSupplier;


/**
 *
 * @author Sachithra
 */
public class AddSuppliers extends javax.swing.JDialog {

    private final ImageIcon saveout;
    private final ImageIcon saveenter;
    
    private final ImageIcon cacleout;
    private final ImageIcon cacleenter;
    
   
    /**
     * Creates new form AddSuppliers
     */
    public AddSuppliers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        saveout = new ImageIcon(getClass().getResource("/view/Inventory/saveOut.png"));
        saveenter = new ImageIcon(getClass().getResource("/view/Inventory/saveEnter.png"));
        cacleout = new ImageIcon(getClass().getResource("/view/Inventory/cancelOut.png"));
        cacleenter = new ImageIcon(getClass().getResource("/view/Inventory/cancelEnter.png"));
        
        this.pack();
                
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        titlelable = new javax.swing.JLabel();
        fnametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        companynametxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        supplieridtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        savebtn = new javax.swing.JLabel();
        lnametxt = new javax.swing.JTextField();
        cancelbtn = new javax.swing.JLabel();
        supidlable = new javax.swing.JLabel();
        fotter = new javax.swing.JLabel();
        fnamelable = new javax.swing.JLabel();
        lnamelable = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cnumtxt = new javax.swing.JTextField();
        citytxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cnumlable = new javax.swing.JLabel();
        backlable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Supplier");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Add Supplier Details");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 30));

        titlelable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/titleGlass.png"))); // NOI18N
        titlelable.setMinimumSize(new java.awt.Dimension(800, 50));
        jPanel1.add(titlelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

        fnametxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fnametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnametxtKeyPressed(evt);
            }
        });
        jPanel1.add(fnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 200, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Supplier ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 110, 30));

        companynametxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(companynametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 200, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 110, 30));

        supplieridtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        supplieridtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplieridtxtKeyPressed(evt);
            }
        });
        jPanel1.add(supplieridtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 200, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Company Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, 30));

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
        jPanel1.add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 150, 50));

        lnametxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lnametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnametxtKeyPressed(evt);
            }
        });
        jPanel1.add(lnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 200, 30));

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
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, 50));

        supidlable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        supidlable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(supidlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 200, 30));

        fotter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/buttonglassdown.png"))); // NOI18N
        jPanel1.add(fotter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 810, 70));

        fnamelable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fnamelable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(fnamelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, 30));

        lnamelable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lnamelable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(lnamelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 200, 30));

        addresstxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 200, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 140, 30));

        cnumtxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cnumtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnumtxtKeyPressed(evt);
            }
        });
        jPanel1.add(cnumtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 200, 30));

        citytxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(citytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 200, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("City");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 110, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 150, 30));

        cnumlable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cnumlable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(cnumlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 200, 30));

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

    private void cancelbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseEntered
        cancelbtn.setIcon(cacleenter);
    }//GEN-LAST:event_cancelbtnMouseEntered

    private void savebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseExited
        savebtn.setIcon(saveout);
    }//GEN-LAST:event_savebtnMouseExited

    private void cancelbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtnMouseExited
        cancelbtn.setIcon(cacleout);        
    }//GEN-LAST:event_cancelbtnMouseExited

    private void savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseClicked
                
        if(supplieridtxt.getText().equalsIgnoreCase("") || fnametxt.getText().equalsIgnoreCase("") || lnametxt.getText().equalsIgnoreCase("")
                || companynametxt.getText().equalsIgnoreCase("") || cnumtxt.getText().equalsIgnoreCase("") || addresstxt.getText().equalsIgnoreCase("")
                || citytxt.getText().equalsIgnoreCase("")){
            
            JOptionPane.showMessageDialog(null,"All fields are required.", "WARNING",JOptionPane.WARNING_MESSAGE);
        }
        
        else{
              ValidateSupplier valid = new ValidateSupplier();
              if( valid.validateSupplierID(supplieridtxt.getText()) && valid.validateName(fnametxt.getText()) && valid.validateName(lnametxt.getText()) && valid.validateContactNum(cnumtxt.getText())){
                  
                HandleSupplier hs = new HandleSupplier();
                
                hs.setSupplierID(supplieridtxt.getText().trim());
                hs.setFirstName(valid.capitalizeFirstLetter(fnametxt.getText()).trim());
                hs.setLastName(valid.capitalizeFirstLetter(lnametxt.getText()).trim());
                hs.setCompanyName(valid.capitalizeFirstLetter(companynametxt.getText()).trim());
                hs.setContactNum(cnumtxt.getText().trim());
                hs.setAddress(valid.capitalizeFirstLetter(addresstxt.getText()).trim());
                hs.setCity(valid.capitalizeFirstLetter(citytxt.getText()).trim());
                try{
                    int i = hs.addSupplier();
                    if(i!=0){              
                        JOptionPane.showMessageDialog(null, "Supplier has been added successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Supplier cannot be add.", "Error", JOptionPane.ERROR_MESSAGE);
                        this.dispose();
                    }
                }                
                catch(SQLIntegrityConstraintViolationException ex){
                    JOptionPane.showMessageDialog(null, "Supplier ID or Company Name is already existing in the system.", "SQLIntegrityConstraintViolationException", JOptionPane.ERROR_MESSAGE);
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
                  
              if(!valid.validateSupplierID(supplieridtxt.getText())){
                supidlable.setText("Supplier ID is invalid");
              }
              if(!valid.validateName(fnametxt.getText())){
                fnamelable.setText("First Name is invalid");
              }
              if(!valid.validateName(lnametxt.getText())){
                lnamelable.setText("Last Name is invalid");
              }
              if(!valid.validateContactNum(cnumtxt.getText())){
                cnumlable.setText("Contact Number is invalid");
              }
              
                  
                  
              }
    }
       
     
        
    }//GEN-LAST:event_savebtnMouseClicked

    private void supplieridtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplieridtxtKeyPressed
       supidlable.setText(null);
    }//GEN-LAST:event_supplieridtxtKeyPressed

    private void fnametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnametxtKeyPressed
       fnamelable.setText(null);
    }//GEN-LAST:event_fnametxtKeyPressed

    private void lnametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnametxtKeyPressed
        lnamelable.setText(null);
    }//GEN-LAST:event_lnametxtKeyPressed

    private void cnumtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnumtxtKeyPressed
        cnumlable.setText(null);
    }//GEN-LAST:event_cnumtxtKeyPressed
    
    
    
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
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddSuppliers dialog = new AddSuppliers(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel backlable;
    private javax.swing.JLabel cancelbtn;
    private javax.swing.JTextField citytxt;
    private javax.swing.JLabel cnumlable;
    private javax.swing.JTextField cnumtxt;
    private javax.swing.JTextField companynametxt;
    private javax.swing.JLabel fnamelable;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JLabel fotter;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lnamelable;
    private javax.swing.JTextField lnametxt;
    private javax.swing.JLabel savebtn;
    private javax.swing.JLabel supidlable;
    private javax.swing.JTextField supplieridtxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titlelable;
    // End of variables declaration//GEN-END:variables
}
