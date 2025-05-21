//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()


package assignment;

import java.util.Scanner;

public class CountOccur {

	// User-defined method to count occurrences of a substring in a main string
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop to find all occurrences of subStr in mainStr
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();  // Move past the last found substring
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String subStr = scanner.nextLine();

        int occurrences = countOccurrences(mainStr, subStr);
        System.out.println("The substring \"" + subStr + "\" appears " + occurrences + " times in the main string.");

        scanner.close();
    }
}
