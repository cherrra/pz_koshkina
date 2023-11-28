import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainForm extends JFrame{
    private JPanel panel1;
    private JLabel labelFile;
    private JButton saveAsButton;
    private JButton saveButton;
    private JButton openButton;
    private JTextPane typeHereTextPane;

    public File file;

    public MainForm() {
        this.getContentPane().add(panel1);

        openButton.addActionListener(e -> {
            if (dialog(FileDialog.LOAD, "Открыть текстовый файл", "*.txt")) {
                StringBuilder s = new StringBuilder();
                try (FileReader reader = new FileReader(file)) {
                    int c;
                    while ((c = reader.read()) != -1)
                        s.append((char)c);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                typeHereTextPane.setText(s.toString());
                labelFile.setText(file.getName());
            }
        });
    saveButton.addActionListener(e -> {
        if (file!=null) save();
            else saveNew();
    });
    saveAsButton.addActionListener(e -> {
        saveNew();
    });
    }
    private void saveNew() {
        if (typeHereTextPane.getText().length() > 0)
            if (dialog(FileDialog.SAVE, "сохранить текстовый файл", "*.text")) {
                save();
                labelFile.setText(file.getName());
            }
    }

    private void save() {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(typeHereTextPane.getText());
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private boolean dialog(int dialog, String title, String filter) {
        FileDialog fileDialog = new FileDialog(new Frame(), title, dialog);
        fileDialog.setFile(filter);
        fileDialog.setVisible(true);
        File[] files  = fileDialog.getFiles();
        if (files.length > 0) {
            file = files[0];
            return true;
        } else return false;
    }
}
