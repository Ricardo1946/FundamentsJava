package Creational.Singleton;

public class Singleton {

    // static variable reference of single_instance
    //of type Singleton
    private static Singleton single_instance = null;

    // Declaaring a variable of type String
    public String s;

    /*
    Constructor
    Here we eill be creating private constructor
    restricted to this itself
     */
    private Singleton(){
        s = "Hello I am a string part of Singleton class";
    }

    // Static method
    //Static method to create instance of Singleton class
    public static synchronized Singleton getInstance(){
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}
