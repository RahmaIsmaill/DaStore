package dastore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Shop extends JFrame {
    public Shop() {
        ImageIcon icon = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\Da store.png");
        setIconImage(icon.getImage());
        setTitle("Dastore");

        setBounds(340, 120, 720, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(212, 217, 238));
        panel1.setBounds(0, 0, 450, 680);

        JLabel shopLabel = new JLabel("Shop Now");
        shopLabel.setFont(new Font("Algerian", Font.PLAIN, 36));
        shopLabel.setForeground(new Color(44, 70, 96));
        shopLabel.setBounds(150, 10, 200, 50);
        panel1.add(shopLabel);


        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(15, 80, 150, 30);
        nameLabel.setForeground(new Color(10, 36, 63));
        nameLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(105, 80, 200, 30);
        panel1.add(nameField);

        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(15, 120, 150, 30);
        phoneLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(phoneLabel);

        JTextField phoneField = new JTextField();
        phoneField.setBounds(105, 120, 200, 30);
        panel1.add(phoneField);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(15, 160, 150, 30);
        addressLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(addressLabel);

        JTextField addressField = new JTextField();
        addressField.setBounds(105, 160, 200, 30);
        panel1.add(addressField);

        JLabel numberLabel = new JLabel("# of pieces");
        numberLabel.setBounds(12, 230, 150, 30);
        numberLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(numberLabel);

        JComboBox<String> numberComboBox = new JComboBox<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
        numberComboBox.setBounds(150, 230, 80, 30);
        panel1.add(numberComboBox);


        JLabel codeLabel = new JLabel("Code");
        codeLabel.setBounds(20, 290, 150, 30);
        codeLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        panel1.add(codeLabel);

        JComboBox<String> codeComboBox = new JComboBox<>(new String[]{"204589", "106739", "345686", "344713", "568955", "345678", "235469" , "334127" , "889032" , "342789" , "421754" , "590322" , "695123"});
        codeComboBox.setBounds(150, 290, 80, 30);
        panel1.add(codeComboBox);


        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(120, 500, 90, 30);
        exitButton.setFont(new Font("Algerian", Font.PLAIN, 16));
        exitButton.setForeground(new Color(10, 36, 63));
        panel1.add(exitButton);

        JButton buycl = new JButton("Buy shoes");
        buycl.setBounds(20, 400, 120, 30);
        buycl.setFont(new Font("Algerian", Font.ITALIC, 12));
        buycl.setForeground(new Color(10, 36, 63));
        panel1.add(buycl);

        JButton checkButton = new JButton("Buy clothes");
        checkButton.setBounds(190, 400, 120, 30);
        checkButton.setFont(new Font("Algerian", Font.ITALIC, 12));
        checkButton.setForeground(new Color(10, 36, 63));
        panel1.add(checkButton);

        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBounds(20, 450, 120, 30);
        confirmButton.setFont(new Font("Algerian", Font.PLAIN, 16));
        confirmButton.setForeground(new Color(10, 36, 63));
        panel1.add(confirmButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(190, 450, 120, 30);
        clearButton.setFont(new Font("Algerian", Font.PLAIN, 16));
        clearButton.setForeground(new Color(10, 36, 63));
        panel1.add(clearButton);

        confirmButton.addActionListener(e -> {
       JOptionPane.showMessageDialog(null, "YOUR ORDER HAS BEEN ADDED SUCCESSFULLY !", "  Da Store  ",JOptionPane.PLAIN_MESSAGE);
                dispose();
        });

        exitButton.addActionListener(e -> {
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "  Exit  ",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION)
                System.exit(0);
        });

        buycl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame shopFrame = new ProductFrame();
                shopFrame.setVisible(true);
            }
        });
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame shopFrame = new Clothesframe();
                shopFrame.setVisible(true);
            }
        });
        clearButton.addActionListener(e -> {
                nameField.setText("");
                phoneField.setText("");
                addressField.setText("");
                numberComboBox.setSelectedIndex(0);
                codeComboBox.setSelectedIndex(0);
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