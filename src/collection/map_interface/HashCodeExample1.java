package collection.map_interface;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
public class HashCodeExample1 {
    public static void main(String[] args){
        Map<Learner, Double> map = new HashMap<>();
        Learner lr1 = new Learner("Zaur", "Tregulov", 3);
        Learner lr2 = new Learner("Maria", "Ivanova", 1);
        Learner lr3 = new Learner("Sergey", "Petrov", 4);
        map.put(lr1, 7.5);
        map.put(lr2, 8.7);
        map.put(lr3, 9.2);
        System.out.println(map);
        Learner lr4 = new Learner("Zaur", "Tregulov", 3);
        Boolean result = map.containsKey(lr4);//false, не смотря на то, что method equals() переопределен, и объект
        // lr4 - такой же, как и lr1. Поскольку коллекции HashMap(и HashSet) используют хэширование при поиске и
        // сравнении объектов.
        System.out.println("result = "+ result);
        System.out.println(lr1.equals(lr4));//true, потому что method equals переопределен.
        System.out.println(lr1.hashCode());
        System.out.println(lr4.hashCode());

        for(Map.Entry<Learner, Double> entry: map.entrySet()){//for each loop. entrySet() возвращает множество
            // объектов Entry(Entry('въезд') - это внутренний интерфейс для Map, к-рый имплементируется внутренним
            // классом Map - Node. Данный метод
            // public abstract java.util.Set<Map.Entry<K, V>> entrySet())
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

}
class Learner
//        implements Comparable<Learner>
    {
    String name;
    String surname;
    int course;
    public Learner(String name, String surname, int course){
        this.name=name;
        this.surname=surname;
        this.course=course;
    }
    public String toString(){
        return "Learner "+name+' '+surname+", course"+course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Learner learner = (Learner) o;
        return course == learner.course && Objects.equals(name, learner.name) && Objects.equals(surname, learner.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

//    @Override
//    public int compareTo(Learner o) {
//        return this.name.compareTo(o.name);
//    }
}
