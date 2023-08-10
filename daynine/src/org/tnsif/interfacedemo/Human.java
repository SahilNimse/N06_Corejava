package org.tnsif.interfacedemo;

public class Human implements ColdDrinks,Alcohol {

	@Override
	public void showDrinks() {
		System.out.println(colddrinksName+" " +alcoholType);
		
	}

		
	

}
