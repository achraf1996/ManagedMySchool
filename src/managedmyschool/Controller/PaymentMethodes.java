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
import java.util.List;
import managedmyschool.Model.PaymentModel;
import managedmyschool.Model.SalaryModel;

/**
 *
 * @author achrafchennan
 */
public class PaymentMethodes {

    Connection conn;
    Statement st;
    Boolean isSucces;

    public PaymentMethodes() {
        this.conn = new SQLMethode().conn;
        this.isSucces = false;
        this.st = null;
    }

    public String updateMonthlyContribution(int studentId, int shartNumber, int month, int year, String registerdBy, int amount) {
        isSucces = false;

        PreparedStatement stprep = null;
        try {

            String query = "UPDATE PaymentStudents set amount = ?, registerdBy = ?  WHERE studentId = ? AND shartNumber=? AND month = ? AND year = ?;";
            stprep = conn.prepareStatement(query);
            stprep.setInt(1, amount);
            stprep.setString(2, registerdBy);
            stprep.setInt(3, studentId);
            stprep.setInt(4, shartNumber);
            stprep.setInt(5, month);
            stprep.setInt(6, year);
            stprep.executeUpdate();
            stprep.close();
            isSucces = true;

        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het doorgeven van de bijdragen, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het doorgeven van de bijdragen, probeer het opnieuw.";

        }

        if (isSucces) {
            return "Het doorgeven van de bijdragen is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het doorgeven van de bijdragen, probeer het opnieuw.";
        }

    }

    public String payMonthlyContribution(int studentId, int shartNumber, int month, int year, String registerdBy, int amount) {
        isSucces = false;
        String query = "INSERT INTO PaymentStudents ("
                + "shartId,"
                + "studentId,"
                + "month,"
                + "registerdBy,"
                + "year,"
                + "amount) VALUES ("
                + "?,?,?,?,?,?);";

        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query);

            stprep.setInt(1, shartNumber);
            stprep.setInt(2, studentId);
            stprep.setInt(3, month);
            stprep.setString(4, registerdBy);
            stprep.setInt(5, year);
            stprep.setInt(6, amount);

            stprep.executeUpdate();

            stprep.close();
            isSucces = true;

        } catch (SQLException ex) {
            return "Er is iets mis gegaan bij het doorgeven van de bijdragen, probeer het opnieuw.";
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return "Er is iets mis gegaan bij het doorgeven van de bijdragen, probeer het opnieuw.";

        }
        if (isSucces) {
            return "Het doorgeven van de bijdragen is succesvol verlopen";
        } else {
            return "Er is iets mis gegaan bij het doorgeven van de bijdragen, probeer het opnieuw.";
        }

    }

    public List<PaymentModel> getMonthlyContribution(int studentId, int[] month, int year) {
        isSucces = false;
        List<PaymentModel> paymentList = new ArrayList<PaymentModel>();
        String query = "SELECT * FROM PaymentStudents WHERE studentId = ? AND month = ? AND year  = ?;";

        try {

            // still needs add student to shart
            PreparedStatement stprep = conn.prepareStatement(query);
            for (int i = 0; i < month.length; i++) {
                stprep.setInt(1, studentId);
                stprep.setInt(2, month[i]);
                stprep.setInt(3, year);
                ResultSet rs = stprep.executeQuery();

                // PaymentModel(int shartNumber, int studentId, int month, int year, int amount, String registerdBy
                while (rs.next()) {
                    paymentList.add(new PaymentModel(rs.getInt("shartNumber"), rs.getInt("studentId"), rs.getInt("month"), rs.getInt("year"), rs.getInt("amount"), rs.getString("registerBy")));
                }
            }

            isSucces = true;

        } catch (SQLException ex) {
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return paymentList;
    }
}
