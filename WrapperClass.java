package Java_with_Anuj_Bhaiya;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        Integer obj1 = Integer.valueOf(10);
        Integer obj2 = 10; // autoboxing
        int obj = obj2; // unboxing

        Integer obj3 = Integer.valueOf("100");
        System.out.println(obj3 * 3);

        Boolean obj4 = Boolean.valueOf("false");
        System.out.println(obj4);

//        ArrayList<int> al = new ArrayList<>(); --> only takes object.
        ArrayList<Integer> al = new ArrayList<>();
    }
}
