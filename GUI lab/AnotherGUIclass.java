import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class AnotherGUIclass extends JFrame implements ActionListener {
    public static final int width = 800;
    public static final int height = 500;
    public static final int number_of_char = 30;

    JTextField input;

    public static void main(String[] args) {
        AnotherGUIclass gui = new AnotherGUIclass();
        gui.setVisible(true);
    }

    public AnotherGUIclass() {
        super();
        setSize(width, height);
        setTitle("Another GUI window");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 1));
        JPanel inputpanel = new JPanel();
        inputpanel.setLayout(new BorderLayout());
        inputpanel.setBackground(Color.WHITE);

        input = new JTextField(number_of_char);
        JLabel nameLabel = new JLabel("Enter Your name here");
        inputpanel.add(nameLabel, BorderLayout.CENTER);
        inputpanel.add(input, BorderLayout.SOUTH);
        add(inputpanel);

        JPanel objbutton = new JPanel();
        objbutton.setLayout(new FlowLayout());
        objbutton.setBackground(Color.PINK);
        JButton actionButton = new JButton("Click Me!");
        actionButton.addActionListener(this);
        objbutton.add(actionButton);

        JButton clearButton = new JButton("Clear Data");
        clearButton.addActionListener(this);
        objbutton.add(clearButton);

        add(objbutton);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Click Me!")) {
            input.setText("Hello" + " " + input.getText());
        } else if (actionCommand.equals("Clear")) {
            input.setText("");
        } else {
            input.setText("Unexpected Error");
        }
    }
}
