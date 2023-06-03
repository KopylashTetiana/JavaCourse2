package generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Privet", 34);
        System.out.println("Znachenia pari: "+pair1.getValue1()+", "+pair1.getValue2());
        Pair<Integer, Double> pair2 = new Pair<>(136, 3.14);
        System.out.println("Znachenia pari: "+pair2.getValue1()+", "+pair2.getValue2());

        OtherPair<Integer> op1 = new OtherPair<>(32123, 54);
        System.out.println("Znachenia pari: "+op1.getValue1()+", "+op1.getValue2());
    }
}
class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;
    public Pair(V1 value1, V2 value2) {
        this.value1=value1;
        this.value2=value2;
    }

    public V1 getValue1() {
        return value1;
    }
    public V2 getValue2() {
        return value2;
    }
}
class OtherPair<V> {
    private V value1;
    private V value2;
    public OtherPair(V value1, V value2) {
        this.value1=value1;
        this.value2=value2;
    }

    public V getValue1() {
        return value1;
    }
    public V getValue2() {
        return value2;
    }
}
