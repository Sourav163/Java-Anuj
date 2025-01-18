package Java_with_Anuj_Bhaiya;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> priority_queue1 = new PriorityQueue<>();
        priority_queue1.offer(40);
        priority_queue1.offer(70);
        priority_queue1.offer(20); // By default, smaller numbers are having higher priorities.
        priority_queue1.offer(30);

        System.out.println("priority_queue1 = " + priority_queue1);
        System.out.println("priority_queue1.poll() = " + priority_queue1.poll());
        System.out.println("priority_queue1 = " + priority_queue1);
        System.out.println("priority_queue1.poll() = " + priority_queue1.poll());
        System.out.println("priority_queue1 = " + priority_queue1);
        System.out.println();

        Queue<Integer> priority_queue2 = new PriorityQueue<>((a, b) -> b - a);
        priority_queue2.offer(40);
        priority_queue2.offer(70); // ...we can decide the bigger numbers will have higher priorities.
        priority_queue2.offer(20); // By using the comparator...
        priority_queue2.offer(30);

        System.out.println("priority_queue2 = " + priority_queue2);
        System.out.println("priority_queue2.poll() = " + priority_queue2.poll());
        System.out.println("priority_queue2 = " + priority_queue2);
        System.out.println("priority_queue2.poll() = " + priority_queue2.poll());
        System.out.println("priority_queue2 = " + priority_queue2);
    }
}
