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
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    public Home() {
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

        btGoAddStudent = new javax.swing.JButton();
        btGoToCreateTeacher = new javax.swing.JButton();
        btGoToCreateClass = new javax.swing.JButton();
        btGoToEditStudent = new javax.swing.JButton();
        btGoToEditTeacher = new javax.swing.JButton();
        btGoToEditClass = new javax.swing.JButton();
        btGoToStudentsCost = new javax.swing.JButton();
        btCloseApp = new javax.swing.JButton();
        btGoToTeachersCost = new javax.swing.JButton();
        btGoToAanwezigheid = new javax.swing.JButton();
        btLogOut = new javax.swing.JButton();

        btGoAddStudent.setText("Student aanmaken");
        btGoAddStudent.setToolTipText("");
        btGoAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGoAddStudentActionPerformed(evt);
            }
        });

        btGoToCreateTeacher.setText("Leraar aanmaken");

        btGoToCreateClass.setText("Klas aanmaken");
        btGoToCreateClass.setToolTipText("");

        btGoToEditStudent.setText("Student Wijzigen");

        btGoToEditTeacher.setText("Leraar Wijzigen");
        btGoToEditTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGoToEditTeacherActionPerformed(evt);
            }
        });

        btGoToEditClass.setText("Klas Wijzigen");
        btGoToEditClass.setToolTipText("");

        btGoToStudentsCost.setText("Studenten kosten");

        btCloseApp.setText("Afsluiten");

        btGoToTeachersCost.setText("Leraren kosten");

        btGoToAanwezigheid.setText("Aanwezigheid ");

        btLogOut.setText("Uitloggen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btCloseApp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLogOut))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btGoAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btGoToCreateTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btGoToCreateClass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btGoToStudentsCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btGoToTeachersCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btGoToAanwezigheid, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btGoToEditStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btGoToEditTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btGoToEditClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGoAddStudent)
                    .addComponent(btGoToEditStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btGoToCreateTeacher)
                    .addComponent(btGoToEditTeacher))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btGoToCreateClass)
                            .addComponent(btGoToEditClass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btCloseApp)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btLogOut)
                                .addGap(28, 28, 28))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btGoToStudentsCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btGoToTeachersCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btGoToAanwezigheid)
                        .addGap(50, 50, 50))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btGoAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGoAddStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btGoAddStudentActionPerformed

    private void btGoToEditTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGoToEditTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btGoToEditTeacherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCloseApp;
    private javax.swing.JButton btGoAddStudent;
    private javax.swing.JButton btGoToAanwezigheid;
    private javax.swing.JButton btGoToCreateClass;
    private javax.swing.JButton btGoToCreateTeacher;
    private javax.swing.JButton btGoToEditClass;
    private javax.swing.JButton btGoToEditStudent;
    private javax.swing.JButton btGoToEditTeacher;
    private javax.swing.JButton btGoToStudentsCost;
    private javax.swing.JButton btGoToTeachersCost;
    private javax.swing.JButton btLogOut;
    // End of variables declaration//GEN-END:variables
}
