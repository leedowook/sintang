package d0530;

public class employee {
	String name;
	int price;
	public employee(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void up() {
		this.price+=this.price*(10/100);
	}
}
