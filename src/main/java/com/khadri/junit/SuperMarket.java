package com.khadri.junit;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {

	private List<Integer> items = new ArrayList<>();

	{
		items.add(1);
		items.add(3);
		items.add(4);
		items.add(2);
	}

	public Boolean checkStock(Item item) {
		return items.contains(item.getItemNo());
	}
}
