package Java_with_Anuj_Bhaiya;

public class OOPS_02_3_superKeyword {
    public static void main(String[] args) {
        Auto a = new Auto();
        System.out.println(a.wheels);
        a.wheels = 4;
        System.out.println(a.wheels);
    }
}

class Auto extends Vehicle {
    public Auto() {
//         super(); --> By Default
        // super - Accesses the immediate parent class's properties/behaviors.
        super(3); // Overrides the default super()
        System.out.println("Auto Created.");
        super.start(); // Accesses the immediate parent class's ("Vehicle") start()
        start();
        System.out.println("Auto Wheels = " + super.wheels); // Same as "wheels"
//        super(3); --> super() can be called only in the first line.
    }

    public void start() {
        System.out.println("Auto is starting...");
    }
}
