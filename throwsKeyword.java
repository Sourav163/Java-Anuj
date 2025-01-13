package Java_with_Anuj_Bhaiya;

public class throwsKeyword {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int a = 8;
        try {
            System.out.println(getNumberFromArray(arr, a));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // throws - informs that the method might give an exception that is mentioned.
    static int getNumberFromArray(int[] arr, int a) throws ArrayIndexOutOfBoundsException {
        return arr[8];
    }
}
