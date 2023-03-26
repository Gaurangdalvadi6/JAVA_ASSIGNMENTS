package random;

import java.util.ArrayList;

public class ArrayListIncreaseSize {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Original ArrayList: " + numbers);

        // Increase the size of the ArrayList
        numbers.ensureCapacity(10);

        System.out.println("New ArrayList size: " + numbers.size());
    }
}
