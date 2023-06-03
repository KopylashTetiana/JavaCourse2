package stream;
//Задача. На место слов в ArrayList поставить их длину: вместо privet - 6, вместо "kak dela?" - 9 и т.д.
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1)); // put your implementation here
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");
        //старый способ:
//        for(int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        System.out.println(list);
        //Новый способ: метод с помощью метода stream: этот метод создает стрим(поток) из коллекции. Мы будем работать не
        // напрямую с листом, а с потоком. Метод map() берет по очереди каждый эл-т из нашего стрима и
        // сопоставляет ему элемент, который из него получается после применения на нем тех действий,
        // которые мы описываем внутри map() с помощью лямбда-выражения. map() возвращает тоже stream, но уже другой:
        // вместо слов - их длина. Метод map() принимает интерфейс Function, поэтому мы можем на input дать String,
        // в output получить int.
      //List<Integer> list2 = list.stream().map(element -> element.length()); - Compile time error.
        //map() возвращает поток, поэтому мы не можем просто присвоить результат этого метода - листу. Нужно
        // сначала преобразовать поток в лист с помозью метода collect(Collectors.toList()). Вот так:
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);
//        Важно: все методы Stream'a не меняют коллекцию, на к-рую они были вызваны. Как методы stream'a применить для
//        массива: 1. из массива получаем stream.
        int[] array = {5, 9, 3, 8, 1};
        //2. с помощью метода map над стримом проделываем какую-то операцию:
        array = Arrays.stream(array).map(element -> {
            if(element % 3 == 0) {  //если очередной эл-т потока
                element = element / 3; //делится нацело на 3, то делим его на 3, иначе -
            };
            return element; //оставляем его как есть.
        }).toArray();   //3. преобразовываем поток в массив.
//        чтобы преобразовать поток в коллекцию, метод collect, а чтобы преобразовать поток в массив, метод toArray.
        System.out.println(Arrays.toString(array));
//        Всё, что касается стримов, можно делать как с List, так и с другими коллекциями: Set и др.
        Set<String> set = new TreeSet<>(); //TreeSet by default отсортирован.
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        //Нет никаких гарантий, какой тип Set'a вернет метод Collectors.toSet().
        //Он возвращает неупорядоченную коллекцию. Но посмотри, элементы set2 отсортированы:
        System.out.println(set2);
        //Это потому, что метод вернул TreeSet, в основе кот-го лежит HashMap, к-рый сортирует элементы по их хэш-коду:
        System.out.println(set2.getClass().getName());
        // Поскольку элементы имеют тип Integer, то их хэш-код - это их значения. Поэтому эл-ты оказались отсортированы.
//        Тот же поток можно преобразовать не в Set, а в List:
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
//        Но в List никакой сортировки нет:
        System.out.println(list3);
    }
}
