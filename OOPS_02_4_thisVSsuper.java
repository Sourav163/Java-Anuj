package Java_with_Anuj_Bhaiya;

public class OOPS_02_4_thisVSsuper {
    public static void main(String[] args) {
        Scooter s = new Scooter();
        s.print();
        System.out.println(s.returnObj());
    }
}

class Scooter {
    String model = "Fashino";

    public void print() {
        Scooty sc = new Scooty();
        sc.brake(this);
    }

    public Scooter returnObj() {
        return this;
    }
}

class Scooty {
    public void brake(Scooter s) {
        System.out.println(s.model + " is braking.");
    }
}