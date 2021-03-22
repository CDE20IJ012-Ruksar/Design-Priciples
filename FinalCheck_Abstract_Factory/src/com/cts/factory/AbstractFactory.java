package com.cts.factory;

import com.cts.order.Order;

public abstract class AbstractFactory {
	public abstract Order placeOrder(String channel, String productType);
}
