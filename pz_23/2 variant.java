import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Event;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame {
    private static final long serialVersionOID = 1L;

    private JTextField textField;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public TestFrame() {
        super("Test frame");
        createGUI();
    }

    public void createGUI() {
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
                JFrame.setDefaultLookAndFeelDecorated(true);
                TestFrame frame = new TestFrame();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
