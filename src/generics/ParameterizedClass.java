package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        //Info<String> info1 = new Info<>("privet");//Compile time error: в дженерик класса Info можно подставлять
        //только тип Number и его сабклассы.
        //Info<Car> info2 = new Info<>(new Car());//Compile time error

    Info<Integer> info3 = new Info<>(123);
        System.out.println(info3);
       Integer i = info3.getValue();

    Info<Double> info4 = new Info<>(3.14);
        System.out.println(info4);
        Double d = info4.getValue();
    }
}
class Info<T extends Number>{
    private T value;
    public Info (T value){
        this.value=value;
    }
    public T getValue() {
        return value;
    }
    public String toString (){
        return "{["+value+"]}";
    }
}
