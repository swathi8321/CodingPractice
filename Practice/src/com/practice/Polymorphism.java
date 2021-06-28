package com.practice;


class Employee{
	
	void work() {
		System.out.println("employee work");
	}
}
class Manager extends Employee{
	
	void work() {
		System.out.println("Manger work");
	}
}
class Security extends Employee{
	void work() {
		System.out.println("Security work");
	}
	void drill() {
		System.out.println("drill");
	}
	void drill(int x) {
		
	}
	void drill(String x) {
		
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Manager();
		e.work();
		
		Employee e1 = new Security();
		e1.work();
		//e1.drill();//not possible
		if(e1 instanceof Security) {
			((Security)e1).drill();//explicitly downcast employee
		}
	}

}
