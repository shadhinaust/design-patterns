package src.creational.builder.pizza;

public class Waiter {
    private PizzaBuilder builder;

    public Pizza getPizzza() {
        return builder.getPizza();
    }

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void constructPizza() {
        builder.createNewPizza();
        builder.buildDough();
        builder.buildSauce();
        builder.buildTopping();
    }
}
