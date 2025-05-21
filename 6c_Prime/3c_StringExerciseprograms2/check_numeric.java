//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()

package assignment;

import java.util.Scanner;

public class check_numeric {


    // User-defined method to check if string contains only numeric characters
    public static boolean isNumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        // Check each character; if any is not a digit, return false
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if numeric: ");
        String input = scanner.nextLine();

        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string contains non-numeric characters.");
        }

        scanner.close();
    }
}
