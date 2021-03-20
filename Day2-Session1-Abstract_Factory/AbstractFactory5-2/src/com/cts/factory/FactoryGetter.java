package com.cts.factory;

import com.cts.abstractclasses.Factory;

public class FactoryGetter {
	public static Factory getFactory(Class type) {
		if (type.equals(MercedesFactory.class)) {
			return new MercedesFactory();
		} else if (type.equals(AudiFactory.class)) {
			return new AudiFactory();
		}

		return null;
	}

}


