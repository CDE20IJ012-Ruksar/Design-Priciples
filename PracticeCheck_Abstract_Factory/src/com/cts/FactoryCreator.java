package com.cts;

public class FactoryCreator {
	
	public static AbstractFactory getFactory() {
		return new CarFactory();
	}

}