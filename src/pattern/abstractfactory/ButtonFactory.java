package pattern.abstractfactory;

import pattern.abstractfactory.IButton;

public class ButtonFactory {
	public final static String BUTTON_A = "buttona";
	public final static String BUTTON_B = "buttonb";
	private String button;

	public ButtonFactory(String button) {
		this.button = button;
	}

	public IButton getButton() {
		return this.createButton();
	}

	private IButton createButton() {
		if (button.equals(BUTTON_A)) {
			return new ButtonA();
		} else if (button.equals(BUTTON_B)) {
			return new ButtonB();
		}

		return null;
	}
}