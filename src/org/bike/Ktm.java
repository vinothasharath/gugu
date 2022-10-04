package org.bike;

public class Ktm  implements Bike{
		

	@Override
	public void cost() {
		
		System.out.println("Bike cost : 1,00000");
		
	}

	@Override
	public void speed() {
		System.out.println("bike speed : 21.36 km/h");
		
		
	}
		
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	
	}	
	}
