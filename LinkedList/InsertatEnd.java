//3. Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))

package assignment;

import java.util.LinkedList;

public class InsertatEnd {
	
	public static void main(String[] args) {
        // Creating a LinkedList of colors
        LinkedList<String> colorList = new LinkedList<>();

        // Adding some colors
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");

        // Display original list
        System.out.println("Original LinkedList: " + colorList);

        // Inserting "Pink" at the end
        colorList.offerLast("Pink");

        // Display updated list
        System.out.println("LinkedList after adding 'Pink' at the end: " + colorList);
    }

}
