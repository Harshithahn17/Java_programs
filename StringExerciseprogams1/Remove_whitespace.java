//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()

package assignment;

import java.util.Scanner;

public class Remove_whitespace {

	  // User-defined method to remove all whitespace characters from a string
    public static String removeWhitespace(String input) {
        if (input == null) {
            return null;
        }
        // Replace all whitespace characters (space, tab, newline, etc.) with empty string
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();

        String result = removeWhitespace(input);
        System.out.println("String after removing whitespace: '" + result + "'");

        scanner.close();
    }
}
