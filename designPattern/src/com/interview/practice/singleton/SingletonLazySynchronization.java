 	 	package com.interview.practice.singleton;

//but perform not good
public class SingletonLazySynchronization {
	
	public static SingletonLazySynchronization instance;
	
	private SingletonLazySynchronization() {
		
	}
	
	public synchronized static SingletonLazySynchronization getInstance() {
		if(instance == null) {
			instance = new SingletonLazySynchronization();
		}
		return instance;
	}

}
