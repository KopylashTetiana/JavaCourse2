package multithreading;

public class Ex3 {
    public static void main(String[] args) {
        Thread mTrd1 = new Thread(new MyThread3());
        Thread mTrd2 = new Thread(new MyThread4());
        mTrd1.start();
        mTrd2.start();
    }
}

class MyThread3 implements Runnable{
    public void run() {
        for(int i = 1; i<=1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}