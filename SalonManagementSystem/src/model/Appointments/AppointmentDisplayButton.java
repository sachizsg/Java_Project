/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Appointments;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JButton;
import view.Appointments.ViewAppointmentDetails;
/**
 *
 * @author Samu
 */
public class AppointmentDisplayButton extends JButton {
    
   
    private JButton appointmentButton;
    private final int x;
    private final int y;    
    private final int height;
    private final LinkedList appoButtonDetails;
    
    
    private final String appointmnetID;
    private final String startTime;
    private final String endTime;
    private final String clientName;
    private final String status;
 
    public static int closeOP = 0;
    
        
    
    private String appointmentID(){
        return this.appointmnetID;
    }    
    
    
    public AppointmentDisplayButton(int x,int y,int height,LinkedList appoButtonDetails){
     
        this.x = x;
        this.y = y;
        this.height = height;
        this.appoButtonDetails = appoButtonDetails;
               
        
        this.appointmnetID = this.appoButtonDetails.get(0).toString();
        this.startTime = this.appoButtonDetails.get(1).toString();
        this.endTime = this.appoButtonDetails.get(2).toString();
        this.clientName = this.appoButtonDetails.get(3).toString();
        this.status = this.appoButtonDetails.get(4).toString();      
        
        
    }
    
    public JButton appButton(){
                 
        Color pending = new Color(0,93,74);
        Color completed = new Color(1,70,161);
        Color error = new Color(201,16,22);
                
        String buttonText = "Client Name: "+this.clientName+"\nAppointment Time: "+this.startTime+" - "+this.endTime+"";
        if (this.status.equalsIgnoreCase("Error")) {
            appointmentButton = new JButton("<html>" + buttonText.replaceAll("\\n", "<br>") + "</html>");  
            appointmentButton.setBackground(error);
        }        
        else if (this.status.equalsIgnoreCase("Pending")) {
            appointmentButton = new JButton("<html>" + buttonText.replaceAll("\\n", "<br>") + "</html>"); 
            appointmentButton.setBackground(pending);
        }        
        else{
            appointmentButton = new JButton("<html>" + buttonText.replaceAll("\\n", "<br>") + "</html>");  
            appointmentButton.setBackground(completed);
        }    
        
        this.setAppointmentButtonProperties();

        appointmentButton.addActionListener(new ActionListener()
        {
            private String appointmnetID;
           
            @Override
            public void actionPerformed(ActionEvent e)
            {
                    appointmnetID = appointmentID();                    
                    ViewAppointmentDetails ad = new ViewAppointmentDetails(null, true,appointmnetID);
                    ad.setVisible(true);                       
                    
            }
        });
        
        
        return appointmentButton;
        
    }
 
    
    private void setAppointmentButtonProperties(){
        appointmentButton.setHorizontalTextPosition(JButton.CENTER);
        appointmentButton.setVerticalTextPosition(JButton.CENTER);
        appointmentButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        appointmentButton.setSize(250, this.height);  
        appointmentButton.setLocation(this.x, this.y);
       
        appointmentButton.setForeground(Color.WHITE);
        appointmentButton.setFont(new Font("Arial",Font.BOLD,12));        
        
    }
    
    
    
}
