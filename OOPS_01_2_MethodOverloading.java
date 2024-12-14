package Java_with_Anuj_Bhaiya;

public class OOPS_01_2_MethodOverloading {
    public static void main(String[] args) {
        Greet g = new Greet();
        g.greetings();
        g.greetings("Sourav");
        g.greetings("Routray", 5);
    }
}

class Greet {
    void greetings() {
        System.out.println("Hello! Good Morning :)");
    }

//    int greetings () {} --> No Method Overloading

    // Method Overloading (Do Khilwaad with Parameters ONLY)
    void greetings(String name) {
        System.out.println("Hello " + name + "! Good Morning :)");
    }

//    void greetings(String another_name) {} --> No Method Overloading

    void greetings(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + name + "! Good Morning :)");
        }
    }
}
