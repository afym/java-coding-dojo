package pattern.abstractfactory;

public abstract class AbstractFactory {
	abstract IColor getColor(String color);
	abstract IButton getButton(String button);
}
