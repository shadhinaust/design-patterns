package src.creational.builder.pizza;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder builder;
        Pizza pizza;

        builder = new HawaiianPizzaBuilder();
        waiter.setBuilder(builder);
        waiter.constructPizza();
        pizza = waiter.getPizzza();
        System.out.println("Hawaiian pizza is made with " + pizza.getDough() + " dough, " + pizza.getSauce() + " sauce and " + pizza.getTopping() + " toppings.");

        builder = new SpicyPizzaBuilder();
        waiter.setBuilder(builder);
        waiter.constructPizza();
        pizza = waiter.getPizzza();
        System.out.println("Spicy pizza is made with " + pizza.getDough() + " dough, " + pizza.getSauce() + " sauce and " + pizza.getTopping() + " toppings.");
    }
}
