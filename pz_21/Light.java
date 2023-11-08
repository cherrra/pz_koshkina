import java.awt.Color;
import java.awt.geom.Path2D;
import java.awt.Graphics2D;

//класс лайт и его поля
public class Light {
    private Color color;
    private int y;

//конструкторы
    public Light(Color color, int y) {
        this.color = color;
        this.y = y;
    }
//метод рисуем шарики
   public void drawLight(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);
        g2d.fillOval(315, y-20, 100, 100);
        g2d.setColor(Color.BLACK);
        g2d.fillOval(315, y-8, 100, 100);
        g2d.setColor(color);
        g2d.fillOval(320, y, 90, 90);
    }
//метод рисуем стрелочки
    public void drawEar(Graphics2D g2d) {
        int x = 440;
        int x2 = 290;
        g2d.setColor(Color.MAGENTA);
        //правые стрелочки
        Path2D.Double ear = new Path2D.Double();
        ear.moveTo(x, y+59);
        ear.lineTo(x, y+4);
        ear.quadTo(x, y-1, x+5, y-1);
        ear.lineTo(x+60, y-1);
        ear.quadTo(x+65, y-1, x+65, y+6);
        ear.lineTo(x+5, y+64);
        ear.quadTo(x, y+64, x, y+59);
        g2d.fill(ear);
        //левые стрелочки
        Path2D.Double ear2 = new Path2D.Double();
        ear2.moveTo(x2, y+59);
        ear2.lineTo(x2, y+4);
        ear2.quadTo(x2, y-1, x2-5, y-1);
        ear2.lineTo(x2-60, y-1);
        ear2.quadTo(x2-65, y-1, x2-65, y+6);
        ear2.lineTo(x2-5, y+64);
        ear2.quadTo(x2, y+64, x2, y+59);
        g2d.fill(ear2);
    }
}


