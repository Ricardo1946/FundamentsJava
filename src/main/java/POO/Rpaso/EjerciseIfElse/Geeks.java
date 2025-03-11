package POO.Rpaso.EjerciseIfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * bufferedReader is the classical method to take input, Introduced
 * in JDK 1.0. This method is used by wrapping the System.in
 * (standard input stream) in an InputStreamReader which is wrapped
 * in a BufferedReader, we can read input from the user in the
 * command line.
 */


public class Geeks {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(
                new InputStreamReader(System.in));

        String s = r.readLine();
        System.out.println(s);
    }
}
