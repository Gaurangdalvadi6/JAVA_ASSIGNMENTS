package random;

import java.util.ArrayList;

public class ExtractArrayListPortion {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Extract a portion of the ArrayList from index 1 to index 3
        ArrayList<Integer> portion = new ArrayList<Integer>(numbers.subList(1, 4));

        System.out.println("Extracted portion of ArrayList: " + portion);
    }
}

