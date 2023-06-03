package practice.other;
//задача из Java quiz #2 from Ciklum
import java.util.List;
import java.util.ArrayList;

class Base {
    int id = 1000;
    Base() {
        Base();
    }
    void Base() {
        System.out.println(++ id);
    }
}

class Derived extends Base {
    int id = 2000;
    Derived() {} //1
    void Base(){
        System.out.println(-- id);
    }
}

public class Test {
    public static void main (String[] args) {
        Derived base = new Derived();

    }
}
