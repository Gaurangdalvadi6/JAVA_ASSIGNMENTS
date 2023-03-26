package random;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        // Sort the ArrayList
        Collections.sort(numbers);

        System.out.println("Sorted ArrayList: " + numbers);
    }
}

