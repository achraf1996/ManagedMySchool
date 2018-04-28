package managedmyschool.Model;



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
    List<Student> students;
    Teacher teacher;
    int startTime, endTime;
    Classrooms classRoom;
    

    public Lesson(String className , List<Student> students, Teacher teacher,
            int startTime, int endTime, Classrooms classRoom) {
        this.className = className;
        this.students = students;
        this.teacher = teacher;
        this.startTime = startTime;
        this.endTime = endTime;  
        this.classRoom = classRoom;
        
    }
    // adds Students
    public boolean addStudent(Student student){return this.students.add(student);}
    
    
    // removes student
    public boolean removeStudent(Student student){return this.students.remove(student);}
    
    
     public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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

    public Classrooms getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(Classrooms classRoom) {
        this.classRoom = classRoom;
    }
   
    
    
}
