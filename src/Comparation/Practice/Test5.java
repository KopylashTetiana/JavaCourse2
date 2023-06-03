package Comparation.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test5 {
    public static void main(String[] args){
    List <Towel> polotenca = new ArrayList<>();
Towel t1=new Towel("Olive", 120, 60);
    Towel t2=new Towel("Yellow", 115, 58);
    Towel t3=new Towel("Yellow", 50, 90);
    Towel t4=new Towel("Yellow", 120, 55);
    Towel t5=new Towel("Yellow", 60, 40);
    Towel t6=new Towel("Brown", 65, 45);
    Towel t7=new Towel("Grey", 140, 70);
    Towel t8=new Towel("Brown", 125, 65);
    Towel t9=new Towel("Green", 100, 65);
    Towel t10=new Towel("Yellow", 100, 60);
    polotenca.add(t1);
    polotenca.add(t2);
    polotenca.add(t3);
    polotenca.add(t4);
    polotenca.add(t5);
    polotenca.add(t6);
    polotenca.add(t7);
    polotenca.add(t8);
    polotenca.add(t9);
    polotenca.add(t10);
System.out.println(polotenca);
        Collections.sort(polotenca, new SquareTowComparator());
        System.out.print("Sortirovka po razmeru: ");
        System.out.println(polotenca);
        Collections.sort(polotenca, new LengthTowComparator());
        System.out.print("Sortirovka po dlinne: ");
        System.out.println(polotenca);
        Collections.sort(polotenca, new WidthTowComparator());
        System.out.print("Sortirovka po shirine: ");
        System.out.println(polotenca);
        Collections.sort(polotenca, new ColorTowComparator());
        System.out.print("Sortirovka po cvetu: ");
        System.out.println(polotenca);
        Collections.sort(polotenca, new ColorSquareTowComparator());
        System.out.print("Sortirovka po cvetu i ploschadi: ");
        System.out.println(polotenca);
    }}
class Towel {
    String color;
    int length;
    int width;
    public Towel(String color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "\nTowel: " + color + ", "+ length+'*'+ width;
    }
}
class SquareTowComparator implements Comparator<Towel>{
    public int compare(Towel tow1, Towel tow2){
        return Integer.compare(tow1.length*tow1.width, tow2.length*tow2.width);
    }
}
class LengthTowComparator implements Comparator<Towel> {
    public int compare(Towel tow1, Towel tow2){
        return Integer.compare(tow1.length, tow2.length);
    }
}
class WidthTowComparator implements Comparator<Towel> {
    public int compare(Towel tow1, Towel tow2){
        return Integer.compare(tow1.width, tow2.width);
    }
}
class ColorTowComparator implements Comparator<Towel> {
    public int compare(Towel tow1, Towel tow2){
        return tow1.color.compareTo(tow2.color);
    }
}
class ColorTowComparator2 implements Comparator<Towel> {
    public int compare(Towel tow1, Towel tow2){
        return tow1.color.compareTo(tow2.color);
    }
}
class ColorSquareTowComparator implements Comparator<Towel> {
    public int compare(Towel tow1, Towel tow2) {
        if (tow1.color.equalsIgnoreCase(tow2.color)) return Integer.compare(tow1.length*tow1.width, tow2.length*tow2.width);
            return tow1.color.compareTo(tow2.color);
    }
}