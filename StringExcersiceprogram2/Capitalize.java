//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()

package assignment;

import java.util.Scanner;

public class Capitalize {
	
	  // User-defined method to capitalize first letter of each word
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");  // Split by whitespace
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter + add rest of the word in lowercase
                capitalized.append(Character.toUpperCase(word.charAt(0)));
                capitalized.append(word.substring(1).toLowerCase());
                capitalized.append(" ");
            }
        }
        return capitalized.toString().trim();  // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to capitalize: ");
        String input = scanner.nextLine();

        String result = capitalizeWords(input);
        System.out.println("Capitalized string: " + result);

        scanner.close();
    }

}
