package stream;
//пример применения метода reduce() для Stream
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        //              1-й метод reduce():
        int result = list.stream().reduce((accumulator, element) -> accumulator*element).get();
        System.out.println(result);
        //stream: 5, 8, 2, 4, 3 итерации метода reduce:
        //iteration:    1   2   3   4   5
        //accumulator = 5   40  80  320 960
        //element =     8   2   4   3
        //Вначале переменной accumulator автоматически присваивается первый элемент стрима, а element - второй эл-т стрима.
        //Затем происходит действие из лямбда-выражения(умножение), и результат присваивается accumulator'у, а element'у
        //- третий эл-т стрима. И т.д. В конце возвращается accumulator, который равен результату умножения всех эл-тов,
        //но reduce возвращает не int значение, а Optional. Чтобы вернуть значение из Optional, применяем к нему метод get().
        // Optional - это тип, который служит контейнером для конечного значения. Если мы вдруг работаем с пустым листом, то
        //Optional, будет содержать null, и тогда метод get() вернул бы нам NullPointerException. Чтобы такого не произошло,
        // сначала проверяем, содержит ли Optional значение 'not null' (с помощью метода isPresent()), и если содержит,
        // тогда применяем метод get():
        List<Integer> list100 = new ArrayList<>(); //содержит null
        Optional<Integer> o = list100.stream().reduce((accum, el) -> accum*el);
        if(o.isPresent()) System.out.println(o.get());  //isPresent() => 'true' or 'false'
        else System.out.println("Is empty");
        //              2-й метод reduce():
        //в параметр метода на первое место добавляется ещё один элемент, int.
        //Этот int присваивается элементу accumulator преред первой итерацией. Таким образом, результат метода в любом случае
        // будет 'not null', поэтому отпадает надобность помещать его в контейнер Optional.
        // Метод get() применять не нужно, return type данного метода reduce - int
        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator*element);
        System.out.println(result2);
        //вывести конкатенацию всех строк листа:
        List<String> list2 = new ArrayList<>();
        list2.add("privet");
        list2.add("kak dela?");
        list2.add("OK");
        list2.add("poka");
        //я точно знаю, что рез-т метода reduce - not null, поэтому могу сразу применять метод get():
        String result3 = list2.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result3);
    }
}
