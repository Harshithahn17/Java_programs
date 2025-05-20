//5. Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index


package assignment;
import java.util.ArrayList;
import java.util.Scanner;

public class ColorDelete {
	 public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding some colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display the original list
	        System.out.println("Original color list: " + colors);

	        // Get 'n' from the user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the position (n) of the color to remove (1-based index): ");
	        int n = scanner.nextInt();

	        // Convert to 0-based index
	        int index = n - 1;

	        // Validate and remove
	        if (index >= 0 && index < colors.size()) {
	            String removedColor = colors.remove(index);
	            System.out.println("Removed color: " + removedColor);
	        } else {
	            System.out.println("Invalid position. No color removed.");
	        }

	        // Display updated list
	        System.out.println("Updated color list: " + colors);
	    }

}
