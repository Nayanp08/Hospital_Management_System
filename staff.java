import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class staff extends JFrame implements ActionListener {

    private JLabel titleLabel;
    private JButton addButton;
    private JButton viewButton;
    private JButton editButton;
    private JButton deleteButton;

    public staff() {
        setTitle("Hospital Management System - Staff Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));

        titleLabel = new JLabel("Welcome to Staff Page");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        add(titleLabel);

        addButton = new JButton("Add Staff");
        addButton.addActionListener(this);
        add(addButton);

        viewButton = new JButton("View Staff");
        viewButton.addActionListener(this);
        add(viewButton);

        editButton = new JButton("Edit Staff");
        editButton.addActionListener(this);
        add(editButton);

        deleteButton = new JButton("Delete Staff");
        deleteButton.addActionListener(this);
        add(deleteButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
           
        } else if (e.getSource() == viewButton) {
          
        } else if (e.getSource() == editButton) {
            
        } else if (e.getSource() == deleteButton) {
            
        }
    }

    public static void main(String[] args) {
        new staff();
    }
}
