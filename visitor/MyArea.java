package alarcos.patrones.visitor;

import java.util.Iterator;

/**
 * A visitor to compute the number of basic shapes in a (possibly complex)
 * shape.
 */
public class MyArea  {

//return the area of a circle
	
	public Integer onCircle(final MyCircle c) {
		final int radius = c.getRadius();
		double ans = radius*radius*3.14;
		int a = (int)ans;
		return a;
	}


//return the area of a rectangle
	
	public Integer onRectangle(final MyRectangle q) {
		final int width = q.getWidth();
		final int height = q.getHeight();
		return width*height;
	}


}