package com.practice;


class Parent{
	public int x=10;
	Parent(int x){
		System.out.println("x is "+x);
	}
	public void print() {
		System.out.println("Value A");
	}
	
}

class Child1 extends Parent{
	public int x=12;
	Child1(int x){
		super(x);
		System.out.println("Child 1: x is "+x);
	}
	public void print() {
		System.out.println("Value B");
	}
}

class Child2 extends Child1{
	Child2(int x){
		super(x);
		System.out.println("Child2:x is "+x);
		
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Child2 c  = new Child2(3);
		Parent p = new Child1(2);
		p.print();
		System.out.println(p.toString());

	}

}
