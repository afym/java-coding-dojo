package test;

import org.junit.Before;
import org.junit.Test;

import classes.MatchClass;

public class MathClassTest {

	private MatchClass numberClass;

	@Before
	public void setNumberClass() {
		this.numberClass = new MatchClass();
	}

	@Test
	public void testMin() {
		System.out.println(this.numberClass.minOutput());
	}

	@Test
	public void testMax() {
		System.out.println(this.numberClass.maxOutput());
	}

	@Test
	public void testPow() {
		System.out.println(this.numberClass.powANumber());
	}

	@Test
	public void testSquared() {
		System.out.println(this.numberClass.squaredRoot());
	}
}
