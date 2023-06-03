package collection.map_interface;
import collection.map_interface.Learner;

import java.util.Comparator;
import java.util.TreeMap;
public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Learner, Double> treeMap = new TreeMap<>(new Comparator<Learner>(){
            @Override
            public int compare(Learner o1, Learner o2){
                return o1.name.compareTo(o2.name);
            }
        });
        Learner lr1 = new Learner("Zaur", "Tregulov", 3);
        Learner lr2 = new Learner("Maria", "Ivanova", 1);
        Learner lr3 = new Learner("Sergey", "Petrov", 4);
        Learner lr4 = new Learner("Igor", "Sidorov", 2);
        Learner lr5 = new Learner("Vasiliy", "Smirnov", 1);
        Learner lr6 = new Learner("Sasha", "Kapustin", 3);
        Learner lr7 = new Learner("Elena", "Sidorova", 4);
        treeMap.put(lr7, 9.1);//method put(k,v)
        treeMap.put(lr2, 6.4);
        treeMap.put(lr4, 7.5);
        treeMap.put(lr3, 7.2);
        treeMap.put(lr6, 8.2);
        treeMap.put(lr5, 7.9);
        System.out.println(treeMap);
        //Значения могут быть неуникальными: добавляем 9.1 дважды и получаем 2 пары с одинаковым значением.
        treeMap.put(lr1, 9.1);
        //Но ключи обязаны быть уникальными, иначе новое значение с таким же ключом запишется вместо старого значения.
        treeMap.put(lr1, 3.2);
        System.out.println(treeMap);
        System.out.println(treeMap.get(lr2));//method get(k) возвращает значение для данного ключа
        System.out.println(treeMap.remove(lr3));//remove(k)-> Value v, метод удаляет элемент с данным ключом и возвращает его значение
        Learner lr8 = new Learner("Anna", "Maria", 4);
        System.out.println(treeMap.remove(lr8));//null
        System.out.println(treeMap.remove(lr3, 7.5));//false
        System.out.println(treeMap.remove(lr4, 7.5));//true
        System.out.println(treeMap.descendingMap());//в обратном порядке(в порядке убывания ключей)
        System.out.println(treeMap.tailMap(lr5));//возвращает хвост(последние пары) карты, начиная с ключа 7,9(k>=7.9)
        System.out.println(treeMap.headMap(lr5));//возвращает голову(первые пары) карты, до ключа 7.9, не включая его(k<7.9)
        System.out.println(treeMap.lastEntry());//возвращает последнюю пару из Map
        System.out.println(treeMap.firstEntry());//возвращает первую пару из Map
    }
}
