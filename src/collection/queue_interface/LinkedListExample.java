package collection.queue_interface;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur"); //метод add добавляет эл-т в конец очереди
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Maria");
        //данная очередь может иметь неограниченное кол-во эл-тов, но есть очередь с ограничением
        //кол-ва эл-тов. Если бы в этой очереди кол-вол эл-тов ограничивалось 4-мя, то при добавлении
        //5-го эл-та методом add, выскочил бы Exception.
        //А при добавлении 5-го эл-та методом offer, ничего бы не произошло, просто бы не добавился эл-т.
        queue.offer("Aleksandr");//метод offer подходит для очереди с ограниченным размером
        System.out.println(queue);
        System.out.println(queue.remove());//метод remove удаляет первый эл-т, который стоит в очереди.
        System.out.println("first: " + queue.element());//метод element возвращает элемент, первый в очереди.
        System.out.println(queue.remove());
        //Можно удалять эл-ты и из середины очереди, например:
        System.out.println(queue.remove("Ivan"));//метод вернул true. Но в таком случае лучше использовать
        // не очередь, а другую коллекцию. Queue не предназначен для удаления эл-тов из середины.
        System.out.println(queue.remove());
        System.out.println(queue.remove());
//        System.out.println(queue.remove());//NoSuchElementException, потому что больше нет эл-тов для удаления.
        System.out.println(queue.poll());//метод poll удаляет первый эл-т, но в случае, если эл-тов больше нет,
        // он не выбрасывает Exception, а возвращает null.
//        System.out.println(queue.element());//NoSuchElementException, потому что эл-тов больше нет.
        System.out.println(queue.peek());//метод peek возвр-т первый эл-то в очереди, как и метод element,
        // но если эл-тов больше нет, он не выбрасывает Exception, а возвращает null.
    }
}
