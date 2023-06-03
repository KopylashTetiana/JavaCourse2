package collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);
        lhs.add(null);
        System.out.println(lhs);//хранит элементы в той последовательности, в которой они добавлялись.
        lhs.remove(8);
        System.out.println(lhs.contains(8));
        System.out.println(lhs.contains(10));
    }

}
