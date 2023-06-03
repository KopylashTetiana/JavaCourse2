package stream;
//сортировка массива чисел с помощью метода sorted интерфейса Stream
//method chaining
import java.util.Arrays;
public class Test5 {
    public static void main(String[] args) {
        int [] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        int [] array2 = Arrays.stream(array).sorted().toArray(); //Java знает, как сортировать числа,
        // поэтому в параметр sorted() можно ничего не передавать.
        System.out.println(Arrays.toString(array2));
        //2.            Method chaining
        // Отфильтровать стрим так, чтобы остались только нечетные числа,
        // затем поделить на 3 только те числа, которые делятся без остатка,
        //и найти суму оставшихся измененных чисел:
        int result = Arrays.stream(array).filter(e -> e%2 == 1)
                .map(e -> { if(e%3 == 0) {e = e/3;} return e;})
                .reduce((a, e) -> a + e).getAsInt();
        System.out.println(result);

    }
}
