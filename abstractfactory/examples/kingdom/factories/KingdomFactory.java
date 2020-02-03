package alarcos.patrones.abstractfactory.examples.kingdom.factories;

import alarcos.patrones.abstractfactory.examples.kingdom.parts.Army;
import alarcos.patrones.abstractfactory.examples.kingdom.parts.Castle;
import alarcos.patrones.abstractfactory.examples.kingdom.parts.King;

/**
 * Created by luisburgos on 17/07/15.
 */
public abstract class KingdomFactory {

    public abstract Castle makeCastle();
    public abstract King makeKing();
    public abstract Army makeArmy();

}
