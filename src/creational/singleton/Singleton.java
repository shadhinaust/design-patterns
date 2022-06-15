package src.creational.singleton;

public class Singleton {
    private Singleton() {

    }

    public String toString() {
        return "Identity: " + getClass().hashCode();
    }

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
