package Add_elements;


import java.util.*;

public class 1a_ArrayListOperation {
    public static void main(String[] args) {
        // 1. Adding elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("1. Initial List: " + fruits);

        // 2. Adding element at specific index
        fruits.add(1, "Mango");
        System.out.println("2. After adding 'Mango' at index 1: " + fruits);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        fruits.addAll(moreFruits);
        System.out.println("3. After adding multiple elements: " + fruits);

        // 4. Accessing elements
        String fruitAt2 = fruits.get(2);
        System.out.println("4. Element at index 2: " + fruitAt2);

        // 5. Updating elements
        fruits.set(3, "Watermelon");
        System.out.println("5. After updating index 3 to 'Watermelon': " + fruits);

        // 6. Removing elements
        fruits.remove("Banana");
        fruits.remove(0);
        System.out.println("6. After removing 'Banana' and index 0: " + fruits);

        // 7. Searching elements
        boolean hasApple = fruits.contains("Apple");
        int indexOfGrapes = fruits.indexOf("Grapes");
        System.out.println("7. Contains 'Apple'? " + hasApple);
        System.out.println("   Index of 'Grapes': " + indexOfGrapes);

        // 8. List size
        System.out.println("8. List size: " + fruits.size());

        // 9. Iterating over list using for-each
        System.out.print("9. Iterating using for-each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("10. Iterating using Iterator: ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(fruits);
        System.out.println("11. Sorted list: " + fruits);

        // 12. Sublist
        List<String> subList = fruits.subList(1, 3); // index 1 to 2
        System.out.println("12. Sublist from index 1 to 2: " + subList);

        // 13. Clearing the list
        fruits.clear();
        System.out.println("13. After clearing the list: " + fruits);
    }
}

