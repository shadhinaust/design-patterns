package src.creational.factorymethod.enemyship;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(ShipType type) {
        EnemyShip ship;
        switch (type) {
            case ROCKET:
                ship = new RocketEnemyShip();
                break;
            case UFO:
                ship = new UFOEnemyShip();
                break;
            case BIG_UFO:
                ship = new BigUFOEnemyShip();
                break;
            default:
                throw new UnsupportedOperationException("Requested ship is not available!!!");
        }

        return ship;
    }
}
