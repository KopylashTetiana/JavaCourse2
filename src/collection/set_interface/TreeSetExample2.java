package collection.set_interface;
import collection.list_interface.Student2;

import java.util.TreeSet;
public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student2> treeSet = new TreeSet<>();
        Student2 st1 = new Student2("Zaur", 5);
        Student2 st2 = new Student2("Misha", 1);
        Student2 st3 = new Student2("Igor", 2);
        Student2 st4 = new Student2("Marina", 3);
        Student2 st5 = new Student2("Olya", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        Student2 st6 = new Student2("Oleg", 2);
        Student2 st7 = new Student2("Ivan", 4);
        System.out.println(treeSet);//ClassCastException, если не переопределен метод compareTo()
        // (class Comparable). TreeSet не требует для работы реализации методов equals & hashCode
        System.out.println("first: " + treeSet.first());//first() returns the first element of TreeSet
        System.out.println("last: " + treeSet.last());//last() returns the last element of TreeSet
        System.out.println("headSet <2: " + treeSet.headSet(st6));//headSet(st) возвращает элементы,
        // которые меньше, чем st6(их курс<2)
        System.out.println("tailSet >=2: " + treeSet.tailSet(st6));//headSet(st) возвращает элементы,
        // которые не меньше, чем st6 (больше, или такие же) (их курс>=2)
        System.out.println("subSet 4> c >= 2: " + treeSet.subSet(st6, st7));//метод возвращает элементы,
        // которые не меньше, чем st6, и меньше, чем st7 (4 > их курс >= 2)
        System.out.println(st3.equals(st6));
        System.out.println(st3.hashCode() == st6.hashCode());    }  }
