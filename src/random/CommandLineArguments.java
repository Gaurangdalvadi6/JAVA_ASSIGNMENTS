package random;

public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main " + e);
            System.out.println("Division by zero is not allowed!");
        } catch (NumberFormatException e) {
            System.out.println("Exception in thread main " + e);
            System.out.println("Please enter valid numbers as command line arguments!");
        }
    }
}
