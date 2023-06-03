package stream;
//пример применения метода Stream.forEach() и Method reference.
import java.util.Arrays;
public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        //Я хочу удвоить каждый элемент и вывести его на экран:
        Arrays.stream(array).forEach(el -> System.out.print(el*2 + " "));
        System.out.println(); //или просто вывести на экран каждый элемент:
        Arrays.stream(array).forEach(el -> System.out.print(el + " "));
        System.out.println();//Это лямбда-выражение можно еще упростить:
        Arrays.stream(array).forEach(System.out::println);
        //'System.out::print' - это method reference. То есть, мы даем
        // ссылку на наш метод println, который находится в System.out.
        // И Java достаточно умна, чтобы понять, что в параметр к println
        // мы должны вставить каждый элемент нашего stream'a.
        //До двух двоеточий указываю класс, после двоеточий - метод:
        // класс::метод.         // Еще один пример:
        Arrays.stream(array).forEach(Utils::myMethod);
        //Method reference можно применять во всех лямбда-выражениях.
    }
}
class Utils {
    public static void myMethod(int a) {
        a +=5;
        System.out.println("element = " + a);
    }
}