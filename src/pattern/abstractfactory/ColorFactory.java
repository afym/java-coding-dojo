package pattern.abstractfactory;

import pattern.abstractfactory.IColor;

public class ColorFactory {
	public final static String RED = "red";
	public final static String BLUE = "blue";
	private String color;

	public ColorFactory(String color) {
		this.color = color;
	}

	public IColor getColor() {
		return this.createColor();
	}

	private IColor createColor() {
		if (this.color.equals(RED)) {
			return new Red();
		} else if (this.color.equals(BLUE)) {
			return new Blue();
		}

		return null;
	}
}
