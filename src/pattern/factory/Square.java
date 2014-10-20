package pattern.factory;

import pattern.factory.IShape;

public class Square implements IShape{

	@Override
	public void draw() {
		System.out.println("Drawing a square");
		
	}

}
