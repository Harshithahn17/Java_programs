//Q3. Write a Java Program for Reversing the characters in a string using user defined function
//reverseString().


package assignment;
import java.util.Scanner;

public class ReverseString {

	  // User-defined method to reverse a string
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        
        scanner.close();
    }
}
