/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Employee;



/**
 *
 * @author Nadee
 */
public class ValidateEmployee {
    
    public boolean ValidateEmployee_ID(String vid){
        
        if(!vid.matches("\\d{9}[V||v]")){
            return false;
            
        }
        else{
             return true;
        }
        
    }
    
    public boolean ValidateName(String vnm){
         
        if(!vnm.matches("[a-zA-Z]*")){
            return false;
        }
        else{
            return true;
        }
                
    }
    
    public boolean ValidateContact_Number(String vcn){
        
       if(!vcn.matches("\\d{10}")){
            return false;
            
        }
        else{
            return true;
        }
                
    }
    
    public boolean ValidateBasic_Salary(String vbs){
         
       if(!vbs.matches("^[-+]?\\d+(\\.{0,1}(\\d+?))?$"))
             return false;
       
         else
             return true;
                
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
