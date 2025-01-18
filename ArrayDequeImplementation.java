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
        System.out.println();

        // Stack operations using ArrayDeque :
        System.out.println("Stack operations using ArrayDeque :");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("\tstack = " + stack);
        System.out.println("\tstack.pop() = " + stack.pop());
        System.out.println("\tstack = " + stack);
        System.out.println("\tstack.peek() = " + stack.peek());
        System.out.println("\tstack = " + stack);

        // Queue operations using ArrayDeque :
        System.out.println("Queue operations using ArrayDeque :");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("\tqueue = " + queue);
        System.out.println("\tqueue.poll() = " + queue.poll());
        System.out.println("\tqueue = " + queue);
    }
}
