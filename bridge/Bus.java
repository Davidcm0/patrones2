/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarcos.patrones.bridge;

import alarcos.patrones.bridge.Auto;
import alarcos.patrones.bridge.Motor;

public class Bus implements Auto{

    private Motor motor;
            
    public Bus(Motor motor){
        this.motor = motor;
    }

    @Override
    public void arrancar() {
        motor.prender();
    }

    @Override
    public void acelerar() {
        motor.aumentaRevoluciones();
    }

    @Override
    public void frenar() {
        motor.reducirRevoluciones();
    }

    @Override
    public void detener() {
        motor.apagar();
    }
    
}
