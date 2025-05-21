//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
//Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
//pressed by implementing the event handling mechanism with addActionListener( ).


package assignment;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ImageButtonDemo().createGUI());
    }

    private void createGUI() {
        JFrame frame = new JFrame("Image Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLayout(new FlowLayout());

        // Label to display which button is pressed
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        messageLabel.setForeground(Color.BLUE);

        // Load icons (update paths if needed)
        ImageIcon digitalClockIcon = new ImageIcon("images/digital_clock.jpg");
        ImageIcon hourGlassIcon = new ImageIcon("images/hour_glass.jpg");

        // Create buttons with text and image
        JButton digitalClockBtn = new JButton("Digital Clock", digitalClockIcon);
        JButton hourGlassBtn = new JButton("Hour Glass", hourGlassIcon);

        // Add ActionListeners
        digitalClockBtn.addActionListener(e -> messageLabel.setText("Digital Clock is pressed"));
        hourGlassBtn.addActionListener(e -> messageLabel.setText("Hour Glass is pressed"));

        // Add components to frame
        frame.add(digitalClockBtn);
        frame.add(hourGlassBtn);
        frame.add(messageLabel);

        frame.setVisible(true);
    }
}
