package collection.set_interface;

import java.util.HashSet;

public class HashSetExample3 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);
        System.out.println(hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);
        System.out.println(hashSet2);

        HashSet<Integer> union = new HashSet<>(hashSet1);//union - операция объединения элементов
        union.addAll(hashSet2);
        System.out.println("Union: " + union);

        HashSet<Integer> intersect = new HashSet<>(hashSet1);//intersect - пересечение элементов
        intersect.retainAll(hashSet2);
        System.out.println("Intersect: " + intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet1);//subtract - разность (віднімання) элементов
        subtract.removeAll(hashSet2);
        System.out.println("Substract: " + subtract);
    }
}
