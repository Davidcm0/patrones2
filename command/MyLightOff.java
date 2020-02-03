package alarcos.patrones.command;

public class MyLightOff {
    private Light light;

    public MyLightOff(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.switchOff();
    }
}