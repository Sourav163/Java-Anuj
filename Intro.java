package Java_with_Anuj_Bhaiya;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {

        // Operators
        System.out.println("Operators :");
        int a = 57 / 10;
        System.out.println("\t" + a);
        int num1 = 12;
        int num2 = 7;
        int num3 = num1 / num2;
        System.out.println("\t" + num3);
        double num4 = num1 / num2;
        System.out.println("\t" + num4);
        double num5 = (double) num1 / num2;
        System.out.println("\t" + num5);
        System.out.println();

        // String Operations
        System.out.println("String Operations :");
        System.out.println("\t" + 5 + 3 + "20");
        System.out.println("\t" + "20" + 5 + 3 + "90");
        System.out.println("\t" + 5 + 3 + "90" + 2 + 7 + "10" + 4 + 6);
        System.out.println();

        // Primitives
        System.out.println("Primitives :");
        int n = 10;
        long num = n;
        System.out.println();

        // Typecasting
        System.out.println("Typecasting :");
        long x = 10;
        int y = (int) x;
        System.out.println("\t" + (byte) 130);
        System.out.println();

        // ASCII Typecasting
        System.out.println("ASCII Typecasting :");
        System.out.println("\t" + (char) 67);
        System.out.println("\t" + (int) (char) 67);
        System.out.println();

        // Conditionals
        System.out.println("Conditionals :");
        int a1 = 10;
        int a2 = 20;
        int a3 = 12;
        int max = a1 > a2 ? a1 > a3 ? a1 : a3 : a2 > a3 ? a2 : a3;
        System.out.println("\t" + max);
        System.out.println();

        // Loops
        System.out.println("Loops :");
        for (int i = 0; i <= 5; i++) {
            System.out.println("\t" + i);
        }
        Scanner sc = new Scanner(System.in);
        boolean has_learned = true;
        while (!has_learned) {
            System.out.println("\t Tried to learn");
            System.out.print("\tHave you learned :  ");
            has_learned = sc.nextBoolean();
        }
        int dw = 8;
        do {
            System.out.println("\t" + dw);
            dw++;
        } while (dw <= 5);
        System.out.println("\tOut of the do-while loop.");

        // break
        System.out.println("break :");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t" + i);
            if (i == 3) break;
        }

        // continue
        System.out.println("continue :");
        int c = 0;
        while (c < 10) {
            c++;
            if (c == 5) continue;
            System.out.println("\t" + c);
        }

        // Nested Loops
        System.out.println("Nested Loops :");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + i + ". ");
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // labeled break and continue
        System.out.println("labeled break and continue :");
        outer_loop:
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + i + ". ");
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
                if (j == 2) break outer_loop;
            }
            System.out.println();
        }
        System.out.println();

        // Arrays
        System.out.println("Arrays :");
        int[] arr1 = new int[5];
        arr1[0] = 5;
        arr1[2] = 3;
        System.out.print("\t" + arr1[0]);
        System.out.print(", " + arr1[1]);
        System.out.print(", " + arr1[2]);
        System.out.print(", " + arr1[3]);
        System.out.println(", " + arr1[4]);
        int[] arr2 = {5, 1, 2, 9, 7};
        System.out.println("\t" + arr2[2]);

        // for-each loop
        System.out.println("for-each loop :");
        String[] names = {"Trupti", "Sourav", "Srinibash", "Shivalika", "Abhaya"};
        for (String name : names) {
            System.out.print("\t" + name);
        }
        System.out.println();

        // Multi-dimensional Arrays
        System.out.println("Multi-dimensional Arrays :");
        int[][] arr3 = new int[4][3];

        arr3[0][0] = 12;
        arr3[0][1] = 23;
        arr3[0][2] = 34;

        arr3[1][0] = 56;
        arr3[1][1] = 67;
        arr3[1][2] = 78;

        arr3[2][0] = 90;
        arr3[2][1] = 21;
        arr3[2][2] = 32;

        arr3[3][0] = 45;
        arr3[3][1] = 89;
        arr3[3][2] = 43;

        for (int i = 0; i < arr3.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr4 = {
                {12, 23, 34},
                {56, 67, 78},
                {90, 21, 32},
                {45, 89, 43}
        };

        for (int[] arr : arr4) {
            System.out.print("\t ");
            for (int ar : arr) {
                System.out.print(ar + " ");
            }
            System.out.println();
        }

        // Methods
        System.out.println("Methods :");
        int avg = average(4, 6, true);
        System.out.println("\t" + avg);

        // Command Line Arguments
        System.out.println("Command Line Arguments :");
        System.out.print("\t");
        for (String arg : args) {
            System.out.print(arg + " ");
        }

        // Math Class Methods
        System.out.println("Math Class Methods :");
        System.out.println("\t" + Math.min(10, -12));
        System.out.println("\t" + Math.max(-12, -41));
        System.out.println("\t" + Math.sqrt(16));
        System.out.println("\t" + Math.pow(16, 2));
        System.out.println("\t" + Math.abs(-41));
        System.out.println("\t" + Math.random());
        System.out.println("\t" + get_random_a_to_b(1, 6));
        System.out.println("\t" + Math.floor(5.9));
        System.out.println("\t" + Math.ceil(4.1));
        System.out.println("\t" + Math.round(5.5));

        // String
        String name = "Sourav";
        int name_address = System.identityHashCode(name);
        String same_name = "Sourav";
        int same_name_address = System.identityHashCode(same_name);
        String new_name = new String("Sourav");
        int new_name_address = System.identityHashCode(new_name);
        String case_name = new String("SOURAV");
        int case_name_address = System.identityHashCode(case_name);

        System.out.println("\t" + name);
        System.out.println("\taddress: " + name_address);
        System.out.println("\t" + same_name);
        System.out.println("\taddress: " + same_name_address);
        System.out.println("\t" + new_name);
        System.out.println("\taddress: " + new_name_address);
        System.out.println("\t" + case_name);
        System.out.println("\taddress: " + case_name_address);

        if (name == same_name) {
            System.out.println("\tname == same_name");
        } else {
            System.out.println("\tname != same_name");
        }

        if (name == new_name) {
            System.out.println("\tname == new_name");
        } else {
            System.out.println("\tname != new_name");
        }

        if (name.equals(new_name)) {
            System.out.println("\tname equals new_name");
        } else {
            System.out.println("\tname differs new_name");
        }

        if (name.equals(case_name)) {
            System.out.println("\tname equals case_name");
        } else {
            System.out.println("\tname differs case_name");
        }

        if (name.equalsIgnoreCase(case_name)) {
            System.out.println("\tname equals case_name (ignoring cases)");
        } else {
            System.out.println("\tname differs case_name (ignoring cases)");
        }
    }

    static int average(int a, int b, boolean should_average) {
        System.out.println("\tThis is average() method.");
        if (should_average)
            return (a + b) / 2;
        else
            return -1;
    }

    static int get_random_a_to_b(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }
}