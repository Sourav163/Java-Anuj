package Java_with_Anuj_Bhaiya;

import java.util.Scanner;

public class OOPS_06_3_throwKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :  ");
        int age = sc.nextInt();
        try {
            if (age < 0)
                throw new MyException("Age can't be negative.");
        } catch (MyException e) {
            System.out.println("MyException :  " + e.getMessage());
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}