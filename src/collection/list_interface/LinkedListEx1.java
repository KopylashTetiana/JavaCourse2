package collection.list_interface;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 st21 = new Student2("Ivan", 3);
        Student2 st22 = new Student2("Mykola", 2);
        Student2 st23 = new Student2("Olena", 1);
        Student2 st24 = new Student2("Petro", 4);
        Student2 st25 = new Student2("Mariya", 3);
        LinkedList<Student2> stud2LinkedList = new LinkedList<>();//LinkedList creation
        stud2LinkedList.add(st21);                                //method add(e)
        stud2LinkedList.add(st22);
        stud2LinkedList.add(1, st23);                        //method add(index, e)
        stud2LinkedList.add(st24);
        stud2LinkedList.add(st25);
        System.out.println("LinkedList=" + stud2LinkedList);
        System.out.println("The second element of LinkedList: " + stud2LinkedList.get(2));//method get(index)
        stud2LinkedList.remove();                               //method remove() - retrieves and removes the head of this list
        stud2LinkedList.remove(2);                         //method remove(index) - retrieves and removes the element at this index
        System.out.println("LinkedList=" + stud2LinkedList);
        System.out.println(stud2LinkedList.getFirst());         //returns the first element in this list
        System.out.println(stud2LinkedList.getLast());          //returns the last element in this list
    }
}

