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
public class paymentMethodes {
            Connection conn;
    
    public paymentMethodes(){
        this.conn = new SQLMethode().conn;
    }
}
