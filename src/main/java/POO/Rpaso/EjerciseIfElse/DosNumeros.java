package POO.Rpaso.EjerciseIfElse;

import java.util.Scanner;

public class DosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Ingrese el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2 = sc.nextInt();

        if (numero1 > numero2){
            System.out.println(" El numero uno es mayor que el numero dos");
        } else if (numero1 == numero2){
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("El numero dos es mayor que el numero uno");
        }
    }
}
