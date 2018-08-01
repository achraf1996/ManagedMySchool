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
public class Aanwezigheid {
    String id;
    boolean isAanwezig;
    
    public Aanwezigheid(String id, boolean isAanwezig){
    this.id = id;
    this.isAanwezig = isAanwezig;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsAanwezig() {
        return isAanwezig;
    }

    public void setIsAanwezig(boolean isAanwezig) {
        this.isAanwezig = isAanwezig;
    }
    
   
}
