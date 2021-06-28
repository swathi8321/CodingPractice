package com.structureDesignPattern.practice;

class HotelKeeper {

	public VegRestraunt getVegmenu() {

		VegRestraunt v = new VegRestraunt();
		v.getMenu();
		return v;
	}

	public NonVegRestraunt getNonVegmenu() {

		NonVegRestraunt v = new NonVegRestraunt();
		v.getMenu();
		return v;
	}

	public BothRestraunt getBothmenu() {

		BothRestraunt v = new BothRestraunt();
		v.getMenu();
		return v;
	}

}

interface Hotel{
	
	public void getMenu();
}
class VegRestraunt implements Hotel{
	
	public void getMenu() {
		
		System.out.println("Veg menu");
	}
}

class NonVegRestraunt implements Hotel{
	
	public void getMenu() {
		
		System.out.println("Non Veg menu");
	}
}

class BothRestraunt implements Hotel{
	
	public void getMenu() {
		
		System.out.println("Both menu");
	}
}


public class FacadePattern 
{ 
	//driver class
    public static void main (String[] args) 
    { 
        HotelKeeper keeper = new HotelKeeper(); 
          
        VegRestraunt v = keeper.getVegmenu(); 
        NonVegRestraunt nv = keeper.getNonVegmenu(); 
        BothRestraunt b = keeper.getBothmenu(); 
  
    } 
} 