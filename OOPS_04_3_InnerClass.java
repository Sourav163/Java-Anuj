package Java_with_Anuj_Bhaiya;

// inner class or, nested class - creating a class in a class.
public class OOPS_04_3_InnerClass {
    // as it is a non-static class, we have to create an object of the main class, then it'll refer to this inner class.
    class Laptop {
        int price = 50000;
    }

    // as it is a static class, we can refer it by using the class name.
    static class Desktop {
        int price = 30000;
    }

    public static void main(String[] args) {
//        OOPS_04_3_InnerClass ic = new OOPS_04_3_InnerClass();
//        Laptop laptop = ic.new Laptop();

        // instead of the above lines we can write like the following:
        Laptop laptop = new OOPS_04_3_InnerClass().new Laptop();

        System.out.println(laptop.price);

        Desktop desktop = new OOPS_04_3_InnerClass.Desktop();
        System.out.println(desktop.price);
    }
}
