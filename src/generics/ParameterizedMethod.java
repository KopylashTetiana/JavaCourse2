package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer>al1 = new ArrayList<>();
        //ArrayList al1 = new ArrayList(); - raw type
        int i2 = al1.get(0);
        /*
        int i2 = (Integer)al1.get(0); - после стирания типа происходит кастинг значения до Integer, а затем результат
        присваивается int i2.
        */
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int i = GenMethod.getSecondElement(al1);
        System.out.println(i);
        ArrayList<String>al2 = new ArrayList<>();
        al2.add("abc");
        al2.add("def");
        al2.add("ghi");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);
    }
}
class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}