package com.interview.practice.creationalDesignPattern;
//another layer of abstraction over design pattern
enum MODEL{mini,micro,luxury};
enum LOCATION{india,usa,australia};
abstract class Car{
	MODEL model;
	LOCATION location;
	

	Car(MODEL model,LOCATION location){
		this.model = model; 
        this.location = location; 
	}
	void setModel(MODEL model) {
		
		model = this.model;
	}
	MODEL getModel() {
		return model;
	}
	
	public LOCATION getLocation() {
		return location;
	}

	public void setLocation(LOCATION location) {
		this.location = location;
	}
	
	abstract void construct();
	@Override
    public String toString() 
    { 
        return "CarModel - "+model + " located in "+location; 
    } 
	
}

class miniCar extends Car{

	miniCar( LOCATION location) {
		super(MODEL.mini, location);
		construct(); 
	}
	protected void construct() 
    { 
        System.out.println("Connecting to mini car"); 
    } 
	
}

class luxuryCar extends Car{

	luxuryCar( LOCATION location) {
		super(MODEL.mini, location);
		construct(); 
	}
	protected void construct() 
    { 
        System.out.println("Connecting to luxury car"); 
    } 
	
}

class IndiaFactory{
	
	public static Car buildCar(MODEL model) {
		switch(model) {
		case mini:
			return new miniCar(LOCATION.india);
		case luxury:
			return new luxuryCar(LOCATION.india);
		}
		return null;
	}
}

 class USAFactory{
	
	public static Car buildCar(MODEL model) {
		switch(model) {
		case mini:
			return new miniCar(LOCATION.india);
		case luxury:
			return new luxuryCar(LOCATION.india);
		default:
			break;
		}
		return null;
	}
}

class CARFactory{
	
	static Car buildCar(MODEL model) {
		LOCATION location = LOCATION.india;
		switch(location) {
		case usa:
			return USAFactory.buildCar(model);
		case india:
			return  IndiaFactory.buildCar(model);
		}
		return null;
		}
		
	}
	
	


public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {
	//	System.out.println(CarFactory.buildCar(CarType.MICRO)); 
        System.out.println(CARFactory.buildCar(MODEL.mini)); 
        System.out.println(CARFactory.buildCar(MODEL.luxury)); 

	}

}


