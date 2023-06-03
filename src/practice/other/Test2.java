package practice.other;

import java.util.ArrayList;

import java.util.List;


public class Test2 {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>();
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        list.addAll(list.subList(0, 4));
        System.out.println(list);
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println('A' + "12");
        String[] a = new String[0];
    }
}
