import Machine.Coin;
import Machine.Item;
import Machine.ItemShelf;
import Machine.ItemType;
import Machine.VendingMachine;
import States.State;

public class Main {

	public static void main(String[] args) {
	       VendingMachine vendingMachine = new VendingMachine();
	        try {

	            System.out.println("|");
	            System.out.println("filling up the inventory");
	            System.out.println("|");

	            fillUpInventory(vendingMachine);
	            displayInventory(vendingMachine);

	            System.out.println("|");
	            System.out.println("clicking on InsertCoinButton");
	            System.out.println("|");

	            State vendingState = vendingMachine.getState();
	            vendingState.clickOnInsertCoinButton(vendingMachine);

	            vendingState = vendingMachine.getState();
	            vendingState.insertCoins(vendingMachine, Coin.Nickle);
	            vendingState.insertCoins(vendingMachine, Coin.Quarter);
	           // vendingState.insertCoin(vendingMachine, Coin.NICKEL);

	            System.out.println("|");
	            System.out.println("clicking on ProductSelectionButton");
	            System.out.println("|");
	            vendingState.clickOnStartProductSelectionButton(vendingMachine);

	            vendingState = vendingMachine.getState();
	            vendingState.selectProduct(vendingMachine, 102);

	            displayInventory(vendingMachine);

	        }
	        catch (Exception e){
	            displayInventory(vendingMachine);
	        }


	    }

	    private static void fillUpInventory(VendingMachine vendingMachine){
	        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
	        for (int i = 0; i < slots.length; i++) {
	            Item newItem = new Item();
	            if(i >=0 && i<3) {
	                newItem.setType(ItemType.Dairy);
	                newItem.setPrice(12);
	            }else if(i >=3 && i<5){
	                newItem.setType(ItemType.Drinks);
	                newItem.setPrice(9);
	            }else if(i >=5 && i<7){
	                newItem.setType(ItemType.Fruits);
	                newItem.setPrice(13);
	            }else if(i >=7 && i<10){
	                newItem.setType(ItemType.Snacks);
	                newItem.setPrice(7);
	            }
	            slots[i].setItem(newItem);
	            slots[i].setSoldOut(false);
	        }
	    }

	    private static void displayInventory(VendingMachine vendingMachine){

	        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
	        for (int i = 0; i < slots.length; i++) {

	            System.out.println("CodeNumber: " + slots[i].getId() +
	                    " Item: " + slots[i].getItem().getType().name() +
	                    " Price: " + slots[i].getItem().getPrice() +
	                    " isAvailable: " + !slots[i].isSoldOut());
	        }
	    }
	}
