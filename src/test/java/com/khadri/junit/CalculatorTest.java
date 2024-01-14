package com.khadri.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private static Calculator calculator;
	
	@BeforeAll
	static void setUp() {
		System.out.println("setUp method");
		 calculator = new Calculator();
	}

	// TDD - test driven development
	@Test
	void testAddPositive() {
		System.out.println("testAddPositive");
		Integer result1 = calculator.add(100, 100);
		Integer result2 = calculator.add(99, 99);
		assertEquals(200, result1);
		assertEquals(0, result2);
	}
 
	// TDD - test driven development
	@Test
	@Disabled
	void testAddAllNegative() {
		Integer result = calculator.add(-10, -20);
		assertNotEquals(-20, result);
	}

	@Test
	@Disabled
	void testEqualToNegative() {

	}

	@Test
	void testEqualToPositive() {
		System.out.println("testEqualToPositive");
		boolean equalTo = calculator.isEqualTo("hello");
		assertEquals(true, equalTo);
	}

	@Test
	void testSub() {
		System.out.println("testSub");
		Integer sub = calculator.sub(30, 10);
		assertEquals(20, sub);
	}

	@Test
	void testMulti() {
		System.out.println("testMulti");
		Integer multi = calculator.multi(10, 10);
		assertEquals(100, multi);
	}

	@Test
	void testDivision() {
		System.out.println("testDivision");
		Integer division = calculator.division(100, 10);
		assertEquals(10, division);
	}

}
