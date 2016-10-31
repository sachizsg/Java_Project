/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Services;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Services.HandleServices;
import net.proteanit.sql.DbUtils;
import view.MainMenu.MainMenu;


public class Services extends javax.swing.JFrame {
    
    private final ImageIcon deleteup;
    private final ImageIcon deletedwn;
    private final ImageIcon addup;
    private final ImageIcon adddwn;
    private final ImageIcon updateup;
    private final ImageIcon updatedwn;
    private final ImageIcon backout;
    private final ImageIcon backenter;
    private final ImageIcon searchout;
    private final ImageIcon searchenter;

    
    public Services() {
        initComponents();
        deleteup = new ImageIcon(getClass().getResource("/view/Services/delete.png"));
        deletedwn = new ImageIcon(getClass().getResource("/view/Services/deletebtn.png"));
        addup = new ImageIcon(getClass().getResource("/view/Services/add.png"));
        adddwn = new ImageIcon(getClass().getResource("/view/Services/addbtn.png"));
        updateup = new ImageIcon(getClass().getResource("/view/Services/update.png"));
        updatedwn = new ImageIcon(getClass().getResource("/view/Services/updatebtn.png"));
        backout = new ImageIcon(getClass().getResource("/view/Services/backOut.png"));
        backenter = new ImageIcon(getClass().getResource("/view/Services/backEnter.png"));
        searchout = new ImageIcon(getClass().getResource("/view/Services/searchOut.png"));
        searchenter = new ImageIcon(getClass().getResource("/view/Services/searchEnter.png"));
        
        this.setIcon();
        this.pack();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        deleteser = new javax.swing.JLabel();
        addser = new javax.swing.JLabel();
        updateser = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        services = new javax.swing.JTable();
        searchbtn = new javax.swing.JLabel();
        searchsertxt = new javax.swing.JTextField();
        backButtonService = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Services");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/salonimglogo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, 310, 90));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/deletebtn.png"))); // NOI18N
        deleteser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteserMouseExited(evt);
            }
        });
        jPanel3.add(deleteser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 527, -1, -1));

        addser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/addbtn.png"))); // NOI18N
        addser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addser.setMaximumSize(new java.awt.Dimension(150, 51));
        addser.setMinimumSize(new java.awt.Dimension(150, 51));
        addser.setPreferredSize(new java.awt.Dimension(150, 51));
        addser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addserMouseExited(evt);
            }
        });
        jPanel3.add(addser, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 527, -1, -1));

        updateser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/updatebtn.png"))); // NOI18N
        updateser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateserMouseExited(evt);
            }
        });
        jPanel3.add(updateser, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 527, -1, -1));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(1286, 460));

        services.setBackground(new java.awt.Color(204, 204, 204));
        services.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        services.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Services ID", "Service Name", "Duration", "Service Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        services.setFillsViewportHeight(true);
        services.setRowHeight(25);
        services.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(services);
        if (services.getColumnModel().getColumnCount() > 0) {
            services.getColumnModel().getColumn(0).setResizable(false);
            services.getColumnModel().getColumn(1).setResizable(false);
            services.getColumnModel().getColumn(2).setResizable(false);
            services.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1270, 500));

        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/searchOut.png"))); // NOI18N
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 543, 30, 25));

        searchsertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchsertxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchsertxtMouseExited(evt);
            }
        });
        searchsertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchsertxtKeyReleased(evt);
            }
        });
        jPanel3.add(searchsertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 300, 30));

        backButtonService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/backOut.png"))); // NOI18N
        backButtonService.setText("jLabel5");
        backButtonService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButtonService.setPreferredSize(new java.awt.Dimension(150, 51));
        backButtonService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonServiceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonServiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonServiceMouseExited(evt);
            }
        });
        jPanel3.add(backButtonService, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 527, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/Background1.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1326, 585));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1326, 585));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Services/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteserMouseClicked
        int column = 0;     

        HandleServices hs = new HandleServices();       
        
        int row = services.getSelectedRow();

        if(row == -1){
            JOptionPane.showMessageDialog(null,"Please select the service that you need to be delete.","Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        else{          
            
                String serviceID =  services.getValueAt(row, column).toString();
                hs.setServiceID(serviceID);

                try{                   
                   
                    int i = hs.deleteService();
                    if (i != 0) {
                        JOptionPane.showMessageDialog(null, "Service has been deleted successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "service cannot be delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(ClassNotFoundException ex){
                    JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
                } 
                catch(SQLIntegrityConstraintViolationException ex){
                    JOptionPane.showMessageDialog(null, "Service cannot be deleted since service is related to existing appointments and purchaces.", "SQLIntegrityConstraintViolationException", JOptionPane.WARNING_MESSAGE);
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                     
        }

    }//GEN-LAST:event_deleteserMouseClicked

    private void deleteserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteserMouseEntered
        deleteser.setIcon(deleteup);
    }//GEN-LAST:event_deleteserMouseEntered

    private void deleteserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteserMouseExited
        deleteser.setIcon(deletedwn);
    }//GEN-LAST:event_deleteserMouseExited

    private void addserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addserMouseEntered
        addser.setIcon(addup);
    }//GEN-LAST:event_addserMouseEntered

    private void addserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addserMouseExited
        addser.setIcon(adddwn);
    }//GEN-LAST:event_addserMouseExited

    private void updateserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateserMouseClicked

        int row = services.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Please select the service that you need to be update.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String serID = services.getValueAt(row,0).toString();
            UpdateService up = new UpdateService(null,true,serID);
            up.setVisible(true);
        }
        
    }//GEN-LAST:event_updateserMouseClicked

    private void updateserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateserMouseEntered
        updateser.setIcon(updateup);
    }//GEN-LAST:event_updateserMouseEntered

    private void updateserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateserMouseExited
        updateser.setIcon(updatedwn);
    }//GEN-LAST:event_updateserMouseExited

    private void searchsertxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchsertxtMouseEntered
        searchbtn.setIcon(searchenter);
    }//GEN-LAST:event_searchsertxtMouseEntered

    private void searchsertxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchsertxtMouseExited
       searchbtn.setIcon(searchout);
    }//GEN-LAST:event_searchsertxtMouseExited

    private void searchsertxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchsertxtKeyReleased

        HandleServices hs = new HandleServices();
        hs.setSearchkey(searchsertxt.getText());

        try{
            ResultSet rs = hs.searchService();
            services.setModel(DbUtils.resultSetToTableModel(rs));
            
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
        
    }//GEN-LAST:event_searchsertxtKeyReleased

    
    private void backButtonServiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonServiceMouseEntered
       backButtonService.setIcon(backenter);
    }//GEN-LAST:event_backButtonServiceMouseEntered

    private void backButtonServiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonServiceMouseExited
       backButtonService.setIcon(backout);
    }//GEN-LAST:event_backButtonServiceMouseExited

    private void addserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addserMouseClicked
        AddServices addsupp = new AddServices(null,true);
        addsupp.setVisible(true);
    }//GEN-LAST:event_addserMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        displayServicesData();           
    }//GEN-LAST:event_formWindowActivated

    private void backButtonServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonServiceMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backButtonServiceMouseClicked
    
    private void displayServicesData(){
        HandleServices hs = new HandleServices();
        try{
        services.setModel(DbUtils.resultSetToTableModel(hs.display()));
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
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("services.png")));    
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
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addser;
    private javax.swing.JLabel backButtonService;
    private javax.swing.JLabel deleteser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel searchbtn;
    private javax.swing.JTextField searchsertxt;
    private javax.swing.JTable services;
    private javax.swing.JLabel updateser;
    // End of variables declaration//GEN-END:variables
}
