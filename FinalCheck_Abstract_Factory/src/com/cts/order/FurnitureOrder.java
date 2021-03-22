package com.cts.order;

public class FurnitureOrder extends Order{
	public FurnitureOrder(String channel) {
		this.setChannel(channel);
		this.setProductType("Furniture");
		processOrder();
	}
	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Furniture Order");
	}

}
