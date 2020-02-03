package alarcos.patrones.visitor;

/**
 * A graphical shape.
 */
public interface Shape {
	<Result> Result accept(Visitor<Result> v);
}