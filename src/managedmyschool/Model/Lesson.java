package managedmyschool.Model;



import java.sql.Time;
import java.util.List;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achrafchennan
 */
public class Lesson {
    String className;
    int teacherId;
    int startTime, endTime;
    String classRoom;
    

    public Lesson(String className , int teacherId,
            int startTime, int endTime, String classRoom) {
        this.className = className;
        this.teacherId = teacherId;
        this.startTime = startTime;
        this.endTime = endTime;  
        this.classRoom = classRoom;
        
    }

    public Lesson(String className, int startTime, int endTime, String classRoom) {
        this.className = className;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classRoom = classRoom;
    }
   
    
     public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getTeacher() {
        return teacherId;
    }

    public void setTeacher(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
   
    
    
}
