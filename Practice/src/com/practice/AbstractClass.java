package com.practice;

public  class AbstractClass {

	void show() {}
	public static void main(String[] args) {
		//baseAbs b = new baseAbs();
	}
}

abstract class baseAbs{
	abstract void show() ;
	void display() {
		
	}
	
}

abstract class childAbs extends baseAbs{

	//didnot implement the parent class and it is made us abstract
	
}

class test extends baseAbs{
	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}
	
}

