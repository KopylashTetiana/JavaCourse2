package nested_classes.inner_class;

public class Car2 {
    String color;
    int doorCount;
    Engine engine;

    public Car2(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine (Engine engine) {  //метод присваивает созданный объект Engine созданному объекту Car
        this.engine = engine;
    }

    @Override
    public String toString() {
        return '{' + color + " car, " + doorCount + " doors, " + engine + " engine}";
    }

    public class Engine {            //inner class inside class Car
        private int horsePower;
        //static int k;             //Compile time error
        //final static int a=0;     //OK

        public Engine(int horsePower) {
           // System.out.println(doorCount);
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "'" + horsePower + " horses'";
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Car2 car = new Car2("black", 4);//создали объект car, у кот-го engine=null
        System.out.println(car);
        //воспользуемся конструктором car.Engine для создания объекта Car2.Engine:
        Car2.Engine engine = car.new Engine(300);
        System.out.println(engine);//вот так выглядит созданный мотор
        System.out.println(car);//car.Engine всё ещё = null
        car.setEngine(engine);//присвоили мотор объекту car
        System.out.println(car);

    }
}
