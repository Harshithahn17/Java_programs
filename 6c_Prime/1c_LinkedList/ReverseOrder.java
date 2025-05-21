//2. Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())

package assignment;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseOrder {
	
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

        // Iterating in reverse using descendingIterator()
        System.out.println("Iterating in reverse order:");
        Iterator<String> reverseIterator = colors.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }

}
