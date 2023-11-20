import javax.swing.*;

public class JOptionPaneTest {
    public static void main(String[] args) {
        //диалоговое окно
        int option = JOptionPane.showConfirmDialog(null, "хотите оформить подписку на рассылку картинок с котиками???");

        if (option == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else {
            String username = "";
            while (username.length() < 5 || username.contains(" ")) {
                username = JOptionPane.showInputDialog("введите логин (не менее 5 символов):");
            }

            String password = "";
            while (password.length() < 8 || password.contains(" ") || !password.matches(".*\\d.*") || !password.matches(".*[a-zA-Z].*")) {
                JPasswordField passwordField = new JPasswordField();
                int passwordOption = JOptionPane.showConfirmDialog(null, passwordField, "введите пароль (не менее 8 символов, цифры и буквы):", JOptionPane.OK_CANCEL_OPTION);
                if (passwordOption == JOptionPane.OK_OPTION) {
                    password = new String(passwordField.getPassword());
                } else {
                    System.exit(0);
                }
            }

            String confirmPassword = "";
            while (!confirmPassword.equals(password)) {
                JPasswordField confirmField = new JPasswordField();
                int confirmOption = JOptionPane.showConfirmDialog(null, confirmField, "повторите пароль:", JOptionPane.OK_CANCEL_OPTION);
                if (confirmOption == JOptionPane.OK_OPTION) {
                    confirmPassword = new String(confirmField.getPassword());
                } else {
                    System.exit(0);
                }
            }

            JOptionPane.showMessageDialog(null, "поздравляю вы оформили рассылку на котов с вас миллион денег!!!");

            //открываем новое окно с картинкой кота
            JFrame frame = new JFrame("Кот");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon icon = new ImageIcon("src/cat.jpg");
            JLabel label = new JLabel(icon);
            frame.add(label);
            frame.pack();
            frame.setVisible(true);
        }
    }
}
