package Java_with_Anuj_Bhaiya;

public class OOPS_04_2_Interface {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.eat("Chilly");
        p.sing();
        p.drink();
        System.out.println("All birds have " + p.legs + " legs.");
        p.fly("Parrot");
    }
}

// interface - same concept as abstraction.
interface Pet {
    void sing();

    void drink();
}

// to overcome abstraction, it can't have methods with body.
interface Bird {
    int legs = 2; // By default, it's "public static final"

    void eat(String food);

    void drink();

    // to overcome multiple changes, default methods can be declared in interfaces.
    default void fly(String bird) {
        System.out.println(bird + " is flying.");
    }
}

// a class can implement multiple interfaces.
class Parrot implements Bird, Pet {
    public void eat(String food) {
        System.out.println("Parrot is eating " + food + ".");
    }

    public void sing() {
        System.out.println("Parrot is singing.");
    }

    public void drink() {
        System.out.println("Parrot is drinking.");
    }
}