package alarcos.patrones.observer2;

public class MyStereo {
	private boolean isPoweredOn;
    public void volumeUp() {
       
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