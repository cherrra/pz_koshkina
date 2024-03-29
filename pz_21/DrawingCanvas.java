import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.geom.Path2D;
import java.awt.Graphics2D;
import java.awt.Color;

//класс дравингканвас и его поля
public class DrawingCanvas extends JComponent {
    private int width;
    private int height;
    //объекты класса лайт (цвета)
    private Light red = new Light(Color.RED, 270);
    private Light yellow = new Light(Color.YELLOW, 380);
    private Light green = new Light(Color.GREEN, 490);

    //конструктор размеры
    public DrawingCanvas(int w, int h) {
        this.height = h;
        this.width = w;
    }
//переопределяем метод (цвета, размеры, координаты)
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //тело
        g2d.setColor(Color.MAGENTA);
        g2d.fillRoundRect(300, 240, 130, 360, 25, 25);
        g2d.fillRoundRect(355, 603, 60, 65, 15, 15);
        //свет
        red.drawLight(g2d);
        yellow.drawLight(g2d);
        green.drawLight(g2d);
        //шапка
        Path2D.Double hat = new Path2D.Double();
        hat.moveTo(320, 230);
        hat.lineTo(410, 230);
        hat.quadTo(410.5, 225.5, 410, 225);
        hat.curveTo(390, 215, 330, 215, 320, 225);
        hat.quadTo(315.5, 225.5, 320, 230);
        g2d.setColor(Color.MAGENTA);
        g2d.fill(hat);
        //цвета
        red.drawEar(g2d);
        yellow.drawEar(g2d);
        green.drawEar(g2d);
}
}
