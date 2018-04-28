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
public class Student extends Person {
     Lesson StudentLesson;
    
    
    public Student(String firstName, String lastName, Date birthDay, ZipCode zipCode, Lesson lesson ) {
        super(firstName, lastName, birthDay, zipCode);
        this.StudentLesson= lesson;
    }


    
}
