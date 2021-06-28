package com.interview.practice.creationalDesignPattern;

//can be used in parking lot where there are different type of vehicles
//can be used in person like user or not user there we can use factory pattern

abstract class animal{
	 public abstract void makeSound();
}
class Dog extends animal{
	
	public void makeSound() {
		System.out.println("bow bow");
	}	
}
class Cat extends animal{
	
	public void makeSound() {
		System.out.println("meow meow");
	}
}

class animalFactory{
	animal getSound(String animalType) {
		if(animalType.equals("cat")) {
			return new Cat();
		}else {
			return new Dog();
		}
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		animalFactory af = new animalFactory();
		
		animal a = af.getSound("cat");
		a.makeSound();
		
		animal a1 = af.getSound("Dog");
		a1.makeSound();
		

	}

}
