import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FormGUI implements ActionListener {
    private JTextField[] fields;

    public static void main(String[] args) {
        FormGUI obj = new FormGUI();
        JFrame frame = new JFrame("Example GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 1100);

        JPanel panel = new JPanel(new GridLayout(0, 4, 20, 100));
        panel.setBorder(new EmptyBorder(20, 150, 100, 150));

        String[] labels = {"First Name", "Last Name", "Address", "City", "State", "Zip Code", "Phone", "Email"};
        obj.fields = new JTextField[labels.length];
        for (int i = 0; i < labels.length; i++) {
            panel.add(new JLabel(labels[i]));
            obj.fields[i] = new JTextField(10);
            panel.add(obj.fields[i]);
        }

        JButton button1 = new JButton("Submit");
        button1.addActionListener(obj);
        JPanel buttonRow1 = new JPanel(new FlowLayout());
        buttonRow1.add(button1);
        panel.add(new JPanel());
        panel.add(buttonRow1);

        JButton button2 = new JButton("Cancel");
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.clearFields();
            }
        });
        
        JPanel buttonRow2 = new JPanel(new FlowLayout());
        buttonRow2.add(button2);
        panel.add(buttonRow2);
        panel.add(new JPanel());

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        writeDataToFile();
        JOptionPane.showMessageDialog(null, "Form submitted!");
        System.exit(0);
    }

    private void writeDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            for (JTextField field : fields) {
                writer.write(field.getText());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Unknown error found!"+e);
        }
    }

    private void clearFields() {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
}
