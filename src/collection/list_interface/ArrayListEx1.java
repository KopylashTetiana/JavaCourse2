package collection.list_interface;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList <String> arrayList1 = new ArrayList<String>();
        String a = new String ("Ooops");
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(a);
        //arrayList1.add(10);
        System.out.println(arrayList1);

        ArrayList <String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");//
        arrayList2.add("Mariya");
        arrayList2.add(a);
        System.out.println(arrayList2);
        a = new String ("Aha!");
        System.out.println(arrayList2);

        ArrayList <StringBuilder> arrayList3 = new ArrayList<>();
        StringBuilder b = new StringBuilder("Oops");
        arrayList3.add(new StringBuilder ("Zaur"));
        arrayList3.add(new StringBuilder ("Ivan"));
        arrayList3.add(new StringBuilder ("Mariya"));
        arrayList3.add(b);
        System.out.println(arrayList3);

        List<StringBuilder> arrayList4 = new ArrayList<>(arrayList3);
        System.out.println(arrayList4);
        b.replace(2,3, a);
        System.out.println(arrayList3);
        System.out.println(arrayList4);



    }
}
