package practice.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Ex6 {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("Oktober");
        months.add("November");
        months.add("December");

        Iterator<String> iter = months.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
            iter.remove();
        }
    }
}
