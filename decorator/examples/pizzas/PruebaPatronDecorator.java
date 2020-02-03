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
public class PruebaPatronDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyRelojBaseCon reloj = new MyRelojBaseCon();
        reloj.mostrarHora();
        
        MyRelojMySCon r = new MyRelojMySCon(reloj);
        r.mostrarHora();

    }
    
}
