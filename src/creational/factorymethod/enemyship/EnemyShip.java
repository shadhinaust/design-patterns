package src.creational.factorymethod.enemyship;

public abstract class EnemyShip {
    private String name;
    private double speed;
    private double directionX;
    private double directionY;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip() {
        System.out.println(name + " is following the hero");
    }

    public void displayEnemyShip() {
        System.out.println(name + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(name + " attacks and does " + amtDamage + " damage to hero");
    }
}
