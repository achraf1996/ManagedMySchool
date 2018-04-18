/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achrafchennan
 */
public class Class {
    String className;
    Student students[];
    Teacher teacher;
    int startTime, endTime;
    Classrooms classRoom;
    

    public Class(String className , Student students[], Teacher teacher,
            int startTime, int endTime, Classrooms classRoom) {
        this.className = className;
        this.students = students;
        this.teacher = teacher;
        this.startTime = startTime;
        this.endTime = endTime;  
        this.classRoom = classRoom;
        
    }
    
    
}
