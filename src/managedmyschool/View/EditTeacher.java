/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.View;

/**
 *
 * @author achrafchennan
 */
public class EditTeacher extends javax.swing.JPanel {

    /**
     * Creates new form EditStudents
     */
    public EditTeacher() {
        initComponents();
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
        btEditTeacher = new javax.swing.JButton();
        btGoBack = new javax.swing.JButton();
        tbFirstName = new javax.swing.JTextField();
        tbLastName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCurrentClass = new javax.swing.JLabel();
        lbEditStudentTitle = new javax.swing.JLabel();
        cbTeachers = new javax.swing.JComboBox<>();
        lbPhoneNumber = new javax.swing.JLabel();
        tbPhoneNumber = new javax.swing.JTextField();
        lbSalery = new javax.swing.JLabel();
        tbSalary = new javax.swing.JTextField();
        cbCurrentClasses = new javax.swing.JComboBox<>();
        lbTeachers = new javax.swing.JLabel();

        btEditTeacher.setText("Opslaan");
        btEditTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditTeacherActionPerformed(evt);
            }
        });

        btGoBack.setText("Vorige");
        btGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGoBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Voornaam:");

        jLabel2.setText("Achternaam:");

        lbCurrentClass.setText("Klas");

        lbEditStudentTitle.setText("Leraar aanmaken");

        ClassMethodes classMethodeList = new ClassMethodes();
        classMethodeList.setIsDemo(true);
        lessonList = classMethodeList.getClasses();
        cbTeachers.addItem("Selecteer een klas");

        for(Lesson les : lessonList){
            cbTeachers.addItem(les.getClassName());
        }

        cbTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTeachersActionPerformed(evt);
            }
        });

        lbPhoneNumber.setText("Telefoonnummer :");

        lbSalery.setText("Uurloon :");

        ClassMethodes classMethodeList = new ClassMethodes();
        classMethodeList.setIsDemo(true);
        lessonList = classMethodeList.getClasses();
        cbTeachers.addItem("Selecteer een klas");

        for(Lesson les : lessonList){
            cbTeachers.addItem(les.getClassName());
        }

        cbCurrentClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCurrentClassesActionPerformed(evt);
            }
        });

        lbTeachers.setText("Leraren");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btGoBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEditTeacher))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lbEditStudentTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lbTeachers)))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(66, 66, 66))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(lbCurrentClass)
                                            .addComponent(lbPhoneNumber)
                                            .addComponent(lbSalery))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tbLastName)
                                    .addComponent(tbFirstName)
                                    .addComponent(cbCurrentClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(tbPhoneNumber)))))
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbEditStudentTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTeachers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCurrentClass)
                    .addComponent(cbCurrentClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPhoneNumber)
                    .addComponent(tbPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalery)
                    .addComponent(tbSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditTeacher)
                    .addComponent(btGoBack))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btEditTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditTeacherActionPerformed
        // TODO add your handling code here:
        //read values
        String voorNaam  = this.tbFirstName.getText();
        String achterNaam  = this.tbLastName.getText();
        String geboorteDatum  = this.tbGeboorteDatum.getText();
        String straat  = this.tbPhoneNumber.getText();
        String huisNummer  = this.tbSalary.getText();
        String postCode = this.tbPostCode.getText();
        String toevoeging = this.tbToevvoeging.getText();
        String selectedKlas =  this.cbTeachers.getSelectedItem().toString();

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

    }//GEN-LAST:event_btEditTeacherActionPerformed

    private void btGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGoBackActionPerformed
        // TODO add your handling code here:
        mainAppFrame main = new mainAppFrame();
        this.setVisible(false);

        main.setVisible(true);

    }//GEN-LAST:event_btGoBackActionPerformed

    private void cbTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTeachersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTeachersActionPerformed

    private void cbCurrentClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCurrentClassesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCurrentClassesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditTeacher;
    private javax.swing.JButton btGoBack;
    private javax.swing.JComboBox<String> cbCurrentClasses;
    private javax.swing.JComboBox<String> cbTeachers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCurrentClass;
    private javax.swing.JLabel lbEditStudentTitle;
    private javax.swing.JLabel lbPhoneNumber;
    private javax.swing.JLabel lbSalery;
    private javax.swing.JLabel lbTeachers;
    private javax.swing.JTextField tbFirstName;
    private javax.swing.JTextField tbLastName;
    private javax.swing.JTextField tbPhoneNumber;
    private javax.swing.JTextField tbSalary;
    // End of variables declaration//GEN-END:variables
}
