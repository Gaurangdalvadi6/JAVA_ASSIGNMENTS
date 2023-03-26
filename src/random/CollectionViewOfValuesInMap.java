package random;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionViewOfValuesInMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        Collection<Integer> values = map.values();

        System.out.println("Values in the map: " + values);
    }
}

