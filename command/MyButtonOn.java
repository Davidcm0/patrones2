package alarcos.patrones.command;

public class MyButtonOn {

    private MyLightOn command;

    public void setCommand(MyLightOn command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}