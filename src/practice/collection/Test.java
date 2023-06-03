package practice.collection;
import java.util.ArrayList;
import java.util.Collections;
public class Test {
    public static void main(String[] args) {
        String string = "12.84";
        double d = Double.parseDouble(string);
        System.out.println(Math.round(d));
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 0, -5, -7, -12, 5, 15);
        System.out.println(list);
//        ArrayList<Integer> copyList = new ArrayList<>(list);
//
//        for (Integer value: copyList)
//            if (value < 0)
//                list.remove(value);
//        System.out.println(list);
        list.removeIf(x -> x < 0);
        System.out.println(list);
    }
}
