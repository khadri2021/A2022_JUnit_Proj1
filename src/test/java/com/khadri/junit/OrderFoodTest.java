package com.khadri.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class OrderFoodTest {

	static OrderFood of;
	static Order order;

	@BeforeAll
	static void setUp() {
		// create an instance
		of = new OrderFood();
		
		// creating stub
		order = new Order();
		order.setOrderId(1);
		order.setOrderName("Idly");
		
		System.out.println("Before All");

	}

	@Test
	void testPlaceInvalidOrder() {

		Double result = of.placeOrder(null);

		assertEquals(0.00, result);
	}

	@Test
	void testPlaceValidOrder() {

		Double result = of.placeOrder(order);

		assertEquals(100.09, result);
	}

	@Test
	void testPlaceValidOrderNotEquals() {

		Double result = of.placeOrder(order);
		
		assertNotEquals(100.08, result);
	}
	
}
