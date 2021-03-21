package com.cts.demo;
public class MovableAdapterImpl implements MovableAdapter { 
	private Movable luxuryCars; 
	public MovableAdapterImpl(Movable luxuryCars) {
		// TODO Auto-generated constructor stub
		super();
		this.luxuryCars=luxuryCars;
	}
	
	public MovableAdapterImpl() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	@Override public double getSpeed() 
	{ 
		return convertMPHtoKMPH(luxuryCars.getSpeed()); 
	} 
	private double convertMPHtoKMPH(double mph)
	{ 
		return mph * 1.60934; 
	}
}