package com.cts.demo;

import static org.junit.Assert.assertEquals;

public class MovableAdapterImplTest {
	@org.junit.Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted()
	{ 
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001); 
	}
	@org.junit.Test
	public void whenConvertingUSDToEuro_thenSuccessfullyConverted()
	{ 
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getPrice(), 164000.00, 0.00001);

	}

}
