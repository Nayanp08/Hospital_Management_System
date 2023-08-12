import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login implements ActionListener {
    JFrame frame;
    JLabel usernameLabel, passwordLabel, message;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton, resetButton;

    Login() {
        frame = new JFrame("Login Form");
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        message = new JLabel();

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");

        usernameLabel.setBounds(80, 70, 200, 30);
        passwordLabel.setBounds(80, 110, 200, 30);
        message.setBounds(80, 160, 300, 30);

        usernameField.setBounds(300, 70, 200, 30);
        passwordField.setBounds(300, 110, 200, 30);

        loginButton.setBounds(80, 200, 100, 30);
        resetButton.setBounds(200, 200, 100, 30);

        frame.add(usernameLabel);
        frame.add(passwordLabel);
        frame.add(message);

        frame.add(usernameField);
        frame.add(passwordField);

        frame.add(loginButton);
        frame.add(resetButton);

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (username.equals("admin") && password.equals("admin123")) {
                 message.setText("Login Successful");
                 message.setForeground(Color.green);
                
                frame.setVisible(false);
                menu hm = new menu();
                hm.setVisible(true);
                
                
            } 
            
            else {
                message.setText("Invalid username or password");
                message.setForeground(Color.red);
            }
        } else if (e.getSource() == resetButton) {
            usernameField.setText("");
            passwordField.setText("");
            message.setText("");
        }
    }

    private void setVisible(boolean b) {
    }

    public static void main(String[] args) {
        new Login();
    }
}
