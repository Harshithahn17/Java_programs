//4. Write a Java program to display elements and their positions in a linked list ( using
 //l_listobj.get(p) )

package assignment;

import java.util.LinkedList;

public class DisplayatPosition {
	
	 public static void main(String[] args) {
	        // Creating a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Adding some colors
	        colorList.add("Red");
	        colorList.add("Green");
	        colorList.add("Blue");
	        colorList.add("Yellow");
	        colorList.add("Black");

	        // Displaying elements with their positions
	        System.out.println("Elements and their positions in the LinkedList:");
	        for (int i = 0; i < colorList.size(); i++) {
	            System.out.println("Position " + i + ": " + colorList.get(i));
	        }
	    }

}
