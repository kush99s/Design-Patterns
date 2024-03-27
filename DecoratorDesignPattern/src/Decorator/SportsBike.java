package Decorator;

import Component.Bike;

public class SportsBike extends BikeDecorator {

	public SportsBike(Bike b) {
		super(b);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Sports bike");
	}

}
