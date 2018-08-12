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
import java.util.ArrayList;
import java.util.Calendar;
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
    Boolean isSucces;

    public studentsMethodes() {
        this.conn = new SQLMethode().conn;
        st = null;
        isSucces = false;

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
                    monthleyPayment = rs.getInt("monthleyPayment");
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

    public String addNewStudent(String firstName, String lastName, Date birthDay, String className,
            String phoneNumberParent, String parentName, String monthleyPayment, int shartNumber
    ) {

        int id = 0;
        String query = "INSERT INTO Student ("
                + "firstName,"
                + "lastName,"
                + "birthDay,"
                + "phoneNumberParent,"
                + "parentName,"
                + "monthleyPayment"
                + "shartNumber ) VALUES ("
                + "?,?,?,?)";

        ResultSet rs;

        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            Calendar now = Calendar.getInstance();
            now.setTime(birthDay);
            now.set(Calendar.HOUR_OF_DAY, 6);
            Date newDate = now.getTime();
            java.sql.Date sqlDate = new java.sql.Date(newDate.getTime());

            stprep.setString(1, firstName);
            stprep.setString(2, lastName);
            stprep.setDate(3, sqlDate);
            stprep.setString(4, phoneNumberParent);
            stprep.setString(5, parentName);
            stprep.setString(6, monthleyPayment);
            stprep.setInt(7, shartNumber);
            stprep.executeUpdate();
            rs = stprep.getGeneratedKeys();

            while (rs.next()) {
                id = rs.getInt(1);
            }
            stprep.close();
            if (id != 0) {
                isSucces = this.addStudentToClass(id, className);
            }

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

    public Boolean addStudentToClass(int studentRow, String className) {

        String query = "INSERT INTO BETWEEN_STUDENTLES ("
                + "studentId,"
                + "lesName ) VALUES ("
                + "?,?)";

        try {
            PreparedStatement stprep = conn.prepareStatement(query);

            stprep.setInt(1, studentRow);
            stprep.setString(2, className);

            int rowCount = stprep.executeUpdate();

            stprep.close();

        } catch (SQLException ex) {
            System.out.println("error");
            return false;

        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return false;

        }

        return true;
    }

    public String changeStudentClass(int id, String className) {
        //change to places
                //remove from students 
        // remove from classtable
        String query = "UPDATE BETWEEN_STUDENTLES set lesName = ? WHERE id = ?";
        
        PreparedStatement stprep = null;
        try {
             stprep = conn.prepareStatement(query);
             stprep.setString(1,className);
             stprep.setInt(1,id);
             stprep.executeUpdate();
            stprep.close();
             return "Het update van de klas is succesvol verlopen";
             
                    } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het update van de klas van de student, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het van de klas van de student, probeer het opnieuw.";
        } 
    }

    public String deleteStudent(int id) {
        //remove from students 
        // remove from classtable
        String query = "DELETE FROM Student WHERE id = ?";
        String queryClassName = "DELETE FROM BETWEEN_STUDENTLES WHERE studentId = ?";
        
        PreparedStatement stprep = null;
        try {
             stprep = conn.prepareStatement(query);
             stprep.setInt(1,id);
             stprep.executeUpdate();
             stprep = conn.prepareStatement(queryClassName);
             stprep.setInt(1,id);
            stprep.executeUpdate();
            stprep.close();
                        return "De student is succesvol verwijderen.";
            
        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het verwijderen van de student, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het verwijderen van de student, probeer het opnieuw.";

        } 

    }

    public String updateStudent(int id, String firstName, String lastName, Date birthDay, String className,
             String phoneNumberParent, String parentName, String monthleyPayment, int shartNumber
    ) {
        String query = "UPDATE Student set firstname = ?, lastName = ?, birthDay = ?, phoneNumberParent = ?, parentName = ?, monthleyPayMent = ?, shartNumber = ? WHERE id =" + id + ";";

        ResultSet rs;

        try {
            PreparedStatement stprep = conn.prepareStatement(query);
            Calendar now = Calendar.getInstance();
            now.setTime(birthDay);
            now.set(Calendar.HOUR_OF_DAY, 6);
            Date newDate = now.getTime();
            java.sql.Date sqlDate = new java.sql.Date(newDate.getTime());

            stprep.setString(1, firstName);
            stprep.setString(2, lastName);
            stprep.setDate(3, sqlDate);
            stprep.setString(4, phoneNumberParent);
            stprep.setString(5, parentName);
            stprep.setString(6, monthleyPayment);
            stprep.setInt(7, shartNumber);
            stprep.executeUpdate();
            rs = stprep.getGeneratedKeys();

            while (rs.next()) {
                id = rs.getInt(1);
            }
            stprep.close();
            isSucces = true;

        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het update van de student, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het update van de student, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het update van de student is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het update van de student, probeer het opnieuw.";
        }

    }
}
