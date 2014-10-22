package test;

import org.junit.Before;
import org.junit.Test;

import classes.ArrayListClass;

public class ArrayListClassTest {
	private ArrayListClass arrayListClass;

	@Before
	public void setArrayListClass() {
		this.arrayListClass = new ArrayListClass();
	}

	@Test
	public void testArrayListClass() {
		this.arrayListClass.arrayListDifference();
	}

}
