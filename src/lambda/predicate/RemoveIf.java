package lambda.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim Java");
        al.add("A imenno lambdas");
        //У ArrayList есть метод removeIf(Predicate<T>). Есть 2 способа его применить:
        //1. Напишем его, используя лямбда-выражение и переписав метод test:
        al.removeIf(element -> element.length() < 5);
        System.out.println(al);
        //2. Вынесем объект Predicate за скобки и присвоим
        // его переменной (но не забудь предварительно импортировать Predicate:
        Predicate<String> p = element -> element.length() <5;
        al.removeIf(p);
        System.out.println(al);
    }
}
