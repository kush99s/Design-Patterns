package States.Impl;

import java.util.List;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachine;
import States.State;

public class DispenseState implements State{
	
	public DispenseState(VendingMachine machine,int id) throws Exception {
		System.out.println("Currently Vending machine is in DispenseState");
		dispenseProduct(machine,id);
		
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
		throw new Exception("Exception occured");
		
	}

	@Override
	public int getChange(int money) throws Exception {
		throw new Exception("Exception occured");
		
	}

	@Override
	public void dispenseProduct(VendingMachine machine, int id) throws Exception {
		System.out.println("Dispensing Product");
		Item item =machine.getInventory().getItem(id);
		machine.getInventory().updateSoldOut(id);
		machine.setState(new IdleState());
		
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		throw new Exception("Exception occured");
		
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int id) throws Exception {
		throw new Exception("Exception occured");
		
	}

}
