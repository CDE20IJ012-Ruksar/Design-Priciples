package com.cts.order;

public class ToysOrder extends Order{
	public ToysOrder (String channel) {
		this.setChannel(channel);
		this.setProductType("Toys");
		processOrder();
	}
	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Toys Order");
	}

}
