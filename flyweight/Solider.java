package alarcos.patrones.flyweight;

public class Solider{
    private SoliderFlyweight solider;
    public Solider(String weapon){
        this.solider= SoliderFlyweightFactory.getSolider();
        this.solider.setWeapon(weapon);
    }    
}
