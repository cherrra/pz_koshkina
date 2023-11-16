import javax.swing.*;
import java.awt.event.*;

//создаем класс фрейма с полями, кнопками
public class JOptionPaneTest extends JFrame {
    private JPanel contents = null;
    private JButton btnMessage1 = null;
    private JButton btnMessage2 = null;
    private JButton btnMessage3 = null;

    private JButton btnConfirm1 = null;
    private JButton btnConfirm2 = null;
    private JButton btnConfirm3 = null;

    private JButton btnInput1 = null;
    private JButton btnInput2 = null;
    private JButton btnInput3 = null;

    private ImageIcon icon = null;
    private final String TITLE_message = "окно сообщения";
    private final String TITLE_confirm = "окно подтверждения";
    private String[] drink = { "сок",
                            "минералка",
                            "лимонад",
                            "пиво" };

    public JOptionPaneTest() {
        super("пример исп JOptionPane"); //название
        setDefaultCloseOperation(EXIT_ON_CLOSE); //чтоб закрыть

//локализация кнопок
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        UIManager.put("OptionPane.cancelButtonText", "Отмена");

//делаем иконку
        contents = new JPanel();
        icon = new ImageIcon("images/warning.png");
//называем кнопочки
        btnMessage1 = new JButton("MessageDialog 2");
        btnMessage2 = new JButton("MessageDialog 4");
        btnMessage3 = new JButton("MessageDialog 5");

        btnConfirm1 = new JButton("ConfirmDialog 4+2");
        btnConfirm2 = new JButton("ConfirmDialog 5");
        btnConfirm3 = new JButton("ConfirmDialog 6");

        btnInput1 = new JButton("InputDialog 2+3");
        btnInput2 = new JButton("InputDialog 4");
        btnInput3 = new JButton("InputDialog 7");

        //вызываем методы
        addMessageListeners(); //для показа
        addConfirmListeners(); //для подтверждения
        addInputListeners(); //для ввода

//размещаем(добавляем) кнопочки в окошко
        contents.add(btnMessage1);
        contents.add(btnMessage2);
        contents.add(btnMessage3);

        contents.add(btnConfirm1);
        contents.add(btnConfirm2);
        contents.add(btnConfirm1);

        contents.add(btnInput1);
        contents.add(btnInput2);
        contents.add(btnInput3);

//чтоб отображалось и по нужным размерам
        setContentPane(contents);
        setSize(500, 140);
        setVisible(true);
    }


    //описываем окна вывода соо message dialog
    private void addMessageListeners() {
        btnMessage1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPaneTest.this,
                        "<html><h2>текст</h2><i>в виде разметки html</i>");
            }
        });

        btnMessage2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPaneTest.this,
                        new String[]{"сообщение в виде массива строк: ",
                                "- первая строка",
                                "- вторая строка"},
                        TITLE_message,
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        btnMessage3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JOptionPaneTest.this,
                        "использование изображения в окне сообщений",
                        TITLE_message, JOptionPane.INFORMATION_MESSAGE,
                        icon);
            }
        });
    }

    //описываем окна подтверждений confirm dialog
    private void addConfirmListeners() {
        btnConfirm1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(
                        JOptionPaneTest.this,
                               "вам это нужно?",
                                       TITLE_confirm,
                                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (result == JOptionPane.YES_OPTION)
                    JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                            "Вы не отказываетесь?");
                else if (result == JOptionPane.NO_OPTION)
                    JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                            "Вы отказались?");

            }
        });

        btnConfirm2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                                                "Вы не отказываетесь?",
                                                        TITLE_confirm,
                                                        JOptionPane.YES_NO_OPTION,
                                                        JOptionPane.WARNING_MESSAGE);

            }});

        btnConfirm3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(JOptionPaneTest.this,
                                                "Вам нравится значок?",
                                                            TITLE_confirm,
                                                            JOptionPane.YES_NO_OPTION,
                                                            JOptionPane.ERROR_MESSAGE,
                                                            icon);
            }});
    }
    //описываем окна выбора данных input dialog
    private void addInputListeners() {
        btnInput1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result = JOptionPane.showInputDialog(
                        JOptionPaneTest.this,
                        "<html><h2>добро пожаловать");
                JOptionPane.showInputDialog(JOptionPaneTest.this,
                                            "вы ответили", result);
            }
        });

        btnInput2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog(JOptionPaneTest.this,
                        new String[] {"неверно введен пароль!",
                                        "повторите пароль: "},
                                    "авторизация" ,
                        JOptionPane.WARNING_MESSAGE);
            }
        });

        btnInput3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object result = JOptionPane.showInputDialog(
                                        JOptionPaneTest.this,
                                                    "Выберите любимый напиток",
                                                        "Выбор напитка",
                                                        JOptionPane.QUESTION_MESSAGE,
                                                        icon, drink, drink[0]);
                JOptionPane.showMessageDialog(JOptionPaneTest.this, result);
            }
        });
    }
}
