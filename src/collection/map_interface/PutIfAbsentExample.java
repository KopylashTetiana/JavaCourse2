package collection.map_interface;
import java.util.Map;
import java.util.HashMap;
public class PutIfAbsentExample {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", null);
        System.out.println(map);

        map.putIfAbsent("key1", "newValue1");//не добавится, т.к. уже есть пара со значением, отличным от null
        map.putIfAbsent("key2", "newValue2");//наш случай: добавится, т.к. есть "key2", но значение в паре = null
        map.putIfAbsent("key3", "newValue3");//добавится, т.к. нет пары с ключом "key3"
        System.out.println(map);

    }
}
