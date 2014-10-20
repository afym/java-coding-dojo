package pattern.factory;

import pattern.factory.IShape;

public class Triangle implements IShape{

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
}
