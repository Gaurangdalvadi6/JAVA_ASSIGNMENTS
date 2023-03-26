package random;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main " + e);
            System.out.println("Division by zero is not allowed!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread main " + e);
            System.out.println("Array index out of bounds!");
        }
    }
}

