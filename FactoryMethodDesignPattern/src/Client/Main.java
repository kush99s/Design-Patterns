package Client;

import Factory.Dialog;
import Factory.HtmlDialog;
import Factory.WindowsDialog;

public class Main {


	public static void main(String[] args) {
		
		// call these according to input
		Dialog obj = new HtmlDialog();
		obj.render();
		
		obj = new WindowsDialog();
		obj.render();
		

	}

}
