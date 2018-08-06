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
     
    String phoneNumberParent, parentName;
    int shartNumber, monthleyPayment;
    
    
    public Student(int id, String firstName, String lastName, Date birthDay,
            String phoneNumberParent, int shartNumber, int monthleyPayment, String parentName ) {
        super(id, firstName, lastName, birthDay);
        this.phoneNumberParent = phoneNumberParent;
        this.shartNumber = shartNumber;
        this.monthleyPayment = monthleyPayment;
        this.parentName  = parentName;
    }

    public String getPhoneNumberParent() {
        return phoneNumberParent;
    }

    public void setPhoneNumberParent(String phoneNumberParent) {
        this.phoneNumberParent = phoneNumberParent;
    }

    public int getShartNumber() {
        return shartNumber;
    }

    public void setShartNumber(int shartNumber) {
        this.shartNumber = shartNumber;
    }

    public int getMonthleyPayment() {
        return monthleyPayment;
    }

    public void setMonthleyPayment(int monthleyPayment) {
        this.monthleyPayment = monthleyPayment;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
    
    


    
}
