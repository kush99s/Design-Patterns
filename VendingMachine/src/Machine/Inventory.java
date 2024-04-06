package Machine;

public class Inventory {
	
	ItemShelf[] shelf;

	public Inventory(int val) {
		shelf = new ItemShelf[val];
		initialiseInventory(shelf);
	}
	
	public ItemShelf[] getInventory() {
		return shelf;
	}

	private void initialiseInventory(ItemShelf[] inventory) {
		int startCode = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf space = new ItemShelf();
            space.setId(startCode);
            space.setSoldOut(true);
            inventory[i]= space;
            startCode++;
        }
		
	}

	public void addItem(Item item, int id) throws Exception {
		
		for(ItemShelf itemShelf: shelf) {
			if(itemShelf.soldOut==true) {
				itemShelf.item = item;
                itemShelf.setSoldOut(false);
			}
			
			else {
				throw new Exception("already item is present, you can not add item here");
			}
		}
		
	}

	public Item getItem(int id) throws Exception {
        for (ItemShelf itemShelf : shelf) {
            if (itemShelf.id == id) {
                if (itemShelf.isSoldOut()) {
                    throw new Exception("item already sold out");
                } else {

                    return itemShelf.item;
                }
            }
        }
        throw new Exception("Invalid Code");
	}

	public void updateSoldOut(int id) {
		for (ItemShelf itemShelf : shelf) {
            if (itemShelf.id == id) {
                itemShelf.setSoldOut(true);
            }
        }
	}
}
