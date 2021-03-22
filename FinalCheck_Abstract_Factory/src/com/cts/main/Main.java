package com.cts.main;

import com.cts.factory.AbstractFactory;
import com.cts.factory.FactoryCreator;

public class Main {
	public static void main(String[] args) {
		AbstractFactory factory = FactoryCreator.getFactory();
		System.out.println(factory.placeOrder("ABC", "Electronic"));
		System.out.println(factory.placeOrder("XYZ", "Furniture"));
        System.out.println(factory.placeOrder("HYU", "Toy"));
	}
}
		
		
		

		

