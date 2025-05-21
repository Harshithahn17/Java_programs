package Add_elements;



import java.util.*;

public class 1a_LinkedListOperations {
    public static void main(String[] args) {
        // 1. Adding elements
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("1. Initial List: " + fruits);

        // 2. Adding element at specific index
        fruits.add(1, "Mango");
        System.out.println("2. After adding Mango at index 1: " + fruits);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        fruits.addAll(moreFruits);
        System.out.println("3. After adding more fruits: " + fruits);

        // 4. Accessing elements
        System.out.println("4. Element at index 2: " + fruits.get(2));

        // 5. Updating elements
        fruits.set(2, "Cherry");
        System.out.println("5. After updating index 2 to Cherry: " + fruits);

        // 6. Removing elements
        fruits.remove("Banana");
        System.out.println("6. After removing Banana: " + fruits);

        // 7. Searching elements
        boolean hasApple = fruits.contains("Apple");
        System.out.println("7. Is Apple in the list? " + hasApple);

        // 8. List size
        System.out.println("8. List size: " + fruits.size());

        // 9. Iterating over list using for-each loop
        System.out.println("9. Iterating with for-each:");
        for (String fruit : fruits) {
            System.out.println(" - " + fruit);
        }

        // 10. Using Iterator
        System.out.println("10. Iterating with Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(" -> " + iterator.next());
        }

        // 11. Sorting
        Collections.sort(fruits);
        System.out.println("11. Sorted List: " + fruits);

        // 12. Sublist
        List<String> subList = fruits.subList(1, 3);  // exclusive of 3
        System.out.println("12. Sublist from index 1 to 2: " + subList);

        // 13. Clearing the list
        fruits.clear();
        System.out.println("13. After clearing the list: " + fruits);
    }
}
