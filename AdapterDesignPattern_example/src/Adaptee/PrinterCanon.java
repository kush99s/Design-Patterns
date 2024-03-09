package Adaptee;

public class PrinterCanon implements Printer {

	@Override
	public void printDoc() {
		System.out.println("Printing document");
	}

}
