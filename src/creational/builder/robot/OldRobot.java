package src.creational.builder.robot;

public class OldRobot implements Robot {
    private String head;
    private String torso;
    private String arms;

    public String getHead() {
        return head;
    }

    public String getTorso() {
        return torso;
    }

    public String getArms() {
        return arms;
    }

    public String getLegs() {
        return legs;
    }

    private String legs;

    @Override
    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public void setTorso(String torso) {
        this.torso = torso;
    }

    @Override
    public void setArms(String arms) {
        this.arms = arms;
    }

    @Override
    public void setLegs(String legs) {
        this.legs = legs;
    }
}
