/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.Model;

/**
 *
 * @author achrafchennan
 */
public class PaymentModel {
   int shartNumber, studentId, month, year, amount;
   String registerdBy;

    public PaymentModel(int shartNumber, int studentId, int month, int year, int amount, String registerdBy) {
        this.shartNumber = shartNumber;
        this.studentId = studentId;
        this.month = month;
        this.year = year;
        this.amount = amount;
        this.registerdBy = registerdBy;
    }

    public int getShartNumber() {
        return shartNumber;
    }

    public void setShartNumber(int shartNumber) {
        this.shartNumber = shartNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRegisterdBy() {
        return registerdBy;
    }

    public void setRegisterdBy(String registerdBy) {
        this.registerdBy = registerdBy;
    }
    
   
   
}
