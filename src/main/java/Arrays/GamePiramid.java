package Arrays;

public class GamePiramid {

    public static void main(String[] args) {
        int num = 5;
        int x = 0;

        // Outer loop for rows
        for (int i = 1; i <= num; i++) {
            x = i - 1;

            //inner loop for "i"th row printing
            for (int j = i; j <= num - 1; j++) {
                // First NUmber space
                System.out.print(" ");

                // Space between nUmbers
                System.out.print("  ");
            }

            for (int j = 0; j <= x; j++)
            System.out.print((i + j) < 10
            ? (i + j) + " "
                    : (i + j) + "  ");


            for (int j = 1; j <= x; j++)
                System.out.print((i + x - j) < 10
                        ? (i + x - j) + " "
                        : (i + x - j) + " ");

            System.out.println();
        }
    }
}
