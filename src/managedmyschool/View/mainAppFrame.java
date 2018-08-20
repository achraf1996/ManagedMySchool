package managedmyschool.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import managedmyschool.Controller.ClassMethodes;

/**
 *
 * @author achrafchennan
 */
public class mainAppFrame extends JFrame {

    // initialising the comp
    JPanel panel = new JPanel();
    JButton redirectStudentAanmakenFrame = new JButton("Nieuwe student aanmaken");
    JButton redirectAanwezigheidFrame = new JButton("Aanwezigheid managen");
    JButton redirectCreateKlas = new JButton("Nieuwe Klas Aanmaken");
    JButton redirectCreateTeacher = new JButton("Nieuwe Leraar Aanmaken");
        JButton redirectEditStudent = new JButton("Student wijzigen");
    JButton redirectEditTeacher = new JButton("Leraar wijzigen");
    JButton redirectEditKlas = new JButton("Klas wijzigen");

    private HomeController Controller;

    public void addHomeListener(ActionListener a) {
        redirectAanwezigheidFrame.addActionListener(a);
    }

    public void addHomeListenerStudent(ActionListener a) {
        this.redirectStudentAanmakenFrame.addActionListener(a);
    }

    public mainAppFrame() {

        //settings the panel settings
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(redirectStudentAanmakenFrame);
        panel.add(redirectAanwezigheidFrame);
        panel.add(this.redirectCreateTeacher);
        panel.add(this.redirectCreateTeacher);
        panel.add(this.redirectCreateKlas);
        panel.add(this.redirectCreateTeacher);
        panel.add(this.redirectEditKlas);

        // settings the frame settings
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(400, 400);
        this.setVisible(true);
        Controller = new HomeController(this);

        //added the onClick methodes for the redirect
        addHomeListener(Controller);
        addHomeListenerStudent(Controller);
    }

}

class HomeController implements ActionListener {

    /*
     * Here we declared a Home class's variable,
     * that we will use to dispose that JFrame.
     */
    private mainAppFrame home;
    ClassMethodes classMethode;

    public HomeController(mainAppFrame home) {
        this.home = home;
        classMethode = new ClassMethodes();

        //Connection checkConnection =  classMethode.createConnection() ;
        JOptionPane.showMessageDialog(null,
                "Dit is een demo-versie de data is geen echte data van de database.",
                "Demo",
                JOptionPane.INFORMATION_MESSAGE);
//          if(checkConnection == null){
//          
//            JOptionPane.showMessageDialog(null,
//                    "Geen verbinding met de database",
//                    "Verbinding",
//                    JOptionPane.WARNING_MESSAGE);}

    }

    public void actionPerformed(ActionEvent e) {

        home.dispose();
        if (e.getActionCommand().equalsIgnoreCase("Aanwezigheid managen")) {
            aanwezigheid aanwezigheidFrame = new aanwezigheid(classMethode);
            aanwezigheidFrame.setVisible(true);
        } else if (e.getActionCommand().equalsIgnoreCase("Nieuwe student aanmaken")) {
            AddStudent addStudent = new AddStudent(classMethode);
            addStudent.setVisible(true);
        }

    }
}
