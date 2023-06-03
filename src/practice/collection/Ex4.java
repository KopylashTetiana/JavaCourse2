package practice.collection;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        Integer [] array = new Integer[]{4,5,6,454,7,-65,55,0,0,1145};
        List<Integer> list1 = Arrays.asList(array);
        System.out.println(list1);
        array[5]=156;
        array[0]=null;
        for(Integer i:array){
            System.out.print(i+"; ");
        }
        System.out.println("\n"+list1);
        String[]array2 = null;
        //List<String> list2 = Arrays.asList(array2);//NullPointerException
        //System.out.println(list2);
        List<String> list3 = Arrays.asList("Open", "your", "eyes");
        System.out.println(list3);
    }
}
