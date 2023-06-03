package stream;
//1. Method chaining
import java.util.stream.Collectors;
import java.util.stream.Stream;
//проверим, выполнится ли метод, возвращающий stream (lazy method), если:
public class MethodChaining {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        //a) после него нет terminal method'а:
        stream1.filter(el -> {
            System.out.print("!!!"); //эта строчка так и не выведется на экран ни разу. Метод не выполнился.
            return el%2 == 0;
        });

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        //b) после него есть terminal method:
        stream2.filter(el -> {
            System.out.print("!?!");
            return el%2 == 0;
        }).collect(Collectors.toList());    //да, выполнится
//2. Method concat
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream4 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream5 = Stream.concat(stream3, stream4);
        stream5.forEach(System.out :: print);
        System.out.println();
//3. Method distinct - метод, который создает стрим уникальных эл-тов (сравнивает их с пом. метода equals)
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//        stream6.distinct().forEach(System.out::print);
//4. Method count - считает кол-во эл-тов в стриме, возвращает long:
//        System.out.println(stream6.count());
//        System.out.println(stream6.distinct().count());
        System.out.println(stream6.distinct().peek(System.out::print).count());
    }
}
