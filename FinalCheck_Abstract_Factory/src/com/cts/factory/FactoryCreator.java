package com.cts.factory;

public class FactoryCreator {
	public static AbstractFactory getFactory() {
		return new OrderFactory();
	}
}