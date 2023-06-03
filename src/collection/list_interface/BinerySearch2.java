package collection.list_interface;

import java.util.Arrays;

public class BinerySearch2 {
    public static void main(String[] args) {
        int [] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array)); //method Arrays.toString(array) возвращает красивое представление массива
        Arrays.sort(array);             //method Arrays.sort(arrays) - сортирует массив
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 150);//Arrays.binarySearch(array, element)
        System.out.println(index);

    }
}
