package dastore;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Product {
    private String name;
    private ImageIcon image;
    private double price;

    public Product(String name, ImageIcon image, double price) {
        this.image = resizeImageIcon(image, 250, 250);
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ImageIcon getImage() {
        return image;
    }

    public double getPrice() {
        return price;
    }

    private ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }
}

public class ProductFrame extends JFrame {
    private java.util.List<Product> products;

    public ProductFrame() {
        setTitle("SHOES Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setBackground(Color.black);
        ImageIcon frameIcon = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\Da store.png");
        setIconImage(frameIcon.getImage());

        products = new ArrayList<>();
        products.add(new Product("Code: 234567", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img1.jpeg"), 10.99));
        products.add(new Product("Code: 343342", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img2.jpeg"), 12.99));
        products.add(new Product("Code: 444537", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img5.jpeg"), 8.99));
        products.add(new Product("Code: 222222", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img3.jpeg"), 10.99));
        products.add(new Product("Code: 337788", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img6.jpeg"), 12.99));
        products.add(new Product("Code: 123456", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img5.jpeg"), 8.99));
        products.add(new Product("Code: 223347", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img1.jpeg"), 10.99));
        products.add(new Product("Code: 222228", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img2.jpeg"), 12.99));
        products.add(new Product("Code: 266655", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img3.jpeg"), 8.99));
        products.add(new Product("Code :211110", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img4.jpeg"), 10.99));
        products.add(new Product("Code: 122221", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img5.jpeg"), 12.99));
        products.add(new Product("Code: 234567", new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\img1.jpeg"), 10.99));
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(3, 3, 10, 10));

        for (Product product : products) {
            JPanel panel = new JPanel(new BorderLayout(5, 5));

            JLabel nameLabel = new JLabel(product.getName(), SwingConstants.CENTER);
            JLabel imageLabel = new JLabel(product.getImage());
            JLabel priceLabel = new JLabel("Price:  $" + product.getPrice(), SwingConstants.CENTER);

            JPanel titlePanel = new JPanel(new GridLayout(2, 1));
            titlePanel.add(nameLabel);
            titlePanel.add(priceLabel);

            panel.add(titlePanel);
            titlePanel.setBounds(50,190,120,50);
            titlePanel.setBackground(Color.white);
            panel.add(imageLabel, BorderLayout.CENTER);

            productPanel.add(panel);
        }

        JScrollPane scrollPane = new JScrollPane(productPanel);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton addToCartButton = new JButton("Add to Cart");
        addToCartButton.setPreferredSize(new Dimension(120, 30));
        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JFrame shopFrame = new Shop();
                shopFrame.setVisible(true);
            }
        });

        buttonPanel.add(addToCartButton);
        add(buttonPanel, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
