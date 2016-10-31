/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salonmanagementsystem;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.Login.WelcomeScreen;

/**
 *
 * @author Samu
 */
public class SalonManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            WelcomeScreen w = new WelcomeScreen(null, true);
            w.setVisible(true);
            break;
            }
            
             
        }
        } catch (UnsupportedLookAndFeelException e) {
             // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        } catch (ParseException ex) {
            Logger.getLogger(SalonManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
