package pattern.abstractfactory;

import pattern.abstractfactory.IColor;

public class Blue implements IColor{

	@Override
	public void paint(){
		System.out.println("Painting blue");
	}
}
