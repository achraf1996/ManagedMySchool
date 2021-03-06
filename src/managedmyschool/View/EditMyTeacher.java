/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.View;

import java.util.List;
import javax.swing.JOptionPane;
import managedmyschool.Controller.ClassMethodes;
import managedmyschool.Controller.HelperMethodes;
import managedmyschool.Controller.StudentsMethodes;
import managedmyschool.Controller.TeachersMethodes;
import managedmyschool.Model.Lesson;
import managedmyschool.Model.Teacher;
import static managedmyschool.View.aanwezigheid.showResponse;

/**
 *
 * @author achrafchennan
 */
public class EditMyTeacher extends javax.swing.JFrame {

    ClassMethodes classMethodes;
    TeachersMethodes teacherMethodes;
    List<Teacher> teacherList;
    List<Lesson> lessonList;
    Teacher selectedTeacher;
    String loginUser;

    /**
     * Creates new form EditMyClass
     */
    public EditMyTeacher() {
        initComponents();
        teacherMethodes = new TeachersMethodes();
        classMethodes = new ClassMethodes();

    }

    public EditMyTeacher(String loginUser) {
        initComponents();
        teacherMethodes = new TeachersMethodes();
        classMethodes = new ClassMethodes();
        this.loginUser = loginUser;
    }

    public void createConstructor() {

        this.classMethodes = new ClassMethodes();
        this.teacherMethodes = new TeachersMethodes();
        this.lessonList = classMethodes.getClasses();
        this.teacherList = teacherMethodes.getTeachers();
    }

    public void getClasses() {
        this.lessonList = classMethodes.getClasses();
    }

    public void getTeachers() {
        this.teacherList = teacherMethodes.getTeachers();
    }

    public void getSelectedTeacher(int teacherId) {
        this.selectedTeacher = teacherMethodes.getTeacher(teacherId);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        if(this.teacherList == null){
            this.createConstructor();
        }
        cbTeachers.addItem("Selecteer een leraar");

        for(Teacher teacher : teacherList){
            cbTeachers.addItem(teacher.getId() + ","+teacher.getFirstName() +", " + teacher.getLastName());
        }

        cbTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTeachersActionPerformed(evt);
            }
        });

        lbPhoneNumber.setText("Telefoonnummer :");

        lbSalery.setText("Uurloon :");

        cbCurrentClasses.addItem("Selecteer een klas");

        for(Lesson les : lessonList){
            this.cbCurrentClasses.addItem(les.getClassName());
        }

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lbTeachers))
                            .addComponent(cbTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(tbPhoneNumber))
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
                                    .addComponent(tbSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCurrentClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditTeacher)
                    .addComponent(btGoBack))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditTeacherActionPerformed
        // TODO add your handling code here:
        //read values
        String firstName = this.tbFirstName.getText();
        String lastName = this.tbLastName.getText();
        String phoneNumber = this.tbPhoneNumber.getText();
        int salary = HelperMethodes.tryParseInt(this.tbSalary.getText()) ? Integer.parseInt(this.tbSalary.getText()) : this.selectedTeacher.getSalary();
        String className = this.cbCurrentClasses.getSelectedItem().toString();
        //update the class
        String respMessage = teacherMethodes.updateTeacher(this.selectedTeacher.getId(), firstName, lastName, this.selectedTeacher.getBirthDay(), phoneNumber, salary);
        if (respMessage.startsWith("Het")) {
            showResponse(respMessage, "Gewijzigd", JOptionPane.INFORMATION_MESSAGE);
        } else {
            showResponse(respMessage, "Mislukt", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btEditTeacherActionPerformed

    private void btGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGoBackActionPerformed
        // TODO add your handling code here:
        MyHome main = new MyHome();
        this.setVisible(false);

        main.setVisible(true);

    }//GEN-LAST:event_btGoBackActionPerformed

    private void cbTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTeachersActionPerformed
        // TODO add your handling code here:
        String id = this.cbTeachers.getSelectedItem().toString().split(",")[0];
        this.getSelectedTeacher(Integer.parseInt(id));
        for (Lesson lesson : lessonList) {
            if (lesson.getTeacher() == this.selectedTeacher.getId()) {
                this.cbCurrentClasses.setSelectedItem(lesson.getClassName());

            }
        }
        this.tbFirstName.setText(this.selectedTeacher.getFirstName());
        this.tbLastName.setText(this.selectedTeacher.getLastName());
        this.tbPhoneNumber.setText(this.selectedTeacher.getPhoneNumber());
        this.tbSalary.setText(String.valueOf(this.selectedTeacher.getSalary()));

    }//GEN-LAST:event_cbTeachersActionPerformed

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
            java.util.logging.Logger.getLogger(EditMyTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMyTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMyTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMyTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMyTeacher().setVisible(true);
            }
        });
    }

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
