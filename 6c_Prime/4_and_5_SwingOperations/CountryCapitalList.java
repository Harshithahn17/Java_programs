//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
//Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display the capital of the countries on console whenever the countries are selected on the list.



package assignment;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;          // includes Map, HashMap, etc.
import java.util.List;        // explicitly imports the correct List interface

public class CountryCapitalList {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CountryCapitalList().createGUI());
    }

    public void createGUI() {
        // Frame setup
        JFrame frame = new JFrame("Country and Capitals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new BorderLayout());

        // Countries and their capitals
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "No single capital"); // Continent
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // Create JList with country names
        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Listener to handle selection and print capitals
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Capitals:");
                    for (String country : selectedCountries) {
                        String capital = countryCapitalMap.get(country);
                        System.out.println(country + " → " + capital);
                    }
                    System.out.println(); // Blank line for clarity
                }
            }
        });

        // Add to frame and display
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
