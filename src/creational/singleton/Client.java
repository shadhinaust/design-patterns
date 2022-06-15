package src.creational.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton_1 = Singleton.getInstance();
        Singleton singleton_2 = Singleton.getInstance();
        System.out.println("First: " + singleton_1.toString() + " and Second: " + singleton_2.toString());
    }
}
