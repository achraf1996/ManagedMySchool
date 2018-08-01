package managedmyschool.Model;


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
public class Teacher extends Person {
    
    
    
    public Teacher(int id, String firstName, String lastName, Date birthDay, ZipCode zipCode) {
        super(id, firstName, lastName, birthDay, zipCode);
    }
    
}
