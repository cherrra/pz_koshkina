import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MainForm mainWindow = new MainForm();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width=1000, height=500;
        mainWindow.setBounds(dim.width / 2 - width /2, dim.height / 2 - height / 2, width, height);
        mainWindow.setTitle("Редактор");
        mainWindow.setVisible(true);
    }
}
