//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pan



package assignment;


import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ColorTabbedPane().createGUI());
    }

    public void createGUI() {
        // Create a new JFrame
        JFrame frame = new JFrame("Color Tabbed Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each color
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add panels to the tabbed pane
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add tabbed pane to frame
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
