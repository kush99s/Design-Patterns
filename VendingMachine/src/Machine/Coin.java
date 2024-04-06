package Machine;

public enum Coin {
	
	Penny(1),
	Nickle(5),
	Dime(10),
	Quarter(25);
	
	public int value;
	Coin(int val){
		value = val;
	}
}
