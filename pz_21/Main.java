import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //размеры окошка
        int w = 900;
        int h = 800;
        //создаем окошко
        JFrame f = new JFrame();
        DrawingCanvas dc = new DrawingCanvas(w, h);
        f.setSize(w, h);
        //заголовок
        f.setTitle("Светофор");
        f.add(dc);
        //метод ЗаКрЫтИя
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //видимость
        f.setVisible(true);
    }
}
