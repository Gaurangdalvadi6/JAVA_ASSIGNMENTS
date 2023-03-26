package random;

import java.util.ArrayList;

public class ColorListExample {
    public static void main(String[] args) {
        // Create a new ArrayList of strings
        ArrayList<String> colors = new ArrayList<String>();

        // Add some color strings to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print out the ArrayList
        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
