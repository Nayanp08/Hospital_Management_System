import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener {

     JButton patientButton;
     JButton doctorButton;
     JButton staffButton;
     JButton billButton;
     JButton labButton;
    
    public menu() {
        setTitle("Hospital Management System");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        patientButton = new JButton("Patient");
        doctorButton = new JButton("Doctor");
        staffButton = new JButton("Staff");
        billButton = new JButton("Bill");
        labButton = new JButton("Lab");
        
        panel.add(patientButton);
        patientButton.addActionListener(this);
        panel.add(doctorButton);
        doctorButton.addActionListener(this);
        panel.add(staffButton);
        staffButton.addActionListener(this);
        panel.add(billButton);
        billButton.addActionListener(this);
        panel.add(labButton);
        labButton.addActionListener(this);

       
        
        add(panel);
        setVisible(true);

        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == billButton) {
            bill hms = new bill();
            hms.setVisible(true);
        }
        if (e.getSource() == patientButton) {
            pat hms = new pat();
            hms.setVisible(true);
        }
        if (e.getSource() == staffButton) {
            staff hms = new staff();
            hms.setVisible(true);
        }

        if (e.getSource() == doctorButton) {
            doc hms = new doc();    
            hms.setVisible(true);
        }

    }

    
 
    
    public static void main(String[] args) {
        new menu();
    }

}
