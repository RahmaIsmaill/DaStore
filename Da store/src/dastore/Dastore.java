package dastore;

//import dastore.out.production.dastore.dastore.Clothesframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class PurchaseFrame extends JFrame {
    public PurchaseFrame() {
        setTitle("Purchase Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        JLabel purchaseLabel = new JLabel("Welcome to the Purchase Page!");
        add(purchaseLabel, BorderLayout.CENTER);
    }
}
public  class Dastore extends JFrame {
    public Dastore() {
        ImageIcon icon = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\Da store.png");
        setIconImage(icon.getImage());
        setTitle("Dastore");
        //*****************************************
        setBounds(340, 120, 720, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //*****************************************
        JLabel title = new JLabel("DA STORE");
        title.setFont(new Font("Algerian", Font.PLAIN, 36));
        title.setForeground(new Color(204, 255, 255));
//*********************************************************
        JLabel subtitle = new JLabel("FOUNDERS : ");
        subtitle.setBackground(new java.awt.Color(102, 204, 255));
        subtitle.setFont(new java.awt.Font("Stencil", Font.BOLD, 14));
        subtitle.setForeground(new java.awt.Color(204, 255, 255));
//****************************************************
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(10, 36, 63));
//************************************************************
        panel.add(title);
        title.setBounds(250, 2, 200, 100);
//************************************************************
        panel.add(subtitle);
        subtitle.setBounds(10, 85, 100, 30);
//************************************************************
        ImageIcon rahma = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\Rahoma (1).jpg");
        ImageIcon hager = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\Hager.jpg");
        ImageIcon nayera = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\nyra.jpeg");
        ImageIcon eman = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\Eman.jpg");
        JLabel Rahma = new JLabel(rahma);
        JLabel Hager = new JLabel(hager);
        JLabel Nayra = new JLabel(nayera);
        JLabel Eman = new JLabel(eman);
        //************************************************************
        panel.add(Rahma);
        Rahma.setBounds(40, 125, 124, 140);
        panel.add(Hager);
        Hager.setBounds(180, 125, 124, 140);
        panel.add(Nayra);
        Nayra.setBounds(360, 125, 124, 155);
        panel.add(Eman);
        Eman.setBounds(500, 125, 124, 140);
        //**************************************************************
        JLabel ER = new JLabel("Rahmaismail@gmail.com");
        ER.setBackground(new java.awt.Color(204, 255, 255));
        ER.setFont(new java.awt.Font("Monotype Corsiva", 1, 12)); // NOI18N
        ER.setForeground(new java.awt.Color(204, 255, 255));
        //**************************************************************
        JLabel EH = new JLabel("Hagermuhammed@gmail.com");
        EH.setFont(new java.awt.Font("Monotype Corsiva", 1, 12)); // NOI18N
        EH.setForeground(new java.awt.Color(204, 255, 255));
        //*********************************************
        JLabel EE = new JLabel("EmanAhmed@gmail.com");
        EE.setFont(new java.awt.Font("Monotype Corsiva", 1, 12)); // NOI18N
        EE.setForeground(new java.awt.Color(204, 255, 255));
        //************************************************************
        JLabel EN = new JLabel("NayraTalaat@gmail.com");
        EN.setFont(new java.awt.Font("Monotype Corsiva", 1, 12)); // NOI18N
        EN.setForeground(new java.awt.Color(204, 255, 255));
        //************************************************************
        panel.add(ER);
        ER.setBounds(45, 280, 150, 40);
        panel.add(EH);
        EH.setBounds(185, 280, 150, 40);
        panel.add(EN);
        EN.setBounds(370, 280, 150, 40);
        panel.add(EE);
        EE.setBounds(520, 280, 150, 40);
        //************************************************************
        JLabel PHR = new JLabel("0128896232");
        PHR.setFont(new java.awt.Font("Monotype Corsiva", 1, 12)); // NOI18N
        PHR.setForeground(new java.awt.Color(204, 255, 255));
        //**************************************************************
        JLabel PHH = new JLabel("0128896234");
        PHH.setFont(new java.awt.Font("Monotype Corsiva", 1, 12)); // NOI18N
        PHH.setForeground(new java.awt.Color(204, 255, 255));
        //*********************************************
        JLabel PHE = new JLabel("0128896236");
        PHE.setFont(new java.awt.Font("Monotype Corsiva", 1, 12)); // NOI18N
        PHE.setForeground(new java.awt.Color(204, 255, 255));
        //************************************************************
        JLabel PHN = new JLabel("0128896238");
        PHN.setFont(new java.awt.Font("Monotype Corsiva", 1, 12)); // NOI18N
        PHN.setForeground(new java.awt.Color(204, 255, 255));
        //************************************************************
        panel.add(PHR);
        PHR.setBounds(70, 300, 150, 40);
        panel.add(PHH);
        PHH.setBounds(215, 300, 150, 40);
        panel.add(PHN);
        PHN.setBounds(400, 300, 150, 40);
        panel.add(PHE);
        PHE.setBounds(550, 300, 150, 40);
        //***********************************************************
        JTextArea Text = new JTextArea();
        Text.setBackground(new java.awt.Color(10, 36, 63));
        Text.setColumns(20);
        Text.setFont(new Font("Monotype Corsiva", Font.PLAIN, 18));
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setRows(5);
        Text.setText("\n-Da store is a local Egyptian brand that was established in 2018 .\n-our Store provides clothes and shoes with a quality \nthat competes with all brands in the Egyptian market at prices\n that suit all classes.\n -It contains men’s, women’s and children’s clothing, as well as shoes.\n\n         *We hope that you will like our products.* ");
        Text.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Text.setCursor(new java.awt.Cursor(Cursor.HAND_CURSOR));
        panel.add(Text);
        Text.setEditable(false);
        Text.setBounds(16, 380, 600, 180);

        //**********************************************************
        JButton Click = new JButton();
        Click.setFont(new Font("Old English Text MT", Font.BOLD, 18));
        Click.setForeground(new Color(10, 36, 63));
        Click.setText("Click here to purchase");
        Click.setBounds(436, 570, 230, 25);
        Click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null ,"Welcome^^");
               dispose();
        JFrame purchase=new Clothesframe();
        purchase.setVisible(true);

            }
        });

        panel.add(Click);
        //**********************************************************
        add(panel, BorderLayout.CENTER);
    }
}