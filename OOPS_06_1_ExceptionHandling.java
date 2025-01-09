package Java_with_Anuj_Bhaiya;

public class OOPS_06_1_ExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("Hii");

        try {
            System.out.println(5 / 0); // Won't be compiled further if exception occurs in the line.
            System.out.println(arr[8]);
            System.out.println(5 / 0);
        }

//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException Handled.");
//        }
//        catch (ArithmeticException e) {
//            System.out.println("ArithmeticException Handled.");
//        }

//        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
//            System.out.println("Both ArrayIndexOutOfBoundsException & ArithmeticException Handled.");
//        }

//        catch (RuntimeException e) {
//            System.out.println("All Type of Runtime Exceptions Handled.");
//        }

        catch (Exception e) {
            System.out.println("All Type of Exceptions Handled.");
        }

        System.out.println("Bye");
    }
}