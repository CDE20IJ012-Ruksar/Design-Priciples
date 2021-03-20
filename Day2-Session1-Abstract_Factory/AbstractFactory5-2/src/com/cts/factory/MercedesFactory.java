package com.cts.factory;

import com.cts.abstractclasses.Factory;
import com.cts.abstractclasses.HeadLight;
import com.cts.abstractclasses.Tire;
import com.cts.mercedes.MercedesHeadlight;
import com.cts.mercedes.MercedesTire;

public class MercedesFactory extends Factory {

	@Override
	public HeadLight makeHeadlight() {
		// TODO Auto-generated method stub
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new MercedesTire();
	}

}
