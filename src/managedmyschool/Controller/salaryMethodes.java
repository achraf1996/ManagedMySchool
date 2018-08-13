package managedmyschool.Controller;

import static java.lang.System.in;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import managedmyschool.Model.SalaryModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author achrafchennan
 */
public class salaryMethodes {

    Connection conn;
    Statement st;
    Boolean isSucces;

    public salaryMethodes() {
        this.conn = new SQLMethode().conn;
        this.isSucces = false;
        this.st = null;

    }

    public String updatepayTeacher(int teacherId, int[] days, int month, int year, int amount, String registerdBy) {
        isSucces = false;

        PreparedStatement stprep = null;
        try {
            for (int i = 0; i < days.length; i++) {
                String query = "UPDATE PaymentTeachers set amount = ?, registerdBy = ?  WHERE teacherId = ? AND day = ? AND month = ? AND year = ?;";
                stprep = conn.prepareStatement(query);
                stprep.setInt(1, amount);
                stprep.setString(2, registerdBy);
                stprep.setInt(3, teacherId);
                stprep.setInt(4, days[i]);
                stprep.setInt(5, month);
                stprep.setInt(6, year);
                stprep.executeUpdate();
            }
            stprep.close();
            isSucces = true;

        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het doorgeven van het salaris, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het doorgeven van het salaris, probeer het opnieuw.";

        }

        if (isSucces) {
            return "Het doorgeven van het salaris is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het doorgeven van het salaris, probeer het opnieuw.";
        }

    }

    public String payTeacher(int teacherId, int[] days, int month, int year, String registerdBy, int amount) {
        isSucces = false;
        String query = "INSERT INTO PaymentTeachers ("
                + "teacherid,"
                + "day,"
                + "month,"
                + "year,"
                + "registerdBy,"
                + "amount) VALUES ("
                + "?,?,?,?,?,?);";

        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query);

            for (int i = 0; i < days.length; i++) {
                stprep.setInt(1, teacherId);
                stprep.setInt(2, teacherId);
                stprep.setInt(3, month);
                stprep.setInt(4, year);
                stprep.setString(5, registerdBy);
                stprep.setInt(6, amount);

                stprep.executeUpdate();
            }

            stprep.close();
            isSucces = true;

        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het doorgeven van het salaris, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het doorgeven van het salaris, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het doorgeven van het salaris is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het doorgeven van het salaris, probeer het opnieuw.";
        }

    }

    public List<SalaryModel> getPaymentTeacher(int teacherId, int month, int year) {
        isSucces = false;
        List<SalaryModel> salaryList = new ArrayList<SalaryModel>();
        String query = "SELECT * FROM WHERE teacherId = ? AND month = ? AND year  = ?;";

        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query);
            stprep.setInt(1, teacherId);
            stprep.setInt(2, month);
            stprep.setInt(3, year);
            ResultSet rs = stprep.executeQuery();
             while(rs.next()){
             salaryList.add(new SalaryModel(rs.getInt("amount"),rs.getInt("day"),rs.getInt("month"), rs.getInt("year"),rs.getInt("teacherId"),rs.getString("registerBy")));                 
             }
            isSucces = true;

        } catch (SQLException ex) {
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
     return salaryList;
    }
}
