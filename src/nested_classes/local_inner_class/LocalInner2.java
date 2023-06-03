package nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Summ implements Math2 {   //local inner class in method main. Но в этих случаях
            // обычно используются анонимные классы
            @Override
            public int doOperation (int a, int b) {
                return a + b;
            }
        }
        Summ summ1 = new Summ();
        System.out.println(summ1.doOperation(5, 3));
    }

}

interface Math2 {
    int doOperation(int a, int b);
}