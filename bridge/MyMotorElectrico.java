package alarcos.patrones.bridge;

import alarcos.patrones.bridge.Motor;

public class MyMotorElectrico { //IMPLEMENTADOR A

    
    public void prender() {
        System.out.println("Prendiendo motor electrioco");
    }

    
    public void apagar() {
        System.out.println("Apagando motor electrico");
    }

    
    public void aumentaRevoluciones() {
        System.out.println("Aumentando 20 revoluciones");
    }

    
    public void reducirRevoluciones() {
        System.out.println("Reduciendo 20 revoluciones");
    }
    
}
