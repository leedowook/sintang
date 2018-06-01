package d0530;

public class excutive extends manager{
	boolean stock;
	public excutive(String name,int price,int bonus,boolean stock){
		super(name,price,bonus);
		this.stock=stock;
	}
	
	@Override
	public void up(){
		this.price+=this.price*(30/100);
	} 
}
