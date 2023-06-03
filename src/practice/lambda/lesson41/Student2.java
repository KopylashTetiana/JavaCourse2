package practice.lambda.lesson41;
//Пример применения лямбда-выражений
import java.util.ArrayList;

public class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "<Student " + name + ", course " + course + '>';
    }
}

interface StudentChecks { //вместо создания N-го количества однотипных методов можно
    // согдать 1 функциональный интерфейс, и...
    boolean check(Student2 s);
}

class CheckByName implements StudentChecks { //...1) для каждого нового метода, который
    // нам понадобился, создавать новый класс, имплементирующий данный интерфейс
    // и переписывающий его метод так, как нам нужно в данной ситуации;
    public boolean check(Student2 s) {
        return s.name.equals("Ivan");
    }
}

class Student2Info {
    void testStudents(ArrayList<Student2> al, StudentChecks sc) {//Для использования лямбда-
        //выражений всю однотипную часть методов мы прописываем здесь: в главном методе,
        // в параметры которого вставляем - коллекцию объектов, над которыми совершаем действия,
        // - и объект класса, который имплементирует наш функциональный интерфейс. И теперь
        //каждый следующий раз, когда нам понадобится применить очередной новый метод, мы
        //будем использовать данный метод, но в место объекта класса, имплементирующего интерфейс.
        //будем прописывать анонимный класс либо его сокращенную версию: лямбда-выражение
        // (см. ниже пункт 2), 3)).
        for(Student2 st: al) {
            if(sc.check(st)) {
                System.out.print(st);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Maria", 3);
        Student2 st6 = new Student2("Elena", 3);
        ArrayList<Student2> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        System.out.println(students);
        Student2Info sInfo = new Student2Info();
        sInfo.testStudents(students, new CheckByName());//используем класс, который
        // имплементирует интерфейс StudentChecks (способ 1), специально созданный
        // для нужного нам сейчас метода
        System.out.println("-------------------");
        sInfo.testStudents(students, new StudentChecks() { //...2) используем
            // анонимный класс (имплементирующий интерфейс StudentChecks)
            @Override
            public boolean check(Student2 s) {
                return s.name.equals("Ivan");
            }
        });
        System.out.println("--------------------");
        sInfo.testStudents(students, (Student2 s) -> {//...3) используем лямбда-выражение -
            // сокращенную запись анонимного класса
            return s.name.equals("Ivan");
        });
        System.out.println("--------------------");
        //Ещё более короткая запись лямбда-выражения: опускаем скобки {} и слово return
        sInfo.testStudents(students, (Student2 s) -> s.name.equals("Ivan"));
        sInfo.testStudents(students, (Student2 s) -> s.name.equals("Elena"));
        sInfo.testStudents(students, (Student2 s) -> s.course >= 2);
        sInfo.testStudents(students, (Student2 s) -> s.course == 3);
        sInfo.testStudents(students, (Student2 s) -> s.course < 3);
//        sInfo.printStudentByName(students, "Ivan");
//        sInfo.printStudentByName(students, "Elena");
//        sInfo.printStudentOverCourse(students, 2);
//        sInfo.printStudentByCourse(students, 3);
//        sInfo.printStudentBeforeCourse(students, 3);
    }
    //вместо следующих методов (ниже) я использую интерфейс и лямбда-выражения.
    // Это удобно в тех случаях, когда данные методы будут использоваться лишь единожды:
//    void printStudentOverCourse(ArrayList<Student2> al, int course) {
//        for(Student2 st: al) {
//            if(st.course >= course) {
//                System.out.print(st);
//            }
//        }
//        System.out.println();
//    }
//
//    void printStudentBeforeCourse(ArrayList<Student2> al, int course) {
//        for(Student2 st: al) {
//            if(st.course < course) {
//                System.out.print(st);
//            }
//        }
//        System.out.println();
//    }
//
//    void printStudentByCourse(ArrayList<Student2> al, int course) {
//        for(Student2 st: al) {
//            if(st.course == course) {
//                System.out.print(st);
//            }
//        }
//        System.out.println();
//    }
//
//    void printStudentByName(ArrayList<Student2> al, String name) {
//        for(Student2 st: al) {
//            if(st.name.equals(name)) {
//                System.out.print(st);
//            }
//        }
//        System.out.println();
//    }
}
