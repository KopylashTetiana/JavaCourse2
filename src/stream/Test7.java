package stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23,3, 7.4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathenatics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>(); //list содержит факультеты, а сами факультеты содержат листы своих студентов.
        facultyList.add(f1);
        facultyList.add(f2);
        //Метод flatMap мы используем тогда, когда нам надо поработать не с самими эл-тами нашей коллекции,
        // а с эл-тами эл-тов нашей коллекции. Напр., мы хотим вывести имена всех студентов из всех факультетов:
        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(stud -> System.out.println(stud.getName()));
    //Вначале вызвали стрим из факультетов. Затем в методе flatMap вызвал// стрим из всех студентов каждого факультета
    // (они в итоге образовали один большой стрим: вначале студенты первого факультета, затем - второго),
    // а затем вывели на экран имя каждого студента.
    }
}

class Faculty { //факультет
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }
}