package client;
import Adaptee.PrinterCanon;
import Adapter.PrinterAdapter;
import Adapter.PrinterAdapterImpl;

public class Main {
	
	public static void main(String args[]) {
		PrinterAdapter adapter = new PrinterAdapterImpl(new PrinterCanon());
		adapter.printsAllDoc();
	}

}
