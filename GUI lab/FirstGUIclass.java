import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FirstGUIclass extends JFrame implements ActionListener {
    public static final int width = 400;
    public static final int height = 300;
    public static final int number_of_char = 30;
    JTextField firstName, lastName, email, address, phone, dob, username, password, gender;

    public static void main(String[] args) {
        FirstGUIclass gui = new FirstGUIclass();
        gui.setVisible(true);
    }

    public FirstGUIclass() {
        super();
        setSize(width, height);
        setTitle("First window GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // First Name;
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel firstNameLabel = new JLabel("First Name:");
        add(firstNameLabel);

        gbc.gridx = 1;
        gbc.gridy = 0;
        firstName = new JTextField(number_of_char);
        add(firstName);

        // Last Name;
        gbc.gridx = 2;
        gbc.gridy = 0;
        JLabel lastNameLabel = new JLabel("Last Name:");
        add(lastNameLabel);

        gbc.gridx = 3;
        gbc.gridy = 0;
        lastName = new JTextField(number_of_char);
        add(lastName);

        // Email;
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel emailLabel = new JLabel("Email:");
        add(emailLabel);

        gbc.gridx = 1;
        gbc.gridy = 1;
        email = new JTextField(number_of_char);
        add(email);

        // Address
        gbc.gridx = 2;
        gbc.gridy = 1;
        JLabel addressLabel = new JLabel("Address:");
        add(addressLabel);

        gbc.gridx = 3;
        gbc.gridy = 1;
        address = new JTextField(number_of_char);
        add(address);

        // Phone;
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel phoneLabel = new JLabel("Phone:");
        add(phoneLabel);

        gbc.gridx = 1;
        gbc.gridy = 2;
        phone = new JTextField(number_of_char);
        add(phone);

        // DOB;
        gbc.gridx = 2;
        gbc.gridy = 2;
        JLabel dobLabel = new JLabel("DOB:");
        add(dobLabel);

        gbc.gridx = 3;
        gbc.gridy = 2;
        dob = new JTextField(number_of_char);
        add(dob);

        // Username;
        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel usernameLabel = new JLabel("Username:");
        add(usernameLabel);

        gbc.gridx = 1;
        gbc.gridy = 3;
        username = new JTextField(number_of_char);
        add(username);

        // Password;
        gbc.gridx = 2;
        gbc.gridy = 3;
        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel);

        gbc.gridx = 3;
        gbc.gridy = 3;
        password = new JTextField(number_of_char);
        add(password);

        JLabel genderLabel = new JLabel("Gender:");
        add(genderLabel);

        gender = new JTextField(number_of_char);
        add(gender);

        // Confirm button;
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(Color.PINK);
        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(this);
        buttonPanel.add(confirmButton);
        add(buttonPanel);
    }

    public void actionPerformed(ActionEvent e) {
        // Perform action when the confirm button is clicked
        JOptionPane.showMessageDialog(FirstGUIclass.this, "Form submitted!");
    }
}
