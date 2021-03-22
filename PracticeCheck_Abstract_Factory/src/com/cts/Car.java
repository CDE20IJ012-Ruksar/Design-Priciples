package com.cts;

public abstract class Car {
	
	 protected Car(CarType model, Location location) 
	    { 
	        this.model = model; 
	        this.location = location; 
	    } 
	   
	    abstract void construct(); 
	   
	    CarType model = null; 
	    Location location = null; 
	   
	    CarType getModel() 
	    { 
	        return model; 
	    } 
	   
	    void setModel(CarType model) 
	    { 
	        this.model = model; 
	    } 
	   
	    Location getLocation() 
	    { 
	        return location; 
	    } 
	   
	    void setLocation(Location location) 
	    { 
	        this.location = location; 
	    }

		@Override
		public String toString() {
			return "Car [model=" + model + ", location=" + location + "]";
		}

}



