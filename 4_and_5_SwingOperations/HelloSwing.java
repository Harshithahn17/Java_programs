//4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
//Programming in Blue color plain font with font size of 32 using Jframe and Jlabel

package assignment;



import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Run GUI code on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            // Create JFrame
            JFrame frame = new JFrame("Hello Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 200);
            frame.setLayout(new FlowLayout());

            // Create JLabel with message
            JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

            // Set font: PLAIN style, size 32
            label.setFont(new Font("SansSerif", Font.PLAIN, 32));

            // Set text color to blue
            label.setForeground(Color.BLUE);

            // Add label to frame
            frame.add(label);

            // Show the frame
            frame.setVisible(true);
        });
    }
}
