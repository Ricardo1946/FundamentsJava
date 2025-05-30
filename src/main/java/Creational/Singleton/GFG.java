package Creational.Singleton;

public class GFG {
    public static void main(String[] args) {

        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // Instantiting Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // Instantiating Singleton clas with variable z
        Singleton z = Singleton.getInstance();

        // Printing the hash code for above variable as, Declared
        System.out.println("HashCode of x is" + x.hashCode());
        System.out.println("HashCode of y is" + y.hashCode());
        System.out.println("HashCode of z is" + z.hashCode());

        if ( x == y && y == z){
            System.out.println("Three objects point to the same memory location on the heap i.e," +
                    "to the same object");
        }
        else {
            System.out.println("Three objects DO NOT point to the same meory location on the heap");
        }
    }
}
