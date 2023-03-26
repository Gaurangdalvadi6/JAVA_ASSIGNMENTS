package random;

import java.util.HashMap;
import java.util.Map;

public class MapEmptyCheck {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        // Add some key-value mappings to the map
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // Check if the map is empty or not
        if (map.isEmpty()) {
            System.out.println("The map is empty");
        } else {
            System.out.println("The map is not empty");
        }
    }
}
