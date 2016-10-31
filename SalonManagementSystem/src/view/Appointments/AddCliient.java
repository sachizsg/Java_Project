/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Appointments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Appointments.HandleNewAppointment;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author Samu
 */
public class AddCliient extends javax.swing.JDialog {

    
    private final ImageIcon clientOut;
    private final ImageIcon clientEnter;
    
    private final ImageIcon doneOut;
    private final ImageIcon doneEnter;
    
    private final ImageIcon cancelOut;
    private final ImageIcon cancelEnter;
    
    private final ImageIcon searchEnter;
    private final ImageIcon searchOut;
    
    private String appointmentempID;
    private Time appointmentTime;
    private String appointmentDate;
    
    
    
    public AddCliient(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        clientOut  = new ImageIcon(getClass().getResource("/view/Appointments/addnewclientOut.png"));  
        clientEnter  = new ImageIcon(getClass().getResource("/view/Appointments/addnewclientEnter.png")); 
        
        doneOut = new ImageIcon(getClass().getResource("/view/Appointments/doneOut.png"));  
        doneEnter = new ImageIcon(getClass().getResource("/view/Appointments/doneEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png"));  
        
        searchEnter = new ImageIcon(getClass().getResource("/view/Appointments/searchEnter.png"));
        searchOut = new ImageIcon(getClass().getResource("/view/Appointments/searchOut.png"));
        
        firstNameText.setEditable(false);
        lastNameText.setEditable(false);
        contactNumberText.setEditable(false);
        firstInDateText.setEditable(false);
        
        
        this.pack();
    }
    
