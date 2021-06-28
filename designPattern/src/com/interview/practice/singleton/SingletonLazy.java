package com.interview.practice.singleton;

//called lazy because it creates only when we call
//it is not thread
public class SingletonLazy {
	
	public static SingletonLazy instance;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getInstance() {
		if(instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}

}
