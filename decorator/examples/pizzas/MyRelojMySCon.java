package alarcos.patrones.decorator.examples.pizzas;

/**
 *
 * @author Jorge Andres
 */
import java.util.Calendar;
import javax.swing.JOptionPane;


public class MyRelojMySCon extends Decorador{

    public MyRelojMySCon(Reloj reloj) {
        super(reloj);
    }

    @Override
    public void mostrarHora() {
        System.out.println(obtenerHora());
    }

    @Override
    public String obtenerHora() {
        Calendar calendario = Calendar.getInstance();
        hora =  calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        String mensaje1 = Integer.toString(hora);
        String mensaje2 = Integer.toString(minutos);
        String mensaje3 = Integer.toString(segundos);
        return mensaje1+":"+mensaje2+":"+mensaje3;
    }
    
}
