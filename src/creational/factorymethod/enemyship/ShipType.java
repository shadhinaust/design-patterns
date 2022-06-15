package src.creational.factorymethod.enemyship;

public enum ShipType {
    ROCKET("R"), UFO("U"), BIG_UFO("B");

    private String code;

    ShipType(String code) {
        this.code = code;
    }

    public static ShipType getType(String code) {
        try {
            for (ShipType type : values()) {
                if (type.code.equalsIgnoreCase(code))
                    return type;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
