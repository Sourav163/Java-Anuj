package Java_with_Anuj_Bhaiya;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] a = new int[5];

        System.out.println("Hii");

        // try block can be one.
        try {
            System.out.println(a[8]);
        }
        // catch blocks can be multiple.
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        // finally block can be one.
        finally {
            System.out.println("Finally: I'll run always.");
        }

        System.out.println("Bye");
    }
}
