/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author achrafchennan
 */
public class AanwezigheidModel {
    Date date;
    String className;
    Student student;
    boolean aanwezig;
    
    public AanwezigheidModel(Date date, String className,Student student, boolean aanwezig ){
     this.date = date;
     this.className  = className;
     this.student = student;
     this.aanwezig  = aanwezig;
     
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean isAanwezig() {
        return aanwezig;
    }

    public void setAanwezig(boolean aanwezig) {
        this.aanwezig = aanwezig;
    }
    
   }

