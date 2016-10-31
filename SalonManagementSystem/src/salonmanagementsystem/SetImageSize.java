/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salonmanagementsystem;


import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Samu
 */
public class SetImageSize {
    
    BufferedImage img = null;
    
    public ImageIcon  addImageToLabel(BufferedImage img,int width,int height){
        
        
        this.img = img;
        
        Image dimg = img.getScaledInstance(width, height,Image.SCALE_SMOOTH);
        
        ImageIcon imageIcon = new ImageIcon(dimg);
        
        return imageIcon;
        
    }
    
    
    
}
