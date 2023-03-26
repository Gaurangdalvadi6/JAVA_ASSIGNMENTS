package random;

import java.util.ArrayList;

public class ArrayListGetElementExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<String>();

        // Add some elements to the ArrayList
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        // Retrieve an element at a specified index
        int index = 2;  // the index of the element to retrieve
        String element = list.get(index);

        // Print the retrieved element
        System.out.println("Element at index " + index + " is: " + element);
    }
}

