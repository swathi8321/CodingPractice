 	 	package com.interview.practice.singleton;

//but thread not safe
public class SingletonLazySyncBlockLevel {

	public static SingletonLazySyncBlockLevel instance;

	private SingletonLazySyncBlockLevel() {

	}

	public static SingletonLazySyncBlockLevel getInstance() {
		synchronized (SingletonLazySyncBlockLevel.class) {
			if (instance == null) {
				instance = new SingletonLazySyncBlockLevel();
			}
			return instance;
		}
	}
	
	//double check locking
	public static SingletonLazySyncBlockLevel getInstance1() {

		if (instance == null) {
			synchronized (SingletonLazySyncBlockLevel.class) {
				instance = new SingletonLazySyncBlockLevel();
			}

		}
		return instance;
	}

}
