package Java_with_Anuj_Bhaiya;

public class OOPS_02_2_MethodOverriding {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike is starting...");
    }
}
