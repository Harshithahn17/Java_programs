//Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()



package assignment;

import java.util.ArrayList;
import java.util.List;

public class SearchcolorbyIndex {

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

	        // Extracting the 1st and 2nd elements (index 0 and 1)
	        List<String> subColors = colors.subList(0, 2); // end index is exclusive

	        // Displaying the sublist
	        System.out.println("Extracted sublist (1st and 2nd elements): " + subColors);
	    }
}
