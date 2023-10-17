
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class thirdGUIclass extends JFrame implements ActionListener {
    public static final int width = 900;
    public static final int height = 800;
    public static final int number_of_char = 30;
    JTextField firstName, lastName, email, address, phone, dob, username, password;

    public static void main(String[] args) {
        thirdGUIclass gui = new thirdGUIclass();
        gui.setVisible(true);
    }

    public thirdGUIclass() {
        super();
        setSize(width, height);
        setTitle("First window GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // First Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel firstNameLabel = new JLabel("First Name:");
        add(firstNameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        firstName = new JTextField(number_of_char);
        add(firstName, gbc);

        // Last Name
        gbc.gridx = 2;
        gbc.gridy = 0;
        JLabel lastNameLabel = new JLabel("Last Name:");
        add(lastNameLabel, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        lastName = new JTextField(number_of_char);
        add(lastName, gbc);

        // Email
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel emailLabel = new JLabel("Email:");
        add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        email = new JTextField(number_of_char);
        add(email, gbc);

        // Address
        gbc.gridx = 2;
        gbc.gridy = 1;
        JLabel addressLabel = new JLabel("Address:");
        add(addressLabel, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        address = new JTextField(number_of_char);
        add(address, gbc);

        // Phone
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel phoneLabel = new JLabel("Phone:");
        add(phoneLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        phone = new JTextField(number_of_char);
        add(phone, gbc);

        // DOB
        gbc.gridx = 2;
        gbc.gridy = 2;
        JLabel dobLabel = new JLabel("DOB:");
        add(dobLabel, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        dob = new JTextField(number_of_char);
        add(dob, gbc);

        // Username
        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel usernameLabel = new JLabel("Username:");
        add(usernameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        username = new JTextField(number_of_char);
        add(username, gbc);

        // Password
        gbc.gridx = 2;
        gbc.gridy = 3;
        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        password = new JTextField(number_of_char);
        add(password, gbc);

        // Confirm button
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(Color.PINK);
        JButton confirmButton = new JButton("Confirm");
        confirmButton.addActionListener(this);
        buttonPanel.add(confirmButton);
        add(buttonPanel, gbc);
    }

    public void actionPerformed(ActionEvent e) {
        // Perform action when the confirm button is clicked
        JOptionPane.showMessageDialog(this, "Form submitted!");
    }
}

