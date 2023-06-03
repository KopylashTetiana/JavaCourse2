package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math1 math = new Math1();
        math.getResult();
    }
}
class Math1 {
    private int a = 10;
    public void getResult(){
        int divisor = 21; //effectively final, т.е., переменная после инициализации не меняет значение.
        class Division { //local inner class//деление
            void abc() {
                //divisor = 20;//Compile time error: чтобы в loc.in.class был доступ до переменной
                // из блока getResult, эта переменная должна быть либо final, либо effectively final.
                //Т.е., её значение менять нельзя.
            }
//            private int divisor;            //делимое
            private int denominator;        //делитель
//            public void setDivisor(int divisor) {   //делимое
//                this.divisor = divisor;
//            }
            public void setDenominator(int denominator) { //делитель
                this.denominator = denominator;
            }
//            public int getDivisor() {       //делимое
//                return divisor;
//            }
            public int getDenominator() {   //делитель
                return denominator;
            }
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
//        division.setDivisor(21);
        division.setDenominator(4);
        //System.out.println("Делимое = " + division.getDivisor());
        System.out.println("Делимое = " + divisor);
        System.out.println("Делитель = " + division.getDenominator());
        System.out.println("Частное = " + division.getQuotient());
        System.out.println("Остаток от деления = " + division.getRemainder());
        System.out.println("Частное в виде десятичной дроби = " + division.getDecimal());
    }
}
