package Java_with_Anuj_Bhaiya;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

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
    }
}
