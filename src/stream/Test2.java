package stream;
//пример на применение метода filter()
//и метода sorted() interface Stream
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23,3, 7.4);
        List<Student> students = new ArrayList<>(); //здесь должен быть List
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
//1. Отфильтруем студентов, возраст которых больше 22 лет, и оценка меньше 7,2:
        List<Student> students2 = students.stream().filter(stud ->
                stud.getAge() > 22 && stud.getAvgGrade() < 7.2).collect(
                        Collectors.toList());
        System.out.println(students2);
        //можно создать стрим не из готовой коллекции, а с нуля:
        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        //отсортируем студентов методом sorted():
        //students = students.stream().sorted().collect(Collectors.toList());//ClassCastException:
        // class stream.Student can not be cast to class java.lang.Comparable.
        //Для сортировки студентов нужно вставить в параметр sorted() нужный нам компаратор:
        students = students.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(students);
    }
}
class Student {
    private String name;
    private char sex;
    private int age, course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String toString() {
        return "<" + sex + ' ' + name + ", " + age + " yrs, " + course + " course, avgGrade: " + avgGrade + '>';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public double getAvgGrade() {
        return avgGrade;
    }
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}