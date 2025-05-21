//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
//pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
//event handling mechanism with addActionListener( ).


package assignment;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountryButtonDemo().createGUI());
    }

    private void createGUI() {
        JFrame frame = new JFrame("Country Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 150);
        frame.setLayout(new FlowLayout());

        // Label to show the message inside the frame
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("SansSerif", Font.BOLD, 16));

        // Buttons
        JButton srilankaBtn = new JButton("Srilanka");
        JButton indiaBtn = new JButton("India");

        // ActionListeners to update the label text
        srilankaBtn.addActionListener(e -> messageLabel.setText("Srilanka is pressed"));
        indiaBtn.addActionListener(e -> messageLabel.setText("India is pressed"));

        // Add components to frame
        frame.add(srilankaBtn);
        frame.add(indiaBtn);
        frame.add(messageLabel);

        frame.setVisible(true);
    }
}
