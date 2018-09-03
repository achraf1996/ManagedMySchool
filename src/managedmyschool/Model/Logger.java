/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.Model;

import java.sql.Time;

/**
 *
 * @author achrafchennan
 */
public class Logger {
    int id;
    String username, methode, input;
    Time time;

    public Logger(int id, String username, String methode, String input, Time time) {
        this.id = id;
        this.username = username;
        this.methode = methode;
        this.input = input;
        this.time = time;
    }

    public Logger(String username, String methode, String input) {
        this.username = username;
        this.methode = methode;
        this.input = input;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMethode() {
        return methode;
    }

    public void setMethode(String methode) {
        this.methode = methode;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    
}
