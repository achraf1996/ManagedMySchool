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
public class ZipCode {

        String zipCode,streetName,addition;
   int houseNumber;
    
    public ZipCode(String zipCode,  String streetName,int houseNumber, String addition) {
      this.zipCode = zipCode;
        this.streetName =  streetName;
        this.houseNumber = houseNumber;
        this.addition = addition;
    
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

 

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
        
    public ZipCode(String zipCode,  String streetName,int houseNumber) {
        this.zipCode = zipCode;
        this.streetName =  streetName;
        this.houseNumber = houseNumber;
    }
    public ZipCode(){
        this.zipCode = null;
        this.streetName = null;
        this.houseNumber = 0;
    }
    
}
