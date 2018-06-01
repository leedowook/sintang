package d0530;

public class manager extends employee{
	int bonus;
	
	public manager(String name,int price,int bonus){
		super(name,price);
		this.bonus=bonus;
	}
	@Override
	public void up(){
		this.price+=this.price*(20/100);
	} 

}
