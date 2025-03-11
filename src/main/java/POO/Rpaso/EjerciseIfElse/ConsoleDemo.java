package POO.Rpaso.EjerciseIfElse;

import java.io.*;

public class ConsoleDemo {

    public static void main(String[] args) {
        String str;

        Console con = System.console();

        if (con == null) {

            System.out.println("No console available");
            return;
        }

        str = con.readLine("Enter your name: ");
        con.printf("Here is your name: %s\n", str);
        char [] ch = con.readPassword();

        //converting char array into string
        String pass = String.valueOf(ch);
        System.out.println("Password is: " + pass);
    }
}
