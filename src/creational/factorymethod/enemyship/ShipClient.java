package src.creational.factorymethod.enemyship;

import java.util.Scanner;

public class ShipClient {
    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip ship;
        Scanner input = new Scanner(System.in);
        System.out.println("What type of ship? (U=UFO, R=Rocket, B=Big UFO)");
        if (input.hasNextLine()) {
            String code = input.nextLine();
            ShipType type = ShipType.getType(code);
            ship = factory.makeEnemyShip(type);
            if (ship != null) {
                doStuffEnemy(ship);
            } else {
                System.out.println("Please enter U, R, or B");
            }
        }
    }

    private static void doStuffEnemy(EnemyShip ship) {
        ship.displayEnemyShip();
        ship.followHeroShip();
        ship.enemyShipShoots();
    }
}
