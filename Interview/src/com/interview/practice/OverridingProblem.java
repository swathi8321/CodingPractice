package com.interview.practice;



class Parent {
 
    public static void foo() {
        System.out.println("Inside foo method in parent class");
    }
 
    public void bar() {
        System.out.println("Inside bar method in parent class");
    }
}
 
class Child1 extends Parent {
    // Hiding
    public static void foo() {
    	
        System.out.println("Inside foo method in child class");
    }
    Child1(){
    	
    }
    // Overriding
    public void bar() {
    	
        System.out.println("Inside bar method in child class");
    }
}
 
public class OverridingProblem {
 
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child1();
        System.out.println("****************Method Hiding*******************");
        p.foo(); // This will call method in parent class
        c.foo(); // This will call method in parent class
        System.out.println("****************Method overriding*******************");
        p.bar(); // This will call method in parent class
        c.bar(); // This will call method in child class
 
    }
}
