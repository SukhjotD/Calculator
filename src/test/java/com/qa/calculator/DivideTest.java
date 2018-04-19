package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivideTest {
	
	private Divide divide;

	@Test
	public void test() {
		divide = new Divide();
		int expectedValue = 2;
		int actualValue = Divide.divide(4,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
