/*
 * Proyecto para clase de Modelos de Programación I
 * Universidad Distrital Francisco Jose de Caldas
 * Profesor Julio Baron    
 */
package alarcos.patrones.decorator.examples.pizzas;

/**
 *
 * @author Jorge Andres
 */
import java.util.ArrayList;


public abstract class Decorador extends Reloj{

    private ArrayList<Reloj> relojes = new ArrayList();

    public Decorador(Reloj reloj){
        relojes.add(reloj);
    }
   
    
}

