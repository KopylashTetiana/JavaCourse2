package practice.lambda;
//Задача. Разработать лямбда-выражение, которое находит
// максимальное значение в массиве чисел, имеющих некоторый
// числовой тип T. Реализовать передачу лямбда-выражения
// в статический метод. В методе вывести максимальное значение на экран.
//import java.util.function.Function;
import java.util.Arrays;
public class Example2 {
    static <T extends Number> void solution(T[] array, MaxEl<T> me) {
        System.out.println("max = " + me.max(array));
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
    public static void main(String[] args) {
        MaxEl<Integer> maxInt = array -> {
            Integer res = array[0];
            for(int i: array) {
                if(res < i) res = i;
            }
            return res;
        };
        solution(new Integer[]{1, -356, 247961, -45, 89311, -7, 0, 4499362, 23, 7, 6965}, maxInt);
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i-1);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
interface MaxEl <T extends Number> {
    T max(T[] array);
}