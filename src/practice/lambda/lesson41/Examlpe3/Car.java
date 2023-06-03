package practice.lambda.lesson41.Examlpe3;

import java.util.ArrayList;

public class Car {
    String color;
    int numberOfDoors;

    public Car(String color, int numberOfDoors) {
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return " |" + color + " car with " + numberOfDoors + " doors|";
    }
}
interface STO {
    boolean check(Car c);
}

class CarTest {
    public void checkCar(ArrayList<Car> cars, STO sto) {
        for(Car c: cars) {
            if(sto.check(c)) {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}

class Test {
    public static void main(String[] args) {
        Car car1 = new Car("black", 4);
        Car car2 = new Car("grey", 6);
        Car car3 = new Car("yellow", 2);
        Car car4 = new Car("blue", 3);
        Car car5 = new Car("white", 4);
        Car car6 = new Car("red", 5);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        CarTest ct = new CarTest();
        ct.checkCar(cars, (Car car) -> car.color.equals("yellow"));
        ct.checkCar(cars, (Car car) -> car.numberOfDoors >=4);
    }
}