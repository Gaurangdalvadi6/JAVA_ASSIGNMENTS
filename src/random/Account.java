package random;

public class Account {
    static int balance = 2000;

    public static void main(String[] args) {
        int withdrawAmount = 2500;
        try {
            withdraw(withdrawAmount);
            System.out.println("Amount withdrawn: " + withdrawAmount);
            System.out.println("Remaining balance: " + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception in thread main " + e);
            System.out.println("Sorry, insufficient balance, you need more " + e.getAmount() + " Rs. to perform this transaction.");
        }
    }

    static void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(amount - balance);
        } else {
            balance -= amount;
        }
    }
}

class InsufficientBalanceException extends Exception {
    private int amount;

    public InsufficientBalanceException(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

