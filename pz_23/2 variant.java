//библиотеки swing
import javax.swing.JButton; //кнопки
import javax.swing.JFrame; //фрейм
import javax.swing.JPanel; //группировка
import javax.swing.JTextField; //текстовое поле
//библиотеки awt
import java.awt.Event; //событие
import java.awt.Dimension; //размер экрана
import java.awt.FlowLayout; //упорядочивание
import java.awt.event.ActionEvent; //запущенное событие
import java.awt.event.ActionListener; //получает запись при выполнении действия

//создаем класс тестового фрейма и его поля
public class TestFrame extends JFrame {
    private static final long serialVersionOID = 1L;

    private JTextField textField;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public TestFrame() {
        super("Test frame"); //заголовок фрейма
        createGUI(); //создаем интерфейс с таким заголовком
    }
//создаем графический интерфейс с кнопками
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        button1 = new JButton("button"); //название кнопки
        button1.setActionCommand("button 1 was pressed"); //при нажатии кнопки вывод надписи
        panel.add(button1); //группируем

        button2 = new JButton("button");
        button2.setActionCommand("button 2 was pressed");
        panel.add(button2);

        button3 = new JButton("button");
        button3.setActionCommand("button 3 was pressed");
        panel.add(button3);

        //создаем текстовое поле
        textField = new JTextField();
        textField.setColumns(23); //длинна поля
        panel.add(textField); //группируем

        //создаем "слушателя"
        ActionListener actionListener = new TestActionListener();

        //при нажатии кнопки вывод записи в консоль
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);

        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100)); //размер фрейма
    }

    //создаем и вызываем новое событие, при нажатии на button3 выводится новая надпись
    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            System.out.println (button.getText() + ", " +
                    e.getActionCommand());
            if (e.getSource() != button3) {
                textField.setText(e.getActionCommand());
            } else {
                ActionEvent e1 = new ActionEvent(button2,
                        Event.MOUSE_DOWN,
                        "button 3 was pressed programmatically");
                ActionListener[] listeners;
                listeners = button2.getActionListeners();
                listeners[0].actionPerformed(e1);
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true); //отображение оформления
                TestFrame frame = new TestFrame();
                frame.pack();
                frame.setLocationRelativeTo(null); //устанавлиевае располоэение окна
                frame.setVisible(true); //отображение фрейма
            }
        });
    }
}
