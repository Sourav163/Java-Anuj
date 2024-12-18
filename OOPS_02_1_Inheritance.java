package Java_with_Anuj_Bhaiya;

public class OOPS_02_1_Inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.wheels = 4;
        c.model = "Rolls-Royce";
        c.start();
        c.details();
    }
}

class Vehicle {
    int wheels;
    String model;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void details() {
        System.out.println(model + " has " + wheels + " wheels.");
    }
}