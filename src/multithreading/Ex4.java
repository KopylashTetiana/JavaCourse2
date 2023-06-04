package multithreading;
//These are examples of how we can create and run a thread without using the class which implements Runnable.
public class Ex4  {
    public static void main(String[] args) {
        //1st option, using anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1000; i > 0; i--) {
                    System.out.println(i);
                }
                System.out.println("We are the champions, my friend!");
            }
        }).start();

        //2nd option, using lambda expression
        new Thread(() -> {
            for(int i = 1000; i > 0; i--) {
                System.out.println(i);
            }
            System.out.println("we are the champions, my friend!");
        }).start();
    }
}