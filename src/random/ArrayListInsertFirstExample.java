package random;

import java.util.ArrayList;

public class ArrayListInsertFirstExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Add some elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Insert an element at the first position
        list.add(0, 5);

        // Print the ArrayList to verify the insertion
        System.out.println("Elements in the ArrayList after inserting an element at the first position:");
        System.out.println(list);
    }
}
