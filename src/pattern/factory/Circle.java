package pattern.factory;

import pattern.factory.IShape;

public class Circle implements IShape {

	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}
