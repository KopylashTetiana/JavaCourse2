package collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("Zaur");                        //method add(dt)
        aL1.add("Ivan");
        aL1.add("Maria");
        aL1.add("Ivan");
        System.out.println(aL1);
        System.out.println(aL1.indexOf("Ivan"));//method indexOf(obj)
        System.out.println(aL1.lastIndexOf("Ivan"));//method lastIndexOf(obj)
        System.out.println(aL1.size());
        System.out.println(aL1.isEmpty());
        System.out.println(aL1.contains("Maria"));

        ArrayList<String> aL2 = new ArrayList<>();
        aL2.add("!!!");
        aL2.add("???");
        aL1.addAll(aL2);
        System.out.println(aL1);
        aL1.addAll(1,aL2);
        System.out.println(aL1);
        aL1.clear();
        System.out.println(aL1);
        System.out.println(aL1.isEmpty());
        System.out.println(aL1.contains("Maria"));

    }
}
