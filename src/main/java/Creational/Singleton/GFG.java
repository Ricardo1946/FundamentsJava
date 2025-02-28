package Creational.Singleton;

public class principal {
    public static void main(String[] args) {
        Singleton c = Singleton.getConfigurador("miurl", "mibaseDatos");
        System.out.println(c.getUrl());
        System.out.println(c.getBaseDatos());
    }
}
