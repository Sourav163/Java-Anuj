package Java_with_Anuj_Bhaiya;

public class OOPS_01_1_ClassesAndObjects {
    public static void main(String[] args) {
        Dog d1 = new Dog(); // Product
        d1.name = "Bob";
        d1.bark();
        d1.eat();
        Dog d2 = new Dog(); // Product
        d2.name = "Jack";
        d2.bark();
        d2.eat();

        Complex c1 = new Complex();
        c1.a = 2;
        c1.b = 3;
        c1.print();
    }
}

// Declare Object and its Properties :
class Dog { // Factory
    // Properties - Variables
    String name;
    int age;

    // Behaviors - Methods/Functions
    void bark() {
        System.out.println(name + " is Barking.");
    }

    void eat() {
        System.out.println(name + " is Eating.");
    }
}

// Non-Primitive/User-Defined/Custom Datatype :
class Complex {
    int a, b;

    void print() {
        System.out.println(a + " + " + b + "i");
    }
}