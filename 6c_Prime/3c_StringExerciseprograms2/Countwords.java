//Q10. Write a Java Program for Counting the number of words in a string using user defined function
//countWords()

package assignment;

import java.util.Scanner;

public class Countwords {
	

    // User-defined method to count the number of words in a string
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        
        // Split the string based on one or more whitespace characters
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Number of words in the string: " + wordCount);

        scanner.close();
    }

}
