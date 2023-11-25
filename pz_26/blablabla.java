import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class blablabla extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextField textField1;
    private JSpinner spinner1;
    private JRadioButton ламинатRadioButton;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JList list1;
    private JCheckBox даCheckBox;
    private JCheckBox даCheckBox1;
    private JCheckBox ДАCheckBox;
    private JCheckBox дАCheckBox;
    private JSlider slider1;
    private JPasswordField passwordField1;
    private JButton оформитьКотоподпискуButton;

    private void createUIComponents() {
        panel1 = new JPanel();
        textField1 = new JTextField();
        spinner1 = new JSpinner();
        ламинатRadioButton = new JRadioButton();
        textField2 = new JTextField();
        textField3 = new JTextField();
        comboBox1 = new JComboBox();
        list1 = new JList();
        даCheckBox = new JCheckBox();
        даCheckBox1 = new JCheckBox();
        ДАCheckBox = new JCheckBox();
        дАCheckBox = new JCheckBox();
        slider1 = new JSlider();
        passwordField1 = new JPasswordField();
        оформитьКотоподпискуButton = new JButton();
    }

    public blablabla() {
        this.getContentPane().add(panel1);
        оформитьКотоподпискуButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == оформитьКотоподпискуButton) {
            String message = "Введенные данные:\n" +
                    "ФИО: " + textField1.getText() + "\n" +
                    "Номер: " + textField2.getText() + "\n" +
                    "Куда слать котов: " + textField3.getText() + "\n" +
                    "Возраст: " + spinner1.getValue() + "\n" +
                    "Когда слать котов: " + comboBox1.getSelectedItem() + "\n" +
                    "Каких котов: " + list1.getSelectedValue() + "\n" +
                    "Любите котов: " + даCheckBox.isSelected() + "\n" +
                    "Сколько у вас котов: " + slider1.getValue() + "\n" +
                    "Введенный пароль: " + new String(passwordField1.getPassword());
            JOptionPane.showMessageDialog(this, message);
        }
    }
}
