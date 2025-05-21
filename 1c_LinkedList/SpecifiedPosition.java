//Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

package assignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class SpecifiedPosition {
	
	 public static void main(String[] args) {
	        // Creating a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();

	        // Adding some colors
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display original list
	        System.out.println("Original LinkedList: " + colors);

	        // Creating a ListIterator starting from the 2nd element (index 1)
	        ListIterator<String> iterator = colors.listIterator(1);

	        // Iterating from the specified position
	        System.out.println("Iterating from 2nd element:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

}
