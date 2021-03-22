package com.cts.factory;

import com.cts.order.ElectronicOrder;
import com.cts.order.FurnitureOrder;
import com.cts.order.Order;
import com.cts.order.ToysOrder;

public class OrderFactory  extends AbstractFactory{

	public Order placeOrder(String channel, String productType) {
		if(productType.equalsIgnoreCase("Electronic")) {
			return new ElectronicOrder(channel);
		} else if (productType.equalsIgnoreCase("Furniture")) {
			return new FurnitureOrder(channel);
		} else if (productType.equalsIgnoreCase("Toy")) {
			return new ToysOrder(channel);
		}

		return null;
	}
}
