package managedmyschool.Model;


import java.util.Date;


/**
 *
 * @author achrafchennan
 */
public class Person {
    String firstName, lastName;
    Date birthDay;
    int id;
    
    
    public Person(int id,String firstName, String lastName, Date birthDay){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
      
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
    
}
