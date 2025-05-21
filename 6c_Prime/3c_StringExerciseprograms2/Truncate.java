//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()

package assignment;
import java.util.Scanner;

public class Truncate {
	
	  // User-defined method to truncate a string to a given length and add ellipsis
    public static String truncate(String input, int maxLength) {
        if (input == null || maxLength <= 0) {
            return "";
        }
        
        // If input length is less than or equal to maxLength, return original string
        if (input.length() <= maxLength) {
            return input;
        }

        // Otherwise, truncate and add ellipsis
        if (maxLength <= 3) {
            // If maxLength is too small, just return dots (maxLength dots)
            return "...".substring(0, maxLength);
        }

        return input.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string to truncate: ");
        String input = scanner.nextLine();

        System.out.print("Enter the maximum length: ");
        int maxLength = scanner.nextInt();

        String truncated = truncate(input, maxLength);
        System.out.println("Truncated string: " + truncated);

        scanner.close();
    }
    

}
