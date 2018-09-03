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
import managedmyschool.Model.Teacher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author achrafchennan
 */
public class TeachersMethodes {

    Connection conn;
    Boolean isSucces;
    Statement st;

    public TeachersMethodes() {
        SQLMethode sqlMethodes = new SQLMethode();
        this.conn = sqlMethodes.conn;
        isSucces = false;
        st = null;
    }



    public String addTeacherToClass(String className, int teacherId) {

        String query = "INSERT INTO BETWEEN_TEACHERLES ("
                + "teacherId,"
                + "className) VALUES (?,?)";

        ResultSet rs;

        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query);

            stprep.setInt(1, teacherId);
            stprep.setString(2, className);
            stprep.executeUpdate();
            isSucces = true;

        } catch (SQLException ex) {
        return "Er is iets mis gegaan bij het toevoegen van de leraar, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het toevoegen van de leraar, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het toevoegen van de leraar is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het toevoegen van de leraar, probeer het opnieuw.";
        }

    }

    public Teacher getTeacher(int teacherId) {
        Teacher teacher = null;
        String query = "SELECT * FROM TEACHER WHERE id = '" + teacherId + "';";

        try {
            this.st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(query);
            int id, salary = 0;
            String firstName, lastName, phoneNumber = null;

            Date birthDay = null;

            while (rs.next()) {
                id = rs.getInt("id");
                firstName = rs.getString("firstName");
                lastName = rs.getString("lastName");
                birthDay = rs.getDate("birthDay");
                phoneNumber = rs.getString("phoneNumber");
                salary = rs.getInt("salary");
                teacher = new Teacher(id, firstName, lastName, birthDay, phoneNumber, salary);
            }
            return teacher;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return teacher;
        }
    }

    public List<Teacher> getTeachers() {

        List<Teacher> teachersList = new ArrayList<Teacher>();

        try {

            int id, salary = 0;
            String firstName, lastName, phoneNumber = null;
            Date birthDay = null;
            ResultSet rs;

            String query = "SELECT * FROM TEACHER;";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                //modify db to fit the purpose
                id = rs.getInt("id");
                firstName = rs.getString("firstName");
                lastName = rs.getString("lastName");
                birthDay = rs.getDate("birthDay");
                phoneNumber = rs.getString("phoneNumber");
                salary = rs.getInt("salary");
                teachersList.add(new Teacher(id, firstName, lastName, birthDay, phoneNumber, salary));
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        return teachersList;
    }

    public String addTeacher(String firstName, String lastName, Date birthDay,
            String phoneNumber, int salary) {

        int id = 0;
        String query = "INSERT INTO Teacher ("
                + "firstName,"
                + "lastName,"
                + "birthDay,"
                + "phoneNumber,"
                + "salary) VALUES ("
                + "?,?,?,?,?)";

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
            stprep.setString(4, phoneNumber);
            stprep.setInt(5, salary);
            stprep.executeUpdate();
            rs = stprep.getGeneratedKeys();

            while (rs.next()) {
                id = rs.getInt(1);
            }
            stprep.close();
            isSucces = true;

        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het aanmaken van de leraar, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het aanmaken van de leraar, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het aanmaken van de leraar is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het aanmaken van de leraar, probeer het opnieuw.";
        }
        

    }

    public String deleteTeacher(int id) {
        //remove from students 
        // remove from classtable
        String query = "DELETE FROM TEACHER WHERE id = ?";

        PreparedStatement stprep = null;
        try {
            stprep = conn.prepareStatement(query);
            stprep.setInt(1, id);
            stprep.executeUpdate();

            stprep.close();
            return "De leraar is succesvol verwijderen.";

        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het verwijderen van de leraar, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het verwijderen van de leraar, probeer het opnieuw.";

        }

    }

    public String updateTeacher(int id, String firstName, String lastName, Date birthDay,
            String phoneNumber, int salary) {
        String query = "UPDATE Teacher set firstName = ?, lastName = ?, birthDay = ?, phoneNumber = ?, salary = ? WHERE id =" + id + ";";

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
            stprep.setString(4, phoneNumber);
            stprep.setInt(5, salary);
            stprep.executeUpdate();

            stprep.close();
            isSucces = true;

        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het update van de leraar, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het update van de leraar, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het update van de leraar is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het update van de leraar, probeer het opnieuw.";
        }

    }
}
