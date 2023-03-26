package random;

import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);

        // Create a new ArrayList and copy numbers1 into it
        ArrayList<Integer> numbers2 = new ArrayList<Integer>(numbers1);

        // Print both ArrayLists to show the result
        System.out.println("ArrayList 1: " + numbers1);
        System.out.println("ArrayList 2 (copy of ArrayList 1): " + numbers2);
    }
}