    public AddCliient(java.awt.Frame parent, boolean modal,String empID,Time time,String date) {
        super(parent, modal);
        initComponents();
        
        clientOut  = new ImageIcon(getClass().getResource("/view/Appointments/addnewclientOut.png"));  
        clientEnter  = new ImageIcon(getClass().getResource("/view/Appointments/addnewclientEnter.png")); 
        
        doneOut = new ImageIcon(getClass().getResource("/view/Appointments/doneOut.png"));  
        doneEnter = new ImageIcon(getClass().getResource("/view/Appointments/doneEnter.png"));  
        
        cancelOut = new ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"));  
        cancelEnter = new ImageIcon(getClass().getResource("/view/Appointments/cancelEnter.png"));  
        
        searchEnter = new ImageIcon(getClass().getResource("/view/Appointments/searchEnter.png"));
        searchOut = new ImageIcon(getClass().getResource("/view/Appointments/searchOut.png"));
        
        firstNameText.setEditable(false);
        lastNameText.setEditable(false);
        contactNumberText.setEditable(false);
        firstInDateText.setEditable(false);
        
        this.appointmentempID = empID;
        this.appointmentTime = time;
        this.appointmentDate = date;        
       
        this.pack();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        contactNumberLabel = new javax.swing.JLabel();
        firstInDateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        clientSearchText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        firstInDateText = new javax.swing.JTextField();
        contactNumberText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectClientTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        doneLabel = new javax.swing.JLabel();
        clientAddLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstNameLabel.setBackground(new java.awt.Color(51, 0, 51));
        firstNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        firstNameLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 100, 30));

        lastNameLabel.setBackground(new java.awt.Color(51, 0, 51));
        lastNameLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");
        lastNameLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, 30));

        contactNumberLabel.setBackground(new java.awt.Color(51, 0, 51));
        contactNumberLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contactNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactNumberLabel.setText("Contact Number");
        contactNumberLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(contactNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 150, 30));

        firstInDateLabel.setBackground(new java.awt.Color(51, 0, 51));
        firstInDateLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstInDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstInDateLabel.setText("First In Date");
        firstInDateLabel.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(firstInDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 130, 30));

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Client");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 35));

        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/searchOut.png"))); // NOI18N
        searchLabel.setIconTextGap(0);
        jPanel1.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 83, 25, 24));

        clientSearchText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clientSearchText.setMargin(new java.awt.Insets(0, 0, 0, 0));
        clientSearchText.setPreferredSize(new java.awt.Dimension(200, 30));
        clientSearchText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientSearchTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientSearchTextMouseExited(evt);
            }
        });
        clientSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clientSearchTextKeyReleased(evt);
            }
        });
        jPanel1.add(clientSearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 30));

        firstNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstNameText.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(firstNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 200, 30));

        lastNameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameText.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(lastNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 200, 30));

        firstInDateText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        firstInDateText.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(firstInDateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 200, 30));

        contactNumberText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        contactNumberText.setPreferredSize(new java.awt.Dimension(0, 30));
        jPanel1.add(contactNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 200, 30));

        selectClientTable.setBackground(new java.awt.Color(204, 204, 204));
        selectClientTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selectClientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Client Name"
            }
        ));
        selectClientTable.setFillsViewportHeight(true);
        selectClientTable.setRowHeight(25);
        selectClientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectClientTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(selectClientTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 128, 230, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/titleGlass.png"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 50));

        doneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/doneOut.png"))); // NOI18N
        doneLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doneLabel.setIconTextGap(0);
        doneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doneLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doneLabelMouseExited(evt);
            }
        });
        jPanel1.add(doneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 150, 50));

        clientAddLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/addnewclientOut.png"))); // NOI18N
        clientAddLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientAddLabel.setIconTextGap(0);
        clientAddLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientAddLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientAddLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientAddLabelMouseExited(evt);
            }
        });
        jPanel1.add(clientAddLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 150, 50));

        cancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/cancelOut.png"))); // NOI18N
        cancelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelLabel.setIconTextGap(0);
        cancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelLabelMouseExited(evt);
            }
        });
        jPanel1.add(cancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 150, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/buttonGlass.png"))); // NOI18N
        jLabel5.setIconTextGap(0);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 540, 75));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Appointments/backgroundsmall.jpg"))); // NOI18N
        jLabel6.setIconTextGap(0);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clientAddLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientAddLabelMouseEntered
       clientAddLabel.setIcon(clientEnter);
    }//GEN-LAST:event_clientAddLabelMouseEntered

    private void clientAddLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientAddLabelMouseExited
       clientAddLabel.setIcon(clientOut);
    }//GEN-LAST:event_clientAddLabelMouseExited

    private void doneLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseEntered
       doneLabel.setIcon(doneEnter);        
    }//GEN-LAST:event_doneLabelMouseEntered

    private void doneLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseExited
       doneLabel.setIcon(doneOut);        
    }//GEN-LAST:event_doneLabelMouseExited

    private void cancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseEntered
       cancelLabel.setIcon(cancelEnter);
    }//GEN-LAST:event_cancelLabelMouseEntered

    private void cancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseExited
       cancelLabel.setIcon(cancelOut);
    }//GEN-LAST:event_cancelLabelMouseExited

    private void doneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseClicked
        
        int selectedRow = selectClientTable.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select client for the appointment.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            String clientName = selectClientTable.getValueAt(selectedRow, 0).toString();        
            HandleNewAppointment hna = new HandleNewAppointment();
            hna.setClientFullName(clientName);
            
            try{
                ResultSet rs = hna.viewClientDetailsForAppointment();
                if (rs.next()) {                
                    String clientID = rs.getString("Client_ID");
                    
                    LinkedList appointmentDetails = new LinkedList();
                    
                    appointmentDetails.add(this.appointmentempID);
                    appointmentDetails.add(this.appointmentTime);
                    appointmentDetails.add(this.appointmentDate);                    
                    appointmentDetails.add(clientID);
                   
                    
                    AddService as = new AddService(null, true,appointmentDetails);
                    this.dispose();
                    as.setVisible(true);
                    
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Cannot find client details.", "Error", JOptionPane.ERROR_MESSAGE);
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
        
        
        
        
    }//GEN-LAST:event_doneLabelMouseClicked

    private void cancelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelLabelMouseClicked

    private void clientAddLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientAddLabelMouseClicked
       
        firstNameText.setText(null);
        lastNameText.setText(null);
        contactNumberText.setText(null);
        firstInDateText.setText(null);
        
        AddNewClient anc = new AddNewClient(null, true);
        anc.setVisible(true);
        
    }//GEN-LAST:event_clientAddLabelMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        HandleNewAppointment anp = new HandleNewAppointment();
        
        try{
            ResultSet rs = anp.viewClientNamesForAppointment();
            selectClientTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        
    }//GEN-LAST:event_formWindowActivated

    private void clientSearchTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientSearchTextMouseEntered
        searchLabel.setIcon(searchEnter);
    }//GEN-LAST:event_clientSearchTextMouseEntered

    private void clientSearchTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientSearchTextMouseExited
        searchLabel.setIcon(searchOut);
    }//GEN-LAST:event_clientSearchTextMouseExited

    private void clientSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientSearchTextKeyReleased

        HandleNewAppointment hna = new HandleNewAppointment();
        
        firstNameText.setText(null);
        lastNameText.setText(null);
        contactNumberText.setText(null);
        firstInDateText.setText(null);
        
        hna.setClientSearchKey(clientSearchText.getText());
        
        try{
            ResultSet rs = hna.searchClientForAppointment();
            selectClientTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        

    }//GEN-LAST:event_clientSearchTextKeyReleased

    private void selectClientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectClientTableMouseClicked
        
        int selectedRow = selectClientTable.getSelectedRow();
        
        String clientName = selectClientTable.getValueAt(selectedRow, 0).toString();
        
        HandleNewAppointment hna = new HandleNewAppointment();
        hna.setClientFullName(clientName);
        
        try{
            ResultSet rs = hna.viewClientDetailsForAppointment();
            if (rs.next()) {                 
                firstNameText.setText(rs.getString("First_Name"));
                lastNameText.setText(rs.getString("Last_Name"));
                contactNumberText.setText(rs.getString("Contact_Number"));                
                firstInDateText.setText(rs.getString("First_In_Date"));
            }
            else{
                JOptionPane.showMessageDialog(null, "Cannot find client details.", "Error", JOptionPane.ERROR_MESSAGE);
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
        
        
    }//GEN-LAST:event_selectClientTableMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(AddCliient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCliient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCliient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCliient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCliient dialog = new AddCliient(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JLabel clientAddLabel;
    private javax.swing.JTextField clientSearchText;
    private javax.swing.JLabel contactNumberLabel;
    private javax.swing.JTextField contactNumberText;
    private javax.swing.JLabel doneLabel;
    private javax.swing.JLabel firstInDateLabel;
    private javax.swing.JTextField firstInDateText;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTable selectClientTable;
    // End of variables declaration//GEN-END:variables
}
