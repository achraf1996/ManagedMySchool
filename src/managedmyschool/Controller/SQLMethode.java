package managedmyschool.Controller;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achrafchennan
 */
public class SQLMethode {
    
       Connection conn;

       

    
        public Connection createConnection(){
        
         try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
     String url = "jdbc:mysql://localhost:8889/managedMySchool?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
      conn = DriverManager.getConnection(url, "root", "root");
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
        }
     
        return conn;
    }
}
