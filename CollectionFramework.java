package Java_with_Anuj_Bhaiya;

import java.util.List;
import java.util.ArrayList;

public class CollectionFramework {
    public static void main(String[] args) {
//        int[] array = new int[5];
        // ArrayList - to overcome the fixed size limitation of the array.

        // creating a list object (Ref. List interface) with ArrayList type
        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(1);

        System.out.println("list1 = " + list1);

        // "Collection" interface methods :
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list1.contains(200) = " + list1.contains(200));
        list1.remove(Integer.valueOf(1)); // if "Integer", treated as object/element.
        System.out.println("list1.remove(Integer.valueOf(1)), list1 = " + list1);
        list1.remove(1); // if "int", treated as index.
        System.out.println("list1.remove(1), list1 = " + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2);
        list1.addAll(list2);
        System.out.println("list1.addAll(list2), list1 = " + list1);

        list2.add(4);
        list2.add(5);
        System.out.println("list2 = " + list2);
        list1.removeAll(list2);
        System.out.println("list1.removeAll(list2), list1 = " + list1);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);
        list1.retainAll(list2);
        System.out.println("list1.retainAll(list2), list1 = " + list1);

        list1.clear();
        System.out.println("list1.clear(), list1 = " + list1);

        list1.add(10);
        list1.add(20);
        list1.add(1);
        System.out.println("list1 = " + list1);
        Object[] a = list1.toArray();
        for (Object e : a) {
            System.out.print(e + "\t");
        }
    }
}
