package Singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            return instance = new Singleton();
        }
        System.out.println("Returning instance of Singleton");
        return instance;
    }
}
