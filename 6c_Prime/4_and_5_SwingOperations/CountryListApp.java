//5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
//Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display them on console whenever the countries are selected on the list.


package assignment;



import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;

public class CountryListApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountryListApp().createGUI());
    }

    public void createGUI() {
        JFrame frame = new JFrame("Country List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        String[] countries = {
            "USA", "India", "Vietnam", "Canada",
            "Denmark", "France", "Great Britain", "Japan",
            "Africa", "Greenland", "Singapore"
        };

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(countryList);

        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected countries:");
                    for (String country : selectedCountries) {
                        System.out.println(country);
                    }
                }
            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

