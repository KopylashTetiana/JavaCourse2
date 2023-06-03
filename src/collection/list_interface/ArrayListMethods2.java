package collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 22);
        Student st2 = new Student("Nikolay", 28);
        Student st3 = new Student("Elena", 19);
        Student st4 = new Student("Petr", 35);
        Student st5 = new Student("Mariya", 23);
        ArrayList<Student> stList = new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);
        System.out.println(stList);
        Student st6 = new Student ("Mariya", 23);
        int index = stList.indexOf(st6);            //method indexOf(Object element)
        System.out.println(index);
//        stList.remove(st6);
//        System.out.println(stList);
    }
}

