package random;

import java.util.HashMap;

public class CountMapMappings {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<Integer, String>();
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Orange");

        int size = fruits.size();
        System.out.println("Number of key-value mappings in HashMap: " + size);
    }
}

