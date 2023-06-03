 package collection.map_interface;
import collection.map_interface.Learner;

import java.util.LinkedHashMap;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        // В каком порядке добавим, в таком порядке и будут содержаться эл-ты в LHM, созданном данным конструктором:
        LinkedHashMap <Double, Learner> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Learner lr1 = new Learner("Zaur", "Tregulov", 3);
        Learner lr2 = new Learner("Maria", "Ivanova", 1);
        Learner lr3 = new Learner("Sergey", "Petrov", 4);
        Learner lr4 = new Learner("Igor", "Sidorov", 2);
        lhm.put(7.2, lr3);
        lhm.put(7.5, lr4);
        lhm.put(5.8, lr1);
        lhm.put(6.4, lr2);
        System.out.println(lhm);
        System.out.println(lhm.get(5.8));
        System.out.println(lhm.get(7.2));
        System.out.println(lhm);

    }
}
