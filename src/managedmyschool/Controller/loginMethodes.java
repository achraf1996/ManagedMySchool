/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import managedmyschool.Model.Lesson;

/**
 *
 * @author achrafchennan
 */
public class loginMethodes {

    Statement st = null;
    Connection conn;
    String query;

    public loginMethodes() {
        this.conn = new SQLMethode().conn;

    }

    private boolean loginUser(String username, String password) {
        boolean succesFullLogin = false;
        query = "SELECT * from LOGIN WHERE username ='" + username.toLowerCase() + "' AND password='" + password.toLowerCase() + "';";
        try {
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(query);
            while (rs.next()) {
                succesFullLogin = true;
            }

        } catch (SQLException ex) {
            succesFullLogin = false;
        }
        return succesFullLogin;
    }
}
