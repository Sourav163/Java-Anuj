package Java_with_Anuj_Bhaiya;

public class OOPS_01_3_Constructor {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(5);
        ComplexNumber cn2 = new ComplexNumber(2, 3);
        cn1.Print();
        cn2.Print();
    }
}

class ComplexNumber {
    int a, b;

//    public ComplexNumber() {
//        a = 0;
//        b = 0;
//    } --> by Default if only not declared

    // Constructor: Same method name as of it's class but not having any return type.
    public ComplexNumber(int real) {
        a = real;
        b = real;
    }

    // Constructor Overload
    public ComplexNumber(int real, int imaginary) {
        a = real;
        b = imaginary;
    }

    public void Print() {
        System.out.println(a + " + " + b + "i");
    }
}