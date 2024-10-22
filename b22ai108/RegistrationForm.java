import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel rollnoLabel = new JLabel("Rollno:");
        JTextField rollnoField = new JTextField();
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField();
        JButton submitButton = new JButton("Submit");
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(rollnoLabel);
        frame.add(rollnoField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(new JLabel());
        frame.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String rollno = rollnoField.getText();
                String phone = phoneField.getText();
                try (FileWriter writer = new FileWriter("registration.txt", true)) {
                    writer.write("Name: " + name + "\n");
                    writer.write("Rollno: " + rollno + "\n");
                    writer.write("Phone: " + phone + "\n");
                    writer.write("--------\n");
                    JOptionPane.showMessageDialog(frame, "Registration successful!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error writing to file: " + ex.getMessage());
                }
            }
        });
        frame.setVisible(true);
    }
}
