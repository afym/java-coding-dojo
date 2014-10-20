package pattern.abstractfactory;

import pattern.abstractfactory.IButton;

public class ButtonB implements IButton {

	@Override
	public void draw() {
		System.out.println("Drawing B button");
	}
}
