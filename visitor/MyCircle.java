package alarcos.patrones.visitor;

/**
 * A circle with a specified radius.
 */
public class MyCircle {

	protected final int radius;

	public MyCircle(final int radius) {
		assert radius >= 0;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

}