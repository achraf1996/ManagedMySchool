package managedmyschool.Controller;

import java.sql.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achrafchennan
 */
public class salaryMethodes {
        Connection conn;
    
    public salaryMethodes(){
        this.conn = new SQLMethode().conn;
    }
}
