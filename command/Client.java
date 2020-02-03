package alarcos.patrones.command;


public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        Button button = new Button();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        button.setCommand(lightOnCommand);
        button.pressButton();
        System.out.println(light.getIsOn());

        button.setCommand(lightOffCommand);
        button.pressButton();
        System.out.println(light.getIsOn());
    }
}