package random;

public class TestDaemonThread2 implements Runnable {

    public void run() {
        try {
            while (true) {
                System.out.println("Thread is running.");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();

        System.out.println("Thread 1 is daemon thread: " + thread1.isDaemon());
        System.out.println("Thread 2 is daemon thread: " + thread2.isDaemon());

        thread1.setDaemon(true);

        try {
            thread2.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Cannot start daemon thread after setting it as daemon.");
        }
    }
}

