/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedmyschool.View;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import managedmyschool.Controller.ClassMethodes;
import managedmyschool.Controller.StudentsMethodes;
import managedmyschool.Controller.TeachersMethodes;
import managedmyschool.Model.Lesson;
import managedmyschool.Model.Student;
import managedmyschool.Model.Teacher;

/**
 *
 * @author achrafchennan
 */
public class EditMyClass extends javax.swing.JFrame {

    ClassMethodes classMethodes;
    StudentsMethodes studentMethodes;
    TeachersMethodes teacherMethodes;
    List<Student> studentsList;
    List<Teacher> teachersList;
    List<Lesson> lessonList;
    boolean columsAreSet;
    Lesson selectedClass;
    String loginUser;

    private DefaultTableModel modelSetTable = new DefaultTableModel() {
        public Class<?> getColumnClass(int column) {
            switch (column) {
                case 0:
                    return int.class;
                case 1:
                    return String.class;
                case 2:
                    return String.class;
                case 3:
                    return Boolean.class;
                default:
                    return String.class;
            }
        }

    };

    /**
     * Creates new form EditMyClass
     */
    public EditMyClass() {
        initComponents();
    }

    public EditMyClass(String loginUser) {
        initComponents();
        this.loginUser = loginUser;
    }

    public void createConstructor() {

        this.classMethodes = new ClassMethodes();
        this.studentMethodes = new StudentsMethodes();
        this.teacherMethodes = new TeachersMethodes();
        this.columsAreSet = false;
        this.lessonList = classMethodes.getClasses();
        this.teachersList = teacherMethodes.getTeachers();
    }

    private void fillStudentTable() {

        this.studentsList = studentMethodes.getAllStudents();
        List<Student> currentStudents = studentMethodes.getStudentsFromClass(this.selectedClass.getClassName());
        Boolean isInClass = false;
        this.tbPickStudentsTable.setModel(modelSetTable);
        if (!this.columsAreSet) {
            modelSetTable.addColumn("ID");
            modelSetTable.addColumn("Voornaam");
            modelSetTable.addColumn("Achternaam");
            modelSetTable.addColumn("Toegevoegd");
            this.columsAreSet = true;
        }
        for (int i = 0; i < studentsList.size(); i++) {
            Student student = studentsList.get(i);

            for (Student currentStudent : currentStudents) {
                if (currentStudent.getId() == student.getId()) {
                    isInClass = true;
                }
            }
            Object[][] data = {new Object[]{student.getId(), student.getFirstName(), student.getLastName(), new Boolean(isInClass)}};
            modelSetTable.addRow(data);
            modelSetTable.setValueAt(student.getId(), i, 0);
            modelSetTable.setValueAt(student.getFirstName(), i, 1);
            modelSetTable.setValueAt(student.getLastName(), i, 2);
            modelSetTable.setValueAt(isInClass, i, 3);
            isInClass = false;
        }

    }

