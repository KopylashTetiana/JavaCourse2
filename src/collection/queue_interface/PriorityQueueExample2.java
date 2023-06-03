package collection.queue_interface;

import java.util.PriorityQueue;
import java.util.Comparator;

import collection.list_interface.Student2;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        PriorityQueue<Student2> studentsPQ = new PriorityQueue<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 stud1, Student2 stud2) {
                return stud1.course - stud2.course;
            }
        });
        Student2 st1 = new Student2("Zaur", 5);
        Student2 st2 = new Student2("Misha", 1);
        Student2 st3 = new Student2("Igor", 2);
        Student2 st4 = new Student2("Marina", 3);
        Student2 st5 = new Student2("Olya", 4);
        studentsPQ.add(st1);
        studentsPQ.add(st2);
        studentsPQ.add(st3);
        studentsPQ.add(st4);
        studentsPQ.add(st5);
        System.out.println(studentsPQ);
        System.out.println(studentsPQ.poll());
        System.out.println(studentsPQ.poll());
        System.out.println(studentsPQ.poll());
        System.out.println(studentsPQ.poll());
        System.out.println(studentsPQ.poll());
        System.out.println(studentsPQ.poll());


    }
}
