package alarcos.patrones.command;

public class MyLightOn {
    private Light light;

    public MyLightOn(Light light) {
        this.light = light;
    }

    
    public void execute() {
        this.light.switchOn();
    }
}