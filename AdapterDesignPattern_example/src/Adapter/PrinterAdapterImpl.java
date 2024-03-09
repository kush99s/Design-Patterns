package Adapter;

import Adaptee.Printer;

public class PrinterAdapterImpl implements PrinterAdapter {
	
	Printer printer;

	public PrinterAdapterImpl(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void printsAllDoc() {
		printer.printDoc();

	}

}
