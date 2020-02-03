package alarcos.patrones.strategy.examples.robot;

public class MyRobot {

    private RobotBehavior behavior;
    private String name;

    public MyRobot(){}

    public RobotBehavior getBehavior() {
        return behavior;
    }

    public void setBehaviorNormal(NormalBehavior behavior) {
        this.behavior = behavior;
    }
    public void setBehaviorAgressive(AgressiveBehavior behavior) {
        this.behavior = behavior;
    }
    public void setBehaviorDefensive(DefensiveBehavior behavior) {
        this.behavior = behavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        int command = behavior.moveCommand();
        System.out.println("Move command: " + command + ". " + behavior.toString());
    }
}