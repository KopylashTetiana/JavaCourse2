package practice.lambda.lesson41.Example5;
//Применяем лямбда-выражение в компараторе (методе для сортировки коллекции студентов)
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

interface StudentChecks {
    boolean check(Student s);
}

class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for(Student st: al) {
            if(sc.check(st)) {
                System.out.print(st);
            }
        }
        System.out.println();
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
        //для сортировки студентов в ArrayList мы используем метод
        // Collections.sort, в параметре которого создаем анонимный
        // метод, имплементирующий интерфейс Comparator и
        // переписывающий его абстрактный метод copare. В итоге
        //сортируем студентов по возрастания курса:
//        Collections.sort(students, new Comparator<Student>() {
//            public int compare(Student s1, Student s2){
//                return s1.course - s2.course;
//            }
//        });
        //всё то же самое, что и выше, но вместо анонимного метода пишем лямбда-выражение:
        Collections.sort(students, (s1, s2) -> s1.course - s2.course);
        System.out.println(students); //студенты отсортированы по курсу

        sInfo.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.name.equals("Ivan");
            }
        });
        System.out.println("--------------------");
        sInfo.testStudents(students, (Student s) -> {
            return s.name.equals("Ivan");
        });
        System.out.println("--------------------");
        sInfo.testStudents(students, (Student s) -> s.name.equals("Ivan"));
        sInfo.testStudents(students, s -> s.name.equals("Elena"));
        sInfo.testStudents(students, (s) -> s.course >= 2);
        sInfo.testStudents(students, (Student p) -> p.course == 3);
        sInfo.testStudents(students, p -> p.course < 3);
    }
}

