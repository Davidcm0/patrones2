package alarcos.patrones.bridge;

import alarcos.patrones.bridge.Auto;
import alarcos.patrones.bridge.Motor;

public class MyCamion {

    private MyMotorGasolina motor;
    
    public MyCamion(MyMotorGasolina motor){
        this.motor = motor;
    }

  
    public void prender() {
        System.out.println("Prendiendo motor gasolina");
    }

    
    public void apagar() {
        System.out.println("Apagando motor gasolina");
    }

    
    public void aumentaRevoluciones() {
        System.out.println("Aumentando 50 revoluciones");
    }

    
    public void reducirRevoluciones() {
        System.out.println("Reduciendo 50 revoluciones");
    }
    
}

