package States;

import java.util.List;

import Machine.Coin;
import Machine.Item;
import Machine.VendingMachine;

public interface State {

	public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
	
	public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
	
	public void insertCoins(VendingMachine machine, Coin coin) throws Exception;
	
	public void selectProduct(VendingMachine machine, int id) throws Exception;
	
	public int getChange(int money) throws Exception;
	
	public void dispenseProduct(VendingMachine machine, int id) throws Exception;
	
	public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
	
	public void updateInventory(VendingMachine machine, Item item, int id) throws Exception;
	
}
