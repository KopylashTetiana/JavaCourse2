package practice.collection;
//constructors of ArrayList
import java.util.ArrayList;
import java.util.List;
public class Ex1 {
    public static void main(String[] args) {
        //ArrayList<int> aL = new ArrayList<>(); //Compile time error: Type argument cannot be of primitive type
        ArrayList<String> aL1 = new ArrayList<String>();
        ArrayList<String> aL2 = new ArrayList<>();
        ArrayList<String> aL3 = new ArrayList<>(200);
        List<String> aL4 = new ArrayList<>();
        ArrayList<String> aL5 = new ArrayList<>();
        System.out.println(aL1);
        System.out.println(aL2);
        System.out.println(aL3);
        System.out.println(aL4);
        System.out.println(aL5);
    }
}
