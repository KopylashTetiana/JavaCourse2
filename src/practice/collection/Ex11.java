package practice.collection;

import java.util.HashMap;
import java.util.Objects;
//
public class Ex11 {
    public static void main(String[] args) {
        HashMap<Dog, Integer> hashMapDogs = new HashMap<>();
        Dog dog1 = new Dog("Hulk", "bulldog");
        Dog dog2 = new Dog("Lessi", "kolli");
        Dog dog3 = new Dog("Irma", "bulldog");
        hashMapDogs.put(dog1, 3);
        hashMapDogs.put(dog2, 1);
        hashMapDogs.put(dog3, 7);
        System.out.println(hashMapDogs);
    }
}

class Dog {

    String name, breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String toString() {
        return breed + ' ' + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this == null || getClass() != o.getClass()) return false;
        Dog anotherDog = (Dog) o;
        return breed.equals(anotherDog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }
}
