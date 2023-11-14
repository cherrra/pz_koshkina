import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame {
        private static final long serialVersionOID = 1L;

        private JTextField textField;
        private JButton button1;
        private JButton button2;
        private JButton button3;

    public TestFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        button1 = new JButton("button");
        button1.setActionCommand("button 1 was pressed");
        panel.add(button1);

        button2 = new JButton("button");
        button2.setActionCommand("button 2 was pressed");
        panel.add(button2);

        button3 = new JButton("button");
        button3.setActionCommand("button 3 was pressed");
        panel.add(button3);

        textField = new JTextField();
        textField.setColumns(23);
        panel.add(textField);

        ActionListener actionListener = new TestActionListener();

        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);

        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100));
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textField.setText(e.getActionCommand());
        }
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TestFrame frame = new TestFrame();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
