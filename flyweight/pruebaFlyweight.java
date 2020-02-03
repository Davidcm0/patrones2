package alarcos.patrones.flyweight;
import java.util.ArrayList;

//To get a clear idea about the Flyweight design pattern please refer the weblink I have given in the readme
//This is the flyweight class
//Eventhough sometimes it is not clearly mentioned about the use of packaging in the Flyweight design pattern, I think it is better to use clever packaging when u are using this design pattern

//According to my belief these 3 classes should be in a one package----------
class SoliderFlyweight{
    private String weapon;
    private String armour;
    private String helmet;

    protected SoliderFlyweight(String weapon, String armour, String helmet) { //This is protected because to, prevent other classes (except Soilder class) from creating objects of SoilderFlyweight
        this.weapon = weapon;
        this.armour = armour;
        this.helmet = helmet;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getArmour() {
        return armour;
    }

    public String getHelmet() {
        return helmet;
    }
    
    protected void setWeapon(String weapon){
        this.weapon = weapon;
    } 
}



class SoliderFlyweightFactory{
    private static SoliderFlyweight solider;
    protected static SoliderFlyweight getSolider(){
        if(solider==null){
            synchronized(SoliderFlyweightFactory.class){
                if(solider==null){
                    solider = new SoliderFlyweight("T-56","Armour","Helmet");
                }
            }
        }
        return solider;
    }
}
//-------------------------------------------------------------------------------

//This is a class which writtern to show the difference between, when we are using flyweight and not



