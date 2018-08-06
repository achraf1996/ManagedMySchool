/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.Controller;

import java.sql.Connection;

/**
 *
 * @author achrafchennan
 */
public class loginMethodes {
   Connection conn;
   
   public loginMethodes(){
       this.conn = new SQLMethode().conn;
            
   }
    
   private boolean loginUser(String username, String password){
       boolean succesFullLogin = false;
       return succesFullLogin;       
   }
    
    
}
