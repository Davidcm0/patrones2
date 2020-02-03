package alarcos.patrones.abstractfactory.examples.ufo.factories;

import alarcos.patrones.abstractfactory.examples.ufo.parts.ShipEngine;
import alarcos.patrones.abstractfactory.examples.ufo.parts.ShipWeapon;

/**
 * Created by luisburgos on 16/07/15.
 */
public abstract class ShipFactory {

    public abstract ShipWeapon makeShipGun();
    public abstract ShipEngine makeShipEngine();

}
