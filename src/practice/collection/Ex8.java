package practice.collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("red", "blue", "green");
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, "red"));
        System.out.println(Collections.binarySearch(list, "black"));
        Collections.shuffle(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
      }

}
