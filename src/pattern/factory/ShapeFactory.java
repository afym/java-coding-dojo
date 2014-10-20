package pattern.factory;

import pattern.factory.IShape;
import pattern.factory.Circle;
import pattern.factory.Square;
import pattern.factory.Triangle;

public class ShapeFactory {
	public static final String SHAPE_CIRCLE = "circle";
	public static final String SHAPE_SQUARE = "square";
	public static final String SHAPE_TRIANGLE = "triangle";

	private String shape;

	public ShapeFactory(String shape) {
		this.shape = shape;
	}

	public IShape getShape() {
		return this.createShape();
	}

	private IShape createShape() {
		if (this.shape.equals(SHAPE_CIRCLE)) {
			return new Circle();
		} else if (this.shape.equals(SHAPE_SQUARE)) {
			return new Square();
		} else if (this.shape.equals(SHAPE_TRIANGLE)) {
			return new Triangle();
		}

		return null;
	}
}