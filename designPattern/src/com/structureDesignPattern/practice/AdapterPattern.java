package com.structureDesignPattern.practice;
//converts one interface to other interface which client wants


	
	interface Bird{
		public void fly();
		public void makeSound();
	}
	
	class Sparrow implements Bird{
		
		public void fly(){
			
			System.out.println("Bird is flying");
		}
		
		public void makeSound() {
			System.out.println("chirp chirp");
		}
	}
	
	interface ToyDuck{
		public void squeak();
	}
	
	class Duck implements ToyDuck{
		
		public void squeak() {
			System.out.println("squeak squeak");
		}
	}

	
	//adapter class to get all features of bird
	
	class BirdAdapter implements ToyDuck{
		
		Bird bird;
		
		BirdAdapter(Bird bird){
			
			this.bird = bird;
		}
		
		public void squeak() {
			bird.makeSound();
		}
		
	}
	public class AdapterPattern {
	public static void main(String[] args) {
		
		Sparrow sparrow = new Sparrow(); 
        ToyDuck toyDuck = new Duck(); 
  
        // Wrap a bird in a birdAdapter so that it  
        // behaves like toy duck 
        ToyDuck birdAdapter = new BirdAdapter(sparrow); 
  
        System.out.println("Sparrow..."); 
        sparrow.fly(); 
        sparrow.makeSound(); 
  
        System.out.println("ToyDuck..."); 
        toyDuck.squeak(); 
  
        // toy duck behaving like a bird  
        System.out.println("BirdAdapter..."); 
        birdAdapter.squeak(); 

	}

}
