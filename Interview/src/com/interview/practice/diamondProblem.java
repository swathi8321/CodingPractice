package com.interview.practice;
//has diamond problem and overiding problem


abstract class BaseClass {
    public void foo() { System.out.println("BaseClass's foo"); }
}
interface BaseInterface {
    default public void foo() { System.out.println("BaseInterface's foo"); }
}


public class diamondProblem extends BaseClass implements BaseInterface {
    public static void main(String []args) {
        new diamondProblem().foo();
    }
}
