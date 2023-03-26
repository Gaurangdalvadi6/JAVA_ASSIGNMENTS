package random;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayListElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        // Swap elements at index 1 and index 3
        Collections.swap(numbers, 1, 3);

        System.out.println("ArrayList after swapping: " + numbers);
    }
}
