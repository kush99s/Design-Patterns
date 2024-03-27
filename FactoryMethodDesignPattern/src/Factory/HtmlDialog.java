package Factory;

import Product.Button;
import Product.HtmlButton;

public class HtmlDialog extends Dialog{

	public HtmlDialog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Button createButton() {
		System.out.println("using html factory implementation");
		return new HtmlButton();
	}

}
