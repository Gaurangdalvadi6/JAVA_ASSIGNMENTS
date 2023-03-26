package random;

import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Iterate through the HashSet using a for-each loop
        System.out.println("Elements of HashSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
