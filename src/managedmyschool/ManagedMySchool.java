/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool;

import javax.swing.SwingUtilities;
import managedmyschool.View.*;

/**
 *
 * @author achrafchennan
 */
public class ManagedMySchool {
    
    
    private static void createAndShowGUI() {
        new EditMyClass();
    }

        public static void main(String[] args) {
        // TODO code application logic here
        
//        EditMyClass newClassPAge = new EditMyClass();
//        newClassPAge.setVisible(true);
         //   EditMyStudents editMyStudents = new EditMyStudents();
          //  editMyStudents.setVisible(true);
          TrackStudentsPayments addClass = new TrackStudentsPayments();
          addClass.setVisible(true);

    }
}
