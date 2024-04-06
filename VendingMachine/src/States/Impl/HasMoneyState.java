package States.Impl;

import java.util.List;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachine;
import States.State;

public class HasMoneyState implements State {
	
	public HasMoneyState(){
		System.out.println("Currently Vending machine is in HasMoneyState");
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		throw new Exception("Exception occured");
		
	}

	@Override
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
		machine.setState(new SelectionState());
		
	}

	@Override
	public void insertCoins(VendingMachine machine, Coin coin) throws Exception {
		System.out.println("Accepting coins");
		machine.getCoinList().add(coin);
		
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
		throw new Exception("Exception occured");
		
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		machine.setState(new IdleState());
		return machine.getCoinList();
		
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int id) throws Exception {
		throw new Exception("Exception occured");
		
	}

}
