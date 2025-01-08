package Java_with_Anuj_Bhaiya;

import java.util.Objects;

public class OOPS_05_2_ObjectClass {
    public static void main(String[] args) {
        Truck t1 = new Truck("TATA", 2024);
        Truck t2 = new Truck("TATA", 2024);
        Truck t3 = new Truck("TATA", 2025);

        System.out.println(t1); // calls toString() method by default.

        // primitive datatypes comparison occurs using "==" operator.
        System.out.println(t1.year == t2.year);
        System.out.println(t1 == t2);
        // non-primitive datatypes comparison occurs using "equals()" method.
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());
    }
}

class Truck {
    String model;
    int year;

    public Truck(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // My Learning :
//    @Override
//    public String toString() {
//        return model + " truck bought in the year of " + year + ".";
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        Truck that = (Truck) obj;
//        if (this.model.equals(that.model) && this.year == that.year) return true;
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        int code = 17;
//        code += this.year;
//        code += this.model.hashCode();
//        return code;
//    }

    // IntelliJ IDEA Generated :
    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Truck that = (Truck) obj;
        return this.year == that.year && Objects.equals(this.model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}