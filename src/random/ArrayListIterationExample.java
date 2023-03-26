package random;

import java.util.ArrayList;

public class ArrayListIterationExample {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<String>();

        // Add some elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        // Iterate through all the elements in the ArrayList using a for loop
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
