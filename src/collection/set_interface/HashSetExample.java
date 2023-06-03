package collection.set_interface;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();//в основе HashSet сидит HashMap, в которой ключ - это элемент HashSet, а значение не используется вовсе.
        set.add("Zaur");
        set.add("Oleg");
        set.add("Maria");
        set.add("Igor");
        set.add("Igor");//не добавится, потому что HashMap (в основе данного HashSet) не может содержать ключи-дубликаты
        set.add(null);//так можно, потому что HashMap может содержать ключ null.
        System.out.println(set);//порядок эл-тов никак не сохраняется
        set.remove("Zaur");//удалился элемент
        set.remove(null);//удалился элемент
        for (String s : set) {//выводим на экран эл-ты коллекции HashSet с помощью foreach loop
            System.out.println(s);
        }
        System.out.println(set.size());//возвращает количество эл-тов в HashSet: 3
        System.out.println(set.isEmpty());//false, потому что HashSet не пуст
        System.out.println(set.contains("Misha"));//содержит ли HashSet такой элемент? нет.
        System.out.println(set.contains("Maria"));//содержит ли HashSet такой элемент? да.
        //set.get("Zaur");//Compile time error: у класса HashSet нет метода get(key), потому что он тут не нужен.
    }
}
