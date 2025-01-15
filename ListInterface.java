package Java_with_Anuj_Bhaiya;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        List<Integer> list = new LinkedList<>();
//        List<Integer> list = new Vector<>();
//        List<Integer> list = new Stack<>();

        list.add(10);
        list.add(20);
        list.add(1);

        System.out.println("list = " + list);

        System.out.println("list.get(0) = " + list.get(0));

        list.set(1, 3);
        System.out.println("list.set(1, 3), list = " + list);

        list.add(2, 5);
        System.out.println("list.add(2, 5), list = " + list);

        list.remove(1);
        System.out.println("list.remove(1), list = " + list);

        list.add(5);
        System.out.println("list = " + list);
        System.out.println("list.indexOf(5) = " + list.indexOf(5));
        System.out.println("list.lastIndexOf(5) = " + list.lastIndexOf(5));
        System.out.println();

        // List Iterations :
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Guava");
        System.out.println(fruits);

        System.out.println("for loop :");
        for (int index = 0; index < fruits.size(); index++) {
            System.out.println("\tFruit is " + fruits.get(index) + ".");
        }

        System.out.println("for each loop :");
        for (String fruit : fruits) {
            System.out.println("\tFruit is " + fruit + ".");
        }

        System.out.println("iterator :");
        Iterator<String> fruit_iterator = fruits.iterator(); // from "Collection"
        while (fruit_iterator.hasNext()) {
            System.out.println("\tFruit is " + fruit_iterator.next() + ".");
        }

        System.out.println("list iterator :");
        Iterator<String> fruit_list_iterator = fruits.listIterator(); // from "List"
        while (fruit_list_iterator.hasNext()) {
            System.out.println("\tFruit is " + fruit_list_iterator.next() + ".");
        }

        System.out.println("fruits = " + fruits);
        System.out.println("fruits.subList(1, 3) = " + fruits.subList(1, 3));

        // Stack Implementation :
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
