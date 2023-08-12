import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pat extends JFrame implements ActionListener {

    JLabel heading, patientNameLabel, patientAgeLabel, patientGenderLabel, patientAddressLabel, patientContactLabel;
    JTextField patientNameField, patientAgeField, patientAddressField, patientContactField;
    JComboBox<String> patientGenderCombo;
    JButton addPatientButton, viewPatientsButton, bb;

    public pat() {
        setTitle("Hospital Management System");
        setSize(400, 400);
        setLayout(new FlowLayout());

        
        heading = new JLabel("Patient Registration");
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        add(heading);

        
        patientNameLabel = new JLabel("Name:");
        add(patientNameLabel);
        patientNameField = new JTextField(20);
        add(patientNameField);

    
        patientAgeLabel = new JLabel("Age:");
        add(patientAgeLabel);
        patientAgeField = new JTextField(3);
        add(patientAgeField);

 
        patientGenderLabel = new JLabel("Gender:");
        add(patientGenderLabel);
        patientGenderCombo = new JComboBox<String>();
        patientGenderCombo.addItem("Male");
        patientGenderCombo.addItem("Female");
        add(patientGenderCombo);

     
        patientAddressLabel = new JLabel("Address:");
        add(patientAddressLabel);
        patientAddressField = new JTextField(20);
        add(patientAddressField);

  
        patientContactLabel = new JLabel("Contact:");
        add(patientContactLabel);
        patientContactField = new JTextField(10);
        add(patientContactField);

 
        addPatientButton = new JButton("Add Patient");
        addPatientButton.addActionListener(this);
        add(addPatientButton);

    
        viewPatientsButton = new JButton("View Patients");
        viewPatientsButton.addActionListener(this);
        add(viewPatientsButton);

        bb = new JButton("back");
        bb.addActionListener(this);
        add(bb);        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPatientButton) {
            String name = patientNameField.getText();
            int age = Integer.parseInt(patientAgeField.getText());
            String gender = (String) patientGenderCombo.getSelectedItem();
            String address = patientAddressField.getText();
            String contact = patientContactField.getText();

            
            patientNameField.setText("");
            patientAgeField.setText("");
            patientAddressField.setText("");
            patientContactField.setText("");

            JOptionPane.showMessageDialog(this, "Patient added successfully.");
        } else if (ae.getSource() == viewPatientsButton) {
            
        }
    

    bb.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        setVisible(false);

     }
        });

        Panel panel = new Panel(new FlowLayout(FlowLayout.LEFT));
        panel.add(bb);
        add(panel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new pat();
    }
}