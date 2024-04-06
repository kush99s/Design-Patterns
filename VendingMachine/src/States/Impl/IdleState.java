package States.Impl;

import java.util.ArrayList;
import java.util.List;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachine;
import States.State;

public class IdleState implements State{
	
	public IdleState(){
		System.out.println("Idle State");
	}
	
	public IdleState(VendingMachine machine){
		System.out.println("Idle State");
		machine.setCoinList(new ArrayList<>());
	}

	@Override
	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
		machine.setState(new HasMoneyState());
		
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
		throw new Exception("Exception occured");
		
	}

	@Override
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
		throw new Exception("Exception occured");
		
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int id) throws Exception {
		machine.getInventory().addItem(item, id);
		
	}

}
