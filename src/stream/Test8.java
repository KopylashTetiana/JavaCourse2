package stream;
//methods Collectors.groupingBy, Collectors.partitioningBy
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>(); //здесь должен быть List
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        //1. Method groupingBy (группировка по). Задача: изменить имена студентов на заглавные буквы
        // и отсортировать их по курсам. Т.е., для каждого курса будет свой лист.
        Map<Integer, List<Student>> map = students.stream()
                .map(el -> {                   //В параметре Collectors.groupingBy()
                    el.setName(el.getName().toUpperCase());     //в виде лямбда-выражения нужно указать,
                    return el;          // по какому атрибуту студента я буду производить группировку:
                })
                .collect(Collectors.groupingBy(el -> el.getCourse())); //этот метод возвращает Map, в котором ключ - Integer,
        // а значение - List студентов:  Map<Integer, List<Student>>
        //Т.е., в нашей коллекции Map - 4 элемента, а элемент представляет собой пару "ключ-значение",
        // где ключ - это номер курса, а значение - лист студентов.
        //Теперь красиво выведем на экран результат.
//        System.out.println(map); //Такая запись выводит все значения в ряд, через запятую (не очень красиво).
        //А эта запись выводит каждую группу на отдельную строку в таком виде: key: [value, value].
        for(Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //2. Method partitioningBy (разделение по). Задача: разделить студентов на 2 группы - те,
        // кто получает высокую оценку, и те, - кто низкую. В параметре partitioningBy тело лямбда-выражения должно быть boolean
        Map<Boolean, List<Student>> map2 = students.stream()
                .collect(Collectors.partitioningBy(stud -> stud.getAvgGrade() > 7)); //результат - Map, содержащий 2 группы:
        //1) для которых return лямбда-выражения == true;
        //2) для которых return лямбда-выражения == false.
        //Красиво выведем на экран результат:
        for(Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}