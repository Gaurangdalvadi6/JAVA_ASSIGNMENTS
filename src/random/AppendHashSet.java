package random;

import java.util.HashSet;

public class AppendHashSet {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original HashSet: " + colors);

        // Append the element "Yellow" to the end of the HashSet
        colors.add("Yellow");

        System.out.println("HashSet after appending element: " + colors);
    }
}


