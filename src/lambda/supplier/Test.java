package lambda.supplier;
import java.util.ArrayList;
import java.util.function.Supplier;

public class Test {
    //создадим метод, который будет создавать нам 3 машины. В его параметре - только объект типа Supplier:
    public static ArrayList<Car> create3Cars(Supplier<Car> carSup) {
        ArrayList<Car> al = new ArrayList<>();
        for(int i = 0; i < 3; i++) {//операцию повторяем 3 раза
            al.add(carSup.get());//Supplier возвращает объект Car
        }
        return al;//возвращаем ArrayList с 3-мя созданными машинами
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = create3Cars(() -> new Car("Nissan Tilda", "Silver metalic", 1.6));
        System.out.println(cars);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return '{' + color + ' ' + model + " with " + engine +
                " engine}";
    }
}
