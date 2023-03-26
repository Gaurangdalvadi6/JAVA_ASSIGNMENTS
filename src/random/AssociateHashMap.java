package random;

import java.util.HashMap;

public class AssociateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<Integer, String>();
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Orange");

        // Associate the value "Grapes" with the key 4 in the HashMap
        fruits.put(4, "Grapes");

        System.out.println("Updated HashMap: " + fruits);
    }
}

