package Java_with_Anuj_Bhaiya;

public class OOPS_01_4_thisKeyword {
    public static void main(String[] args) {
        ComplexOperation co1 = new ComplexOperation(5, 6);
        ComplexOperation co2 = new ComplexOperation(2, 3);
        co1.Print();
        co2.Print();
        ComplexOperation addition = co1.add(co2);
        System.out.println("co1 = " + co1);
        System.out.println("Addition :");
        System.out.print("\t");
        addition.Print();
    }
}

class ComplexOperation {
    int a, b;

    public ComplexOperation(int a, int b) {
//        a = a; --> can't be recognized by java to which "a" to refer here, so both side parameterized "a" has been referred.

        // this keyword refers to the current object
        this.a = a;
        this.b = b;
    }

    public void Print() {
        System.out.println(a + " + " + b + "i");
    }

    public ComplexOperation add(ComplexOperation num) {
        System.out.println("Inside add method");
        System.out.print("\t");
        Print();
        System.out.print("\t");
        this.Print(); // Same as above Print(), but it's more accurate due to "this".
        System.out.print("\t");
        num.Print();
        System.out.println("\tthis = " + this);
        System.out.println("Outside add method");
        return new ComplexOperation(a + num.a, b + num.b);
    }
}