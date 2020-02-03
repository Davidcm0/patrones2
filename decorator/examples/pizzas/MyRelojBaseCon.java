package alarcos.patrones.decorator.examples.pizzas;

/**
 *
 * @author Jorge Andres
 */
import java.util.Calendar;
import javax.swing.JOptionPane;


public class MyRelojBaseCon extends Reloj{

    @Override
    public void mostrarHora() {
        System.out.println(obtenerHora());
    }

    @Override
    public String obtenerHora() {
        Calendar calendario = Calendar.getInstance();
        hora =  calendario.get(Calendar.HOUR_OF_DAY);
        String mensaje = Integer.toString(hora);
        return mensaje;
    }
    
}
