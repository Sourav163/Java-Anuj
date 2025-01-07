package Java_with_Anuj_Bhaiya;

public class OOPS_04_4_AnonymousClass {
    public static void main(String[] args) {
        // anonymous class - similar to subclass extending its parent class but, used only once.
        OuterClass oc = new OuterClass() {
            public void innerMethod() {
                System.out.println("It's inner method.");
            }

            public void outerMethod() {
                System.out.println("It's overridden outer method.");
            }
        };
        oc.outerMethod();

        OuterInterface oi = new OuterInterface() {
            @Override
            public void interfaceMethod() {
                System.out.println("It's overridden interface method.");
            }

            public void anotherMethod() {
                System.out.println("It's another method.");
            }
        };
        oi.interfaceMethod();
    }
}

class OuterClass {
    public void outerMethod() {
        System.out.println("It's outer method.");
    }
}

interface OuterInterface {
    void interfaceMethod();
}