package practice.stream;
//Stream's methods: map, filter, forEach, reduce.
// Method reference in lambdas

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("All I know");
        list1.add("will be forever");
        list1.add("All I know");
        list1.add("nothing together");
        list1.add("All I know");
        String result = list1.stream().reduce((a, e) -> {
            if(a.length() > e.length()) return a;
                    else return a + " " + e;
        }).get();
        System.out.println(result);
        String result2 = list1.stream().reduce("Better", (a, e) -> {
            if(a.length() > e.length()) return a;
            else return a + " " + e;
        });
        System.out.println(result2);
        list1.stream().forEach(el -> System.out.print(el.length() + " "));
        System.out.println();
        list1.stream().forEach(System.out :: print);
        List<String> list3 = list1.stream().map(el -> {
            String s = null;
            for(char c : el.toCharArray()) s = c + s;
            return s;
        }).collect(Collectors.toList());
        System.out.println(list3);
    }

}
