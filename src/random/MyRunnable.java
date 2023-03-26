package random;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        // code to be executed in the thread
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
