package alarcos.patrones.mediator2;

import java.util.ArrayList;

public class MyAirplane {
private int FlightNumber;
private ArrayList <MyAirplane> colleagues;

public MyAirplane () {
	this.colleagues = new ArrayList<MyAirplane>();
}

public int getFlightNumber() {
	return this.FlightNumber;
}

public void setFlightNumber(int flightNumber) {
	this.FlightNumber = flightNumber;
}

public void receive (String message) {
	System.out.println(this.FlightNumber + " Recieved message: " + message + "\n");
}
public void addColleague (MyAirplane air) {
	this.colleagues.add(air);
}


public void broadcast(String message, MyAirplane sender) {
	for (MyAirplane air: colleagues) {
		if (air != sender) {
			air.receive(message);
		}
	}
}
}