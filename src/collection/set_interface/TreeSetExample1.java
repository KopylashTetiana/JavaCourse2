package collection.set_interface;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.remove(2);
        System.out.println(treeSet);
//        treeSet.add(null);//NullPointerException. TreeSet не может хранить null
        System.out.println(treeSet.contains(1));
        System.out.println(treeSet.contains(2));

    }
}
