package collection.map_interface;
//hashMap, который хранит номер паспорта, имя и фамилию человека
import java.util.Map;
import java.util.HashMap;
public class HashMapEx1 {
    public static void main(String[] args) {
Map<Integer, String> map1 = new HashMap<>();//creation HashMap
        map1.put(1000, "Zaur Tregulov");//добавление элементов в HashMap.
        map1.put(3568, "Ivan Ivanov");//порядок добавления эл-тов не сохраняется, они хранятся в каком-то другом порядке
        map1.put(null, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.put(1000, "Oleg Ivanov");//Если такой ключ уже есть, его значение заменяется текущим значением.
        map1.putIfAbsent(1000, "Danylo Galyckyi");//Добавь эл-т, если такого эл-та в коллекции ещё нет
        map1.put(85214, null);
        System.out.println(map1);
        System.out.println(map1.get(1000));//Из данной коллекции выведи значение этого ключа
        System.out.println(map1.get(1001));//...если такого ключа нет, выведется null
        map1.remove(15879);//method removes the mapping (отображение) for the key from this map if it is present
        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov"));//возвращает true, если такое значение имеется в map
        System.out.println(map1.containsKey(500));//Возващает true, если в коллекции имеется такой ключ
        System.out.println(map1.keySet());//Возвращает множество всех ключей, имеющихся в данной map, в [].
        System.out.println(map1.values());//Возвращает множество всех значений, имеющихся в данной map, в [].
for (Integer i: map1.keySet()){
        System.out.println(i);
}

        Map<String, String> map2 = new HashMap<>();//Types of key and value могут быть абсолютно разными, и могут даже совпадать
        map2.put("Sasha", "good");
        map2.put("Misha", "clever");

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(9, "First");
        map3.put(3, "Second");
        map3.put(2, "Third");
        map3.put(7, "Fourth");
        map3.put(5, "Fifth");
        map3.put(1, "Sixth");
        map3.put(8, "Seventh");
        map3.put(6, "Eighth");
        map3.put(4, "Ninth");
            System.out.println(map3.hashCode());
    }
}
