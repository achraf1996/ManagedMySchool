package managedmyschool.Controller;

import java.sql.Connection;
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
public class teacherMethodes {

    Connection conn;

    public teacherMethodes() {
        SQLMethode sqlMethodes = new SQLMethode();
        this.conn = sqlMethodes.conn;

    }

    private void getTeachers() {

    }

    private void getTeacher(String id) {

    }

    private void updateTeacher(Teacher teacher) {

    }

    private void removeTeacher(String id) {

    }

    private void setSalaryMonthley(String month, String teacherId) {

    }
}
