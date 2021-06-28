package com.structureDesignPattern.practice;

import java.util.ArrayList;
import java.util.List;

interface Employees{
	public void showEmployeeDetails();
}

class Developer implements Employees{
	int ID;
	String Name;
	String Department;
	
	Developer(int ID,String Name,String Department){
		this.ID = ID;
		this.Name = Name;
		this.Department = Department;
	}
	
	public void showEmployeeDetails(){
		System.out.println("The id is "+ID+"Name is "+Name+"Department is "+Department);
	}
}

class Manger implements Employees{
	
	int ID;
	String Name;
	String Department;
	
	Manger(int ID,String Name,String Department){
		this.ID = ID;
		this.Name = Name;
		this.Department = Department;
	}
	
	public void showEmployeeDetails(){
		System.out.println("The id is "+ID+"Name is "+Name+"Department is "+Department);
	}
	
}

class CompanyDirectory implements Employees {

	private List<Employees> empList = new ArrayList<Employees>();

	public void showEmployeeDetails() {
		for (Employees emp : empList) {

			emp.showEmployeeDetails();

		}
	}

	public void addEmployee(Employees emp) {
		empList.add(emp);
	}
}
	


public class CompositePattern {

	public static void main(String[] args) {
		
		Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer"); 
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer"); 
        
		CompanyDirectory devDirectory = new CompanyDirectory();
		devDirectory.addEmployee(dev1);
		devDirectory.addEmployee(dev2);
		
		devDirectory.showEmployeeDetails();
		
		
	}

}
