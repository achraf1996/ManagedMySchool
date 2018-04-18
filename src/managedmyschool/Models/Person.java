
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
}
