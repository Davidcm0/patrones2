package alarcos.patrones.command;


public class MyButtonOff {

    private MyLightOff command;

    public void setCommand(MyLightOff command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}