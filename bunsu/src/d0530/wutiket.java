package d0530;

public class wutiket extends ticket {
	
	int check;
	public wutiket(String name,int num,int price,int check) {
		super(name,num,price);
		this.check=check;
	}
	@Override
	public void sale() {
		int price;
		if(check==1) {
			price=this.price;
			
			System.out.println("신용카드 할인이있으십니다.");
			price*=95/100;
			System.out.println("원래 가격"+this.price+"원이 신용카드로 인해 할인된 가격은 "+price+"원 입니다.");
			this.price=price;
		}
		else if(check==0) {
			System.out.println("신용카드 할인이 없으십니다.");
			System.out.println("가격은 "+this.price+"입니다");
			
		}
		
	}
}
