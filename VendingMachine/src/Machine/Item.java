package Machine;

public class Item {
	public ItemType type;
	public int price;
	
	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Item(ItemType type,int price){
		this.type = type;
		this.price = price;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}
}
