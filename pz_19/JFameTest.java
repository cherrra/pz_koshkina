import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JFameTest {
    public static void createGUI() {
        JFrame frame = new JFrame("тЕСТОвое окно");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("блаблабаблабла");
        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(1000, 500));

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}
