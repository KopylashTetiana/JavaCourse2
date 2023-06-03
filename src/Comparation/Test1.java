package Comparation;
//method Collections.sort(ArrayList<>)->void естественная сортировка
//escape-последовательности или экранирование символов: \n (перенос курсора на новую строку)
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList <>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Maria");
        System.out.println("Pered sortirovkoy \n" + list+'\n');
       // System.out.println(list);
        Collections.sort(list);
        System.out.println("Posle sortirovki");
        System.out.println(list);
        String str = "Java said, \"Hello World!\"";
    }
}
