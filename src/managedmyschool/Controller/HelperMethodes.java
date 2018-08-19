package managedmyschool.Controller;

import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achrafchennan
 */
public class helperMethodes {

    public helperMethodes() {
    }
 
    
    public java.sql.Date getDate(Date birthDay){
                Calendar now = Calendar.getInstance();
            now.setTime(birthDay);
            now.set(Calendar.HOUR_OF_DAY, 6);
            Date newDate = now.getTime();
            return new java.sql.Date(newDate.getTime());
            
    }
    
}
