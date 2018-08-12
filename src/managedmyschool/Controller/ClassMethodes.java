package managedmyschool.Controller;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import static javafx.scene.input.KeyCode.T;
import static jdk.nashorn.internal.codegen.CompilerConstants.className;
import managedmyschool.Model.Aanwezigheid;
import managedmyschool.Model.AanwezigheidModel;
import managedmyschool.Model.Lesson;
import managedmyschool.Model.Student;
import managedmyschool.Model.Classrooms;
import managedmyschool.Model.ZipCode;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author achrafchennan
 */
public class ClassMethodes {
    
    
    Boolean isDemo = false;
   Connection conn;
      Statement st = null;
      Boolean isSucces = false;
      List<Student> studentListDemo;
      List<Student> studentListDemo1;
      List<AanwezigheidModel> aanwezigheidDemo;
      List<AanwezigheidModel> aanwezigheidDemo1;
      
      
    public void setIsDemo(Boolean isDemo) {
        this.isDemo = isDemo;
    }

    public ClassMethodes( ) {
        
        studentListDemo = new ArrayList();
        studentListDemo1 = new ArrayList();
        aanwezigheidDemo = new ArrayList();
        aanwezigheidDemo1 = new ArrayList();
        
    }

    
     
   public Boolean addStudentToClass(int studentRow, String className){
      Connection conndb = createConnection();

       String query = "INSERT INTO BETWEEN_STUDENTLES (" 
            + "studentId,"
            + "lesName ) VALUES ("
            + "?,?)";
       
        try{
         PreparedStatement stprep = conndb.prepareStatement(query);

         stprep.setInt(1,studentRow);
         stprep.setString(2,className);
         
        int rowCount =  stprep.executeUpdate();
         
         
         
         
        stprep.close();

          
    }
    catch(SQLException ex){
        System.out.println("error");   
                return false;

    }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
              return false;

   }
       
