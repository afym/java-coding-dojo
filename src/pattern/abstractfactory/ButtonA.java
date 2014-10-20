package pattern.abstractfactory;

import pattern.abstractfactory.IButton;

public class ButtonA implements IButton{

	@Override
	public void draw() {
		System.out.println("Drawing A button");
	}
}
