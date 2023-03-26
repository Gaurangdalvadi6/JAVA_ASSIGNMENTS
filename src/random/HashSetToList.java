package random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToList {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Convert the HashSet to an ArrayList
        List<Integer> numbersList = new ArrayList<Integer>(numbers);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbersList);
    }
}

