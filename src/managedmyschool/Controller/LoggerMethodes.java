/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.Controller;

import java.sql.Connection;
import java.sql.Statement;

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

    public void getLogs() {

    }

    public void createLogs() {
    }
}
