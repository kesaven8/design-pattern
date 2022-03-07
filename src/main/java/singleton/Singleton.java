package singleton;

// Making a Singleton class
public class Singleton {
    private static Singleton SINGLETON = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Singleton();
        }
        return SINGLETON;
    }

}
