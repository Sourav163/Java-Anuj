package Java_with_Anuj_Bhaiya;

public class OOPS_04_1_Abstraction {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.toggle();
        s.call();
        s.camera(1);
        s.camera(2);
    }
}

// abstract class - can't be instantiated as an object, only inheritance.
abstract class Phone {
    // abstract class can have non-abstract methods called concrete methods.
    void toggle() {
        System.out.println("Phone Toggled On/Off.");
    }

    // abstract method - can't have body.
    abstract void call();

    // if one method in class is abstract, then the class must be abstract.
    abstract int camera(int num);
}

// all the abstract methods of the parent abstract class must be implemented with body.
class Smartphone extends Phone {
    @Override
    void call() {
        System.out.println("Incoming & Outgoing Call Available.");
    }

    @Override
    int camera(int num) {
        if (num == 2)
            System.out.println("Front & Rear Camera Available.");
        else System.out.println("Only Rear Camera Available.");
        return num;
    }
}