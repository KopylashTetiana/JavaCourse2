package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        //Задание. Для листа студентов сделать следующее:
        // - имена сделать заглавными буквами,
        // - отфильтровать по полу (выбрать только девушек),
        // - и отсортировать по возрасту. Вывести результат на экран.
        // Если это делать без стрима, выйдет намного больше строк кода.
//        students.stream().map(el -> {
//            el.setName(el.getName().toUpperCase());
//            return el;
//        })
//                .filter(el -> el.getSex() == 'f')
//                .sorted((el1, el2) -> el1.getAge() - el2.getAge())
//                   .forEach(System.out :: println);
        Student student1 =
                students.stream().map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                        .filter(el -> el.getSex() == 'f')
                        .sorted((el1, el2) -> el1.getAge() - el2.getAge())
                        .findFirst().get();
        System.out.println(student1);
        student1 = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(student1);

        students.stream().filter(st -> st.getAge() > 20).limit(2).forEach(System.out :: println);

        students.stream().filter(st -> st.getAge() > 20).skip(2).forEach(System.out :: println);

        List<Integer> courses = students.stream().mapToInt(el -> el.getCourse()).boxed().collect(Collectors.toList());
        System.out.println(courses);

        List <Double> avgGrades = students.stream().mapToDouble
                (el -> el.getAvgGrade()).boxed().collect(Collectors.toList());
        System.out.println(avgGrades);

        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        double average = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(average);

        int min = students.stream().mapToInt(el -> el.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(max);

    }
}
