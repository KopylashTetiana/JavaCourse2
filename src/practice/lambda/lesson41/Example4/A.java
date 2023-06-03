package practice.lambda.lesson41.Example4;

public class A {
    static int code(String s, Intr i) {
        return i.letter(s);
    }

    public static void main(String[] args) {
        System.out.println(code("South", s -> s.charAt(1)));
        System.out.println(code("Elefant", s -> s.charAt(6)));
    }
}

interface Intr {
    char letter(String str);
}
