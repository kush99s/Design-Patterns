package Factory;

import Product.Button;
import Product.WindowsButton;

public class WindowsDialog extends Dialog{

	public WindowsDialog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
