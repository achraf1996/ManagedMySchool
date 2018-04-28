package managedmyschool.Model;


import java.util.Date;


/**
 *
 * @author achrafchennan
 */
public class Person {
    String firstName, lastName;
    ZipCode zipCode;
    Date birthDay;
    
    
    public Person(String firstName, String lastName, Date birthDay, ZipCode zipCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.zipCode = zipCode;
      
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

    public ZipCode getZipCode() {
        return zipCode;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    
}
