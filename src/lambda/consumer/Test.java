package lambda.consumer;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test {
    //создадим метод, который будет создавать нам 3 машины. В его параметре - только объект типа Supplier:
    public static ArrayList<Car> create3Cars(Supplier<Car> carSup) {
        ArrayList<Car> al = new ArrayList<>();
        for(int i = 0; i < 3; i++) {//операцию повторяем 3 раза
            al.add(carSup.get());//Supplier возвращает объект Car
        }
        return al;//возвращаем ArrayList с 3-мя созданными машинами
    }
//В следующем методе мы пропишем, что при его вызове
// вызывается метод accept с объектом типа Car в параметре.
// А что конкретно делает метод accept с этим объектом,
// мы будем прописывать при вызове метода changeCar.
    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = create3Cars(() -> new Car("Nissan", "Silver", 1.6));
        System.out.println(cars);

        changeCar(cars.get(0), car -> {
            car.color = "Red";
            car.engine = 2.4;
                    System.out.println("upgraded car: " + car);
                });
        System.out.println("Our cars: " + cars);
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
