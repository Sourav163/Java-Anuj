package Java_with_Anuj_Bhaiya;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        System.out.println();
        Stack<String> letters = new Stack<>();
        letters.push("A");
        letters.push("B");
        letters.push("C");
        letters.push("D");

        System.out.println("letters = " + letters);

        System.out.println("letters.pop() = " + letters.pop());
        System.out.println("letters = " + letters);

        System.out.println("letters.peek() = " + letters.peek());
        System.out.println("letters = " + letters);

        System.out.println("letters.empty() = " + letters.empty());
        System.out.println("letters.isEmpty() = " + letters.isEmpty()); // "List" method
    }
}
