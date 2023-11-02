import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
public class ContentPaneReplace extends JFrame {
    private static final long serialVersionUID = 1l;
    public ContentPaneReplace() {
        super("КНОПКИ тестовыЕ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contens = new JPanel();
        contens.add(new JButton("домой"));
        contens.add(new JButton("не в колледж"));
        setContentPane(contens);

        setSize(200, 100);
        setVisible(true);
    }
}
