package pattern.abstractfactory;

import pattern.abstractfactory.IColor;

public class Red implements IColor {

	@Override
	public void paint() {
		System.out.println("Painting red");
	}
}
