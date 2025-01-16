package Java_with_Anuj_Bhaiya;

import java.util.Queue;
import java.util.LinkedList;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("queue = " + queue);

        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);

        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue = " + queue);

        // Iteration :
        while (!queue.isEmpty()) {
            System.out.print("\t" + queue.poll());
        }

        System.out.println();
        System.out.println(queue.poll());
    }
}
