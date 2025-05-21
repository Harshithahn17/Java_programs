//5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))

package assignment;

import java.util.LinkedList;
import java.util.Collections;

public class SwaptwoElements {
	
	  public static void main(String[] args) {
	        // Creating a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Adding some colors
	        colorList.add("Red");     // index 0
	        colorList.add("Green");   // index 1
	        colorList.add("Blue");    // index 2
	        colorList.add("Yellow");  // index 3
	        colorList.add("Black");   // index 4

	        // Display original list
	        System.out.println("Original LinkedList: " + colorList);

	        // Swapping first (0) and third (2) elements
	        Collections.swap(colorList, 0, 2);

	        // Display list after swapping
	        System.out.println("LinkedList after swapping 1st and 3rd elements: " + colorList);
	    }

}
