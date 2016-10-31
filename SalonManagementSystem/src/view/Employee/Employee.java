 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Employee;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Employee.HandleEmployee;
import net.proteanit.sql.DbUtils;
import view.MainMenu.MainMenu;


public class Employee extends javax.swing.JFrame {

    private final ImageIcon addEnter;
    private final ImageIcon addOut;
    
    private final ImageIcon updateEnter;
    private final ImageIcon updateOut;
    
    private final ImageIcon deleteEnter;
    private final ImageIcon deleteOut;
    
    private final ImageIcon searchEnter;
    private final ImageIcon searchOut;
    
    private final ImageIcon backout;
    private final ImageIcon backenter;
   
    
    public Employee() {
        initComponents();
        
        addEnter = new ImageIcon(getClass().getResource("/view/Employee/addEnter.png"));
        addOut = new ImageIcon(getClass().getResource("/view/Employee/addOut.png"));
        
        updateEnter = new ImageIcon(getClass().getResource("/view/Employee/updateEnter.png"));
        updateOut = new ImageIcon(getClass().getResource("/view/Employee/updateOut.png"));
        
        deleteEnter = new ImageIcon(getClass().getResource("/view/Employee/deleteEnter.png"));
        deleteOut = new ImageIcon(getClass().getResource("/view/Employee/deleteOut.png"));
        
        searchEnter = new ImageIcon(getClass().getResource("/view/Employee/searchEnter.png"));
        searchOut = new ImageIcon(getClass().getResource("/view/Employee/searchOut.png"));
        
        backout = new ImageIcon(getClass().getResource("/view/Inventory/backOut.png"));
        backenter = new ImageIcon(getClass().getResource("/view/Inventory/backEnter.png"));
        
        this.setIcon();
        this.pack(); 
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("employees.png")));
    }
    
    private void displayData(){
        try{
          HandleEmployee hnemp = new HandleEmployee();
          EmployeeTable.setModel(DbUtils.resultSetToTableModel(hnemp.display()));
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        backbtn = new javax.swing.JLabel();
        addemployee = new javax.swing.JLabel();
        updateemployee = new javax.swing.JLabel();
        deleteemployee = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1286, 460));

        EmployeeTable.setBackground(new java.awt.Color(204, 204, 204));
        EmployeeTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Contact Number"
            }
        ));
        EmployeeTable.setFillsViewportHeight(true);
        EmployeeTable.setRowHeight(25);
        jScrollPane1.setViewportView(EmployeeTable);
        if (EmployeeTable.getColumnModel().getColumnCount() > 0) {
            EmployeeTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1270, 500));

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Inventory/backOut.png"))); // NOI18N
        backbtn.setText("jLabel5");
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.setPreferredSize(new java.awt.Dimension(150, 51));
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backbtnMouseExited(evt);
            }
        });
        jPanel2.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 527, -1, -1));

        addemployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/addOut.png"))); // NOI18N
        addemployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addemployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addemployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addemployeeMouseExited(evt);
            }
        });
        jPanel2.add(addemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 527, 150, 50));

        updateemployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/updateOut.png"))); // NOI18N
        updateemployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateemployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateemployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateemployeeMouseExited(evt);
            }
        });
        jPanel2.add(updateemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 527, 150, 50));

        deleteemployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/deleteOut.png"))); // NOI18N
        deleteemployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteemployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteemployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteemployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteemployeeMouseExited(evt);
            }
        });
        jPanel2.add(deleteemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 527, 150, 50));

        searchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/searchOut.png"))); // NOI18N
        searchLabel.setIconTextGap(0);
        jPanel2.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 543, 30, 25));

        searchText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchText.setMargin(new java.awt.Insets(0, 0, 0, 0));
        searchText.setPreferredSize(new java.awt.Dimension(300, 28));
        searchText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchTextMouseExited(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });
        jPanel2.add(searchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, 300, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/Background1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1326, 585));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1326, 585));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/salonimglogo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, 310, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Employee/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addemployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addemployeeMouseEntered
        addemployee.setIcon(addEnter);
    }//GEN-LAST:event_addemployeeMouseEntered

    private void addemployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addemployeeMouseExited
         addemployee.setIcon(addOut);
    }//GEN-LAST:event_addemployeeMouseExited

    private void updateemployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateemployeeMouseEntered
        updateemployee.setIcon(updateEnter);
    }//GEN-LAST:event_updateemployeeMouseEntered

    private void updateemployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateemployeeMouseExited
        updateemployee.setIcon(updateOut);
    }//GEN-LAST:event_updateemployeeMouseExited

    private void deleteemployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteemployeeMouseEntered
        deleteemployee.setIcon(deleteEnter);
    }//GEN-LAST:event_deleteemployeeMouseEntered

    private void deleteemployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteemployeeMouseExited
        deleteemployee.setIcon(deleteOut);
    }//GEN-LAST:event_deleteemployeeMouseExited

    private void addemployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addemployeeMouseClicked
        
        AddEmployee ae = new AddEmployee(null, true);
        ae.setVisible(true);
        
    }//GEN-LAST:event_addemployeeMouseClicked

    private void updateemployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateemployeeMouseClicked
        
        int row = EmployeeTable.getSelectedRow();

        if(row == -1){
             JOptionPane.showMessageDialog(null, "Please select the employee that you need to be update", "Message", JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            String employeeID = EmployeeTable.getValueAt(row,0).toString();
            UpdateEmployee ue = new UpdateEmployee(null, true,employeeID);
            ue.setVisible(true);
        }
        
    }//GEN-LAST:event_updateemployeeMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.displayData();        
    }//GEN-LAST:event_formWindowActivated

    private void deleteemployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteemployeeMouseClicked
        int column = 0;        
        
        
        int row = EmployeeTable.getSelectedRow();

        if(row == -1)
        {
            JOptionPane.showMessageDialog(null, "Please select the employee that you need to be delete.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }

        else
        {                
                    String Employee_ID =EmployeeTable.getValueAt(row, column).toString();  
                    HandleEmployee he = new HandleEmployee();                   
                    he.setEmployee_ID( Employee_ID);                    
                    try
                    {
                        int i = he.deleteEmployee();
                        if (i != 0) {
                            JOptionPane.showMessageDialog(null, "Employee has been deleted successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Employee cannot be delete.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                          
                    }                    
                    catch(ClassNotFoundException ex){
                        JOptionPane.showMessageDialog(null, "Database cannot be found.", "ClassNotFoundException", JOptionPane.ERROR_MESSAGE);
                    } 
                    catch(SQLIntegrityConstraintViolationException ex){
                        JOptionPane.showMessageDialog(null, "Employee cannot be deleted since employee is related to existing appointments.", "SQLIntegrityConstraintViolationException", JOptionPane.WARNING_MESSAGE);
                    }
                    catch(SQLException ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                                         
	}    
            
    }//GEN-LAST:event_deleteemployeeMouseClicked

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        HandleEmployee hemp = new HandleEmployee();
        
        hemp.setSearchKey(searchText.getText());
        try{
            
            ResultSet rs = hemp.searchEmployee();
            
            EmployeeTable.setModel(DbUtils.resultSetToTableModel(rs));
        
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
        
    }//GEN-LAST:event_searchTextKeyReleased

    private void backbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseEntered
        backbtn.setIcon(backenter);
    }//GEN-LAST:event_backbtnMouseEntered

    private void backbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseExited
        backbtn.setIcon(backout);
    }//GEN-LAST:event_backbtnMouseExited

    private void searchTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextMouseEntered
        searchLabel.setIcon(searchEnter);
    }//GEN-LAST:event_searchTextMouseEntered

    private void searchTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextMouseExited
        searchLabel.setIcon(searchOut);
    }//GEN-LAST:event_searchTextMouseExited

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backbtnMouseClicked

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JLabel addemployee;
    private javax.swing.JLabel backbtn;
    private javax.swing.JLabel deleteemployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel updateemployee;
    // End of variables declaration//GEN-END:variables
 
   

}


