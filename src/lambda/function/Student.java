package lambda.function;
//применение интерфейса Function.
//Задача: написать метод, который будет находить среднее арифметическое для всех студентов по разным показателям.
// Например, среднее арифметическое курсов этих студентов.
//Но этот метод должен принимать в себя любой из этих показателей: возраст, курс, или средняя оценка.
//Т.е., на input принимать студента, а получать double, чтобы среднее число было дробным.
//Для этого нам понадобится интерфейс Function.
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Student {
    String name;    int course;    double avgGrade;

    public Student(String name, int course, double avgGrade) {
        this.name = name;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String toString() {
        return "<Student " + name + ", course " + course + "average grade " + avgGrade + '>';
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 8.3);
        Student st2 = new Student("Nikolay", 2, 6.4);
        Student st3 = new Student("Elena", 1, 8.9);
        Student st4 = new Student("Petr", 4, 7);
        Student st5 = new Student("Maria", 3, 7.4);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        //Как может выглядеть объект типа Function в лямбда-выражении:
        Function<Student, Double> f = student -> student.avgGrade;
        //Теперь при каждом применении метода avgOfSmth (average
        // of something) мы прописываем в лямбда-выражении, как будет
        // выглядеть метод apply: 1) найдем сред.арифм. оценку всех студентов:
        Double avGrade = avgOfSmth(students, st -> st.avgGrade);
        //2)найдем сред.арифм. курсов всех студентов:
        Double avCourse = avgOfSmth(students, st -> (double)st.course);
        System.out.println("Средняя оценка: " + avGrade + ",\nсредний курс: " + avCourse);
    }   //метод, находящий среднее арифметическое какого-либо параметра из Student:

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for(Student st: list) {
//Здесь не пишем, как будет выглядеть метод apply, а напишем это
// в лямбда-выражении, когда будем применять метод avgOfSmth:
            result += f.apply(st);
        }
        result = result/list.size();
        return result;
    }
}

