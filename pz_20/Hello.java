import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Hello {
    public static void main(String [] args) {
        //объект класса с пустым конструктором
        JFrame jFrame = new JFrame(){};
        //метод видимости объекта с параметром true(виден)
        jFrame.setVisible(true);
        //метод НаЖмИ на крестик и окно ЗаКрОеЦа
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //НаШ рАзМеРчИк(размер окна)
        // jFrame.setSize(500,300);

        //методы для расположения
        //расположение по x y    jFrame.setLocation(500,400);
        //метод размер + координаты jFrame.setBounds(500,500,500, 300);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize(); //получение размера окна с высотой и шириной + расположение по середине экрана
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        jFrame.setTitle("Мама я в телике!!!"); //заголовчик
    }
}
