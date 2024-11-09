package dastore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public  class SignUp extends JFrame {
    public SignUp (JFrame mainframe){}
    public SignUp() {
        ImageIcon icon = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\Da store.png");
        setIconImage(icon.getImage());
        setTitle("Dastore");
        setBounds(340, 120, 720, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(212, 217, 238));
        panel1.setBounds(0, 0, 450, 680);

        JLabel loginLabel = new JLabel("SIGNUP");
        loginLabel.setFont(new Font("Algerian", Font.PLAIN, 36));
        loginLabel.setForeground(new Color(44, 70, 96));
        loginLabel.setBounds(150, 50, 200, 50);
        panel1.add(loginLabel);

        JLabel nameLabel = new JLabel("Username");
        nameLabel.setBounds(15, 150, 150, 30);
        nameLabel.setForeground(new Color(10, 36, 63));
        nameLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 150, 200, 30);
        panel1.add(nameField);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(15, 220, 150, 30);
        emailLabel.setForeground(new Color(10, 36, 63));
        emailLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 220, 200, 30);
        panel1.add(emailField);

        JLabel phoneLabel = new JLabel("Phone Number");
        phoneLabel.setBounds(15, 290, 150, 30);
        phoneLabel.setForeground(new Color(10, 36, 63));
        phoneLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(phoneLabel);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 290, 200, 30);
        panel1.add(phoneField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(15, 360, 150, 30);
        passwordLabel.setForeground(new Color(10, 36, 63));
        passwordLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 360, 200, 30);
        panel1.add(passwordField);

        JLabel passwordLabel2 = new JLabel("Confirm Pass");
        passwordLabel2.setBounds(15, 430, 150, 30);
        passwordLabel2.setForeground(new Color(10, 36, 63));
        passwordLabel2.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(passwordLabel2);

        JPasswordField passwordField2 = new JPasswordField();
        passwordField2.setBounds(150, 430, 200, 30);
        panel1.add(passwordField2);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(170, 530, 90, 30);
        submitButton.setFont(new Font("Algerian", Font.PLAIN, 16));
        submitButton.setForeground(new Color(10, 36, 63));
        panel1.add(submitButton);

        submitButton.addActionListener(e -> {
            String User_Name = nameField.getText();
            String Email = emailField.getText();
            String Phone = phoneField.getText();
            char[] Password = passwordField.getPassword();
            char[] Password2 = passwordField2.getPassword();

            // Database connection parameters
            String dbUrl = "jdbc:mysql://localhost:3306/Login";
            String dbUser = "root";
            String dbPass = "";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);

                // Insert user data into the database
                String query = "INSERT INTO user (User_name, Email, Phone, Password, Password2) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, User_Name);
                preparedStatement.setString(2, Email);
                preparedStatement.setString(3, Phone);
                preparedStatement.setString(4, new String(Password)); // Convert char[] to String
                preparedStatement.setString(5, new String(Password2)); // Convert char[] to String

                if (Arrays.equals(Password, Password2)) {
                    preparedStatement.executeUpdate();
                    con.commit();
                    JOptionPane.showMessageDialog(null, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (ClassNotFoundException | SQLException e1) {
                System.err.println("Error: " + e1.getMessage());
            }

            dispose();
        });


        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(45, 74, 119));
        int panel1Height = panel1.getHeight();
        int panel2Y = panel1.getY() + panel1Height;
        panel2.setBounds(0, panel2Y, 450, 340);

        JLabel title = new JLabel("DA STORE");
        title.setFont(new Font("Algerian", Font.BOLD, 36));
        title.setForeground(new Color(255, 255, 255));
        title.setBounds(490, 280, 200, 50);
        panel2.add(title);

        JLabel subtitle = new JLabel("clothes &  shoes");
        subtitle.setFont(new Font("Stencil", Font.PLAIN, 10));
        subtitle.setForeground(new Color(212, 217, 238));
        subtitle.setBounds(536, 314, 100, 30);
        panel2.add(subtitle);


        add(panel1);
        add(panel2);
        setVisible(true);
    }
}

