package pattern.factory;

import pattern.factory.Shape;

public class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
}