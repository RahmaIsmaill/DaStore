package dastore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame {
    public Login(JFrame mainframe) {}

    public Login() {
        // Set frame properties
        setTitle("Da Store");
        setIconImage(new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\Da store.png").getImage());
        setBounds(340, 120, 720, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up panel1
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(212, 217, 238));
        panel1.setBounds(0, 0, 450, 680);

        // Add login label
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setFont(new Font("Algerian", Font.PLAIN, 36));
        loginLabel.setForeground(new Color(44, 70, 96));
        loginLabel.setBounds(150, 100, 200, 50);
        panel1.add(loginLabel);

        // Add name label and text field
        JLabel nameLabel = new JLabel("Username");
        nameLabel.setBounds(15, 190, 150, 30);
        nameLabel.setForeground(new Color(10, 36, 63));
        nameLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(105, 190, 200, 30);
        panel1.add(nameField);

        // Add password label and password field
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(15, 290, 150, 30);
        passwordLabel.setForeground(new Color(10, 36, 63));
        passwordLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(105, 290, 200, 30);
        panel1.add(passwordField);

        // Add login and sign-up buttons
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 370, 100, 30);
        loginButton.setFont(new Font("Algerian", Font.PLAIN, 16));
        loginButton.setForeground(new Color(10, 36, 63));
        panel1.add(loginButton);



        // Add action listeners
        loginButton.addActionListener(e -> {
            String userName = nameField.getText();
            String password = new String(passwordField.getPassword());

            // Database connection parameters
            String dbUrl = "jdbc:mysql://localhost:3306/Login";
            String dbUser = "root";
            String dbPass = "";

            try {
                // Establish the database connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);

                // Check if the user exists and the password is correct
                String query = "SELECT * FROM user WHERE User_name = ?";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, userName);
                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {
                    String storedPassword = rs.getString("Password");
                    if (password.equals(storedPassword)) {
                        // Correct username and password
                        JOptionPane.showMessageDialog(null, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        dispose(); // Close the current frame
                        JFrame Dastoreframe = new Dastore();
                        Dastoreframe.setVisible(true);
                    } else {
                        // Incorrect password
                        JOptionPane.showMessageDialog(null, "Incorrect password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    // User not found
                    JOptionPane.showMessageDialog(null, "User not found. Please register first.", "Error", JOptionPane.ERROR_MESSAGE);
                    JFrame signUpFrame = new SignUp();
                    signUpFrame.setVisible(true);
                }

                // Close the connection
                rs.close();
                preparedStatement.close();
                con.close();
            } catch (ClassNotFoundException | SQLException ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        });



        // Create and set up panel2
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
