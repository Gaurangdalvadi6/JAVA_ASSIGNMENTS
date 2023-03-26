package random;

import java.util.HashSet;

public class CountHashSetElements {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        int size = colors.size();
        System.out.println("Number of elements in HashSet: " + size);
    }
}
