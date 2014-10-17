package pattern.factory;

import pattern.factory.Shape;
import pattern.factory.Circle;
import pattern.factory.Square;
import pattern.factory.Triangle;

public class ShapeFactory {
	public static final String SHAPE_CIRCLE = "circle";
	public static final String SHAPE_SQUARE = "square";
	public static final String SHAPE_TRIANGLE = "triangle";

	private Shape shape;

	public ShapeFactory(String shape) {
		this.createShape(shape);
	}

	public Shape getShape() {
		return this.shape;
	}

	private void createShape(String shape) {
		if (shape.equals(SHAPE_CIRCLE)) {
			this.shape = new Circle();
		} else if (shape.equals(SHAPE_SQUARE)) {
			this.shape = new Square();
		} else if (shape.equals(SHAPE_TRIANGLE)) {
			this.shape = new Triangle();
		}
	}
}
