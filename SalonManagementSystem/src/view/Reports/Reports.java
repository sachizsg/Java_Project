/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Reports;

import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import model.Reports.HandleIncomeReport;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import view.MainMenu.MainMenu;

/**
 *
 * @author Samu
 */
public class Reports extends javax.swing.JFrame {
   
 
   
    private final ImageIcon backout;
    private final ImageIcon backenter;
    private final ImageIcon dailyout;
    private final ImageIcon dailyenter;
    private final ImageIcon monthlyout;
    private final ImageIcon monthlyenter;
    
    
    
    public static String dailyDate;
    
    public static String startDate;
    public static String endDate;
    
    
    public Reports() {
        initComponents();
                
        backout = new ImageIcon(getClass().getResource("/view/Reports/backOut.png"));
        backenter = new ImageIcon(getClass().getResource("/view/Reports/backEnter.png"));
        dailyout = new ImageIcon(getClass().getResource("/view/Reports/incomDailyOut.png"));
        dailyenter = new ImageIcon(getClass().getResource("/view/Reports/incomDailyEnter.png"));
        monthlyout = new ImageIcon(getClass().getResource("/view/Reports/incomMonthlyOut.png"));
        monthlyenter = new ImageIcon(getClass().getResource("/view/Reports/incomMonthlyEnter.png"));
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String currentDate = dateFormat.format(date);
        
        IncomeReportDaily(currentDate);
        
        
        
        this.setIcon();
        
        this.pack();
        
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
    }

    public void IncomeReportDaily(String date)
    {
        HandleIncomeReport hir = new HandleIncomeReport();
        hir.setReportSource("C:\\Salon Management System\\SalonManagementSystem\\Reports\\Income Report\\IncomeReport.jrxml");
        hir.setDate(date);
        
        JasperPrint jasperPrint = hir.dailyReport();
        
        JRViewer jRViewer = new JRViewer(jasperPrint);
        jRViewer.setZoomRatio((float) 0.75);
            
        jTabbedPane1.addTab("Income Report - "+date, jRViewer);  
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount()-1);
   
    }
    
    public void IncomeReportMonthly(String sDate,String eDate)
    {
        HandleIncomeReport hir = new HandleIncomeReport();
        hir.setReportSource("C:\\Salon Management System\\SalonManagementSystem\\Reports\\Income Report\\IncomeReportMonthly.jrxml");
        hir.setStartDate(sDate);
        hir.setEndDate(eDate);
        
        JasperPrint jasperPrint = hir.monthlyReport();
        
        JRViewer jRViewer = new JRViewer(jasperPrint);
        jRViewer.setZoomRatio((float) 0.75);
            
        jTabbedPane1.addTab("Income Report - Monthly", jRViewer);  
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount()-1);
   
    }
    
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        monthlyReport = new javax.swing.JLabel();
        dailyReport = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reports");
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 890, 650));

        jLabel3.setBackground(new java.awt.Color(102, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Reports/Background1.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 670));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 20, 910, 670));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        monthlyReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Reports/incomMonthlyOut.png"))); // NOI18N
        monthlyReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        monthlyReport.setIconTextGap(0);
        monthlyReport.setPreferredSize(new java.awt.Dimension(350, 50));
        monthlyReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthlyReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                monthlyReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                monthlyReportMouseExited(evt);
            }
        });
        jPanel2.add(monthlyReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 350, 50));

        dailyReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Reports/incomDailyOut.png"))); // NOI18N
        dailyReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dailyReport.setIconTextGap(0);
        dailyReport.setPreferredSize(new java.awt.Dimension(350, 50));
        dailyReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dailyReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dailyReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dailyReportMouseExited(evt);
            }
        });
        jPanel2.add(dailyReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 350, 50));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Reports/backOut.png"))); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setIconTextGap(0);
        backButton.setPreferredSize(new java.awt.Dimension(150, 51));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Reports/Background1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 415, 550));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 415, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Reports/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        MainMenu mm = new MainMenu();
        this.dispose();
        mm.setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setIcon(backenter);
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backButton.setIcon(backout);
    }//GEN-LAST:event_backButtonMouseExited

    private void dailyReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dailyReportMouseClicked
        
        DailyReport dr = new DailyReport(this, true);
        dr.setVisible(true);
        
        int currentIndex = jTabbedPane1.getSelectedIndex();
        jTabbedPane1.remove(currentIndex); 
        
        IncomeReportDaily(Reports.dailyDate);
        
        
    }//GEN-LAST:event_dailyReportMouseClicked

    private void dailyReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dailyReportMouseEntered
        dailyReport.setIcon(dailyenter);
    }//GEN-LAST:event_dailyReportMouseEntered

    private void dailyReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dailyReportMouseExited
        dailyReport.setIcon(dailyout);
    }//GEN-LAST:event_dailyReportMouseExited

    private void monthlyReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthlyReportMouseClicked
        
        MonthlyReport mr = new MonthlyReport(this, true);
        mr.setVisible(true);
        
        int currentIndex = jTabbedPane1.getSelectedIndex();
        jTabbedPane1.remove(currentIndex); 
        
       
        IncomeReportMonthly(Reports.startDate,Reports.endDate);
        
        
    }//GEN-LAST:event_monthlyReportMouseClicked

    private void monthlyReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthlyReportMouseEntered
        monthlyReport.setIcon(monthlyenter);
    }//GEN-LAST:event_monthlyReportMouseEntered

    private void monthlyReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthlyReportMouseExited
        monthlyReport.setIcon(monthlyout);
    }//GEN-LAST:event_monthlyReportMouseExited

    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("reports.png")));
    
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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel dailyReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel monthlyReport;
    // End of variables declaration//GEN-END:variables
}
