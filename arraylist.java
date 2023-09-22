package collection;

import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        // Create an ArrayList of Strings

        ArrayList<String> fruits = new ArrayList<>();
        // or
        // ArrayList fruits = new ArrayList();

        // Add elements to the ArrayList
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Access elements by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // // Update an element
        // fruits.set(1, "Grapes");
        // System.out.println("Updated fruits: " + fruits);

        // // Remove an element by index
        // fruits.remove(2);
        // System.out.println("Fruits after removing at index 2: " + fruits);

        // // Check if an element exists
        // boolean containsMango = fruits.contains("Mango");
        // System.out.println("Contains Mango: " + containsMango);

        // // Get the size of the ArrayList
        // int size = fruits.size();
        // System.out.println("Number of fruits: " + size);

        // // Iterate through the ArrayList using a for loop
        // System.out.println("Fruits using a for loop:");
        // for (int i = 0; i < size; i++) {
        // System.out.println(fruits.get(i));
        // }

        // // Iterate through the ArrayList using an enhanced for loop (for-each loop)
        // System.out.println("Fruits using an enhanced for loop:");
        // for (String fruit : fruits) {
        // System.out.println(fruit);
        // }

        // // Clear the ArrayList
        // fruits.clear();
        // System.out.println("Fruits after clearing: " + fruits);
    }
}
