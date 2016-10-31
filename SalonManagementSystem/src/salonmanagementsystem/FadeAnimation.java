/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salonmanagementsystem;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 *
 * @author Samu
 */
public class FadeAnimation extends JPanel implements ActionListener{
    
    private final Image image1;
    private final Image image2;
    private final Image image3;
    private final Image image4;
    

    
    private int index;
    
    private Timer timer;
    private float alpha;
    double w = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    
    
    public FadeAnimation(){
        
        image1 = new ImageIcon(getClass().getResource("/view/MainMenu/img1.jpg")).getImage();
        image2 = new ImageIcon(getClass().getResource("/view/MainMenu/img2.jpg")).getImage();
        image3 = new ImageIcon(getClass().getResource("/view/MainMenu/img3.jpg")).getImage();
        image4 = new ImageIcon(getClass().getResource("/view/MainMenu/img4.jpg")).getImage();
        
        
     
    }
    
    public void paint(int index){
       

        
        this.index = index;
        this.alpha = 1;
        timer = new Timer(50,this);
        timer.start();
        
       
        
    }
    
    @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            
            switch(index) {
        
                case 1 : 
                         g2d.drawImage(image2,0,0,getWidth(),getHeight(),null);
                         g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
                         g2d.drawImage(image1,0,0,getWidth(),getHeight(),null); 
                         
                         break; 
                case 2 :                          
                         g2d.drawImage(image3,0,0,getWidth(),getHeight(),null);
                         g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
                         g2d.drawImage(image2,0,0,getWidth(),getHeight(),null);
                        
                         break; 
                    
                case 3 :                          
                         g2d.drawImage(image4,0,0,getWidth(),getHeight(),null);
                         g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
                         g2d.drawImage(image3,0,0,getWidth(),getHeight(),null);
                      
                         break; 
                    
                case 4 :                          
                         g2d.drawImage(image1,0,0,getWidth(),getHeight(),null);
                         g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
                         g2d.drawImage(image4,0,0,getWidth(),getHeight(),null);
                         
                         break;     
                default: 
                         g.drawImage(image1,0,0,getWidth(),getHeight(),null);
                       
                         
           
            }
            
            
                     
           
        }

    @Override
    public void actionPerformed(ActionEvent e) {
                      
        alpha += -0.1f;
        if (alpha <= 0) {
        alpha = 0;
        timer.stop();
        }
        repaint();      
         
    }
    
}
