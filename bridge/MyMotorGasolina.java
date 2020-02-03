package alarcos.patrones.bridge;

import alarcos.patrones.bridge.Motor;

public class MyMotorGasolina {//IMPLEMENTADOR C

    
    public void prender() {
        System.out.println("Prendiendo Motor gasolina");
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
