package alarcos.patrones.abstractfactory.examples.ufo.factories;

import alarcos.patrones.abstractfactory.examples.ufo.parts.ShipEngine;
import alarcos.patrones.abstractfactory.examples.ufo.parts.ShipWeapon;
import alarcos.patrones.abstractfactory.examples.ufo.parts.UFOEngine;
import alarcos.patrones.abstractfactory.examples.ufo.parts.UFOGun;

/**
 * Created by luisburgos on 16/07/15.
 */
public class UFOShipFactory extends ShipFactory {
    @Override
    public ShipWeapon makeShipGun() {
        return new UFOGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOEngine();
    }
}
