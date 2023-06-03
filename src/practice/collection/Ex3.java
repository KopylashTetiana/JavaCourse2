package practice.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ex3 {
    static <T>  ArrayList<T> moreSize(ArrayList<T>...array){
        ArrayList<T> aL = new ArrayList<>(array[0]);
        for (int i=1; i<array.length; i++){
            if(array[i].size()>aL.size()){
            aL=array[i];}
            }
        return aL;
    }
    public static void main(String[] args) {
        ArrayList <String> aL1 = new ArrayList<String>();
        ArrayList<String> aL2 = new ArrayList<>();
        ArrayList<String> aL3 = new ArrayList<>(200);
        List<String> aL4 = new ArrayList<>();
        aL1.add("Archimedes");
        System.out.println("aL1.add Aphrodite: "+aL1.add("Aphrodite"));
        ArrayList<String> aL5 = new ArrayList<>(aL1);
        System.out.println(aL1+", "+aL2+", "+aL3+", "+aL4+", "+aL5);
        //System.out.println(aL1.add(4," "));//Compile time error
        //aL1.add(4,"Aurora");//IndexOutOfBoundsException
        aL1.add(1,"Aurora");
        System.out.println(aL1+"-*-"+aL5);
        aL1.get(2);
        //aL1.get(4);//IndexOutOfBoundsException
        System.out.println("aL1(0): "+aL1.get(0));
        aL2.add(aL1.get(1));
        //aL1.set(4,"Ivan");//IndexOutOfBoundsException
        //System.out.println(aL1.set(3,"Ivan"));//IndexOutOfBoundsException
        System.out.println("This element is removed from aL1: "+aL1.set(2,"Ivan"));
        System.out.println(aL1.indexOf("Aurora"));
        System.out.println(aL1.indexOf("Ivan"));
        System.out.println(aL2.indexOf("Aurora"));
        System.out.println("aL1: "+aL1);
        System.out.println("Aphrodite is removed from aL1: "+aL1.remove("Aphrodite"));
        System.out.println("Aurora is removed from aL2: "+aL2.remove("Aurora"));
        System.out.println("The zero element is removed from aL1: "+aL1.remove(0));
        aL1.add(null);
        System.out.println("aL1: "+aL1);
        //System.out.println(aL1.remove(5));//IndexOutOfBoundsException
        System.out.println(aL1.set(2, "Archimedes"));
        System.out.println("aL1: "+aL1);
        Car car1 = new Car("Mitsubishi");
        Car car2 = new Car("Volvo");
        ArrayList<Car> aLC = new ArrayList<>();
        aLC.add(car1);
        aLC.add(car2);
        Car car3 = new Car("Volvo");
        System.out.println(aLC.remove(car3));
        System.out.println(aLC);
        System.out.println(aL2.addAll(aL1));
        //System.out.println(aL3.addAll(null));//NullPointerException
        System.out.println(aL1.addAll(2, aL2));
        System.out.println("aL1: "+ aL1);
       // System.out.println(aL3.addAll(100, aL1));//IndexOutOfBoundsException
        aL1.clear();
        System.out.println(aL1+"*-*"+aL2);
        System.out.println("aL5: "+aL5);
        System.out.println(aLC.indexOf(car1));
        System.out.println(aLC.indexOf(new Car("Mitsubishi")));
        Car car4 = new Car(null);
        //aLC.add(null);
        aLC.add(car4);
        System.out.println((String) null);
        System.out.println(aLC);
        System.out.println(aLC.indexOf(null));
        System.out.println(aLC.indexOf(new Car(null)));
        System.out.println(aL1.size()+aL2.size());
        System.out.println(aL2);
        aL5.addAll(aL2);
        System.out.println(aL5);
        System.out.println(aL5.lastIndexOf("Archimedes"));
        System.out.println(aL5.lastIndexOf(new String("Archimedes")));
        System.out.println(aL5.lastIndexOf("Hercules"));
        System.out.println(aL5.lastIndexOf(null));
        System.out.println(aLC.lastIndexOf(null));
        //System.out.println(moreSize(aL1, aL2, aL3, (ArrayList)aL4, aL5, null));//NullPointerException
        System.out.println(moreSize(aL1, aL2, aL3, (ArrayList)aL4, aL5));
        System.out.println(aL3.isEmpty());
        System.out.println(aL2.isEmpty());
        System.out.println(aL2.toString());





        //System.out.println(aL2.indexOf("Ivan"));//NullPOinterException


    }
}
class Car{
    String name;
    public Car(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }
}
