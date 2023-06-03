package practice.lambda;
//задача на лямбда-выражение: написать метод, который
// принимает в параметр ссылку на функ.интерфейс,
// который находит сред.арифм. трех чисел.
public class Example1 {
    public void printAverage(Iaverage ref) {
        System.out.println("ref=" + ref.avg(3, 7, 8));
    }
    public static void main(String[] args) {
        Example1 ex1 = new Example1();
        ex1.printAverage((a, b, c) -> (a + b + c)/3);//самый короткий способ записи
        ex1.printAverage(ex1.ia1);
    }
    Iaverage ia1 = (a, b, c) -> {
        double res = (a + b + c)/3;
        return res;
    };
}
interface Iaverage {
    double avg(double a, double b, double c);
}
