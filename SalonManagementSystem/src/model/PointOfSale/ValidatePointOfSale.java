/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.PointOfSale;

/**
 *
 * @author Nadee
 */
public class ValidatePointOfSale {
    
        
    
    public boolean validatePrice(String price){     
       if(!price.matches("[0-9.,]+")){
           return false;
       }else{
           return true;
       }
  
   }
    
    public boolean validateNumbers(String reordLevel){
      if(!reordLevel.matches("^([0-9]*,?)*$")){
          return false;
      }else{
          return true;
      }
  
    }
    
    
    
}
