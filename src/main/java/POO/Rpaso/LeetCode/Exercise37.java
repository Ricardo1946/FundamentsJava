package POO.Rpaso.LeetCode;

import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a String: ");

        char[] letters = input.nextLine().toCharArray();

        System.out.print("Reverse string: ");

        for(int i = letters.length - 1; i >=0; i--){
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}
