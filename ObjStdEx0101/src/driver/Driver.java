package driver;

import store.Product;

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println();
		Product.displayStoreName();
		
	Product keybord = new Product("キーボード",3000);
	Product mouse = new Product("マウス",2000);
	
	System.out.println();
	keybord.display();
	mouse.display();
	
	keybord.down();
	mouse.up(2000);
	
	System.out.println("価格再設定後");
	keybord.display();
	mouse.display();
	}	
}
