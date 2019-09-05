package com.stack;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void shouldComplexStatements() {
		int result = calculator.evalute("1 - 3 + 2 + 4");
		// assertEquals(4, result);
		throw new NullPointerException();
		// assertEquals(5, result);
	}

	@Test
	public void shouldEvaluateConstants() {
		int result = calculator.evalute("1");
		assertEquals(1, result);
	}

	@Test
	public void shouldSupportAdding() {
		int result = calculator.evalute("1 + 2");
		assertEquals(3, result);
	}

	@Test
	public void shouldSupportSubtraction() {
		int result = calculator.evalute("1 - 2");
		assertEquals(-1, result);
	}
}
