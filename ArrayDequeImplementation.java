package Java_with_Anuj_Bhaiya;

import java.util.ArrayDeque;

public class ArrayDequeImplementation {
    public static void main(String[] args) {
        ArrayDeque<Integer> array_deque = new ArrayDeque<>();
        array_deque.offer(10);
        array_deque.offerLast(20);
        array_deque.offerFirst(30);
        array_deque.offerFirst(40);
        array_deque.offerLast(50);
        array_deque.offer(60);

        System.out.println("array_deque = " + array_deque);

        System.out.println("array_deque.peek() = " + array_deque.peek());
        System.out.println("array_deque.peekLast() = " + array_deque.peekLast());
        System.out.println("array_deque.peekFirst() = " + array_deque.peekFirst());

        System.out.println("array_deque.poll() = " + array_deque.poll());
        System.out.println("array_deque = " + array_deque);
        System.out.println("array_deque.pollLast() = " + array_deque.pollLast());
        System.out.println("array_deque = " + array_deque);
        System.out.println("array_deque.pollFirst() = " + array_deque.pollFirst());
        System.out.println("array_deque = " + array_deque);
    }
}
