package Comparation.Practice;
//отсортируй ArrayList<Integer>
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Test2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 100; i>0; i--){
            if((i%7==0)||(i%7==6))numbers.add(i);
        }
        System.out.println("Do sortirovki: \n"+numbers);
        //numbers.add();
        Collections.sort(numbers);
        System.out.println("Posle sortirovki: \n"+numbers);
    }
}
