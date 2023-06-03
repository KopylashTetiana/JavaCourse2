package practice.lambda.lesson41.Example6;
//Применяем лямбда-выражение в компараторе (методе для сортировки коллекции машин)
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Car {
    String color;
    int horses;
    public Car(String color, int horses) {
        this.color = color;
        this.horses = horses;
    }
    @Override
    public String toString() {
        return "|" + color + " car with " + horses + " horses engine|";
    }

    public static void main(String[] args) {
        Car car1 = new Car("black", 400);
        Car car2 = new Car("grey", 600);
        Car car3 = new Car("yellow", 200);
        Car car4 = new Car("blue", 300);
        Car car5 = new Car("white", 400);
        Car car6 = new Car("red", 500);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
//для сортировки машин в ArrayList мы используем
// метод Collections.sort, в параметре которого создаем
// анонимный класс, имплементирующий интерфейс Comparator
// и переписывающий его абстрактный метод compare. В итоге
// сортируем автомобили по мошности двигателя:
        Collections.sort(cars, new Comparator<Car>() {
            public int compare(Car c1, Car c2) {
                return c1.horses - c2.horses;
            }
        });
//всё то же самое, что и выше, но анонимный класс заменяем лямбда-выражением:
        Collections.sort(cars, (c1, c2) -> c1.horses - c2.horses);
        System.out.println(cars);
    }
}
