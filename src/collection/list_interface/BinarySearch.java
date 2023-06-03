package collection.list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(-3);
//        arrayList.add(8);
//        arrayList.add(12);
//        arrayList.add(-8);
//        arrayList.add(0);
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(150);
//        arrayList.add(-30);
//        arrayList.add(19);
//        System.out.println(arrayList);
//        //в неотсортированной коллекции поиск дает неправильный результат:
//        System.out.println(Collections.binarySearch(arrayList, 12));
//        Collections.sort(arrayList);//отсортировали коллекцию
//        System.out.println(arrayList);
//        System.out.println(Collections.binarySearch(arrayList, 12));
//        System.out.println(Collections.binarySearch(arrayList, 100));
//
//        Collections.reverse(arrayList);
//        System.out.println(arrayList);
//        Collections.shuffle(arrayList);
//        System.out.println(arrayList);

        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(15, "Ivan", 6542);
        Employee emp3 = new Employee(123, "Petro", 8542);
        Employee emp4 = new Employee(15, "Maria", 5678);
        Employee emp5 = new Employee(182, "Mykola", 125);
        Employee emp6 = new Employee(15, "Oleksa", 9874);
        Employee emp7 = new Employee(250, "Olena", 1579);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee(182, "Mykola", 0));
        System.out.println(index2);
    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{id:" + id +", " + name +", $" + salary +'}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id-anotherEmp.id;
        if (result==0){
            result=this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}