package Factory;

import Product.Button;

public abstract class Dialog {

	public Dialog() {
		// TODO Auto-generated constructor stub
	}
	
	abstract public Button createButton();
	public void render() {
		Button b= createButton();
		b.render();
		b.onClick();
	}

}