    public void addNewStudents() {
        for (int i = 0; i < this.modelSetTable.getRowCount(); i++) {
            Object id = this.modelSetTable.getValueAt(i, 0);
            Object toegevoegd = this.modelSetTable.getValueAt(i, 3);

            int idStudent = Integer.parseInt(id.toString());
            String isAanw = String.valueOf(toegevoegd);
            Boolean isTrue = isAanw.equalsIgnoreCase("true") ? true : false;

        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPickStudentsTable = new javax.swing.JTable();
        cbClasses = new javax.swing.JComboBox<>();
        btGoBack = new javax.swing.JButton();
        btEditClass = new javax.swing.JButton();
        lbEditClassTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbChooseClass = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbTeacher = new javax.swing.JLabel();
        cbTeachers = new javax.swing.JComboBox<>();
        lbClassroom = new javax.swing.JLabel();
        tbClassroom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbPickStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbPickStudentsTable);

        if(this.lessonList == null){
            this.createConstructor();
        }

        cbClasses.addItem("Selecteer een klas");
        for(Lesson les : this.lessonList){
            cbClasses.addItem(les.getClassName());
        }
        cbClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClassesActionPerformed(evt);
            }
        });

        btGoBack.setLabel("Vorige");
        btGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGoBackActionPerformed(evt);
            }
        });

        btEditClass.setText("Opslaan");
        btEditClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditClassActionPerformed(evt);
            }
        });

        lbEditClassTitle.setText("Klas Wijzigen");

        lbChooseClass.setText("Klas:");

        jLabel8.setText("Alle Studenten");

        lbTeacher.setText("Leraar:");

        if(this.teachersList == null){
            this.createConstructor();
        }
        cbTeachers.addItem("Selecteer een leraar");

        for(Teacher teacher : this.teachersList){
            cbTeachers.addItem(teacher.getId()+"," + teacher.getLastName());
        }
        cbTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTeachersActionPerformed(evt);
            }
        });

        lbClassroom.setText("Klaslocatie:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTeacher)
                            .addComponent(lbClassroom))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTeachers, 0, 134, Short.MAX_VALUE)
                            .addComponent(tbClassroom))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(lbEditClassTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbChooseClass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(199, 199, 199))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btGoBack)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditClass)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbEditClassTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbChooseClass)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(132, 132, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(300, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btGoBack)
                        .addComponent(btEditClass))
                    .addGap(33, 33, 33)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClassesActionPerformed
        // TODO add your handling code here:
        if (!this.cbClasses.getSelectedItem().toString().startsWith("Selecteer")) {
            if (this.classMethodes != null) {

                this.selectedClass = this.classMethodes.getClassByName(this.cbClasses.getSelectedItem().toString());
                this.tbClassroom.setText(selectedClass.getClassRoom());

                for (Teacher teacher : teachersList) {
                    if (teacher.getId() == selectedClass.getTeacher()) {
                        cbTeachers.setSelectedItem(teacher.getId() + "," + teacher.getLastName());
                    }
                }
                this.fillStudentTable();
            }

        }


    }//GEN-LAST:event_cbClassesActionPerformed

    private void btGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGoBackActionPerformed
        MyHome main = new MyHome();
        this.setVisible(false);

        main.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btGoBackActionPerformed

    private void btEditClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditClassActionPerformed
        // TODO add your handling code here:
        String className, teacherName, classRoom;
        className = this.cbClasses.getSelectedItem().toString();
        teacherName = this.cbTeachers.getSelectedItem().toString();
        classRoom = this.tbClassroom.getText();
        List<Student> currentStudents = studentMethodes.getStudentsFromClass(this.selectedClass.getClassName());

        int teacherId = Integer.parseInt(this.cbTeachers.getSelectedItem().toString().split(",")[0]);

        if (!className.equalsIgnoreCase("Selecteer een klas")) {
            this.classMethodes.updateClass(new Lesson(className, teacherId, this.selectedClass.getStartTime(), this.selectedClass.getEndTime(), classRoom));
            currentStudents.forEach(student -> this.classMethodes.removeStudentFromClass(student.getId(), className));
            for (int i = 0; i < this.modelSetTable.getRowCount(); i++) {
                Object id = this.modelSetTable.getValueAt(i, 0);
                Object isInClass = this.modelSetTable.getValueAt(i, 3);
                String isInClassTemp = String.valueOf(isInClass);
                if (isInClassTemp.equalsIgnoreCase("true")) {
                    int idStudent = Integer.parseInt(id.toString());
                    this.classMethodes.addStudentToClass(idStudent, className);
                }

            }
            JOptionPane.showMessageDialog(null,
                    "Succesvol aangepast",
                    "Succes",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            String ErrorMessage = className == "Selecteer een klas" ? "U heeft geen klas geselecteerd, " : "";

            JOptionPane.showMessageDialog(null,
                    ErrorMessage,
                    "Verplichten velden",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEditClassActionPerformed

    private void cbTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTeachersActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(EditMyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMyClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditClass;
    private javax.swing.JButton btGoBack;
    private javax.swing.JComboBox<String> cbClasses;
    private javax.swing.JComboBox<String> cbTeachers;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbChooseClass;
    private javax.swing.JLabel lbClassroom;
    private javax.swing.JLabel lbEditClassTitle;
    private javax.swing.JLabel lbTeacher;
    private javax.swing.JTextField tbClassroom;
    private javax.swing.JTable tbPickStudentsTable;
    // End of variables declaration//GEN-END:variables
}