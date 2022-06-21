package com.interview.practice;

interface shape{
	
	void print();
	default void show() {
		System.out.println("print in shape");
	}
}

class Square implements shape{
	
	 public void print() {
		System.out.println("print in square");
	}
}
class Base {

	public void makeSound() {
		System.out.println("Base|makeSound|noise in base");
	}

}

class Child extends Base {

	@Override
	public void makeSound() {
		System.out.println("Child|makeSound|noise in child");
	}

}

abstract class Dog {
	final void bark() {
		System.out.println("Dog|bark|woof");
	}

	abstract void jump(); // this is a pure virtual function
}

class MyDog extends Dog {
	
	void jump() {
		
		System.out.println("Mydog|jump()|Jumps in the air");
	}
}

public class Polymorphism {
	
	 public static void main(String args[]) {
		 System.out.println("**a.makeSound***");
		 Base a = new Base();
		 a.makeSound();
		 
		 System.out.println("**b.makeSound***");
		 
		 Base b = new Child();
		 b.makeSound();
		 
		 System.out.println("***c.makesound**");
		 
		 Child c = new Child();
		 c.makeSound();
		 
		 System.out.println("*****");
		 
		 Base d = new Child();
		 Child e = (Child)d;
		 e.makeSound();
		 
		 Dog ob1 = new MyDog();
		 ob1.jump();
		
		
		 shape s = new Square();
		 s.show();
		 s.print();
		 
	 }
	
	

}
