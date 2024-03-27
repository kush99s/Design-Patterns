package Decorator;

import Component.Bike;

public class SuperBike extends BikeDecorator {

	public SuperBike(Bike b) {
		super(b);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Super bike");
	}

}
