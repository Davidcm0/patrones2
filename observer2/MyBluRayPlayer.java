package alarcos.patrones.observer2;

public class MyBluRayPlayer {
	private boolean isPoweredOn;
    public void play() {
        
    }

    public void pause() {
        
    }
    public void togglePower() {
        isPoweredOn = !isPoweredOn;
        if(isPoweredOn)
        	System.out.printf("");
        else
        	System.out.printf("");
       // announce("Powered %s", isPoweredOn ? "on" : "off");
    }

}