package Comparation.Practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

//Отсортируй объекты Car всеми возможными способами
public class Test3 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car mitsu = new Car(1990, "Mitsubishi", 306);
        Car ferrari = new Car(2001, "Ferrari", 300);
        Car bugatti = new Car(2010, "Bugatti", 250);
        Car subaru = new Car(2010, "Subaru Forester", 116);
        Car bmw = new Car(2014, "BMW 320", 123);
        Car ford = new Car(2013, "Ford Fusion", 157);
        Car opel = new Car(2018, "Opel Insignia", 79);
        Car merc = new Car(2019, "Mercedes-Benz E-450", 3);
        Car honda = new Car(2012, "Honda Pilot", 117);
        cars.add(bmw);
        cars.add(merc);
        cars.add(honda);
        cars.add(subaru);
        cars.add(mitsu);
        cars.add(ford);
        cars.add(opel);
        cars.add(ferrari);
        cars.add(bugatti);
        System.out.println("Do sortirovki: "+cars);
        Collections.sort(cars);
        System.out.println("1. Posle sortirovki compareTo po godu: "+cars);
        cars.sort(new ModelComparator());
        System.out.println("2. Posle sortirovki compare po modeli: "+cars);
        cars.sort(new ManufactureYearComparator());
        System.out.println("3. Posle sortirovki compare po godu: " + cars);
        cars.sort(new ManufactureYearComparator2());
        System.out.println("4. Posle sortirovki compare po godu2: " + cars);
        cars.sort(new MileageComparator());
        System.out.println("5. Posle sortirovki compare po probegu: " + cars);
        cars.sort(new MileageComparator2());
        System.out.println("6. Posle sortirovki compare po probegu2: " + cars);
        cars.sort(new YearMileageComparator());
        System.out.println("7. Posle sortirovki compare po godu i probegu: " + cars);
        Collections.sort(cars, new ModelComparator());
        System.out.println(cars);
    }
}
class Car implements Comparable<Car> {
    private int manufactureYear;
    private String model;
    private int mileage;

    public Car(int manufactureYear, String model, int mileage) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.mileage = mileage;
    }

    public void setYear(int year) {
        manufactureYear = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String toString() {
        return "\n Manufacure year: " + manufactureYear + ", model: " + model + ", mileage: " + mileage;
    }

    //    @Override//1-й способ перезаписи метода compareTo
//    public int compareTo(Car car){
//        return (this.manufactureYear == car.manufactureYear)? 0:(this.manufactureYear<car.manufactureYear)? -1:1;
//    }
//    @Override//2-й способ перезаписи метода compareTo
//    public int compareTo(Car car) {
//        return this.manufactureYear - car.manufactureYear;
//    }
    @Override//3-й способ перезаписи метода compareTo
    public int compareTo(Car car) {
        return Integer.compare(this.manufactureYear, car.manufactureYear);
    }
}
class ManufactureYearComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2){
    return Integer.compare(car1.getManufactureYear(), car2.getManufactureYear());
    }
}

class ManufactureYearComparator2 implements Comparator<Car>{
    public int compare(Car car1, Car car2){
        return car1.getManufactureYear()-car2.getManufactureYear();
    }
}
class ModelComparator implements Comparator<Car>{
    public int compare(Car car1, Car car2){
        return CharSequence.compare(car1.getModel(),car2.getModel());
    }
}
class MileageComparator implements Comparator<Car>{
    public int compare(Car car1, Car car2){
        return car1.getMileage()-car2.getMileage();
    }
}
class MileageComparator2 implements Comparator<Car>{
    public int compare(Car car1, Car car2){
        if (car1.getMileage()==car2.getMileage()) return 0;
        else if (car1.getMileage()<car2.getMileage()) return -1;
        else return 1;
    }
}
class YearMileageComparator implements Comparator<Car>{
    public int compare(Car car1, Car car2){
        if (car1.getManufactureYear()==car2.getManufactureYear())
            if(car1.getMileage()==car2.getMileage()) {
                return 0;
            } else if (car1.getMileage()<car2.getMileage()) return -1;
        else return 1;
        else if (car1.getManufactureYear()<car2.getManufactureYear()) return -1;
        else return 1;
    }
}