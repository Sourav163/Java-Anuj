package Java_with_Anuj_Bhaiya;

public class OOPS_05_3_Polymorphism {

    public static void main(String[] args) {
        // dynamic dispatch - run-time polymorphism.
        Demo d = new ChildDemo();
        d.print_data();
        d.print_data(5);
//        d.insideChildDemo(); --> only parent class properties and behaviors are accessible.
    }
}

class Demo {
    int data = 170;

    public void print_data() {
        System.out.println(data);
    }

    // method overloading - compile-time polymorphism.
    public void print_data(int times) {
        for (int i = 1; i <= times; i++)
            System.out.println(i + ". " + data);
    }
}

class ChildDemo extends Demo {
    // method overriding - run-time polymorphism.
    @Override
    public void print_data() {
        System.out.println("Overridden " + data);
    }

    public void insideChildDemo() {
        System.out.println("Inside 'ChildDemo' Class.");
    }
}