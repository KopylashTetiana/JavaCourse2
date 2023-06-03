package practice.other;
import java.util.ArrayList;

public class Ex7 {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(s.toCharArray());
        char [] array = s.toCharArray();
        System.out.println(array);

        Character a = 'м';
        Character b = 'м';
        System.out.println(a==(int)b);
        Character c = 'm';
        Character d = 'm';
        System.out.println(c==d);
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println((int)c);
        ArrayList<String> aL = new ArrayList<>();
        aL.add("Hello");
        aL.add("OK");
        aL.add("Good bye");
        String[] arr = aL.toArray(new String[10]);
        System.out.println(aL);
    }
}
