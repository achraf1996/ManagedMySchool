/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import managedmyschool.Model.Lesson;

/**
 *
 * @author achrafchennan
 */
public class LoginMethodes {

    Statement st = null;
    PreparedStatement stprep = null;
    Connection conn;
    String query;

    public LoginMethodes() {
        this.conn = new SQLMethode().conn;

    }

    public boolean loginUser(String username, String password) {
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

    public void setPassword(String username, String password) {

        String query = "UPDATE BETWEEN_STUDENTLES set lesName = ? WHERE id = ?";

        query = "UPDATE LOGIN set password = ?  WHERE username = ? ";
        try {
            stprep = conn.prepareStatement(query);
            stprep.setString(1, password);
            stprep.setString(2, username);
            stprep.executeUpdate();
            conn.close();

        } catch (SQLException ex) {
            ex.getMessage();
        }

    }
}
