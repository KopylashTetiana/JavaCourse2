package collection.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        for(Integer i: priorityQueue){
            System.out.print(i + " ");
        }
        System.out.println(priorityQueue);//хранятся эл-ты в очереди в неотсортированном порядке
        System.out.println(priorityQueue.peek());//первый элемент - наименьшее число (его приоритет - наибольшший)
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }
}
