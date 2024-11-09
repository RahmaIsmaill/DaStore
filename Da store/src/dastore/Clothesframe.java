
package dastore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Clothesframe extends JFrame {




    public Clothesframe(){
        ImageIcon icon = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\Da store.png");
        setIconImage(icon.getImage());

        setTitle("Clothes Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        setBackground(new Color(255, 255, 255));

        JLabel titleLabel = new JLabel("Da Store Gallery", SwingConstants.CENTER);
        titleLabel.setForeground(new Color(51, 140, 168));
        titleLabel.setFont(new Font("Algerian", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);


        JPanel productsPanel = new JPanel();
        productsPanel.setLayout(new GridLayout(2, 3, 10, 10)); // 2 rows, 3 columns, with gaps of 10 pixels
        //productsPanel.setBackground(new Color(255,255,255));


        String[] productNames = {"# of Code : 334127 ", "# of Code : 889032", "# of Code : 342789", "# of Code : 421754", "# of Code : 590322", "# of Code : 695123"};
        String[] prices = {"$100.00", "$150.00", "$200.00", "$250.00", "$300.00", "$350.00"};
        String[] imagePaths = {"C:\\Users\\kompu tek\\Desktop\\images\\img6.png", "C:\\Users\\kompu tek\\Desktop\\images\\img13.png", "C:\\Users\\kompu tek\\Desktop\\images\\img2.png", "C:\\Users\\kompu tek\\Desktop\\images\\img18.png", "C:\\Users\\kompu tek\\Desktop\\images\\img3.png", "C:\\Users\\kompu tek\\Desktop\\images\\img16.png"};


        for (int i = 0; i < productNames.length; i++) {
            JPanel productPanel = createProductPanel(productNames[i], prices[i], imagePaths[i]);
            productsPanel.add(productPanel);
        }


        add(productsPanel, BorderLayout.CENTER);


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton nextPageButton = new JButton("Buy shoes");
        nextPageButton.setFont(new Font("Algerian", Font.BOLD, 18));
        nextPageButton.setForeground(new Color(51, 140, 168));
        nextPageButton.setBackground(new Color(255, 255, 255));

        nextPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Frame ProductFrame = new ProductFrame();
                ProductFrame.setVisible(true);
                System.out.println("Go for Booking...");
            }
        });

        buttonPanel.add(nextPageButton);
        add(buttonPanel, BorderLayout.SOUTH);


        setVisible(true);
    }

    private static JPanel createProductPanel(String name, String price, String imagePath) {
        // Create a panel for each product
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(255, 255, 255));



        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel, BorderLayout.CENTER);


        JLabel nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Algerian", Font.BOLD, 16));
        panel.add(nameLabel, BorderLayout.NORTH);


        JLabel priceLabel = new JLabel("Price: " + price);
        panel.add(priceLabel, BorderLayout.SOUTH);
        priceLabel.setFont(new Font("Algerian", Font.PLAIN, 16));
        return panel;
    }
}


