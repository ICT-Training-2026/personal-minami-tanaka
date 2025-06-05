package store;

//クラス(static)フィールド
public class Product {
	
	private static final String STORE_NAME="速水PC販売店";
	
	private static final int DEFAULT_CHANGE_AMT=1000;
	
	private String name;
	private int price;
	
//コンストラクタ
	public Product(String name,int price){
	this.name = name;
	this.price = price;
	}
	
//同クラス内で別コンストラクタを呼び出す（12～14行目）	
	public Product(String name){
		this(name, 0);
	}
	
//クラス(static）メソッド
	public static void displayStoreName() {
		System.out.println("■店舗名：" + STORE_NAME);
	}
/*同じクラスなので、フィールド名のみでOK
* 異なるクラスの場合、クラス名.メソッド名	
*/
		
//値上げ	
	public int up (int amt) {
		return price +=amt;
	}
	
	public int up() {
		return this.up(DEFAULT_CHANGE_AMT);	
	}
	
//値下げ
	public int down (int amt) {
		return price -=amt;
	}
	
	public int down() {
		return this.down(DEFAULT_CHANGE_AMT);
	}
	
//画面表示
	public void display() {
		System.out.println(name + ":" +price+ "円");
	}	
}