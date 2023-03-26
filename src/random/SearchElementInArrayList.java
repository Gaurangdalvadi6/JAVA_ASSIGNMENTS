package random;

import java.util.ArrayList;

public class SearchElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int searchElement = 3;
        boolean found = false;

        // Search for element
        for (int num : numbers) {
            if (num == searchElement) {
                found = true;
                break;
            }
        }

        // Print result
        if (found) {
            System.out.println("Element " + searchElement + " found in the ArrayList.");
        } else {
            System.out.println("Element " + searchElement + " not found in the ArrayList.");
        }
    }
}

