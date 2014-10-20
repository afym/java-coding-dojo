package test;

import org.junit.Before;
import org.junit.Test;

import pattern.abstractfactory.ButtonFactory;
import pattern.abstractfactory.ColorFactory;
import pattern.abstractfactory.FactoryProducer;

/**
 * Abstract Factory :
 * 
 * It works around a super-factory which creates other factories. This factory
 * is also called as Factory of factories. This type of design pattern comes
 * under creational pattern as this pattern provides one of the best ways to
 * create an object.
 * 
 * In Abstract Factory pattern an interface is responsible for creating a
 * factory of related objects, without explicitly specifying their classes. Each
 * generated factory can give the objects as per the Factory pattern.
 * 
 * @url 
 *      http://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
 */
public class AbstractFactoryPatternTest {
	private FactoryProducer producer;

	@Before
	public void setFactoryProducer() {
		this.producer = new FactoryProducer();
	}

	@Test
	public void testColor() {
		this.producer.getColor(ColorFactory.BLUE).paint();
		this.producer.getColor(ColorFactory.RED).paint();
	}

	@Test
	public void testButton() {
		this.producer.getButton(ButtonFactory.BUTTON_A).draw();
		this.producer.getButton(ButtonFactory.BUTTON_B).draw();
	}
}
