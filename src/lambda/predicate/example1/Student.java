package lambda.predicate.example1;
//логические методы для взаимодействия фильтраций Predicate: and, or, negate
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

class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for(Student st: al) {
            if(pr.test(st)) {
                System.out.println(st);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Nikolay", 2);
        Student st2 = new Student("Elena", 1);
        Student st3 = new Student("Petr", 4);
        Student st4 = new Student("Elena", 3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        StudentInfo sInfo = new StudentInfo();
        Predicate<Student> p1 = student -> student.course > 2; //фильтрация №1
        Predicate<Student> p2 = student -> student.name.equals("Elena"); //фильтрация №2
        sInfo.testStudents(students, p1);
        System.out.println("***");
        sInfo.testStudents(students, p2);
        System.out.println("***");
        //метод, объединяюций эти 2 фильтрации: p1.and(p2)
        sInfo.testStudents(students, p1.and(p2));
        System.out.println("***");
        //метод - логическое "или": p1.or(p2)
        sInfo.testStudents(students, p1.or(p2));
        System.out.println("***");
        //метод, отрицающий данную фильтрацию: p1.negate()
        sInfo.testStudents(students, p1.negate());
    }
}
