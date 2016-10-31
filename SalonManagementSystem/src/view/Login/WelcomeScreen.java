/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Samu
 */
public class WelcomeScreen extends javax.swing.JDialog {

    private Timer t = null;
    private int count = 0;
    
    
    public WelcomeScreen(java.awt.Frame parent, boolean modal)throws UnsupportedLookAndFeelException, ParseException  {
        super(parent, modal);
        initComponents();
        
        this.pack();
        
        t = new Timer(100, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             count++;
             ProgressBar.setValue(count);
             if(ProgressBar.getValue() < 100){
                ProgressBar.setValue(ProgressBar.getValue() + 1);
            }
             
             if(ProgressBar.getValue() == 100){
                 try {
                     setVisible(false);
                    
                         SalonLogin log = new SalonLogin();
                         log.setVisible(true);
                         t.stop();
                         

                
                 } catch (Exception ex) {
                     JOptionPane.showMessageDialog(null, "Can't properly load this software.", "Error", JOptionPane.ERROR_MESSAGE);
                 }
             
                
            }
            }
        });
       t.start();
        
        
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();

        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(640, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login/small-load.gif"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 420));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 420));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -40, 750, 490));

        ProgressBar.setStringPainted(true);
        getContentPane().add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 380, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WelcomeScreen dialog = new WelcomeScreen(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
