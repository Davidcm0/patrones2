package alarcos.patrones.abstractfactory.examples.ufo.factories;

import alarcos.patrones.abstractfactory.examples.ufo.parts.ShipEngine;
import alarcos.patrones.abstractfactory.examples.ufo.parts.ShipWeapon;
import alarcos.patrones.abstractfactory.examples.ufo.parts.UFOBossEngine;
import alarcos.patrones.abstractfactory.examples.ufo.parts.UFOBossGun;

/**
 * Created by luisburgos on 16/07/15.
 */
public class UFOBossShipFactory extends ShipFactory {
    @Override
    public ShipWeapon makeShipGun() {
        return new UFOBossGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOBossEngine();
    }
}
