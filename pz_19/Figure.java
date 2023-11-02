import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
public class Figure extends JComponent {
    private static final long serialVersionUID = 1L;
    private Color color;
    private int type;
    private String text;

    Figure(Color color, int type, String text) {
        this.color = color;
        this.type = type;
        this.text = text;
        setOpaque(false);
    }

    public void paintComponent(Graphics g) {
        g.setColor(color);
        switch (type) {
            case 0:
                g.fillOval(0, 0, 500, 700);
                break;
            case 1:
                g.clearRect(0, 0, 130, 80);
                break;
        }
        g.setColor(Color.black);
        g.drawString(text, 40, 50);
    }
}
