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
    Time startTime, endTime;
    Classrooms classRoom;
    

    public Lesson(String className , int teacherId,
            Time startTime, Time endTime, Classrooms classRoom) {
        this.className = className;
        this.teacherId = teacherId;
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

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Classrooms getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(Classrooms classRoom) {
        this.classRoom = classRoom;
    }
   
    
    
}
