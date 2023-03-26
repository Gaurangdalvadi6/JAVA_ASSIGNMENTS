package random;

public class MyThread extends Thread {

    @Override
    public void run() {
        // code to be executed in the thread
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

