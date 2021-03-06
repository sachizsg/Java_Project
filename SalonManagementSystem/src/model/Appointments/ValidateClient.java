/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Appointments;

/**
 *
 * @author Samu
 */
public class ValidateClient {
    
    public boolean validateName(String name){
        
        if(!name.matches("[a-zA-Z]*")){
            return false;
        }
        else{
            return true;
        }
        
    }
    
    public boolean validateContactNumber(String number)
    {
        if(!number.matches("\\d{10}")){
            return false;
            
        }
        else{
            return true;
        }
              
    }
    
    public String capitalizeFirstLetter(String value){
        if(value.length() == 0){
            return value;
        }
        else{
            String[] char1 = value.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String char2 : char1) {
                sb.append(Character.toUpperCase(char2.charAt(0))).append(char2.substring(1)).append(" ");
            }          
            return sb.toString();
        }
    }
    
   
    
}
