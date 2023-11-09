import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.net.URL;

public class Main extends Canvas {
    static int width = 750, height = 750; //размеры

    public static void main(String[] args) throws IOException {
        //создаем и настраиваем окошко
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("dvd logo");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width / 2, dim.height / 2 - height / 2, width, height + 30);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);

        //добавляем картинку и делаем так чтобы она появилась
        BufferedImage screamHead = ImageIO.read
                (new URL("https://www.dvdland.com.au/product_images/p/196/dvd_7__69128_std.jpg"));
        int screamHeadWidth = screamHead.getWidth();
        int screamHeadHight = screamHead.getHeight();
        JLabel wIcon = new JLabel(new ImageIcon(screamHead));
        int startX = (int) (Math.random() * (width - screamHeadWidth)),
                startY = (int) (Math.random() * (height - screamHeadHight));
        wIcon.setBounds(startX, startY, screamHeadWidth, screamHeadHight); //начальное положение картинки
        frame.add(wIcon); //картинка на фон

        //бесконечный цикл чтобы картинка двигалась
        while (true) {
            int newX = (int) (Math.random() * (width - screamHeadWidth)),
                    newY = (int) (Math.random() * (height - screamHeadHight));
            int[][] path = drawBresenhamLine(startX, startY, newX, newY);

            startX = newX;
            startY = newY;
            for (int i = 5; i < path.length; i += 5) {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                wIcon.setBounds(path[i][0], path[i][1], screamHeadWidth, screamHeadHight);
                wIcon.repaint();
            }
        }

    }
//алгоритм Брезенхэма для подсчета координат
    public static int[][] drawBresenhamLine(int xstart, int ystart, int xend, int yend) {
        int x, y, dx, dy, incx, incy, pdx, pdy, es, el, err;

        dx = xend - xstart;
        dy = yend - yend;

        incx = sign(dx);
        incy = sign(dy);

        if (dx < 0) dx = -dx;
        if (dy < 0) dy = -dy;

        if (dx > dy) {
            pdx = incx;
            pdy = 0;
            es = dy;
            el = dx;
        } else {
            pdx = 0;
            pdy = incy;
            es = dx;
            el = dx;
        }
        x = xstart;
        y = ystart;
        err = el / 2;
        int[][] a = new int[el + 1][2];
        a[0][0] = x;
        a[0][1] = y;

        for (int t = 0; t < el; t++) {
            err -= es;
            if (err < 0) {
                err += el;
                x += incx;
                y += incy;
            } else {
                x += pdx;
                y += pdy;
            }
            a[t + 1][0] = x;
            a[t + 1][1] = y;
        }
        return a;
    }
//в методе Брезенхэма нарисовали все 9 видов отрезков

    private static int sign(int x) {
        return (x > 0 ? 1 : (x < 0) ? -1 : 0);
        //возвращает 0, если аргумент x: -1, если x < 0 и 1, если x > 0
    }
}
