package alarcos.patrones.observer2;

public class RemoteControl {
    private BluRayPlayer bluRayPlayer;
    private Stereo stereo;

    public RemoteControl(BluRayPlayer bluRayPlayer, Stereo stereo) {
        this.bluRayPlayer = bluRayPlayer;
        this.stereo = stereo;
    }

    public void pressPowerButton() {
        bluRayPlayer.togglePower();
        stereo.togglePower();
    }

}