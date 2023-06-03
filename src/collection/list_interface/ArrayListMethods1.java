package collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList();
        aL1.add("Zaur");                        //method add(dt)
        aL1.add("Ivan");
        aL1.add("Maria");
        aL1.add(1, "Misha");        //method add(index, dt)
        for (String s: aL1){
            System.out.print(s+' ');
        }
        System.out.println();
        aL1.set(1, "Masha");                //method set(index, dt)
        for(int i = 0; i<aL1.size(); i++){ //method size
            System.out.println(aL1.get(i)); //method get
        }
        ArrayList<Integer> aL2 = new ArrayList();
    }
}
