//2. Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color "Blue" from the ArrayList


package assignment;

import java.util.ArrayList;

public class ColorRemove {
	 public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Displaying the original list
	        System.out.println("Original color list: " + colors);

	        // Removing the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedByIndex = colors.remove(1);
	            System.out.println("Removed 2nd element: " + removedByIndex);
	        } else {
	            System.out.println("List has fewer than 2 elements. Skipping index removal.");
	        }

	        // Removing the color "Blue"
	        boolean removedBlue = colors.remove("Blue");
	        if (removedBlue) {
	            System.out.println("Removed color: Blue");
	        } else {
	            System.out.println("Color 'Blue' not found in the list.");
	        }

	        // Displaying the final list
	        System.out.println("Updated color list: " + colors);
	    }

}
