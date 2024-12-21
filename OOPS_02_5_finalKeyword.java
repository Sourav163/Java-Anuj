package Java_with_Anuj_Bhaiya;

public class OOPS_02_5_finalKeyword {
    public static void main(String[] args) {
        Hello h = new Hello();
//        h.pi = 5.4f; --> can't be done
        System.out.println(h.pi);
        h.print();
    }
}

// final class - can't be extended/inherited
final class Hello {
    // final variable - can't be re-assigned
    final float pi = 3.14f;

    // final method - can't be overridden
    final void print() {
        System.out.println("Hello...");
    }
}

//class World extends Hello  --> can't be done
//    void print() {...} --> can't be done