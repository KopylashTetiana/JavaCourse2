package collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("Ivan");                        //method add(dt)
        aL1.add("Zaur");
        aL1.add("Maria");
        aL1.add("Kolya");
        aL1.add("Elena");

        List<Integer> list1 = List.of(3, 8, 13);//method List.of(E...elements) - быстрый способ создания неизменяемого List'a
        System.out.println(list1);
        //list1.add(100);//UnsupportedOperationException: эту коллекцию нельзя никак изменить.

        List<String> list2 = List.copyOf(aL1);//method List.copyOf(Collection<E>c) - быстрый способ создания неизменяемого List'a
        System.out.println(list2);

        //List<Integer> list3 = List.of(3, 8, null);//созданный List не может содержать null: NullPointerException

 /*       System.out.println("ArrayList: "+aL1);
        List<String> myList = aL1.subList(1,4); //method subList(fromIndex, toIndex)->List<E>
        System.out.println("SubList "+myList);
        myList.add("Svetlana");                 //внесли изменения ч/з List - всё в порядке.
        System.out.println("SubList "+myList);
        System.out.println("ArrayList: "+aL1);
        aL1.add("Fedor");                       //внесли изменения ч/з ArrayList, а затем обратились к List - Exception.
        System.out.println("ArrayList: "+aL1);
      //  System.out.println("SubList "+myList);  //ConcurrentModificationException
        String [] array = aL1.toArray(new String [10]);//method toArray, длину массива можно писать любую, без разницы.
        // поэтому лучше писать всегда 0.
        for(String s: array){
            System.out.println(s);
        }
*/



    /*    ArrayList<String>aL3=aL1;
        ArrayList<String> aL2 = new ArrayList<>();
        aL2.add("Ivan");
        aL2.add("Maria");
        aL2.add("Igor");
        //aL1.removeAll(aL2);                 //method removeAll(Collection<?>c)
        //aL1.retainAll(aL2);                   //method retainAll(Collection<?>c)
        //System.out.println(aL1);
        boolean result = aL1.containsAll(aL2);
        System.out.println(result);*/

    }
}
