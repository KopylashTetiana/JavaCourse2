package stream;

import java.util.stream.Stream;

public class PeekExample {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1
                .distinct()                     //1 2 3 4 5
                .peek(System.out::println)      //1 2 3 4 5
                .filter(element -> element > 2) //- - 3 4 5
                .peek(System.out::println)      //    3 4 5
                .map(element -> element * 10)   //    304050
                .peek(System.out::println)      //    304050
                .count();                       //    1+1+1=3
        //1 2 3 3 30 4 4 40 5 5 50 3
    }
}
