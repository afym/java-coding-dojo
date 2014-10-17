package test;

import org.junit.Test;
import pattern.factory.ShapeFactory;

public class FactoryPatternTest {

	@Test
	public void testSquare() {
		ShapeFactory square = new ShapeFactory(ShapeFactory.SHAPE_SQUARE);
		square.getShape().draw();
	}

}
