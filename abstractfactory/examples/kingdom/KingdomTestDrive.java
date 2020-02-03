package alarcos.patrones.abstractfactory.examples.kingdom;

import alarcos.patrones.abstractfactory.examples.kingdom.factories.ElfKingdomFactory;
import alarcos.patrones.abstractfactory.examples.kingdom.factories.KingdomFactory;
import alarcos.patrones.abstractfactory.examples.kingdom.factories.MenKingdomFactory;
import alarcos.patrones.abstractfactory.examples.kingdom.parts.Army;
import alarcos.patrones.abstractfactory.examples.kingdom.parts.Castle;
import alarcos.patrones.abstractfactory.examples.kingdom.parts.King;

/**
 * Created by luisburgos on 17/07/15.
 */
public class KingdomTestDrive {

    public static void main(String[] args) {
        createKingdom(new ElfKingdomFactory());
        createKingdom(new MenKingdomFactory());

    }

    public static void createKingdom(KingdomFactory factory) {
        King king = factory.makeKing();
        Castle castle = factory.makeCastle();
        Army army = factory.makeArmy();
        System.out.println("The kingdom was created: ");
        System.out.println(king);
        System.out.println(castle);
        System.out.println(army);
    }

}
