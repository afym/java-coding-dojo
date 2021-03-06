package test;

import org.junit.Test;

import pattern.singlenton.SingletonClass;
/**
 * Singleton pattern is one of the simplest design patterns in Java. 
 * This type of design pattern comes under creational pattern as this 
 * pattern provides one of the best way to create an object. 
 * 
 * This pattern involves a single class which is responsible to creates own 
 * object while making sure that only single object get created. This class provides 
 * a way to access its only object which can be accessed directly without need to 
 * instantiate the object of the class.
 * 
 * @url http://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 */
public class SinglentonPatternTest {

	@Test
	public void testSingletonInstance() {
		SingletonClass singleton = SingletonClass.getInstance();
		System.out.println(singleton.getSomeString());
	}

}
