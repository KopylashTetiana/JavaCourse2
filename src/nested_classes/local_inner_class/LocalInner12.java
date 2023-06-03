package nested_classes.local_inner_class;

public class LocalInner12 {
    public static void main(String[] args) {
        Math12 math = new Math12();
        math.getResult(21, 4);//эти значения в объекте math менять нельзя.
        //Для того, чтобы быть уверенным, что мы их не изменим, в параметре метода getResult
        // поставим modifier 'final' у каждой из этих переменных (строчка 13)
    }
}
class Math12 {
    private int a = 10;
    public void getResult(final int divisor, final int denominator){
        class Division { //local inner class//деление

            public int getQuotient() {      //частное (от деления чисел)
                return divisor/denominator;
            }
            public int getRemainder() {     //остаток (от деления чисел)
                return divisor%denominator;
            }
            public double getDecimal() {
                return (double)divisor*a/(double)denominator/a; //local inner class "видит" private элементы внешнего класса
            }
        }
        Division division = new Division();//создаем объект класса Division
        System.out.println("Делимое = " + divisor);
        System.out.println("Делитель = " + denominator);
        System.out.println("Частное = " + division.getQuotient());
        System.out.println("Остаток от деления = " + division.getRemainder());
        System.out.println("Частное в виде десятичной дроби = " + division.getDecimal());
    }
}
