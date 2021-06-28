package com.interview.practice.creationalDesignPattern;

interface Car1{
	public void setTires(String tires);
	public void setFront(String wiper);
	public void setScreen(String headLights);
	public void setDoors(String doors);
	
}
interface carBuilder{
	
	public void buildInterior(String type);
	public void buildTires(String tireType);
	public void useMaterials(String materialType);
}

class cheapCar implements carBuilder{

	private Car1 car;

	public void buildInterior(String type) {
		
		type = "cheap";
		car.setDoors(type);
	}


	public void buildTires(String tireType) {
		tireType = "cheap";
		car.setTires(tireType);
	}


	public void useMaterials(String materialType) {
		
		materialType = "cheap";
		car.setScreen(materialType);
	}
	
}

class costCar implements carBuilder{

	private Car1 car;

	public void buildInterior(String type) {
		
		type = "cheap";
		car.setDoors(type);
	}


	public void buildTires(String tireType) {
		tireType = "cheap";
		car.setTires(tireType);
	}


	public void useMaterials(String materialType) {
		
		materialType = "cheap";
		car.setScreen(materialType);
	}
	
}
public class Builder {
	

}
