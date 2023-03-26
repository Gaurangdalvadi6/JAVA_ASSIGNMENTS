package random;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread is running.");
            Thread.sleep(2000); // sleep for 2000ms
            System.out.println("Thread is done.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
    }
}
