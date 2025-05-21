package assignment;




import javax.swing.*;
import java.awt.*;

public class ColorTabbedPaneApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ColorTabbedPaneApp().createGUI());
    }

    public void createGUI() {
        JFrame frame = new JFrame("Color Tabbed Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}

