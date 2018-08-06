/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.View;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import managedmyschool.Controller.ClassMethodes;
import managedmyschool.Model.Lesson;
import managedmyschool.Model.Student;
import managedmyschool.Model.ZipCode;

/**
 *
 * @author achrafchennan
 */
public class AddStudent extends javax.swing.JFrame {
    
    ClassMethodes classMethode;
    List<Lesson> lessonList;


    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
        lessonList = new ArrayList<Lesson>();
        classMethode = new ClassMethodes();
        this.classMethode.setIsDemo(true);
    }

     public AddStudent(ClassMethodes classMeth) {
        initComponents();
        lessonList = new ArrayList<Lesson>();
        classMethode = classMeth;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btCreateStudent = new javax.swing.JButton();
        btGoBack = new javax.swing.JButton();
        tbFirstName = new javax.swing.JTextField();
        tbLastName = new javax.swing.JTextField();
        lbFirstName = new javax.swing.JLabel();
        lbLastName = new javax.swing.JLabel();
        lbDateOfBirth = new javax.swing.JLabel();
        lbClasses = new javax.swing.JLabel();
        lbCreateStudentTitle = new javax.swing.JLabel();
        cbClasses = new javax.swing.JComboBox<>();
        lbPhoneNumberParent = new javax.swing.JLabel();
        tbPhoneParents = new javax.swing.JTextField();
        lbMonthleyCost = new javax.swing.JLabel();
        tbMontleyCost = new javax.swing.JTextField();
        lbShartNumber = new javax.swing.JLabel();
        tbShartNumber = new javax.swing.JTextField();
        tbDateOfBirth = new javax.swing.JFormattedTextField();
        lbParentName = new javax.swing.JLabel();
        tbParentName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCreateStudent.setText("Aanmaken");
        btCreateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateStudentActionPerformed(evt);
            }
        });

        btGoBack.setText("Vorige");
        btGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGoBackActionPerformed(evt);
            }
        });

        lbFirstName.setText("Voornaam:");

        lbLastName.setText("Achternaam:");

        lbDateOfBirth.setText("Geboortedatum:");

        lbClasses.setText("Klas");

        lbCreateStudentTitle.setText("Student aanmaken");

        ClassMethodes classMethodeList = new ClassMethodes();
        classMethodeList.setIsDemo(true);
        lessonList = classMethodeList.getClasses();
        cbClasses.addItem("Selecteer een klas");

        for(Lesson les : lessonList){
            cbClasses.addItem(les.getClassName());
        }

        lbPhoneNumberParent.setText("Tel Ouders :");

        lbMonthleyCost.setText("Bijdragen :");

        lbShartNumber.setText("Shart-Nummer");

        tbShartNumber.setToolTipText("");

        tbDateOfBirth.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        tbDateOfBirth.setToolTipText("");

        lbParentName.setText("Naam ouder:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lbCreateStudentTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbClasses)
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbMontleyCost, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tbPhoneParents, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(cbClasses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbDateOfBirth)
                                            .addComponent(lbFirstName))
                                        .addGap(32, 32, 32))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbLastName)
                                        .addGap(54, 54, 54)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tbLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(tbFirstName)
                                    .addComponent(tbDateOfBirth))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbShartNumber)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tbShartNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(133, 133, 133)
                                                .addComponent(tbParentName))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbParentName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btGoBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCreateStudent)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbPhoneNumberParent)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbMonthleyCost)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbCreateStudentTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbShartNumber)
                        .addComponent(tbShartNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLastName)
                    .addComponent(tbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbParentName)
                        .addComponent(tbParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDateOfBirth)
                    .addComponent(tbDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbClasses)
                    .addComponent(cbClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhoneNumberParent)
                    .addComponent(tbPhoneParents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMonthleyCost)
                    .addComponent(tbMontleyCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCreateStudent)
                    .addComponent(btGoBack))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGoBackActionPerformed
        // TODO add your handling code here:
            mainAppFrame main = new mainAppFrame();
                        this.setVisible(false);

            main.setVisible(true);
          
    }//GEN-LAST:event_btGoBackActionPerformed

    private Boolean checkIfNull(String var){
    if(var.replace(" ", "") == "")
    return true;
    else
      return  false;
    }
    
    private void btCreateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateStudentActionPerformed
        // TODO add your handling code here:
       //read values
       String voorNaam  = this.tbFirstName.getText();
       String achterNaam  = this.tbLastName.getText();
       String geboorteDatum  = this.tbDateOfBirth.getText();
       String straat  = this.tbPhoneParents.getText();
       String huisNummer  = this.tbMontleyCost.getText();
       String postCode = this.tbPostCode.getText();
       String toevoeging = this.tbShartNumber.getText();
       String selectedKlas =  this.cbClasses.getSelectedItem().toString();
       
        DateFormat formatter = new SimpleDateFormat("dd-MM-yy");
                Date date  = null;
                      java.sql.Date sqlDate =  null;
                try {
                  date = formatter.parse(geboorteDatum);
                  sqlDate = new java.sql.Date(date.getTime());

                    } catch (ParseException e) {
                 e.printStackTrace();
                    }
         int huisNum = Integer.parseInt(huisNummer);
         
       
       
       if(!checkIfNull(voorNaam)&&
          !checkIfNull(achterNaam) &&
          !checkIfNull(geboorteDatum) &&
          !checkIfNull(straat) &&
          !checkIfNull(huisNummer) &&
          !checkIfNull(postCode) &&
          selectedKlas  != "Selecteer een klas" &&
          sqlDate != null  
               
               ){
           
           ZipCode zipCode = new ZipCode(postCode,straat,huisNum, toevoeging);
           String respMessage =  classMethode.addNewStudent(voorNaam,achterNaam,date,selectedKlas,zipCode);
           if(respMessage.startsWith("Het"))
               showResponse(respMessage,"Aangemaakt",JOptionPane.INFORMATION_MESSAGE);
           else
              showResponse(respMessage,"Mislukt",JOptionPane.ERROR_MESSAGE);

       }
       else{
          
                    JOptionPane.showMessageDialog(null,
                "Niet alle velden zijn ingevuld, alle velden moeten ingevuld worden behalve toevoeging deze is optioneel",
             "Verplichten velden",
                JOptionPane.WARNING_MESSAGE);
       }
              
  
        
    }//GEN-LAST:event_btCreateStudentActionPerformed

         
       public static void showResponse (String responseText, String responseTitle, int joptionpane ){
             JOptionPane.showMessageDialog(null,
                responseText,
                responseTitle,
                joptionpane);
       }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateStudent;
    private javax.swing.JButton btGoBack;
    private javax.swing.JComboBox<String> cbClasses;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbClasses;
    private javax.swing.JLabel lbCreateStudentTitle;
    private javax.swing.JLabel lbDateOfBirth;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbMonthleyCost;
    private javax.swing.JLabel lbParentName;
    private javax.swing.JLabel lbPhoneNumberParent;
    private javax.swing.JLabel lbShartNumber;
    private javax.swing.JFormattedTextField tbDateOfBirth;
    private javax.swing.JTextField tbFirstName;
    private javax.swing.JTextField tbLastName;
    private javax.swing.JTextField tbMontleyCost;
    private javax.swing.JTextField tbParentName;
    private javax.swing.JTextField tbPhoneParents;
    private javax.swing.JTextField tbShartNumber;
    // End of variables declaration//GEN-END:variables
}
