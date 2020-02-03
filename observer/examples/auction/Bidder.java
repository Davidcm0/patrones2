package alarcos.patrones.observer.examples.auction;

import alarcos.patrones.observer.pattern.Event;
import alarcos.patrones.observer.pattern.Observer;

/**
 * Created by luisburgos on 15/07/15.
 */
public class Bidder implements Observer {

    private static int ID = 0;

    @Override
    public void update(Event event) {
        System.out.println(
                "ID: " + (++ID) +
                        ", Updating event type: " +  event.getType() +
                        ", Event description: " + event.getDescription());
    }
}
