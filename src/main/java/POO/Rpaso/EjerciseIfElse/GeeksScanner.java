package POO.Rpaso.EjerciseIfElse;

import java.util.Scanner;

/**
 * Scanner Class is probably the most preferred method to take input.
 * Introduced in JDK 1. The main purpose of the Scanner class is to
 * parse primitive types and string using regular expression;
 * However, it is also can be used to read input from the user in the
 * command line.
 */


public class GeeksScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String num1 = input.nextLine();
        System.out.println(" You entered string " + num1);

        int a = input.nextInt();
        System.out.println("You entered integer " + a);

        float b = input.nextFloat();
        System.out.println("You entered float " + b);
    }
}
