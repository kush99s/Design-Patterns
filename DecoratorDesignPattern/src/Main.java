import Decorator.SportsBike;
import Decorator.SuperBike;
import Implementation.BasicBike;
import Component.Bike;

public class Main {

	public static void main(String args[]) {
		Bike sportsBike = new SportsBike(new BasicBike());
		sportsBike.assemble();
		
		Bike superBike = new SuperBike(new SportsBike(new BasicBike()));
		superBike.assemble();
	}
}
