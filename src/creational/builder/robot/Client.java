package src.creational.builder.robot;

public class Client {
    public static void main(String[] args) {
        RobotBuilder builder = new OldRobotBuilder();
        RobotEngineer engineer = new RobotEngineer(builder);
        engineer.makeRobot();
        OldRobot robot = engineer.getRobot();

        System.out.println("Robot is ready with " + robot.getHead() + ", " + robot.getTorso() + ", " + robot.getArms() + " and " + robot.getLegs() + ".");
    }
}
