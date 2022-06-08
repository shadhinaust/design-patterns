package src.creational.builder.robot;

public interface RobotBuilder {
    public void buildHead();

    public void buildTorso();

    public void buildArms();

    public void buildLegs();

    public OldRobot getRobot();
}
