package com.cts.factory;

import com.cts.abstractclasses.Factory;
import com.cts.abstractclasses.HeadLight;
import com.cts.abstractclasses.Tire;
import com.cts.audi.AudiHeadlight;
import com.cts.audi.AudiTire;

public class AudiFactory extends Factory {

	@Override
	public HeadLight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
