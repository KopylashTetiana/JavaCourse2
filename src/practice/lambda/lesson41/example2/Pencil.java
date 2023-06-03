package practice.lambda.lesson41.example2;
//простой, но ужасно корявый пример применения лямбда выражения. Методы делают лишнюю работу, на мой взгляд.
public class Pencil{
    String color;
    int length;

    public Pencil(String color, int length) {
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return '<' + color + " pencil, length=" + length +
                '>';
    }
//    public int work(int count) {
//        return this.length -= count;
//    }
    public void afterWorkInfo(int count, Painting painting) {
        this.length = painting.work(count);
        System.out.println("After work: " + this);
    }
}

interface Painting {
    int work(int count);
}

class TestPencil {
    public static void main(String[] args) {
        Pencil yellowP = new Pencil("yellow", 15);
        System.out.println(yellowP);
        yellowP.afterWorkInfo(3, (count) -> yellowP.length - count); //lambda expressions
        yellowP.afterWorkInfo(4, (count) -> yellowP.length - count);
        yellowP.afterWorkInfo(5, (count) -> yellowP.length - count);
    }
}