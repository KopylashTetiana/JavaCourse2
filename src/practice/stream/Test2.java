package practice.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
//        Stream<Integer> stream1 = Stream.of(5, 10, 15, 66, 8, 0, 47, 635, 1);
//        stream1
//                .map(el -> el*3)                                //
//                .peek(System.out::println)                      //15 30 45  198 24  0   141 1905 3
//                .filter(el -> el%5 != 0)                        //
//                .peek(System.out::println)                      //          198 24      141      3
//                .sorted()                                       //          3   24  141 198
//                .peek(el -> System.out.println(el = el/2))      //          1   12  70  99
//                .count();
//15    30  45  198 198 24  24  0   141 141 1905    3   3   1   12  70  99
        Stream<String> stream2 = Stream.of("I'm ", "learning ", "Java ", "coding ", "every ", "day.");
        stream2.peek(System.out::print)
                .filter(el-> el.toCharArray()[0] == 'J')
                .count();

    }
}
