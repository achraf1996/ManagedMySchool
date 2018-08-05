/*
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
public class EditClas extends javax.swing.JPanel {

    /**
     * Creates new form EditStudents
     */
    public EditClas() {
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
        tbPickStudentsTable = new javax.swing.JTable(model);
        cbClasses = new javax.swing.JComboBox<>();
        btGoBack = new javax.swing.JButton();
        btEditClass = new javax.swing.JButton();
        lbEditClassTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbChooseClass = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        tbPickStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbPickStudentsTable);

        List<Lesson> lessons = classMethode.getClasses();
        cbClasses.addItem("Selecteer een klas");

        for(Lesson les : lessons){
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
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btEditClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditClassActionPerformed
        // TODO add your handling code here:
        String datum = datumTextfield.getText();
        DateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        String className = cbClasses.getSelectedItem().toString();
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

            this.aanwezigList = classMethode.getAanwezigheid(sqlDate.toString(), cbClasses.getSelectedItem().toString());
            aanwezigList.stream().distinct().collect(Collectors.toList());
            tbPickStudentsTable.setModel(model);
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
    }//GEN-LAST:event_btEditClassActionPerformed

    private void btGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGoBackActionPerformed
        mainAppFrame main = new mainAppFrame();
        this.setVisible(false);

        main.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btGoBackActionPerformed

    private void cbClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClassesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClassesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditClass;
    private javax.swing.JButton btGoBack;
    private javax.swing.JComboBox<String> cbClasses;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbChooseClass;
    private javax.swing.JLabel lbEditClassTitle;
    private javax.swing.JTable tbPickStudentsTable;
    // End of variables declaration//GEN-END:variables
}
