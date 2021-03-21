package com.cts.demo;
public class MovableAdapterImpl implements MovableAdapter { 
	 private Movable luxuryCars; // standard constructors 
	 
	 public MovableAdapterImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}
	@Override 
	 public double getSpeed() { 
		 return convertMPHtoKMPH(luxuryCars.getSpeed()); 
		 } 
	 private double convertMPHtoKMPH(double mph) { 
		 return mph * 1.60934; 
		 }
	 @Override
		public double getPrice() {
			return convertUSDtoEuro(luxuryCars.getPrice());
		}
	 private double convertUSDtoEuro(double price) {
			return 0.82 * price;
		}
}