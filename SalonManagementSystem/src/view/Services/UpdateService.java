/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Services;

import java.sql.DataTruncation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Services.HandleServices;
import model.Services.ValidateServices;


public class UpdateService extends javax.swing.JDialog {
    
    private final ImageIcon saveout;
    private final ImageIcon saveenter;
    
    private final ImageIcon cacleout;
    private final ImageIcon cacleenter;
   
    private String serID;
    
   
    public UpdateService(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        saveout = new ImageIcon(getClass().getResource("/view/Services/saveOut.png"));
        saveenter = new ImageIcon(getClass().getResource("/view/Services/saveEnter.png"));
        cacleout = new ImageIcon(getClass().getResource("/view/Services/cancelOut.png"));
        cacleenter = new ImageIcon(getClass().getResource("/view/Services/cancelEnter.png"));
       
        this.pack();
    }
    
    public UpdateService(java.awt.Frame parent, boolean modal, String Ser_ID) {
        super(parent, modal);
        initComponents();
        
        saveout = new ImageIcon(getClass().getResource("/view/Services/saveOut.png"));
        saveenter = new ImageIcon(getClass().getResource("/view/Services/saveEnter.png"));
        cacleout = new ImageIcon(getClass().getResource("/view/Services/cancelOut.png"));
        cacleenter = new ImageIcon(getClass().getResource("/view/Services/cancelEnter.png"));
        
        this.serID = Ser_ID;
        this.loadServiceDetails();
         
        this.pack();
    }
     
    private void loadServiceDetails(){
        HandleServices hs = new HandleServices();
        hs.setServiceID(this.serID);
        try{
            ResultSet rs = hs.getSelectedServiceDetails();
            if(rs.next()){
                snametxt.setText(rs.getString("Service_Name"));
                spricetxt.setText(rs.getString("Service_Price"));
                
                int time = rs.getInt("Duration");
               
                long hours = TimeUnit.MINUTES.toHours(time);
                long remainMinute = time - TimeUnit.HOURS.toMinutes(hours);
                String h = String.format("%02d", hours);
                String m = String.format("%02d", remainMinute);
                  
                
                hourscombo.setSelectedItem(h);
                miutscombo.setSelectedItem(m);
              
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
        titlelable = new javax.swing.JLabel();
        snametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        savebtn = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JLabel();
        fotter = new javax.swing.JLabel();
        spricelable = new javax.swing.JLabel();
        spricetxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cnumlable = new javax.swing.JLabel();
        addresslable = new javax.swing.JLabel();
        hourscombo = new javax.swing.JComboBox();
        miutscombo = new javax.swing.JComboBox();
        secondcombo = new javax.swing.JComboBox();
        backlable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Service");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Update Service Details");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 30));

        titlelable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/titleGlass.png"))); // NOI18N
        titlelable.setMinimumSize(new java.awt.Dimension(800, 50));
        jPanel1.add(titlelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

        snametxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(snametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 205, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Service Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   HH         MM        SS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 200, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Duration");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 110, 30));

        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/saveOut.png"))); // NOI18N
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
        jPanel1.add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 150, 50));

        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/cancelOut.png"))); // NOI18N
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
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, 50));

        fotter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/buttonglassdown.png"))); // NOI18N
        jPanel1.add(fotter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 810, 70));

        spricelable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spricelable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(spricelable, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 200, 30));

        spricetxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        spricetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spricetxtKeyPressed(evt);
            }
        });
        jPanel1.add(spricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 205, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Service Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 130, 30));

        cnumlable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cnumlable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(cnumlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 200, 30));

        addresslable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addresslable.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(addresslable, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 200, 30));

        hourscombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        hourscombo.setMaximumRowCount(13);
        hourscombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(hourscombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 65, 35));

        miutscombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        miutscombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));
        jPanel1.add(miutscombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 65, 35));

        secondcombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        secondcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00" }));
        jPanel1.add(secondcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 65, 35));

        backlable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/backgroundsmall.jpg"))); // NOI18N
        jPanel1.add(backlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseClicked

        if(snametxt.getText().equalsIgnoreCase("") || spricetxt.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null,"All fields are required.", "WARNING",JOptionPane.WARNING_MESSAGE);
        }        
        else{            
           ValidateServices valid = new ValidateServices(); 
           
           if(valid.validatePrice(spricetxt.getText())){
      
                String hours = hourscombo.getSelectedItem().toString();
                String min = miutscombo.getSelectedItem().toString();               
                
                int h = Integer.parseInt(hours);
                int m = Integer.parseInt(min);
              
                int dutime = (h*60)+(m);  
                
                HandleServices hs = new HandleServices();
                
                hs.setServiceID(this.serID);
                hs.setName(valid.capitalizeFirstLetter(snametxt.getText().trim()));
                hs.setDuration(Integer.toString(dutime));                        
                hs.setServicePrice(spricetxt.getText());
           
            
             try{
                    int i = hs.updateServices();
                    if(i!=0){
              
                    JOptionPane.showMessageDialog(null, "Service has been updated successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    }else{
                      JOptionPane.showMessageDialog(null, "Service cannot be update.", "Error", JOptionPane.ERROR_MESSAGE);
                      this.dispose();
                    }
                }        
                catch(SQLIntegrityConstraintViolationException ex){
                    JOptionPane.showMessageDialog(null, "This service is already existing in the system.", "SQLIntegrityConstraintViolationException", JOptionPane.ERROR_MESSAGE);
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
               
                if(!valid.validatePrice(spricetxt.getText())){
                   spricelable.setText("Price is invalid");
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

    private void spricetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spricetxtKeyPressed
        spricelable.setText(null);
    }//GEN-LAST:event_spricetxtKeyPressed

    
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
            java.util.logging.Logger.getLogger(UpdateService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateService dialog = new UpdateService(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel addresslable;
    private javax.swing.JLabel backlable;
    private javax.swing.JLabel cancelbtn;
    private javax.swing.JLabel cnumlable;
    private javax.swing.JLabel fotter;
    private javax.swing.JComboBox hourscombo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox miutscombo;
    private javax.swing.JLabel savebtn;
    private javax.swing.JComboBox secondcombo;
    private javax.swing.JTextField snametxt;
    private javax.swing.JLabel spricelable;
    private javax.swing.JTextField spricetxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titlelable;
    // End of variables declaration//GEN-END:variables
}
