//Q9. Write a Java Program for Creating a random string of a specified length using user defined
//function generateRandomString()

package assignment;

import java.util.Random;
import java.util.Scanner;

public class generaterandom {
	
	 // User-defined method to generate random string of given length
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of random string to generate: ");
        int length = scanner.nextInt();

        String randomString = generateRandomString(length);
        System.out.println("Generated random string: " + randomString);

        scanner.close();
    }

}
