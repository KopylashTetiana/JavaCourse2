package collection.list_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("Ivan");
        aL1.add("Zaur");
        aL1.add("Maria");
        aL1.add("Kolya");
        aL1.add("Elena");
        System.out.println(aL1);

        Iterator<String> iterator1 = aL1.iterator();//creating new iterator
        while (iterator1.hasNext()){                    //method hasNext()
            System.out.println(iterator1.next());       //method next()
            //The main difference between Iterator and foreach loop is that we can remove some element
            // from our collection with Iterator:
            iterator1.remove();
        }

    }
}
