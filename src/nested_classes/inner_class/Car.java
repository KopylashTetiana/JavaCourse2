package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);//Вот так создается объект inner класса: мы с помощью this,
        // a this означает наш текущий объект класса Car, после этого объекта мы ставим ".", как бы показывая,
        // что мы будем обращаться к какому-то его элементу, и тут же создаем новый мотор.
        //Таким образом, в создании inner class всегда задействован объект внешнего класса.
    }

    @Override
    public String toString() {
        return '{' + color + " car, " + doorCount + " doors, " + engine + " engine}";
    }

    public class Engine {            //inner class inside class Car
        private int horsePower;

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
        //Car.Engine engine = new Car.Engine(256);//Comple time error! для создания объекта inner class
        // нужно сначала создать объект внешнего класса
        Car car = new Car("black", 4, 300);
        System.out.println(car);
    }
}
