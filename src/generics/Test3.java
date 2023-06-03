package generics;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.List;
import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        List <? extends Number> list = new ArrayList<Integer>();//bounded wildcard


        List <Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List <String> list2 = new ArrayList<>();
        list2.add("privet");
        list2.add("poka");
        list2.add("ok");
        showListInfo(list2);

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(10);
        ali.add(34);
        ali.add(65);
        System.out.println(summ(ali));

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(10.4);
        ald.add(34.32);
        ald.add(65.98);
        System.out.println(summ(ald));

//        ArrayList<String> als = new ArrayList<>();
//        als.add("Dred");
//        System.out.println(summ(als));//Compile time error

        List <? super Number> lists = new ArrayList<Number>();//bounded wildcard. Подходит Number или любой его super-класс.
        List <? extends Number> liste = new ArrayList<Integer>();//bounded wildcard. Подходит Number или любой его sub-класс.
    }
    static void showListInfo(List<?> list){//method с использованием  wildcard
        System.out.println("Moy list soderjit sleduyuschie elementi: "+list);
    }
    public static double summ(ArrayList<? extends Number> al) {//bounded wildcard
        double summ = 0;
        for(Number n: al){
            summ+=n.doubleValue();
        }
        return summ;
    }
}
