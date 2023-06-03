package lambda.predicate.example2;
//задача из Java quiz #2 from Ciklum
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<String> words = List.of("A", "an", "the", "when", "what", "where", "Whether");
        processStringArray(words, p -> p.length() > 0);
    }
    private static void processStringArray(List<String> list, Predicate<String> predicate) {
        for(String str: list) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
