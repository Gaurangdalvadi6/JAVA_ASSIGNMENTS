package random;

import java.util.ArrayList;

public class ArrayListPrintElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Elements of the ArrayList using position:");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}

