package random;

public class ValidateAge {
    public static void main(String[] args) {
        int age = 16;
        try {
            validate(age);
            System.out.println("Welcome to vote!");
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main " + e);
            System.out.println("Age is not valid!");
        }
    }

    static void validate(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        }
    }
}
