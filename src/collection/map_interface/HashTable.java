package collection.map_interface;
import collection.list_interface.Student;

import java.util.Hashtable;
public class HashTable {
    public static void main(String[] args) {
        Hashtable <Double, Student> ht = new Hashtable<>();
        Student st1 = new Student ("Zaur", 26);
        Student st2 = new Student("Maria", 21);
        Student st3 = new Student("Sergey", 28);
        Student st4 = new Student("Igor", 19);
        ht.put(7.8, st1);
        ht.put(9.3, st2);
        ht.put(5.8, st3);
        ht.put(6.0, st4);
        Double d1 = null;
        System.out.println(d1.hashCode());
        //ht.put(null, st4);
        System.out.println(ht);
    }

}
