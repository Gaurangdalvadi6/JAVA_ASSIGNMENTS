package random;

import java.util.ArrayList;

public class ArrayListReplaceElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println("Original ArrayList: " + fruits);

        // Replace the second element of the ArrayList
        fruits.set(1, "grape");

        System.out.println("New ArrayList: " + fruits);
    }
}

