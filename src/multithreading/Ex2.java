package multithreading;

public class Ex2 extends Thread {
    public void run() {
        for(int i = 1000; i>=1; i--) {
            System.out.println(i + "\"");
        }
    }
    public static void main(String args[]) {
        MyThread1 mTrd1 = new MyThread1();
        Ex2 mTrd2 = new Ex2();
        mTrd1.start();
        mTrd2.start();
    }

}
class MyThread1 extends Thread {
    public void run() {
        for(int i = 1; i <=1000; i++) {
            System.out.println(i+"\'");
        }
    }
}

//class MyThread2 extends Thread {
//    public void run() {
//        for(int i = 1000; i>=1; i--) {
//            System.out.print(i+".");
//        }
//    }
//}
