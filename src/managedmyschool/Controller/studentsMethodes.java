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
import java.util.Date;
import managedmyschool.Model.Student;
import managedmyschool.Model.ZipCode;

/**
 *
 * @author achrafchennan
 */
public class studentsMethodes {

    Connection conn;
    Statement st;
    public studentsMethodes() {
        this.conn = new SQLMethode().conn;
        st = null;

    }

    public Student getStudent(int studentId) {
        Student student = null;
        String query = "SELECT * FROM STUDENT WHERE id = '" + studentId + "';";

        try {
            this.st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(query);
            int id = 0;
            String firstName = null;
            String lastName = null;
            Date birthDay = null;
            ZipCode zipCode = null;

            while (rs.next()) {
                id = rs.getInt("id");
                firstName = rs.getString("firstName");
                lastName = rs.getString("lastName");
                birthDay = rs.getDate("birthDay");
                //student = new Student(id, firstName, lastName, birthDay, zipCode);
            }
            return student;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return student;
        }
    }

}
