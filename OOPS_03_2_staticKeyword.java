package Java_with_Anuj_Bhaiya;

public class OOPS_03_2_staticKeyword {
    // static is allowed in non-static but, non-static is not allowed in static.
    public void printHi() {
        System.out.println("Hi");
        printHello();
    }

    public static void printHello() {
        System.out.println("Hello");
//        printHi();
    }

    public static void main(String[] args) {
        StaticKeyword sk1 = new StaticKeyword();
        System.out.println(sk1.count);
        System.out.println(sk1.static_count);

        sk1.count = 50;
        sk1.static_count = 50; // it'll update the main copy

        StaticKeyword sk2 = new StaticKeyword();
        System.out.println(sk2.count);
        System.out.println(sk2.static_count);

        System.out.println(StaticKeyword.static_count); // static can be accessed directly with the class name

        OOPS_03_2_staticKeyword.printHello(); // static method can be declared without creating an object of the class
        printHello(); // can be written like this bcz the static method is available in the same class.

//        printHi(); --> can't be written like this bcz it's a non-static method, it can only be declared by creating an object of the class.

        System.out.println(Math.max(3, -6)); // a pre-defined static method of Math class

        System.out.println(StaticKeyword.greet);
    }
}

class StaticKeyword {
    public int count = 10;

    // static - creates only one copy for all.
    public static int static_count = 10;

    // static should not be modified, so for this we can use "final" keyword.
    public static final String greet = "Hello World";
}

// Use Case Scenario :
/* Suppose there is a "Blueprint" class which contains the blueprint to build a house, so the houses will be made by using that class. So, if we have to find how many houses are made using this "Blueprint" class then we can make a static variable "count" which is initialized with 0, and in the constructor part we can increment the count by 1, so that we can easily find the number of houses made using the class. */