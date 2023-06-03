package collection.list_interface;

import java.util.Objects;

public class Student2 implements Comparable<Student2> {
    public String name;
    public int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return ('<' + name + ", " + course + " course>");
    }

    @Override //метод сравнивает студентов по их курсу
    public int compareTo(Student2 anotherStud) {
        return course - anotherStud.course;
    }

    @Override//метод сравнивает студентов по их курсу
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return course == student2.course;
    }

    @Override//hashCode зависит только от курса
    public int hashCode() {
        return Objects.hash(course);
    }
}
