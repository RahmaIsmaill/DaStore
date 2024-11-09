package dastore;
import javax.swing.*;
public class main{

        public static void main(String[] args) {
        JFrame mainFrame = new Login();
        mainFrame.setVisible(false);
        Banner Banner = new Banner(mainFrame);
        Banner.setVisible(true);
    }
}
