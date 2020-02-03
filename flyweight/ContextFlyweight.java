package alarcos.patrones.flyweight;

import java.util.ArrayList;
//This is a simple class written to show simulate the process
public class ContextFlyweight{
    public static void main(String args[]){
        
        //This is what happens when we use flyweight design pattern
        ArrayList<Solider> soliders = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i=0; i<200000; i++){
            soliders.add(new Solider("AK-47"));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("With Flyweight");
        System.out.println("Time spent is: "+(endTime-startTime)); //smaller
        
        System.out.println("");
        
         //This is what happens when we don't use flyweight design pattern
        ArrayList<Solider2> soliders2 = new ArrayList<>();
        long startTime2 = System.currentTimeMillis();
        for (int i=0; i<200000; i++){
            soliders2.add(new Solider2("AK-47","Armour","Helmet"));
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Without Flyweight");
        System.out.println("Time spent is: "+(endTime2-startTime2)); //larger  
    }
}
