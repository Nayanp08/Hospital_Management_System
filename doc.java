import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Doctor {
    private String name;
    private String specialization;
    private String phone;
    
    public Doctor(String name, String specialization, String phone) {
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public String getPhone() {
        return phone;
    }
}

class DoctorsPage extends Frame implements ActionListener {
    private Label nameLabel, specializationLabel, phoneLabel;
    private TextField nameField, specializationField, phoneField;
    private Button addButton;
    private TextArea doctorsTextArea;
    private ArrayList<Doctor> doctorsList;
    
    public DoctorsPage() {
        setTitle("Hospital Management System - Doctors");
        setLayout(new FlowLayout());
        setSize(500, 400);
        
        nameLabel = new Label("Name of Doctor:");
        add(nameLabel);
        
        nameField = new TextField(20);
        add(nameField);
        add(new Label());
        add(new Label());
        add(new Label());
        add(new Label());
        add(new Label());
        add(new Label());
        specializationLabel = new Label("Specialization:");
        add(specializationLabel);
       
        specializationField = new TextField(20);
        add(specializationField);
        add(new Label());
        add(new Label());
        add(new Label());
        add(new Label());
        add(new Label());
        add(new Label());
        add(new Label());
        add(new Label());
        phoneLabel = new Label("Phone:");
        add(phoneLabel);

        phoneField = new TextField(20);
        add(phoneField);
        
        addButton = new Button("Add Doctor");
        add(addButton);
        addButton.addActionListener(this);
        
        doctorsTextArea = new TextArea(10, 40);
        doctorsTextArea.setEditable(false);
        add(doctorsTextArea);
        
        doctorsList = new ArrayList<Doctor>();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            String specialization = specializationField.getText();
            String phone = phoneField.getText();
            
            Doctor newDoctor = new Doctor(name, specialization, phone);
            doctorsList.add(newDoctor);
            
            updateDoctorsTextArea();
        }
    }
    
    public void updateDoctorsTextArea() {
        String doctorsText = "";
        
        for (int i = 0; i < doctorsList.size(); i++) {
            Doctor currentDoctor = doctorsList.get(i);
            
            doctorsText += "Name: " + currentDoctor.getName() + "\n";
            doctorsText += "Specialization: " + currentDoctor.getSpecialization() + "\n";
            doctorsText += "Phone: " + currentDoctor.getPhone() + "\n\n";
        }
        
        doctorsTextArea.setText(doctorsText);
    }
}

public class doc {
    public static void main(String[] args) {
        DoctorsPage doctorsPage = new DoctorsPage();
        doctorsPage.setVisible(true);
    }

    public void setVisible(boolean b) {
    }

}
