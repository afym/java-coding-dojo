package pattern.abstractfactory;

import pattern.abstractfactory.AbstractFactory;

public class FactoryProducer extends AbstractFactory {

	@Override
	public IColor getColor(String color) {
		return new ColorFactory(color).getColor();
	}

	@Override
	public IButton getButton(String button) {
		return new ButtonFactory(button).getButton();
	}
	
}
