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
import java.util.Calendar;
import java.util.Date;
import managedmyschool.Model.Logger;

/**
 *
 * @author achrafchennan
 */
public class LoggerMethodes {

    Connection conn;
    Statement st = null;
    Boolean isSucces = false;

    public LoggerMethodes() {
        SQLMethode sqlMethodes = new SQLMethode();
        this.conn = sqlMethodes.conn;

    }

    public void getLogs(String methode) {

    }

    public String createLogs(Logger logger) {
                int id = 0;
        String query = "INSERT INTO logger (username,methode,input) VALUES (?,?,?);";

        ResultSet rs;

        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            

            stprep.setString(1, logger.getUsername());
            stprep.setString(2, logger.getMethode());
            stprep.setString(3, logger.getInput());

            stprep.executeUpdate();
            rs = stprep.getGeneratedKeys();

            while (rs.next()) {
                id = rs.getInt(1);
            }
            stprep.close();
    

        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het aanmaken van de student, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het aanmaken van de student, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het aanmaken van de student is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het aanmaken van de student, probeer het opnieuw.";
        }
    }
}
