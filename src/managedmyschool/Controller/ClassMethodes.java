package managedmyschool.Controller;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import static javafx.scene.input.KeyCode.T;
import static jdk.nashorn.internal.codegen.CompilerConstants.className;
import managedmyschool.Model.Aanwezigheid;
import managedmyschool.Model.AanwezigheidModel;
import managedmyschool.Model.Lesson;
import managedmyschool.Model.Student;
import managedmyschool.Model.Classrooms;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author achrafchennan
 */
public class ClassMethodes {

    Connection conn;
    Statement st = null;
    Boolean isSucces = false;
    StudentsMethodes studentsMeht;
    TeachersMethodes teacherMethodes;

    public ClassMethodes() {
        SQLMethode sqlMethodes = new SQLMethode();
        studentsMeht = new StudentsMethodes();
        teacherMethodes = new TeachersMethodes();
        this.conn = sqlMethodes.conn;

    }

    public String createClass(Lesson newLesson) {
        Lesson newClass = null;
        isSucces = false;

        int id = 0;
        String query = "INSERT INTO Lesson ("
                + "className,"
                + "startTime,"
                + "classRoom,"
                + "endTime ) VALUES ("
                + "?,?,?,?)";


        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query);
            stprep.setString(1, newLesson.getClassName());
            stprep.setInt(2, newLesson.getStartTime());
            stprep.setString(3, newLesson.getClassRoom().toString());
            stprep.setInt(4, newLesson.getEndTime());
            stprep.executeUpdate();

