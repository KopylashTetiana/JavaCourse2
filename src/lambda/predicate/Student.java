package lambda.predicate;
//применение интерфейса Predicate вместо своего для создания новых однотипных методов при помощи лямбда-выражений

import java.util.ArrayList;
import java.util.function.Predicate;

public class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "<Student " + name + ", course " + course + '>';
    }
}
//в основной метод, который я буду вызывать для создания
// новых методов, вместо созданного мной интерфейса
// вписываю интерфейс Predicate:
class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for(Student st: al) {
            if(pr.test(st)) {
                System.out.println(st);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Nikolay", 2);
        Student st3 = new Student("Elena", 1);
        Student st4 = new Student("Petr", 4);
        Student st5 = new Student("Maria", 3);
        Student st6 = new Student("Elena", 3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        StudentInfo sInfo = new StudentInfo();
        //используем анонимный класс (имплементирующий интерфейс Predicate):
        sInfo.testStudents(students, new Predicate<Student>() {
            @Override
            public boolean test(Student s) {
                return s.name.equals("Ivan");
            }
        });
        System.out.println("--------------------");
        //лямбда-выражение: overriding метода test интерфейса Predicate
        sInfo.testStudents(students, (Student s) -> {
            System.out.println("Hello");
            return s.name.equals("Ivan");
        });
        System.out.println("--------------------");
        sInfo.testStudents(students, s -> s.name.equals("Elena"));
        System.out.println("--------------------");
        sInfo.testStudents(students, (s) -> s.course >= 2 && s.name.equals("Nikolay"));
    }
}