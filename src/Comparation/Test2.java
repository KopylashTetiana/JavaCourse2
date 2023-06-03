package Comparation;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);
         Arrays.sort(new Employee[]{emp1, emp2, emp3}); //Если для сортировки использовать этот метод без перезаписи
        //метода Comparable.compareTo(Employee emp), то компилятор не ругается, но выскочит ClassCastException:
        //Employee cannot be cast to class Comparable.
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting: \n"+list);
        Collections.sort(list);//java не понимает, каким образом сортировать объекты Employee.
        //Пока мы не перезаписали метод compareTo интерфейса Comparable
        System.out.println("After sorting: \n"+list);
    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name: " + name +
                ", surname: " + surname +
                ", salary=" + salary +
                '}';
    }

    @Override//1й способ перезаписи метода compareTo(с использованием Ternary operator)
    public int compareTo(Employee anotherEmp) {
       return ((this.id == anotherEmp.id)?0:(this.id < anotherEmp.id)?-1:1);
    }
    //@Override//2й способ перезаписи метода compareTo
    //public int compareTo(Employee anotherEmp) {
    //    if (this.id == anotherEmp.id){return 0;}
    //    else if(this.id < anotherEmp.id){return -1;}
    //    else return 1;
    //}
    //@Override//3-й способ перезаписи метода compareTo, подходит для числовых типов. Самый популярный
    //public int compareTo(Employee anotherEmp) {
    //    return this.id-anotherEmp.id;
    //}
    //@Override//4-й способ перезаписи метода compareTo, подходит если id - Integer. Оригинальный.
    //public int compareTo(Employee anotherEmp) {
     //   return this.id.compareTo(anotherEmp.id);
    //}
//В классах Integer и String переписан метод compareTo, поэтому можно воспользоваться их функционалом.
   // @Override//5-й способ перезаписи метода compareTo, если мы сравниваем работников не по id, а по name<String>:
    //public int compareTo(Employee anotherEmp) {
    //return this.name.compareTo(anotherEmp.name);
    //}
 //   @Override//6-й способ перезаписи метода compareTo, где мы сравниваем работников по name и surname:
    //public int compareTo(Employee anotherEmp) {
//        int res = this.name.compareTo(anotherEmp.name);
//        if (res==0) {res = this.surname.compareTo(anotherEmp.surname);}
//        return res;
//    }
}
class IdComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.id == e2.id) return 0;
        else if (e1.id<e2.id) return -1;
        else return 1;
    }
}