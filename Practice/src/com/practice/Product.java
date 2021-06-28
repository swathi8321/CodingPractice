package com.practice;

public class Product {
	
	private String productCode;
	private String productName;
	private Double productPrice;
	
	
	Product(String productCode,String productName,Double productPrice){
		
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public void Display() {
		System.out.println(productCode +" "+productName+" "+productPrice);
	}
}
