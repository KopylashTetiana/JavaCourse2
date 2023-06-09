package lambda;

import java.util.ArrayList;
public class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentChecks sc) {//lambda expression
        for(Student s: al) {
            if(sc.check(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for(Student s: al) {
//            if(s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for(Student s: al) {
//            if(s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for(Student s: al) {
//            if(s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
//1. что заменяют нам лямбда-выражения: чтобы выполнить новую фильтрацию, нужно
// в классе StudentInfo создавать новые методы. Это не очень удобно, особенно
// если у нас нет доступа к классу StudentInfo, а новая фильтрация нам нужна.

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
        ArrayList <Student>students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());//2-й способ, lambda
        System.out.println("----------------");
        info.testStudents(students, new StudentChecks() {//3-й способ, anonymous class, lambda
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("----------------");
        //4-й способ, lambda expressions, которые появились, начиная с java8:
        info.testStudents(students, (Student s) -> {return s.age < 30;});//в этом способе мы одной
        // строкой (лямбда выражением) заменили все строки предыдущего (3-го) способа.
//        info.printStudentsOverGrade(students, 8);
//        System.out.println("----------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("----------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');


    }
}
//2-й способ создания различных методов фильтрации студентов: создать интерфейс с 1 методом,
// а в классе StudentInfo - написать лишь один метод testStudents(см. выше)

interface StudentChecks { //functional interface
    boolean check(Student s);   //must have only 1 abstract method (and it can have any other
    // non-abstract methods or variables)
}

class CheckOverGrade implements StudentChecks {//этот метод не очень хороший, потому что мы вручную
    //указываем оценку: 8. А если нужно будет проверить оценку 9, придется писать новый класс.
    //Третий вариант - создать анонимный класс (см. class Test)
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}