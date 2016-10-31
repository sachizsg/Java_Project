/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Finance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Finance.HandleFinance;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sachithra
 */
public class EmplpaymentSetting extends javax.swing.JDialog {
    
    private final ImageIcon empcalout;
    private final ImageIcon empcalenter;
    private final ImageIcon allowout;
    private final ImageIcon allowenter;
  
    
    private double tot = 0;   
    
    public static String allowences;
     


    public EmplpaymentSetting(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
                        
       empcalout = new ImageIcon(getClass().getResource("/view/Finance/purcbtn.png"));
       empcalenter = new ImageIcon(getClass().getResource("/view/Finance/purc.png"));
       allowout = new ImageIcon(getClass().getResource("/view/Finance/addallowbtn.png"));
       allowenter = new ImageIcon(getClass().getResource("/view/Finance/addallow.png"));
      
       monthlyPaymentTxt.setEditable(false);
       addAllowanceTxt.setEditable(false);
       addAllowanceTxt.setText(".00");
       totalPayment.setEditable(false);
       
       this.employeeDetails();
       this.getEmployeeSalaryTotal();


    }
    
    private void employeeDetails(){
        
       HandleFinance hf = new HandleFinance();
       
       try{
           ResultSet rs = hf.display();
           EmployeePayment.setModel(DbUtils.resultSetToTableModel(rs));
           
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
    
    private void getEmployeeSalaryTotal(){
        
        for(int i = 0; i < EmployeePayment.getRowCount() ; i++){
            String totl = EmployeePayment.getValueAt(i, 3).toString();
            double serTot = Double.parseDouble(totl); 
            
            tot = tot + serTot;
        }
       
        DecimalFormat df = new DecimalFormat("#.00");
        String totalAmount= df.format(tot);
        monthlyPaymentTxt.setText(totalAmount);
        totalPayment.setText(totalAmount);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeePayment = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        procedcal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalPayment = new javax.swing.JTextField();
        monthlyPaymentTxt = new javax.swing.JTextField();
        addAllowanceTxt = new javax.swing.JTextField();
        addallowance = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculate Employee Payments");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmployeePayment.setBackground(new java.awt.Color(204, 204, 204));
        EmployeePayment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmployeePayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        EmployeePayment.setFillsViewportHeight(true);
        EmployeePayment.setRowHeight(25);
        jScrollPane1.setViewportView(EmployeePayment);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 960, 260));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Payment  ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Calculate Employee Payments");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 280, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/titleGlass.png"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 960, 50));

        procedcal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/purcbtn.png"))); // NOI18N
        procedcal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        procedcal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                procedcalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                procedcalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                procedcalMouseExited(evt);
            }
        });
        jPanel1.add(procedcal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/buttonglassdown.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 505, 960, 80));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Monthly Payment  ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, 30));

        totalPayment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(totalPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 170, 30));

        monthlyPaymentTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(monthlyPaymentTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 170, 30));

        addAllowanceTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(addAllowanceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 170, 30));

        addallowance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/addallowbtn.png"))); // NOI18N
        addallowance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addallowance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addallowanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addallowanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addallowanceMouseExited(evt);
            }
        });
        jPanel1.add(addallowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 160, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/transparentimage.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 450, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Finance/background.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void procedcalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procedcalMouseEntered
        procedcal.setIcon(empcalenter);
    }//GEN-LAST:event_procedcalMouseEntered

    private void procedcalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procedcalMouseExited
        procedcal.setIcon(empcalout);
    }//GEN-LAST:event_procedcalMouseExited

    private void addallowanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addallowanceMouseExited
        addallowance.setIcon(allowout);                
    }//GEN-LAST:event_addallowanceMouseExited

    private void addallowanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addallowanceMouseEntered
        addallowance.setIcon(allowenter);
    }//GEN-LAST:event_addallowanceMouseEntered

    private void addallowanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addallowanceMouseClicked
        
        AddAllowance ad = new AddAllowance(null,true,monthlyPaymentTxt.getText());
        ad.setVisible(true);
        
        addAllowanceTxt.setText(EmplpaymentSetting.allowences);
        
        double bonus = Double.parseDouble(EmplpaymentSetting.allowences);
        double totWithBonus = tot + bonus;
        
        DecimalFormat df = new DecimalFormat("#.00");
        String totPayment= df.format(totWithBonus);
        totalPayment.setText(totPayment);
        
    }//GEN-LAST:event_addallowanceMouseClicked

    private void procedcalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procedcalMouseClicked
               
        HandleFinance hfn = new HandleFinance();
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String currentDate = df.format(d);
        
        hfn.setCurrentDate(currentDate);        
        hfn.setSalary(monthlyPaymentTxt.getText());
        hfn.setBonus(addAllowanceTxt.getText());
        hfn.setTotalSalary(totalPayment.getText());
        
        try {
            
            int i = hfn.addSalary();
                if(i!=0){
                    JOptionPane.showMessageDialog(null, "Employee paymnet has been proceeded successfully.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                }
                else{
                     JOptionPane.showMessageDialog(null, "Employee payment cannot be proceed.", "Error", JOptionPane.ERROR_MESSAGE);
                     this.dispose();
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
       
    }//GEN-LAST:event_procedcalMouseClicked

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
            java.util.logging.Logger.getLogger(EmplpaymentSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmplpaymentSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmplpaymentSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmplpaymentSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmplpaymentSetting dialog = new EmplpaymentSetting(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable EmployeePayment;
    private javax.swing.JTextField addAllowanceTxt;
    private javax.swing.JLabel addallowance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthlyPaymentTxt;
    private javax.swing.JLabel procedcal;
    private javax.swing.JTextField totalPayment;
    // End of variables declaration//GEN-END:variables

    
}

