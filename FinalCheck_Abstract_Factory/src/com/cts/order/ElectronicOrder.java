package com.cts.order;

public class ElectronicOrder extends Order{
	public ElectronicOrder(String channel) {
		this.setChannel(channel);
		this.setProductType("Electronic");
		processOrder();
	}
	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Electronic Order");
	}

}
