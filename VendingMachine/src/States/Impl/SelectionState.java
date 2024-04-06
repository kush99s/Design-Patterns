package States.Impl;

import java.util.List;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachine;
import States.State;

public class SelectionState implements State {
	
	public SelectionState() {
		System.out.println("Currently Vending machine is in HasMoneyState");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		throw new Exception("Exception occured");
		
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		throw new Exception("Exception occured");
		
	}

	@Override
	public void insertCoins(VendingMachine machine, Coin coin) throws Exception {
		throw new Exception("Exception occured");
		
	}

	@Override
	public void selectProduct(VendingMachine machine, int id) throws Exception {
		Item item = machine.getInventory().getItem(id);
		
		int amountPaid = 0;
		for(Coin c:machine.getCoinList()) {
			amountPaid += c.value;
		}
		
		if(amountPaid  >= item.price) {
			if(amountPaid  > item.price) {
				getChange(amountPaid-item.price);
			}
			machine.setState(new DispenseState(machine,id));
		}
		
		else {
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
		}
		
	}

	@Override
	public int getChange(int money) throws Exception {
		System.out.println("Returned the change in the Coin Dispense Tray: " + money);
        return money;
	}

	@Override
	public void dispenseProduct(VendingMachine machine, int id) throws Exception {
		throw new Exception("Exception occured");
		
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		machine.setState(new IdleState(machine));
		return machine.getCoinList();
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int id) throws Exception {
		throw new Exception("Exception occured");
		
	}

}
