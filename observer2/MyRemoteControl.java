package alarcos.patrones.observer2;

public class MyRemoteControl {
    private MyBluRayPlayer bluRayPlayer;
    private MyStereo stereo;

    public MyRemoteControl(MyBluRayPlayer bluRayPlayer, MyStereo stereo) {
        this.bluRayPlayer = bluRayPlayer;
        this.stereo = stereo;
    }

    public void pressPowerButton() {
        bluRayPlayer.togglePower();
        stereo.togglePower();
    }

}