package random;

import java.util.Arrays;

public class ArrayUpdate {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int index = 2;
    int value = 10;

    System.out.println("Original array: " + Arrays.toString(arr));

    // Updating element
    arr[index] = value;

    System.out.println("Array after updating element at index " + index + " with " + value + ": " + Arrays.toString(arr));
  }
}

