package com.interview.practice.creationalDesignPattern;

abstract class Vehicles {

	protected Workshop workShop1;
	protected Workshop workShop2;

	Vehicles(Workshop workShop1, Workshop workShop2) {

		this.workShop1 = workShop1;
		this.workShop2 = workShop2;
	}

	abstract public void manufacture();
}

class Bus extends Vehicles{
	
	Bus(Workshop workShop1, Workshop workShop2){
		super(workShop1,workShop2);
		
	}
	 public void manufacture() {
		 System.out.println("Car "); 
		 workShop1.work();
		 workShop2.work();
	 }
}

class Bike extends Vehicles{
	
	Bike(Workshop workShop1, Workshop workShop2){
		super(workShop1,workShop2);
		
	}
	 public void manufacture() {
		 System.out.println("Bike"); 
		 workShop1.work();
		 workShop2.work();
	 }
}

interface Workshop 
{ 
    abstract public void work(); 
} 

class Produce implements Workshop{
	
	public void work() {
		System.out.println("Produced "); 
	}
}

class Assemble implements Workshop{
	
	public void work() {
		System.out.println("Assembled "); 
	}
}


public class BridgeDesignPattern {

	public static void main(String[] args) {
		Vehicles bus = new Bus(new Produce(),new Assemble());
		bus.manufacture();
	}

}
