package multithreading;

public class Ex6 implements Runnable {
    public void run() {
        System.out.println("run method. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.start();
        System.out.println("main method. Thread name = " + Thread.currentThread().getName());
    }
}
