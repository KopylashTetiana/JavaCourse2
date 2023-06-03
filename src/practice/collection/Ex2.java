package practice.collection;
//methods add(DT element)-> boolean; add(int index,
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>();
        System.out.println(aL1.add("Archimedes"));
        aL1.add(0,"Aurora");
        //aL1.add(4, "Aphrodite");//IndexOutOfBoundsException
        //System.out.println(aL1.add(4, "Aurora"));//compile time error
        aL1.add(2,"Aphrodite");
        System.out.println(aL1);
        aL1.add("Hercules");
    }
}