            stprep.close();
            isSucces = true;
        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het aanmaken van de nieuwe klas, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het aanmaken van de nieuwe klas, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het aanmaken van de nieuwe klas is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het aanmaken van de nieuwe klas, probeer het opnieuw.";
        }

    }

    public String updateClass(Lesson updateClass) {
        isSucces = false;

        String query = "UPDATE LESSON set className = ?, teacherId = ?, startTime = ?,  classRoom = ?, endTime = ? WHERE classname = ?";

        ResultSet rs;

        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query);
            stprep.setString(1, updateClass.getClassName());
            stprep.setInt(2, updateClass.getTeacher());
            stprep.setInt(3, updateClass.getStartTime());
            stprep.setString(4, updateClass.getClassRoom().toString());
            stprep.setInt(5, updateClass.getEndTime());
            rs = stprep.executeQuery();

            stprep.close();
            isSucces = true;
        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het aanmaken van de nieuwe klas, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het aanmaken van de nieuwe klas, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het aanmaken van de nieuwe klas is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het aanmaken van de nieuwe klas, probeer het opnieuw.";
        }
    }

    public int getClassTeacher(String className) {
        int teacherId = 0;
        String query = "SELECT * FROM BETWEEN_TEACHERLES WHERE className = '" + className + "';";
        try {
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(query);
            while (rs.next()) {
                className = rs.getString("className");
                teacherId = rs.getInt("teacherId");
            }
        } catch (SQLException sqlEX) {
            return teacherId;
        } catch (Exception ex) {
            return teacherId;
        }
        return teacherId;
    }

    public Lesson getClassByName(String className) {
        Lesson resultLesson = null;
        String query = "SELECT * FROM LESSON WHERE className = '" + className + "';";
        String classNameResult = "";
        int teacherId = 0;
        int startTime = 0 ;
        int endTime = 0;
        String classRoom = "";

        try {
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(query);
            while (rs.next()) {
                className = rs.getString("className");
                startTime = rs.getInt("startTime");
                endTime = rs.getInt("endTime");
                teacherId = this.getClassTeacher(className);
                classRoom = rs.getString("classRoom");

            }
            resultLesson = new Lesson(className, teacherId, startTime, endTime, classRoom);
        } catch (SQLException sqlEX) {
            return resultLesson;
        } catch (Exception ex) {
            return resultLesson;
        }
        return resultLesson;

    }

    public String deleteClass(String className) {
        isSucces = false;

        String query = "DELETE FROM Lesson WHERE className = ?";
        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query);
            stprep.setString(1, className);
            stprep.executeQuery();

            stprep.close();
            isSucces = true;
        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het verwijderen van de  klas, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het verwijderen van de klas, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het verwijderen van de klas is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het verwijderen van de  klas, probeer het opnieuw.";
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

    public Boolean removeStudentFromClass(int studentRow, String className) {

        String query = "DELETE FROM BETWEEN_STUDENTLES WHERE studentId = ? ";

        try {
            PreparedStatement stprep = conn.prepareStatement(query);

            stprep.setInt(1, studentRow);
            stprep.executeUpdate();
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

    public List<Lesson> getClasses() {
        List<Lesson> classes = new ArrayList<Lesson>();

        String query = "SELECT * FROM LESSON";
        String className = "";
        int teacherId;
        int startTime;
        int endTime;
        String classRoom;
        try {

            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(query);
            while (rs.next()) {
                //modify db to fit the purpose
                className = rs.getString("className");
                startTime = rs.getInt("startTime");
                endTime = rs.getInt("endTime");
                classRoom = rs.getString("classRoom");
                 teacherId = this.getClassTeacher(className);
                classes.add(new Lesson(className, teacherId, startTime, endTime, classRoom));

            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return classes;
    }

    public String setAanwezigheid(Date date, String className, List<Aanwezigheid> studentIds) {

        String query = "INSERT INTO Aanwezigheid ("
                + "className,"
                + "studentId,"
                + "date,"
                + "aanwezig ) VALUES ("
                + "?,?,?,?)";

        try {
            PreparedStatement stprep = conn.prepareStatement(query);

            // make student id and isAanwezig model;
            Calendar now = Calendar.getInstance();
            now.setTime(date);
            now.set(Calendar.HOUR_OF_DAY, 6);
            date = now.getTime();
            Date newDate = now.getTime();

            java.sql.Date sqlDate = new java.sql.Date(newDate.getTime());

            for (int i = 0; i < studentIds.size(); i++) {

                stprep.setString(1, className);
                stprep.setInt(2, studentIds.get(i).getId());
                stprep.setDate(3, sqlDate);
                stprep.setBoolean(4, studentIds.get(i).isIsAanwezig());

                stprep.executeUpdate();

            }
            stprep.close();
            return "De aanwezigheid is succesvol doorgegeven.";

        } catch (SQLException ex) {
            return "Er is iets fout gegaan bij invoeren van de aanwezigheid.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            return "Er is iets fout gegaan bij invoeren van de aanwezigheid.";

        }

    }

    public List<AanwezigheidModel> getAanwezigheid(String date, String className) {

        List<AanwezigheidModel> aanwezigheidList = new ArrayList<AanwezigheidModel>();
        Boolean isAanwezig = false;

        String query = "SELECT * FROM Aanwezigheid WHERE date = '" + date + "' AND className = '" + className + "';";

        try {
            st = conn.createStatement();

            ResultSet rs;
            int id = 0;
            Date dateAanwezigheid = new Date();
            String classname = null;
            int studentId = 0;
            Student student;
            boolean isAanwezigheid = false;

            rs = st.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt("id");
                dateAanwezigheid = rs.getDate("date");
                className = rs.getString("className");
                studentId = rs.getInt("studentId");
                isAanwezigheid = rs.getBoolean("aanwezig");
                student = this.studentsMeht.getStudent(studentId);
                aanwezigheidList.add(new AanwezigheidModel(dateAanwezigheid, className, student, isAanwezigheid));

            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return aanwezigheidList;
        }

        return aanwezigheidList;

    }

    private Classrooms getEnumValue(String classRoom) {
        Classrooms newClass = Classrooms.CLASSROOM101;

        if (classRoom.equals(Classrooms.CLASSROOM101)) {
            newClass = Classrooms.CLASSROOM101;
        } else if (classRoom.equals(Classrooms.CLASSROOM102)) {
            newClass = Classrooms.CLASSROOM102;
        } else if (classRoom.equals(Classrooms.CLASSROOM103)) {
            newClass = Classrooms.CLASSROOM103;
        } else if (classRoom.equals(Classrooms.CLASSROOM104)) {
            newClass = Classrooms.CLASSROOM104;
        }

        return newClass;
    }

}
