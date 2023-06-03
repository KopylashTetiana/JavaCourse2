package practice.nested_classes;

import java.time.LocalDateTime;
import java.time.LocalTime;

//training of all nested classes
public class Outer {        //outer class
    private static int counter = 0;
    int number;
    String name;
    Inner inner1;
    Nested nested1;

    public Outer(int number, String name, int otherNumber, String otherName) {
        counter++;
        this.number = number;
        this.name = name;
        inner1 = this.new Inner(otherNumber);
        nested1 = new Outer.Nested(otherName);
        System.out.println("The Outer #" + counter + " has been created.");
    }
    public String growing(){
        class Mushroom {        //local inner class
        final String name;
        final double height;
        public Mushroom(String name, double height) {
            this.name = name;
            this.height = height;
        }
        public String toString() {return "Mushroom " + name + " has height " + height + "sm.";}
        }
        Mushroom mushroom = new Mushroom("Umbrella", 29.5);
        return mushroom.toString();
    }
    SomeInterface si = new SomeInterface() {  //anonymous class
        @Override
        public LocalDateTime getPresent() {
            return present;
        }
    };

    class Inner {           //inner class
        int otherNumber;
        Inner(int otherNumber) {
            this.otherNumber = otherNumber;
            System.out.println("New " + this.toString() + " has been created.");
        }
        public String toString() {return "Inner " + otherNumber;}
    }
    static class Nested {       //static nested class
        private final String otherName;
        Nested(String otherName) {
            this.otherName = otherName;
            System.out.println("New " + this.toString() + " has been created.");
        }
        public String toString() {return "Nested " + otherName;}
    }

}
interface SomeInterface {
    LocalDateTime present = LocalDateTime.now();
    LocalDateTime getPresent();
}

class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer(32, "Aurora", 56, "Kronos");
        System.out.println(outer.si.getPresent());
        System.out.println(LocalTime.now());
        System.out.println(outer.growing());
        Outer outer2 = new Outer(11, "Ah", 96, "Octoberfest");
    }
}