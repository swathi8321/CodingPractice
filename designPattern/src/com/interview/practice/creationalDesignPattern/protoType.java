package com.interview.practice.creationalDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class protoType {

	abstract class animals implements Cloneable {

		protected String animalType;

		abstract void addLegs();

		public Object Clone() {
			Object clone = null;

			try {
				clone = super.clone();

			} catch (Exception ex) {
				ex.printStackTrace();
			}

			return clone;
		}
	}

	class Cow extends animals {
		
		Cow(){
			
			this.animalType = "Cow";
		}

		@Override
		public void addLegs() {
			System.out.println("four legs");
		}

	}

	class Chicken extends animals {
		
		Chicken(){
			
			this.animalType = "Chicken";
		}

		@Override
		public void addLegs() {
			System.out.println("two legs");
		}

	}
	
	static class animalStore {
		private static Map<String,animals> animalMap = new HashMap<String,animals>();
		
		animalStore() {
			
			//animalMap.put("cow",new Cow());
			///animalMap.put("chicken",new Chicken());
		}
			
		public static animals getAnimal(String animalType) 
	    { 
	        return (animals) animalMap.get(animalType).Clone(); 
	    } 
	}
}
