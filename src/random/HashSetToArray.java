package random;

import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Create an array with the same size as the HashSet
        Integer[] numbersArray = new Integer[numbers.size()];

        // Convert the HashSet to an array
        numbers.toArray(numbersArray);

        // Print the array
        System.out.println("Array: ");
        for (Integer number : numbersArray) {
            System.out.println(number);
        }
    }
}
