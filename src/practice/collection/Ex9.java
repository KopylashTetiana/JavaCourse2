package practice.collection;
import java.util.Map;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "value1");
        map.put(2, "value2");
        map.put(null, "value3");
        map.put(4, null);
        System.out.println(map);

        System.out.println(map.remove(1));
        System.out.println(map.remove(null));
        System.out.println(map.remove(3));
        System.out.println(map.remove(4));
        System.out.println(map);
    }
}
