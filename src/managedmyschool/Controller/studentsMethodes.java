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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

    public List<Student> getStudentsFromClass(String lesName) {

        List<Student> studentsList = new ArrayList<Student>();

        String query = "SELECT * FROM BETWEEN_STUDENTLES WHERE lesName = '" + lesName + "';";

        List<String> studenstIds = new ArrayList<String>();

        try {
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(query);
            while (rs.next()) {
                studenstIds.add(rs.getString("studentId"));

            }
            int id, monthleyPayment, shartNumber = 0;
            String firstName, lastName, phoneNumberParent, parentName = null;
            Date birthDay = null;

            for (int i = 0; i < studenstIds.size(); i++) {
                query = "SELECT * FROM STUDENT WHERE id = '" + studenstIds.get(i) + "';";
                st = conn.createStatement();

                rs = st.executeQuery(query);
                while (rs.next()) {
                    //modify db to fit the purpose
                    id = rs.getInt("id");
                    firstName = rs.getString("firstName");
                    lastName = rs.getString("lastName");
                    birthDay = rs.getDate("birthDay");
                    phoneNumberParent = rs.getString("phoneNumberParent");
                    parentName = rs.getString("parentName");
                    monthleyPayment = rs.getInt("monthleyPayMent");
                    shartNumber = rs.getInt("shartNumber");

                    studentsList.add(new Student(id, firstName, lastName, birthDay, phoneNumberParent,
                             shartNumber, monthleyPayment, parentName));
                }
            }
            conn.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return studentsList;
    }

    public List<Student> getAllStudents() {

        List<Student> studentsList = new ArrayList<Student>();

        try {

            int id, monthleyPayment, shartNumber = 0;
            String firstName, lastName, phoneNumberParent, parentName = null;
            Date birthDay = null;
            ResultSet rs;

            String query = "SELECT * FROM STUDENT;";
            st = conn.createStatement();

            rs = st.executeQuery(query);
            while (rs.next()) {
                //modify db to fit the purpose
                id = rs.getInt("id");
                firstName = rs.getString("firstName");
                lastName = rs.getString("lastName");
                birthDay = rs.getDate("birthDay");
                phoneNumberParent = rs.getString("phoneNumberParent");
                parentName = rs.getString("parentName");
                monthleyPayment = rs.getInt("monthleyPayMent");
                shartNumber = rs.getInt("shartNumber");

                studentsList.add(new Student(id, firstName, lastName, birthDay, phoneNumberParent,
                         shartNumber, monthleyPayment, parentName));
            }

            conn.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return studentsList;
    }
    
    
    
}
