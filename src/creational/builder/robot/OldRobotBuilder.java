package src.creational.builder.robot;

public class OldRobotBuilder implements RobotBuilder {
    private OldRobot robot;

    public OldRobotBuilder() {
        this.robot = new OldRobot();
    }

    @Override
    public void buildHead() {
        robot.setHead("Tin Head");
    }

    @Override
    public void buildTorso() {
        robot.setTorso("Tin Torso");
    }

    @Override
    public void buildArms() {
        robot.setArms("Blowtorch Arms");
    }

    @Override
    public void buildLegs() {
        robot.setLegs("Rollar Skates");
    }

    @Override
    public OldRobot getRobot() {
        return robot;
    }
}
