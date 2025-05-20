//Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)



package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ColorSort {
	
	 public static void main(String[] args) {
	        // Creating an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding colors to the list
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Displaying the original list
	        System.out.println("Original color list: " + colors);

	        // Sorting the list
	        Collections.sort(colors);

	        // Displaying the sorted list
	        System.out.println("Sorted color list: " + colors);
	    }

}
