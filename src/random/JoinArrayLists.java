package random;

import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Create a new ArrayList to hold the joined list
        List<Integer> joinedList = new ArrayList<Integer>();

        // Add all elements of list1 to the joined list
        joinedList.addAll(list1);

        // Add all elements of list2 to the joined list
        joinedList.addAll(list2);

        System.out.println("Joined ArrayList: " + joinedList);
    }
}

