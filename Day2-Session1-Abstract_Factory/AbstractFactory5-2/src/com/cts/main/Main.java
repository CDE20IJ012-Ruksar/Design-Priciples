package com.cts.main;
import com.cts.abstractclasses.Factory;
import com.cts.abstractclasses.HeadLight;
import com.cts.abstractclasses.Tire;
import com.cts.factory.AudiFactory;
import com.cts.factory.FactoryGetter;
import com.cts.factory.MercedesFactory;

public class Main{

	public static void main(String[] args) {
Factory factory = FactoryGetter.getFactory(MercedesFactory.class);
		
		HeadLight headlight = factory.makeHeadlight();
		Tire tire = factory.makeTire();
		System.out.println(headlight);
		System.out.println(tire);
		
		factory = FactoryGetter.getFactory(AudiFactory.class);
		headlight = factory.makeHeadlight();
		tire = factory.makeTire();
		System.out.println(headlight);
		System.out.println(tire);
	}
	
}