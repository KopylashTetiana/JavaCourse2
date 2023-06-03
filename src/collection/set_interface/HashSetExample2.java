package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<LittleCar> littleAutoPark = new HashSet<>();
        LittleCar lC1 = new LittleCar("Mercedes", 3.2);
        LittleCar lC2 = new LittleCar("AlfaRomeo", 1.6);
        LittleCar lC3 = new LittleCar("Mitsubishi", 2.9);
        LittleCar lC4 = new LittleCar("Mini Cooper", 1.6);
        LittleCar lC5 = new LittleCar("Mitsubishi", 2.9);
        littleAutoPark.add(lC1);
        littleAutoPark.add(lC2);
        littleAutoPark.add(lC3);
        littleAutoPark.add(lC4);
        littleAutoPark.add(lC5);
        System.out.println(littleAutoPark);
//Если переопределен метод:    то объекты lC3 и lC5:
// hashCode() | equals()   |
// да         | нет        |-будут иметь одинаковый hashCode, но не равны, поэтому оба
//            |            | элемента будут записаны в Set и располагаться один за другим.
// да         | да         |-будут равны, поэтому в Set запишется лишь один такой элемент
// нет        | да         |-будут иметь разный hashCode, поэтому до проверки методом equals
//            |            | дело не дойдет, оба элемента запишутся в Set на разные позиции
// нет        |нет         |-будут не равны ни за hashCode, ни за equals, и запишутся в Set
//            |            | на разные позиции.
    }
}

class LittleCar {
    String name;
    double capacity;

    public LittleCar(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " = " + capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        LittleCar anotherLittleCar = (LittleCar) o;
        return (name.equals(anotherLittleCar.name) && capacity == anotherLittleCar.capacity);
    }

    @Override
    public int hashCode() {
        return (name.hashCode() * 31 + (int)capacity) * 31;
    }

}