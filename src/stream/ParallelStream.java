package stream;

import java.util.List;
import java.util.ArrayList;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
        //получить параллельный стрим можно 2-мя способами:
        // 1. когда мы получаем стрим из готового листа(коллекции), тогда вместо метода стрим пишем метод parallelStream();
        // 2. когда создаем стрим с нуля, тогда на этот стрим применям метод parallel().

        double sumResult = list.parallelStream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("sumResult = " + sumResult); //рез-т правильный, потому что сумму можно считать по частям

        double divisionResult = list.stream().reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("divisionResult = " + divisionResult);

        double divisionResult2 = list.parallelStream().reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("divisionResult2 = " + divisionResult2); //результат будет неправильным, потому что деление
        // нельзя разделять на несколько ядер и делать частями.
    }
}
