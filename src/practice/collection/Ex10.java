package practice.collection;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Ex10 {
    public static void main(String[] args) {
        Student st1 = new Student("Anton", 4);
        Student st2 = new Student("Ben", 2);
        Student st3 = new Student("Anton", 4);
        Map<Student, Double> hashMap = new HashMap<>();
        hashMap.put(st1, 8.7);
        hashMap.put(st2, 9.5);
        hashMap.put(st3, 5.4);
        System.out.println("hashMap: "+hashMap);
        Map<Student, Double> treeMap = new TreeMap<>();
        treeMap.put(st1, 8.7);
        treeMap.put(st2, 9.5);
        treeMap.put(st3, 5.4);
        System.out.println("treeMap: "+treeMap);
        System.out.println("st1.equals(st3): "+st1.equals(st3));
        System.out.println("st1.compareTo(st3): "+st1.compareTo(st3));
        System.out.println("st1.compareTo(st2): "+st1.compareTo(st2));
        System.out.println("st1.hashCode(): "+st1.hashCode());
        System.out.println("st3.hashCode(): "+st3.hashCode());
    }
}
class Student implements Comparable<Student>{
    String name;
    int course;
    public Student(String name, int course){
        this.name=name;
        this.course=course;
    }
    @Override
    public String toString(){
        return name+", "+course+" course";
    }
    @Override
    public int compareTo(Student o1){return this.name.compareTo(o1.name);}

}
