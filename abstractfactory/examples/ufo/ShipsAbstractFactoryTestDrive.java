package alarcos.patrones.abstractfactory.examples.ufo;

import alarcos.patrones.abstractfactory.examples.ufo.products.Ship;
import alarcos.patrones.abstractfactory.examples.ufo.products.UFOBossShip;
import alarcos.patrones.abstractfactory.examples.ufo.products.UFOShip;


/**
 * Created by luisburgos on 17/07/15.
 */
public class ShipsAbstractFactoryTestDrive {

    public static void main(String[] args) {

        Ship ship;
        String typeShip;

        typeShip = "ufo";
        if(typeShip.equalsIgnoreCase("ufo")){
            ship = new UFOShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }

        typeShip = "boss";
        if(typeShip.equalsIgnoreCase("boss")){
            ship = new UFOBossShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }

    }

}
