package practice.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Ex5 {
    public static void main(String[]args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Norway");
        states.add("USA");
        states.add("France");
        states.add("Ukraine");
        states.add("Germany");

        Iterator<String> iterator1 = states.iterator();//creating new iterator
        while (iterator1.hasNext()){                    //method hasNext()
            System.out.println(iterator1.next());       //method next()
            //The main difference between Iterator and foreach loop is that we can remove some element
            // from our collection with Iterator:
            iterator1.remove();
        }

    }
}
