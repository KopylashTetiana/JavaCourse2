package lambda.supplier;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela", "normalno", "poka");
//        //чтобы вывести на экран каждый эл-т листа, есть 2 способа:
//        //1) foreach loop
//        System.out.println("1-----------");
//        for(String s: list) {
//            System.out.println(s);
//        }
//        System.out.println("2-----------");
//        //2)метод list.forEach принимает Consumer в свои параметры.
//        //Мы передаем ему в параметре, что нужно сделать для каждого эл-та
//        list.forEach(str -> System.out.println(str));
//        //результат одинаковый для обоих способов.
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(el -> {
            System.out.println(el);
            el*=2;
            System.out.println(el);
        });
    }
}
