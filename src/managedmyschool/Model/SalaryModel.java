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
public class SalaryModel {
    int amount, day, month, year, teacherId;
    String registerdBy;

    public SalaryModel(int amount, int day, int month, int year, int teacherId, String registerdBy) {
        this.amount = amount;
        this.day = day;
        this.month = month;
        this.year = year;
        this.teacherId = teacherId;
        this.registerdBy = registerdBy;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getRegisterdBy() {
        return registerdBy;
    }

    public void setRegisterdBy(String registerdBy) {
        this.registerdBy = registerdBy;
    }
    
    
    
    
    
}
