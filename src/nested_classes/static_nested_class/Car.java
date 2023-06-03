package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return '{' + color + " car, " + doorCount + " doors, " + engine + " engine}";
    }

    public static class Engine {            //nestet static class inside class Car
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "'" + horsePower + " horses'";
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);//для создания объекта nested static class
        // нужно указывать имя класса, внутри которого находится данный nested class.
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
        //ВНИМАНИЕ! Создавать объект класса Engine можно только таким образом. Мы не можем
        // использовать для его создания готовый объект класса Car. Так писать нельзя:
        //Car.Engine engine2 = new car.Engine(150);//Compile time error
    }
}