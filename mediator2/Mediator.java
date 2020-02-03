package alarcos.patrones.mediator2;

public abstract class Mediator {
	
	public abstract void broadcast (String message, Colleague sender);
}