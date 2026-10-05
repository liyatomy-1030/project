
package bytebite;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {

        setTitle("BYTEBITE - Login");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("BYTEBITE");
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setBounds(170, 30, 200, 50);

        JLabel subtitle = new JLabel("Canteen Management System");
        subtitle.setBounds(150, 80, 250, 25);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(80, 140, 100, 30);

        usernameField = new JTextField();
        usernameField.setBounds(190, 140, 220, 30);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(80, 190, 100, 30);

        passwordField = new JPasswordField();
        passwordField.setBounds(190, 190, 220, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(180, 250, 140, 40);

        loginButton.addActionListener(e -> login());

        panel.add(title);
        panel.add(subtitle);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        add(panel);

        setVisible(true);
    }

    private void login() {

        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("admin") && password.equals("1234")) {

            JOptionPane.showMessageDialog(
                    this,
                    "Login successful!"
            );

            dispose();

            new DashboardFrame();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Invalid username or password!"
            );
        }
    }
}