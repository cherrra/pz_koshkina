import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.Color;
public class JLayeredPaneTest extends JFrame {
    private static final long serialVersionUID = 1L;
    public  JLayeredPaneTest() {
        super("ТеСтОвЫе ШаРиКи");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();

        Figure figure1 = new Figure(Color.magenta, 0, "megashar");
        Figure figure2 = new Figure(Color.cyan, 0, "supershar");
        Figure figure3 = new Figure(Color.green, 0, "minishar");

        figure1.setBounds(50, 100, 100, 100);
        figure2.setBounds(50, 190, 200, 200);
        figure3.setBounds(50, 280, 1000, 1000);

        lp.add(figure1, JLayeredPane.POPUP_LAYER);
        lp.add(figure2, JLayeredPane.PALETTE_LAYER);
        lp.add(figure3, JLayeredPane.PALETTE_LAYER);

        lp.setPosition(figure3, 0);

        setSize(1000,1000);
        setVisible(true);
    }
}
