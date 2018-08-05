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
public class AddClass extends javax.swing.JFrame {
    
    ClassMethodes classMethode;
    List<Lesson> lessonList;


    /**
     * Creates new form AddStudent
     */
    public AddClass() {
        initComponents();
        lessonList = new ArrayList<Lesson>();
        classMethode = new ClassMethodes();
        this.classMethode.setIsDemo(true);
    }

     public AddClass(ClassMethodes classMeth) {
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
        btCreateClass = new javax.swing.JButton();
        btGoBack = new javax.swing.JButton();
        tbClassName = new javax.swing.JTextField();
        lbClassName = new javax.swing.JLabel();
        lbAddClassTitle = new javax.swing.JLabel();
        lbImportFrom = new javax.swing.JLabel();
        cbClasses = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPickStudents = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCreateClass.setText("Aanmaken");
        btCreateClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateClassActionPerformed(evt);
            }
        });

        btGoBack.setText("Vorige");
        btGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGoBackActionPerformed(evt);
            }
        });

        lbClassName.setText("Klasnaam:");

        lbAddClassTitle.setText("Klas aanmaken");

        lbImportFrom.setText("Importeer uit");

        ClassMethodes classMethodeList = new ClassMethodes();
        classMethodeList.setIsDemo(true);
        lessonList = classMethodeList.getClasses();
        cbClasses.addItem("Selecteer een klas");

        for(Lesson les : lessonList){
            cbClasses.addItem(les.getClassName());
        }

        tbPickStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbPickStudents);

        jLabel10.setText("Alle leerlingen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAddClassTitle)
                .addGap(288, 288, 288))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btGoBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCreateClass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbClassName)
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbClasses, 0, 94, Short.MAX_VALUE)
                                    .addComponent(tbClassName)))
                            .addComponent(lbImportFrom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(138, 138, 138)))))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAddClassTitle)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbImportFrom)
                            .addComponent(cbClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCreateClass)
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
    
    private void btCreateClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateClassActionPerformed
        // TODO add your handling code here:
       //read values
       String voorNaam  = this.tbClassName.getText();
       String achterNaam  = this.tbAchternaam.getText();
       String geboorteDatum  = this.tbGeboorteDatum.getText();
       String straat  = this.tbStraat.getText();
       String huisNummer  = this.tbHuisNummer.getText();
       String postCode = this.tbPostCode.getText();
       String toevoeging = this.tbToevvoeging.getText();
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
              
  
        
    }//GEN-LAST:event_btCreateClassActionPerformed

         
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
            java.util.logging.Logger.getLogger(AddClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreateClass;
    private javax.swing.JButton btGoBack;
    private javax.swing.JComboBox<String> cbClasses;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAddClassTitle;
    private javax.swing.JLabel lbClassName;
    private javax.swing.JLabel lbImportFrom;
    private javax.swing.JTextField tbClassName;
    private javax.swing.JTable tbPickStudents;
    // End of variables declaration//GEN-END:variables
}