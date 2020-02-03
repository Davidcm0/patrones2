package alarcos.patrones.visitor;

/**
 * A rectangle with specified width and height.
 */
public class MyRectangle {

	protected final int width, height;

	public MyRectangle(final int width, final int height) {
		assert width >= 0;
		assert height >= 0;
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}