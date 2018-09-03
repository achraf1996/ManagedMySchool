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
public class SalaryMethodes {

    Connection conn;
    Statement st;
    Boolean isSucces;

    public SalaryMethodes() {
        this.conn = new SQLMethode().conn;
        this.isSucces = false;
        this.st = null;

    }

    public String updatepayTeacher(List<SalaryModel> salaryList) {
        isSucces = false;

        PreparedStatement stprep = null;
        try {
            String query = "UPDATE PaymentTeachers set amount = ?, registerdBy = ?  WHERE teacherId = ? AND day = ? AND month = ? AND year = ?;";
            stprep = conn.prepareStatement(query);

            for (SalaryModel salaryModel : salaryList) {
                stprep.setInt(1, salaryModel.getAmount());
                stprep.setString(2, salaryModel.getRegisterdBy());
                stprep.setInt(3, salaryModel.getTeacherId());
                stprep.setInt(4, salaryModel.getDay());
                stprep.setInt(5, salaryModel.getMonth());
                stprep.setInt(6, salaryModel.getYear());
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

    public String payTeacher(List<SalaryModel> salaryList) {
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

            for (SalaryModel salaryModel : salaryList) {
                stprep.setInt(1, salaryModel.getTeacherId());
                stprep.setInt(2, salaryModel.getDay());
                stprep.setInt(3, salaryModel.getMonth());
                stprep.setInt(4, salaryModel.getYear());
                stprep.setString(5, salaryModel.getRegisterdBy());
                stprep.setInt(6, salaryModel.getAmount());

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
        String query = "SELECT * FROM PaymentTeachers WHERE teacherId = ? AND month = ? AND year  = ?;";

        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query);
            stprep.setInt(1, teacherId);
            stprep.setInt(2, month);
            stprep.setInt(3, year);
            ResultSet rs = stprep.executeQuery();
            while (rs.next()) {
                salaryList.add(new SalaryModel(rs.getInt("amount"), rs.getInt("day"), rs.getInt("month"), rs.getInt("year"), rs.getInt("teacherId"), rs.getString("registerdBy")));
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
