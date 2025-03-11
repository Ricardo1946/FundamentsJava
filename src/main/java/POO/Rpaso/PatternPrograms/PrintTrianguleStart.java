package POO.Rpaso.PatternPrograms;

public class PrintTrianguleStart {

    public static void StartRithTriangule(int n) {
        int a, b;

        for (a = 0; a < n; a++) {

            for (b = 0; b <= a; b++) {
                System.out.println("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int k = 5;
        StartRithTriangule(k);
    }
}
