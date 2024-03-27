package Decorator;

import Component.Bike;

public class BikeDecorator implements Bike {

	Bike bike;
	public BikeDecorator(Bike bike) {
		this.bike=bike;
	}
	@Override
	public void assemble() {
		this.bike.assemble();
		
	}
}
