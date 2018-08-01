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
        
        fillDemoStudentList(1,11,studentListDemo);
        fillDemoStudentList(11,21,studentListDemo1);
        
    }

    
      public void fillDemoStudentList(int startNumber, int endNumber, List<Student> list ){
      for (int i = startNumber; i < endNumber; i++) {
            
         String voorNaam = "student" + i;
         String achterNaam = "demo";
         Date geboorteDatum = null;
         String postCode = "35" + i + "5KM";
         String straat = "DeDemoStraat";

         ZipCode zipCodeDemo = new ZipCode(postCode,straat,i,"");
         
        DateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        try {

            geboorteDatum = (Date) formatter.parse("10-10-1996");

        } catch (ParseException e) {
            e.printStackTrace();
        }
         list.add(new Student(i,voorNaam,achterNaam,geboorteDatum,zipCodeDemo));
        }
      }
      
   public String addNewStudent(String voorNaam, String achterNaam, Date geboorteDatum, String klas, ZipCode zipCode){
        
       
       if(this.isDemo){
           int studentId= 0;
           if(CheckClass(klas))
             studentId =  this.studentListDemo.size() + 1; 
           else 
             studentId =  this.studentListDemo1.size() + 1; 

           
            Student student = new Student(studentId,voorNaam,achterNaam,geboorteDatum, zipCode);
            
             if(CheckClass(klas))
             this.studentListDemo.add(student); 
           else if(klas.equalsIgnoreCase("DemoKlas2"))
             this.studentListDemo1.add(student); 
             return "Het aanmaken van de student is succesvol verlopen";
  
       }
       else{
              Connection conndb = createConnection();
          int id = 0;
    String query = "INSERT INTO Student (" 
            + "firstName,"
            + "lastName,"
            + "birthDay,"
            + "zipCode ) VALUES ("
            + "?,?,?,?)";
   
            ResultSet rs;

    
    try{
         PreparedStatement stprep = conndb.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                 Calendar now = Calendar.getInstance();
                now.setTime(geboorteDatum);
                now.set(Calendar.HOUR_OF_DAY, 6);
                Date newDate  = now.getTime();
         java.sql.Date sqlDate = new java.sql.Date(newDate.getTime());

         stprep.setString(1,voorNaam);
         stprep.setString(2,achterNaam);
         stprep.setDate(3, sqlDate);
         stprep.setString(4,zipCode.getZipCode());
         
         stprep.executeUpdate();
         rs = stprep.getGeneratedKeys();
         
         while(rs.next()){
            id = rs.getInt(1);
                            }
        stprep.close();
        if(id != 0)
        isSucces = this.addStudentToClass(id, klas);
        isSucces = this.createZipCode(zipCode.getZipCode(), zipCode.getStreetName(), zipCode.getHouseNumber(), zipCode.getAddition());
          
    }
    catch(SQLException ex){
        return "Er is iets mis gegaan bij het aanmaken van de student, probeer het opnieuw.";
    }
   catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
              return "Er is iets mis gegaan bij het aanmaken van de student, probeer het opnieuw.";

   }
    if(isSucces)
    return "Het aanmaken van de student is succesvol verlopen";
    else
     return "Er is iets mis gegaan bij het aanmaken van de student, probeer het opnieuw.";
       
       }
       


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
   
   
   public Student getStudent(int studentId){
   Student student = null;
   Connection conndb = createConnection();
    String query = "SELECT * FROM STUDENT WHERE id = '"+studentId+"';";     

   try{
       st = conndb.createStatement();
       ResultSet rs;
        rs = st.executeQuery(query);
        int id = 0;
        String firstName = null;
        String lastName = null;
        Date birthDay = null;
        ZipCode zipCode = null;
        
        while(rs.next()){
         id = rs.getInt("id");
         firstName = rs.getString("firstName");
         lastName = rs.getString("lastName");
         birthDay = rs.getDate("birthDay");
         zipCode = this.getZipcode(rs.getString("zipCode"));
         student = new Student(id, firstName, lastName, birthDay, zipCode);
        }
        return student; 
   
   }
   catch(SQLException ex){
                  System.err.println(ex.getMessage());
                 return student;
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
   
   
   public List<Student> getStudents(String lesName){
       
          List<Student> studentsList = new ArrayList<Student>();

       if(this.isDemo){
       if(CheckClass(lesName)){
           studentsList  = this.studentListDemo; 
       }
       else if(lesName.equalsIgnoreCase("DemoKlas2")){
           studentsList  = this.studentListDemo1; 

       }
      }
       else{
        Connection conndb = createConnection();
   
    String query = "SELECT * FROM BETWEEN_STUDENTLES WHERE lesName = '"+lesName+"';"; 
    
    List<String> studenstIds = new ArrayList<String>();
    
    
    try{
        st =conndb.createStatement();
        ResultSet rs;
        rs  = st.executeQuery(query);
        while(rs.next())
        {
        studenstIds.add(rs.getString("studentId"));
        
        }    
        int id = 0;
        String firstName = null;
        String lastName = null;
        Date birthDay = null;
        ZipCode zipCode = null;
        for (int i = 0; i < studenstIds.size(); i++) {
         query = "SELECT * FROM STUDENT WHERE id = '"+studenstIds.get(i)+"';";     
            st = conndb.createStatement();
        
        rs = st.executeQuery(query);
      while (rs.next())
      {
          //modify db to fit the purpose
         id = rs.getInt("id");
         firstName = rs.getString("firstName");
         lastName = rs.getString("lastName");
         birthDay = rs.getDate("birthDay");
         zipCode = this.getZipcode(rs.getString("zipCode"));
       
         studentsList.add(new Student(id, firstName,lastName,birthDay,zipCode));
        
      }   
            
            
        }
        conn.close();
        
    }
        catch (SQLException ex)
    {
      System.err.println(ex.getMessage());
    }
       }
        return studentsList;

   }
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


