package com.practice;

interface test1{
	
	default void show() {
		System.out.println("world");
	}
}

interface test2{
	final static int answer=42;
	void show(int x) ;
	default void show() {
		System.out.println("hello");
	}
}

abstract class test3 implements test1{
	
	abstract void m3();
	public void show1() {
		System.out.println("world");
	}
	public void show() {
		
	}
}

public class InterfaceClass extends test3 implements test1,test2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	@Override
	void m3() {
		// TODO Auto-generated method stub
		
	}

public static void main(String[] args) {
	InterfaceClass ic = new InterfaceClass();
	ic.show();
	
//	test3 t1 = new InterfaceClass();
//	t1.show1();
	
	test2 t = new InterfaceClass();
	t.show();
}
@Override
public void show(int x) {
	// TODO Auto-generated method stub
	
}

	
}