       return true;
   }
   
   
   public Boolean createZipCode(String zipCode, String straat, int huisNummer, String toevoeging){
       Connection conndb = createConnection();
    String query = "INSERT INTO ZipCode (" 
            + "zipCode,"
            + "streetName,"
            + "houseNumber,"
            + "addition ) VALUES ("
            + "?,?,?,?)";
       
    try{
         PreparedStatement stprep = conndb.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);

         stprep.setString(1,zipCode);
         stprep.setString(2,straat);
         stprep.setInt(3, huisNummer);
         stprep.setString(4,toevoeging);
         
         stprep.executeUpdate();
         
       
    }
     catch(SQLException ex){
        System.out.println("error");   
                return false;

    }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
              return false;

   }
   return true;
   }
   
   
   public List<Lesson> getClassesDemo(){
      List<Lesson> classes = new ArrayList<Lesson>();

      
       for (int i = 1; i < 3; i++) {
           String className = "DemoKlas"  + i ; 
           int teacherId = i;
           Time startTime =  null;
           Time endTime = null;
           Classrooms classRoom  = Classrooms.CLASSROOM101;
           classes.add(new Lesson(className, teacherId, startTime, endTime, classRoom));
           
       }
       
       return classes;
   }
   
   public List<Lesson> getClasses(){
          List<Lesson> classes = new ArrayList<Lesson>();

       if(this.isDemo){
       classes  = this.getClassesDemo();
       
       }
       else{
           Connection conndb = createConnection();
  
    String query = "SELECT * FROM LESSON";  
    String className = "";
    int teacherId;
    Time startTime;
    Time endTime;
    Classrooms classRoom;
    try
    {
       
      st = conndb.createStatement();
      ResultSet rs;
        rs = st.executeQuery(query);
      while (rs.next())
      {
          //modify db to fit the purpose
         className = rs.getString("className");
         teacherId = rs.getInt("teacher");
         startTime = rs.getTime("startTime");
         endTime = rs.getTime("endTime");
         classRoom = this.getEnumValue(rs.getString("classRoom"));
       
         classes.add(new Lesson(className,teacherId,startTime,endTime,classRoom));
        
      }
      
      
    }
    catch (SQLException ex)
    {
      System.err.println(ex.getMessage());
    }
       }
   
   return classes;
   }
   
   public Lesson getClass(String className){
   Connection conndb = createConnection();
   
    String query = "SELECT * FROM LESSON WHERE className = '"+className +"';";  
    Lesson les = null;
    String classname = "";
    int teacherId;
    Time startTime;
    Time endTime;
    Classrooms classRoom;
    try
    {
       
      st = conndb.createStatement();
      ResultSet rs;
        rs = st.executeQuery(query);
      while (rs.next())
      {
          //modify db to fit the purpose
         classname = rs.getString("className");
         teacherId = rs.getInt("teacher");
         startTime = rs.getTime("startTime");
         endTime = rs.getTime("endTime");
         classRoom = this.getEnumValue(rs.getString("classRoom"));
       
         les  = new Lesson(className,teacherId,startTime,endTime,classRoom);
        
      }
      
      
    }
    catch (SQLException ex)
    {
      System.err.println(ex.getMessage());
    }
   
   return les;
   }
   
   public ZipCode getZipcode(String zipcodeId){
    ZipCode zipCode = null;
    
       Connection conndb = createConnection();
   
    
    String query = "SELECT * FROM ZipCode WHERE zipCode = '"+ zipcodeId +"';";  
    String zipCodePrimary = null;
    String streetName = null;
    int houseNumber = 0;
    String addition = null;

    try
    {
       
      st = conndb.createStatement();
      ResultSet rs;
        rs = st.executeQuery(query);
      while (rs.next())
      {
     
         zipCodePrimary = rs.getString("zipCode");
         streetName = rs.getString("streetName");
         houseNumber = rs.getInt("houseNumber");
         addition = rs.getString("addition");
         zipCode = new ZipCode(zipCodePrimary,streetName,houseNumber,addition);  


      }
         return zipCode;
    }
    catch (SQLException ex)
    {
     zipCode = new ZipCode();
      System.err.println(ex.getMessage());
        return zipCode;
    }
   }
   
   

   
   public String setAanwezigheid(Date date, String className, List<Aanwezigheid>studentIds){
   
   
       if(this.isDemo){
           if(CheckClass(className)){
           this.aanwezigheidDemo.removeAll(aanwezigheidDemo);
           for(Aanwezigheid aanwezigheidStudent : studentIds){
                        int id = Integer.parseInt(aanwezigheidStudent.getId()) - 1;

           Student newStudent =  this.studentListDemo.get(id);
           this.aanwezigheidDemo.add(new AanwezigheidModel(date,className,newStudent,aanwezigheidStudent.isIsAanwezig()));
           }
           }
           else if(className.equalsIgnoreCase("DemoKlas2")){
                this.aanwezigheidDemo1.removeAll(aanwezigheidDemo1);
           for(Aanwezigheid aanwezigheidStudent : studentIds){
                        int id = Integer.parseInt(aanwezigheidStudent.getId());

           List<Student> newStudentList =  this.studentListDemo1.stream().filter(a -> a.getId() == id ).collect(Collectors.toList());
           this.aanwezigheidDemo1.add(new AanwezigheidModel(date,className,newStudentList.get(0),aanwezigheidStudent.isIsAanwezig()));
           }
           }
                   return "De aanwezigheid is succesvol doorgegeven.";

           
       }
       else{
        Connection conndb = createConnection();
    
    String query = "INSERT INTO Aanwezigheid (" 
            + "className,"
            + "studentId,"
            + "date,"
            + "aanwezig ) VALUES ("
            + "?,?,?,?)";
    
    
    try{
         PreparedStatement stprep = conndb.prepareStatement(query);
        
         
         // make student id and isAanwezig model;
                Calendar now = Calendar.getInstance();
                now.setTime(date);
                now.set(Calendar.HOUR_OF_DAY, 6);
                date = now.getTime();
                Date newDate  = now.getTime();
         
          java.sql.Date sqlDate = new java.sql.Date(newDate.getTime());
     
          
         for (int i = 0; i < studentIds.size(); i++){

         stprep.setString(1,className); 
         stprep.setString(2,studentIds.get(i).getId());
         stprep.setDate(3, sqlDate);
         stprep.setBoolean(4,studentIds.get(i).isIsAanwezig());
         
         stprep.executeUpdate();
         
         }
        stprep.close();
        return "De aanwezigheid is succesvol doorgegeven.";
          
    }
    catch(SQLException ex){
       return "Er is iets fout gegaan bij invoeren van de aanwezigheid.";          
    }
   catch(Exception e){
      //Handle errors for Class.forName
     return "Er is iets fout gegaan bij invoeren van de aanwezigheid.";          

   }
       }
      
   
   }
   
   public List<AanwezigheidModel> getAanwezigheid(String date, String className)
   {
       
       List<AanwezigheidModel> aanwezigheidList = new ArrayList<AanwezigheidModel>();
        Boolean isAanwezig = false;
        if(this.isDemo){
          if(CheckClass(className)){
          return this.aanwezigheidDemo;
          }
          else if (className.equalsIgnoreCase("KlasDemo2")){
            return  this.aanwezigheidDemo1;
          }
          return aanwezigheidList;
           
       }
                
        else{
          Connection conndb = createConnection();

          String query = "SELECT * FROM Aanwezigheid WHERE date = '"+date+"' AND className = '"+className+"';"; 
      
       
       try{
       st = conndb.createStatement();
       
       ResultSet rs;
       int id = 0;
       Date dateAanwezigheid = new Date();
       String classname = null;
       int studentId = 0;
       Student student;
       boolean isAanwezigheid = false;
       
       rs = st.executeQuery(query);
       while(rs.next()){
       id = rs.getInt("id");
       dateAanwezigheid = rs.getDate("date");
       className = rs.getString("className");
       studentId = rs.getInt("studentId");
       isAanwezigheid = rs.getBoolean("aanwezig");
       student = this.getStudent(studentId);
       aanwezigheidList.add(new AanwezigheidModel(dateAanwezigheid,className,student,isAanwezigheid ));
       
       }
       conn.close();
       }
       catch(SQLException ex){
               System.err.println(ex.getMessage());
               return aanwezigheidList; 
            }  
       
              return aanwezigheidList;        

        }
   }
   
   private Boolean CheckClass(String input){return input.equalsIgnoreCase("DemoKlas1");}
   

   private Classrooms getEnumValue(String classRoom){
           Classrooms newClass = Classrooms.CLASSROOM101;
           
           if(classRoom.equals(Classrooms.CLASSROOM101))
           {
           newClass = Classrooms.CLASSROOM101;
           }
           else if (classRoom.equals(Classrooms.CLASSROOM102)){
           newClass = Classrooms.CLASSROOM102;    
           }
           else if(classRoom.equals(Classrooms.CLASSROOM103)){
           newClass = Classrooms.CLASSROOM103;    
           }
           else if(classRoom.equals(Classrooms.CLASSROOM104)){
           newClass = Classrooms.CLASSROOM104;    
           }
           
           return newClass;
   }
  
    
    public Connection createConnection(){
        
         try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
     String url = "jdbc:mysql://localhost:8889/managedMySchool?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
      conn = DriverManager.getConnection(url, "root", "root");
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
        }
     
        return conn;
    }
    
 
  



   
}


