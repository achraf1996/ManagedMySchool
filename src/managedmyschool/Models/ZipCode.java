/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achrafchennan
 */
public class ZipCode {
    
    
    String zipCode, address, addressNumber, cityName;
  

    public ZipCode(String zipCode, String address, String addressNumber, String cityName){
        this.zipCode = zipCode;
        this.address =  address;
        this.addressNumber = addressNumber;
        this.cityName =  cityName;
   
    }
     public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public String getCityName() {
        return cityName;
    }

    
    
    
}
