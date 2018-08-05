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
public class TeachersCostPage extends javax.swing.JPanel {

    /**
     * Creates new form EditStudents
     */
    public TeachersCostPage() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable tbTeacherSalery = new javax.swing.JTable(model);
        cbTeachers = new javax.swing.JComboBox<>();
        btGoBack = new javax.swing.JButton();
        btSafePayment = new javax.swing.JButton();
        lbTeachersCostPageTitle = new javax.swing.JLabel();
        lbTeachers = new javax.swing.JLabel();
        lbLastEditBy = new javax.swing.JLabel();
        btSameAsPrevious = new javax.swing.JButton();
        lbSalary = new javax.swing.JLabel();
        tbSalary = new javax.swing.JTextField();

        tbTeacherSalery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbTeacherSalery);

        List<Lesson> lessons = classMethode.getClasses();
        cbTeachers.addItem("Selecteer een klas");

        for(Lesson les : lessons){
            cbTeachers.addItem(les.getClassName());
        }
        cbTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTeachersActionPerformed(evt);
            }
        });

        btGoBack.setLabel("Vorige");
        btGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGoBackActionPerformed(evt);
            }
        });

        btSafePayment.setText("Opslaan");
        btSafePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSafePaymentActionPerformed(evt);
            }
        });

        lbTeachersCostPageTitle.setText("KostenOverzicht Leraren");

        lbTeachers.setText("Leraren:");

        lbLastEditBy.setText("Laatst aangepast door : ");

        btSameAsPrevious.setText("Zelfde Vorige maand");
        btSameAsPrevious.setActionCommand("");
        btSameAsPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSameAsPreviousActionPerformed(evt);
            }
        });

        lbSalary.setText("Uurloon: ");

        tbSalary.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbTeachers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lbSalary)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btSameAsPrevious))
                                    .addComponent(cbTeachers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(218, 218, 218)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btSafePayment)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(lbTeachersCostPageTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lbLastEditBy, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btGoBack)
                    .addContainerGap(582, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbTeachersCostPageTitle)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbTeachers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSalary)
                            .addComponent(tbSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btSameAsPrevious)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lbLastEditBy)
                .addGap(41, 41, 41)
                .addComponent(btSafePayment)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(300, Short.MAX_VALUE)
                    .addComponent(btGoBack)
                    .addGap(33, 33, 33)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSafePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSafePaymentActionPerformed
        // TODO add your handling code here:
        String datum = datumTextfield.getText();
        DateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        String className = cbTeachers.getSelectedItem().toString();
        int rowCount = this.model.getRowCount();

        if (rowCount > 0) {
            for (int i = rowCount - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
        if (className != "Selecteer een klas" && datum != "Voer een datum in") {

            Date date = null;
            java.sql.Date sqlDate = null;
            try {
                date = formatter.parse(datum);
                sqlDate = new java.sql.Date(date.getTime());

            } catch (ParseException e) {
                e.printStackTrace();
            }

            this.aanwezigList = classMethode.getAanwezigheid(sqlDate.toString(), cbTeachers.getSelectedItem().toString());
            aanwezigList.stream().distinct().collect(Collectors.toList());
            tbTeacherSalery.setModel(model);
            for (AanwezigheidModel aanwezigheid : aanwezigList) {

                String aanwezigheidTekst = aanwezigheid.isAanwezig() ? "Ja" : "Nee";
                Student student = aanwezigheid.getStudent();
                ZipCode adres = student.getZipCode();

                Object[] data = {student.getId(), aanwezigheidTekst, student.getFirstName(), student.getLastName(), student.getBirthDay().toString(), adres.getStreetName(), adres.getHouseNumber(), adres.getZipCode()};
                model.addRow(data);

            }
            if (this.aanwezigList.size() < 1) {
                showResponse("Er is geen resultaat gevonden voor deze datum", "Geen Resultaat", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            String ErrorMessage = className == "Selecteer een klas" ? "U heeft geen klas geselecteerd, " : "";
            String ErrorMessage1 = datum == "Voer een datum in" ? "U heeft geen datum ingevoerd" : "";

            JOptionPane.showMessageDialog(null,
                ErrorMessage + ErrorMessage1,
                "Verplichten velden",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btSafePaymentActionPerformed

    private void btGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGoBackActionPerformed
        mainAppFrame main = new mainAppFrame();
        this.setVisible(false);

        main.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btGoBackActionPerformed

    private void cbTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTeachersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTeachersActionPerformed

    private void btSameAsPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSameAsPreviousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSameAsPreviousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGoBack;
    private javax.swing.JButton btSafePayment;
    private javax.swing.JButton btSameAsPrevious;
    private javax.swing.JComboBox<String> cbTeachers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLastEditBy;
    private javax.swing.JLabel lbSalary;
    private javax.swing.JLabel lbTeachers;
    private javax.swing.JLabel lbTeachersCostPageTitle;
    private javax.swing.JTextField tbSalary;
    // End of variables declaration//GEN-END:variables
}