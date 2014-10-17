package pattern.factory;

import pattern.factory.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}
