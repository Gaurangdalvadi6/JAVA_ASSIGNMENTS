package random;

public class TestThreadTwice extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        TestThreadTwice t1 = new TestThreadTwice();
        t1.start();
        t1.start(); // attempting to start the same thread twice
    }
}

