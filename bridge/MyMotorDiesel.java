package alarcos.patrones.bridge;

import alarcos.patrones.bridge.Motor;

public class MyMotorDiesel {//IMPLEMENTADOR B

    
    public void prender() {
        System.out.println("Prendiendo motor diesel");
    }

    
    public void apagar() {
        System.out.println("Apagando motor diesel");
    }

    
    public void aumentaRevoluciones() {
        System.out.println("Aumentando 30 revoluciones");
    }

    
    public void reducirRevoluciones() {
        System.out.println("Reduciendo 30 revoluciones");
    }
    
}
