package test;

import org.junit.Test;
import pattern.factory.ShapeFactory;

/**
 * Factory pattern :
 * 
 * Is one of most used design pattern in Java. This type of
 * design pattern comes under creational pattern as this pattern provides one of
 * the best ways to create an object.
 * 
 * In Factory pattern, we create object without exposing the creation logic to
 * the client and refer to newly created object using a common interface.
 * 
 * @url http://www.tutorialspoint.com/design_pattern/factory_pattern.htm
 */
public class FactoryPatternTest {

	@Test
	public void testSquare() {
		ShapeFactory square = new ShapeFactory(ShapeFactory.SHAPE_SQUARE);
		square.getShape().draw();
	}

	@Test
	public void testCircle() {
		ShapeFactory circle = new ShapeFactory(ShapeFactory.SHAPE_CIRCLE);
		circle.getShape().draw();
	}

	@Test
	public void testTriangle() {
		ShapeFactory triangle = new ShapeFactory(ShapeFactory.SHAPE_TRIANGLE);
		triangle.getShape().draw();
	}
}
