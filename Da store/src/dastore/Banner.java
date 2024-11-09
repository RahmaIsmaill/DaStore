package dastore;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class Banner extends JWindow {
        private static final int width = 900;
        private static final int heigh = 600;

        public Banner(JFrame mainFrame) {
            ImageIcon Img = new ImageIcon("C:\\Users\\kompu tek\\Desktop\\Da-store (3)\\Da store\\Da store\\src\\dastore\\images\\banner.png");
            Image image = Img.getImage().getScaledInstance(width, heigh, Image.SCALE_SMOOTH);
            ImageIcon resizedImg = new ImageIcon(image);

            JLabel Imgg = new JLabel(resizedImg);
            getContentPane().add(Imgg);
            setSize(width, heigh);
            setLocationRelativeTo(null);
            Imgg.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dispose();
                    mainFrame.setVisible(true);
                }
            });
        }
    }