package collection.map_interface;
import collection.map_interface.Learner;

import java.util.TreeMap;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Learner> treeMap = new TreeMap<>();
        Learner lr1 = new Learner("Zaur", "Tregulov", 3);
        Learner lr2 = new Learner("Maria", "Ivanova", 1);
        Learner lr3 = new Learner("Sergey", "Petrov", 4);
        Learner lr4 = new Learner("Igor", "Sidorov", 2);
        Learner lr5 = new Learner("Vasiliy", "Smirnov", 1);
        Learner lr6 = new Learner("Sasha", "Kapustin", 3);
        Learner lr7 = new Learner("Elena", "Sidorova", 4);
        treeMap.put(9.1, lr7);//method put(k,v)
        treeMap.put(6.4, lr2);
        treeMap.put(7.5, lr4);
        treeMap.put(7.2, lr3);
        treeMap.put(8.2, lr6);
        treeMap.put(7.9, lr5);
        System.out.println(treeMap);
        //Значения могут быть неуникальными: добавляем lr7 дважды и получаем 2 пары с одинаковым значением.
        treeMap.put(3.2, lr7);
        //Но ключи обязаны быть уникальными. Либо новое значение с таким же ключом запишется вместо старого значения.
        treeMap.put(3.2, lr5);
        System.out.println(treeMap);
        System.out.println(treeMap.get(6.4));//method get(k) возвращает значение для данного ключа
        System.out.println(treeMap.remove(7.2));//remove(k)-> Value v, метод удаляет элемент с данным ключом и возвращает его значение
        System.out.println(treeMap.remove(5.0));//null
        System.out.println(treeMap.remove(7.5, lr3));//false
        System.out.println(treeMap.remove(7.5, lr4));//true
        System.out.println(treeMap.descendingMap());//в обратном порядке(в порядке убывания ключей)
        System.out.println(treeMap.tailMap(7.9));//возвращает хвост(последние пары) карты, начиная с ключа 7,9(k>=7.9)
        System.out.println(treeMap.headMap(7.9));//возвращает голову(первые пары) карты, до ключа 7.9, не включая его(k<7.9)
        System.out.println(treeMap.lastEntry());//возвращает последнюю пару из Map
        System.out.println(treeMap.firstEntry());//возвращает первую пару из Map
    }
}
