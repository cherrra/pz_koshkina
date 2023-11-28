import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton submitButton;
    private JComboBox comboBox1;

    public Main() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                String date = textField2.getText();
                String venue = textField3.getText();
                double price = Double.parseDouble(textField4.getText());
                String selectedConcertType = (String) comboBox1.getSelectedItem();

                Concert concert;
                switch (selectedConcertType) {
                    case "Music Concert":
                        concert = new MusicConcert(name, date, venue, price, "Default Performer", "Default Genre");
                        break;
                    case "Classical Concert":
                        concert = new ClassicalConcert(name, date, venue, price, "Default Composer");
                        break;
                    case "Jazz Festival":
                        concert = new JazzFestival(name, date, venue, price, "Default Band");
                        break;
                    case "Rock Festival":
                        concert = new RockFestival(name, date, venue, price, "Default Band");
                        break;
                    case "Dance Performance":
                        concert = new DancePerformance(name, date, venue, price, "Default Dance Style");
                        break;
                    case "Stand-Up Comedy":
                        concert = new StandUpComedy(name, date, venue, price, "Default Comedian");
                        break;
                    default:
                        concert = new MusicConcert(name, date, venue, price, "Default Performer", "Default Genre");
                }

                JOptionPane.showMessageDialog(null, getConcertInfo(concert, selectedConcertType), "Concert Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        UIManager UI = new UIManager();
        UI.put("OptionPane.messageForeground", new ColorUIResource(255, 255, 255));
        UI.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UI.put("Panel.background", new ColorUIResource(137, 136, 203));
        int option = JOptionPane.showConfirmDialog(null, "хотите посетить мероприятие??");

        if (option == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else {
            JFrame frame = new JFrame("Concert Information");
            Main main = new Main();
            frame.setContentPane(main.panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setSize(new Dimension(300, 300));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }


    private static String getConcertInfo(Concert concert, String selectedConcertType) {
        String additionalInfo = "";
        if (concert instanceof JazzFestival) {
            additionalInfo = "Стиль: " + ((JazzFestival) concert).getVibe();
        } else if (concert instanceof RockFestival) {
            additionalInfo = "Группы: " + ((RockFestival) concert).getBands();
        } else if (concert instanceof StandUpComedy) {
            additionalInfo = "Комик: " + ((StandUpComedy) concert).getComedian();
        } else if (concert instanceof ClassicalConcert) {
            additionalInfo = "Композитор: " + ((ClassicalConcert) concert).getComposer();
        } else if (concert instanceof MusicConcert) {
            additionalInfo = "Музыкант: " + ((MusicConcert) concert).getPerformer();
        } else if (concert instanceof DancePerformance) {
            additionalInfo = "Танцевальная группа: " + ((DancePerformance) concert).getDancers();
        }


        return "Билет:\n" +
                "Имя: " + concert.name + "\n" +
                "Дата: " + concert.date + "\n" +
                "Место: " + concert.venue + "\n" +
                "Стоимость: " + concert.ticketPrice + "\n" +
                "Мероприятие: " + selectedConcertType + "\n" +
                additionalInfo;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(7, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-7763765));
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-1));
        label1.setText("Регистрация ");
        panel1.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setForeground(new Color(-1));
        label2.setText("Имя:");
        panel1.add(label2, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setForeground(new Color(-1));
        label3.setText("Дата мероприятия:");
        panel1.add(label3, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setForeground(new Color(-1));
        label4.setText("Место мероприятия:");
        panel1.add(label4, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField1 = new JTextField();
        panel1.add(textField1, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        textField2 = new JTextField();
        panel1.add(textField2, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        textField3 = new JTextField();
        panel1.add(textField3, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        textField4 = new JTextField();
        panel1.add(textField4, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        submitButton = new JButton();
        submitButton.setBackground(new Color(-13093801));
        submitButton.setForeground(new Color(-1));
        submitButton.setText("продолжить");
        panel1.add(submitButton, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setBackground(new Color(-8559105));
        label5.setForeground(new Color(-1));
        label5.setText("Стоимость:");
        panel1.add(label5, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Music Concert");
        defaultComboBoxModel1.addElement("Classical Concert");
        defaultComboBoxModel1.addElement("Jazz Festival");
        defaultComboBoxModel1.addElement("Rock Festival");
        defaultComboBoxModel1.addElement("Dance Performance");
        defaultComboBoxModel1.addElement("Stand-Up Comedy");
        comboBox1.setModel(defaultComboBoxModel1);
        panel1.add(comboBox1, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setForeground(new Color(-1));
        label6.setText("Мероприятие:");
        panel1.add(label6, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

}
