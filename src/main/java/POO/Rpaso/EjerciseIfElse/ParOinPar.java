package POO.Rpaso.EjerciseIfElse;

import java.util.Scanner;

public class ParOinPar {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int numero1;

        System.out.println("Ingrese un numero: ");
        numero1 = input.nextInt();

        if ( numero1 % 2 ==0 ){
            System.out.println("El numero que acaba de digitar es par");
        } else {
            System.out.println("El numero que acaba de digitar es impar");
        }
    }
}
