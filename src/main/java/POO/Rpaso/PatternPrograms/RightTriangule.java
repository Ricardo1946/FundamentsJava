package POO.Rpaso.PatternPrograms;

public class RightTriangule {

    public static void main(String[] args) {

        int n = 5; // number of rows
        int numStars = 1; // number of stars to be printed in each row

        for (int i = 1; i <= n; i++) { // loop for rows
            for (int j = 1; j <= numStars; j++) { // loop for printing stars in each row
                System.out.print("* ");
            }
            numStars++; // increment the number of stars for the next row
            System.out.println(); // move to next line
        }
    }
}
