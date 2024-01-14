package com.khadri.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order; 
import org.junit.jupiter.api.Test;

class SuperMarketTest {

	static Item item;

	static SuperMarket instance;

	@BeforeAll
	static void setUp() {
		instance = new SuperMarket();
		item = new Item();
	}
	
	@Test
	@DisplayName("Stock Sucess")
	@Order(2)
	void testCheckStockSuccess() {
		item.setItemNo(3);
		item.setItemName("CloseUp");
		Boolean actual = instance.checkStock(item);
		assertEquals(true, actual);
	}
	
	@Test
	@DisplayName("Stock Fail")
	void testCheckStockFail() {
		item.setItemNo(6);
		item.setItemName("CloseUp");
		Boolean actual = instance.checkStock(item);
		assertEquals(false, actual);
	}

	
}
